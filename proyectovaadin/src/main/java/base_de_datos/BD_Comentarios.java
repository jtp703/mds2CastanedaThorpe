package base_de_datos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import base_de_datos.Comentario;
import base_de_datos.Usuario;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import base_de_datos.MDS12425PFCastanedaThorpePersistentManager; // Ajustar al nombre real del PersistentManager generado por ORM

public class BD_Comentarios {
	public BDPrincipal _bD_principal;
	public Vector<Comentario> _contiene_comentarios = new Vector<Comentario>();

	/**
	 * Elimina un comentario dado su ID, disociándolo de todas sus relaciones
	 * y luego borrándolo.
	 */
	public void borrarComentario(int aIdComentario) throws PersistentException {
	    PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
	        .instance().getSession().beginTransaction();
	    try {
	        // 1) Recuperar con 'get' en vez de 'load' para evitar ObjectNotFoundException
	        Comentario comentario = ComentarioDAO.getComentarioByORMID(aIdComentario);
	        if (comentario != null) {
	            // 2) Método generado por VP: quita el comentario de:
	            //    - tweet.tiene_comentario
	            //    - usuario.publica_comentario
	            //    - limpia comlikeado_por, comentario_contiene…
	            ComentarioDAO.deleteAndDissociate(comentario);
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
	 * Quita el "Me gusta" de un comentario: elimina la relación entre el usuario y el comentario,
	 * y decrementa el contador de "Me gusta".
	 */
	public void quitarMegustaComentario(int aIdUsuario, int aIdComentario) throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		try {
			Usuario usuario = UsuarioDAO.loadUsuarioByORMID(aIdUsuario);
			Comentario comentario = ComentarioDAO.loadComentarioByORMID(aIdComentario);
			if (usuario != null && comentario != null) {
				// Remueve la relación Many-to-Many
				if (comentario.comlikeado_por.contains(usuario)) {
					comentario.comlikeado_por.remove(usuario);
					ComentarioDAO.save(comentario);
				}
			}
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}

		MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
	}

	public Comentario escribirComentario(int idUsuario, int idTweet, String aTexto) throws PersistentException {
	    PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
	            .instance().getSession().beginTransaction();
	    Comentario comentario = null;
	    try {
	        comentario = ComentarioDAO.createComentario();
	        comentario.setTexto(aTexto);
	        comentario.setPertenecea_tweet(TweetDAO.loadTweetByORMID(idTweet));
	        
	        // Asociar el usuario autor del comentario
	        Usuario autor = UsuarioDAO.loadUsuarioByORMID(idUsuario);
	        if (autor == null) {
	            throw new PersistentException("Usuario con ID " + idUsuario + " no encontrado.");
	        }
	        comentario.setComentado_por(autor); // Cambia 'Comentado_por' si tu campo se llama distinto

	        ComentarioDAO.save(comentario);

	        t.commit();
	    }
	    catch (Exception e) {
	        t.rollback();
	    }
	    finally {
	        MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
	    }
	    return comentario;
	}


	/**
	 * Añade un "Me gusta" a un comentario: crea la relación entre el usuario y el comentario,
	 * y aumenta el contador de "Me gusta".
	 */
	public void darMegustaComentario(int aIdUsuario, int aIdComentario) throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		try {
			Usuario usuario = UsuarioDAO.loadUsuarioByORMID(aIdUsuario);
			Comentario comentario = ComentarioDAO.loadComentarioByORMID(aIdComentario);
			if (usuario != null && comentario != null) {
				// Añade la relación Many-to-Many
				if (!comentario.comlikeado_por.contains(usuario)) {
					comentario.comlikeado_por.add(usuario);
					ComentarioDAO.save(comentario);
				}
			}
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}

		MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
	}

	/**
	 * Devuelve todos los comentarios almacenados en la base de datos.
	 */
	public Comentario[] cargarComentarios() throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		Comentario[] resultados = new Comentario[0];
		try {
			// Sin criterios (null, null) lista todos los comentarios
			resultados = ComentarioDAO.listComentarioByQuery(null, null);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}

		MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
		return resultados;
	}
}
