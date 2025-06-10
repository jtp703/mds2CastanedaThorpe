package base_de_datos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import java.util.regex.Pattern;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Date;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import antlr.collections.List;
import base_de_datos.Tweet;
import base_de_datos.Usuario;
import ch.qos.logback.core.boolex.Matcher;
import base_de_datos.Comentario;
import base_de_datos.Hashtag;
import base_de_datos.Documento;
import base_de_datos.Administrador;

// Ajusta este import al nombre real del PersistentManager generado por tu ORM:
import base_de_datos.MDS12425PFCastanedaThorpePersistentManager;

public class BD_Tweets {
	public BDPrincipal _bD_principal;
	public Vector<Tweet> _contiene_publicaciones = new Vector<Tweet>();

	/**
     * Devuelve todos los tweets existentes en la base de datos.
     */
    public Tweet[] cargarTweets() throws PersistentException {
        PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
                .instance().getSession().beginTransaction();
        Tweet[] resultados = new Tweet[0];
        try {
            // Sin filtro (null, null) listamos todos los tweets
            resultados = TweetDAO.listTweetByQuery(null, null);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        } finally {
            MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
        }
        return resultados;
    }

    /**
     * Elimina un tweet dado su ID, disociándolo de todas sus relaciones
     * y luego borrándolo en cascada correcta.
     */
    public void borrarTweet(int aIdTweet) throws PersistentException {
        PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
            .instance().getSession().beginTransaction();
        try {
            // Usamos get para que devuelva null si no existe
            Tweet tweet = TweetDAO.getTweetByORMID(aIdTweet);
            if (tweet != null) {
                TweetDAO.deleteAndDissociate(tweet);
            }
            t.commit();
        } catch (Exception e) {
            t.rollback();
            throw e;
        } finally {
            MDS12425PFCastanedaThorpePersistentManager
                .instance().disposePersistentManager();
        }
    }

    /**
     * Crea y guarda un nuevo tweet con texto y documentos adjuntos.
     *
     * Ahora recibe el ID de usuario (aIdUsuario) que publica el tweet,
     * porque no existe getUsuarioActual(). 
     *
     * @param aIdUsuario   ID del Usuario que publica el tweet.
     * @param aTexto       Texto del tweet.
     * @param aDocumentos  Array de URLs o rutas de documentos.
     * @param aTipo        Array de tipos correspondientes a cada documento.
     * @return             El Tweet recién creado (con sus documentos vinculados).
     */
    public Tweet escribirTweet(int aIdUsuario, String aTexto, String[] aDocumentos, String[] aTipo) throws PersistentException {
        PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
                .instance().getSession().beginTransaction();
        Tweet tweet = null;
        try {
            // 1. Creamos el tweet
            tweet = TweetDAO.createTweet();
            tweet.setTexto(aTexto);
            tweet.setFechaCreacion(new Date());

            // 2. Asignamos el Usuario que lo publica
            Usuario publicador = UsuarioDAO.loadUsuarioByORMID(aIdUsuario);
            if (publicador == null) {
                // Si no existe el usuario, lanzamos excepción para abortar la transacción
                throw new PersistentException("Usuario con ID " + aIdUsuario + " no encontrado.");
            }
            tweet.setTweeteado_por(publicador);

            // 3. Guardamos el tweet inicialmente (para tener ID y permitir relacionar documentos)
            TweetDAO.save(tweet);

            // 4. Si vienen documentos adjuntos, los creamos y vinculamos al tweet
            if (aDocumentos != null && aTipo != null && aDocumentos.length == aTipo.length) {
                for (int i = 0; i < aDocumentos.length; i++) {
                    Documento doc = DocumentoDAO.createDocumento();
                    doc.setUrl(aDocumentos[i]);       // 'url' es el campo en Documento
                    doc.setTipo(aTipo[i]);            // 'tipo' es el campo en Documento
                    doc.setPertenecea_tweet(tweet);   // vincula el documento al tweet
                    DocumentoDAO.save(doc);
                }
            }

            // 5. Volvemos a guardar el tweet para que se fijen bien las relaciones con documentos
            TweetDAO.save(tweet);

            // 6. Extraemos todos los hashtags del texto
            ArrayList<String> nombresHashtags = extraerHashtags(aTexto);
            for (String nombreRaw : nombresHashtags) {
                // --- 6.1. Escapamos posibles comillas simples para la consulta ---
                String nombreEscapado = nombreRaw.replace("'", "''");

                // --- 6.2. Intentamos cargar un hashtag existente con ese nombre ---
                // Condición HQL: nombre = 'elHashtag'
                String condicion = "nombre = '" + nombreEscapado + "'";
                Hashtag[] encontrados = HashtagDAO.listHashtagByQuery(condicion, null);

                Hashtag hashtag;
                if (encontrados != null && encontrados.length > 0) {
                    // Ya existía en BD: tomamos el primero
                    hashtag = encontrados[0];
                } else {
                    // No existía: lo creamos y seteamos campos iniciales
                    hashtag = HashtagDAO.createHashtag();
                    hashtag.setNombre(nombreRaw);
                    HashtagDAO.save(hashtag);
                }

                // --- 6.3. Asociamos este hashtag al tweet si aún no está asociado ---
                // La relación ManyToMany se maneja por ambas colecciones: tweet.contiene y hashtag.aparece_en
                // Para evitar duplicados, comprobamos antes:
                if (!tweet.contiene.contains(hashtag)) {
                    // Añadimos al tweet
                    tweet.contiene.add(hashtag);
                    TweetDAO.save(tweet);
                }
                if (!hashtag.aparece_en.contains(tweet)) {
                    // Añadimos al hashtag
                    hashtag.aparece_en.add(tweet);
                }
                HashtagDAO.save(hashtag);
            }

            // 7. Guardamos de nuevo el tweet para fijar la relación con todos los hashtags
            TweetDAO.save(tweet);

            t.commit();
        } catch (Exception e) {
            t.rollback();
            throw e instanceof PersistentException ? (PersistentException) e : new PersistentException(e);
        } finally {
            MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
        }
        return tweet;
    }

    /**
     * Extrae todos los hashtags de un texto (sin la ‘#’), evitando duplicados.
     * Por ejemplo, de "Hola #Java y #VaadinFlow" devolvería ["Java", "VaadinFlow"].
     */
    private ArrayList<String> extraerHashtags(String text) {
        ArrayList<String> hashtags = new ArrayList<>();
        String regex = "#(\\w+)";
        Pattern pattern = Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String hashtag = matcher.group(1); // Captura el texto del hashtag sin la '#'
            if (!hashtags.contains(hashtag)) {
                hashtags.add(hashtag);
            }
        }
        return hashtags;
    }

    
    /**
     * Añade un "Me gusta" a un tweet: crea la relación Many-to-Many entre Usuario y Tweet,
     * e incrementa el contador numMegustas.
     */
    public void darMegustaTweet(int aIdUsuario, int aIdTweet) throws PersistentException {
        PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
                .instance().getSession().beginTransaction();
        try {
            Usuario usuario = UsuarioDAO.loadUsuarioByORMID(aIdUsuario);
            Tweet tweet = TweetDAO.loadTweetByORMID(aIdTweet);
            if (usuario != null && tweet != null) {
                // UsuarioSetCollection likeado_por en Tweet
                if (!tweet.likeado_por.contains(usuario)) {
                    tweet.likeado_por.add(usuario);
                    TweetDAO.save(tweet);
                }
            }
            t.commit();
        } catch (Exception e) {
            t.rollback();
        } finally {
            MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
        }
    }

    /**
     * Quita un "Me gusta" de un tweet: elimina la relación Many-to-Many y decrementa numMegustas.
     */
    public void quitarMegusta(int aIdUsuario, int aIdTweet) throws PersistentException {
        PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
                .instance().getSession().beginTransaction();
        try {
            Usuario usuario = UsuarioDAO.loadUsuarioByORMID(aIdUsuario);
            Tweet tweet = TweetDAO.loadTweetByORMID(aIdTweet);
            if (usuario != null && tweet != null) {
                if (tweet.likeado_por.contains(usuario)) {
                    tweet.likeado_por.remove(usuario);
                    TweetDAO.save(tweet);
                }
            }
            t.commit();
        } catch (Exception e) {
            t.rollback();
        } finally {
            MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
        }
    }

    /**
     * Devuelve todos los tweets publicados por un usuario dado su ID.
     */
    public Tweet[] getTweetsByUserId(int aIdUsuario) throws PersistentException {
        PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
                .instance().getSession().beginTransaction();
        Tweet[] resultados = new Tweet[0];
        try {
            // La columna en Tweet que referencia a Usuario es "UsuarioUsuarioAutentificadoID"
            String condicion = "UsuarioUsuarioAutentificadoID = " + aIdUsuario;
            resultados = TweetDAO.listTweetByQuery(condicion, null);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        } finally {
            MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
        }
        return resultados;
    }

    /**
     * Carga todos los tweets que contengan un hashtag dado su ID.
     */
    public Tweet[] cargarTweetsFiltrados(int aIdHashtag) throws PersistentException {
        PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
                .instance().getSession().beginTransaction();
        Tweet[] resultadoArray = new Tweet[0];
        try {
            Hashtag hashtag = HashtagDAO.loadHashtagByORMID(aIdHashtag);
            if (hashtag != null) {
                // HashtagSetCollection "aparece_en" contiene todos los tweets asociados
                Object[] tweetsConHash = hashtag.aparece_en.toArray();
                Tweet[] tweets = new Tweet[tweetsConHash.length];
                for (int i = 0; i < tweetsConHash.length; i++) {
                    tweets[i] = (Tweet) tweetsConHash[i];
                }
                resultadoArray = tweets;
            }
            t.commit();
        } catch (Exception e) {
            t.rollback();
        } finally {
            MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
        }
        return resultadoArray;
    }

    /**
     * Crea un retweet de un tweet existente.
     *
     * @param aIdTweetRetweteado ID del tweet que se retwitea.
     * @param aIdUsuario         ID del usuario que hace el retweet.
     * @param aTexto             Nuevo texto adicional (puede combinarse con el original).
     * @return                   El nuevo Tweet que referencia al original.
     */
    public Tweet retweet(int idUsuario, int aIdTweetRetweteado, String aTexto) throws PersistentException {
        PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
                .instance().getSession().beginTransaction();
        Tweet retweet = null;
        try {
            Tweet original = TweetDAO.loadTweetByORMID(aIdTweetRetweteado);
            
            if (original != null) {
            	Usuario reTweeter = UsuarioDAO.loadUsuarioByORMID(idUsuario);
                if (reTweeter == null) {
                    throw new PersistentException("Usuario con ID " + idUsuario + " no encontrado.");
                }
                // 1. Creamos el nuevo Tweet que referencia al original
                retweet = TweetDAO.createTweet();
                retweet.setTexto(
                	    "Tweet original: " + original.getTexto() + "\n" +
                	    "Retweeteado por: " + reTweeter.getNick() + "\n" +
                	    aTexto
                	);
                retweet.setFechaCreacion(new Date());
                retweet.setTweet(original);
                retweet.setTweeteado_por(reTweeter);
                original.reetweteado_por.add(reTweeter);
                // 3. Guardamos el retweet
                TweetDAO.save(retweet);
                TweetDAO.save(original);
            }
            t.commit();
        } catch (Exception e) {
            t.rollback();
        } finally {
            MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
        }
        return retweet;
    }
    
    public Tweet getTweetById(int aIdTweet) throws PersistentException {
        PersistentTransaction tx = MDS12425PFCastanedaThorpePersistentManager
            .instance().getSession().beginTransaction();
        try {
            // 1) Cargamos la entidad
            Tweet tweet = TweetDAO.loadTweetByORMID(aIdTweet);
            // 2) Refrescamos su estado desde la BD (incluye la relación de likes)
            MDS12425PFCastanedaThorpePersistentManager
                .instance().getSession().refresh(tweet);
            tx.commit();
            return tweet;
        } catch (Exception e) {
            tx.rollback();
            throw new PersistentException(
                "Error cargando/refrescando Tweet " + aIdTweet, e
            );
        } finally {
            MDS12425PFCastanedaThorpePersistentManager
                .instance().disposePersistentManager();
        }
    }
}