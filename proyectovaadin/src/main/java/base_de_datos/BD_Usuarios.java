package base_de_datos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Usuario;
import base_de_datos.Tweet; // Asegúrate de que exista esta entidad
import base_de_datos.Administrador;

import java.util.Date;

// Ajusta el import al nombre real del PersistentManager generado por tu ORM:
import base_de_datos.MDS12425PFCastanedaThorpePersistentManager;

public class BD_Usuarios {
	public BDPrincipal _bD_principal;
	public Vector<Usuario> _contiene_usuarios = new Vector<Usuario>();

	/**
	 * Elimina (borra) el perfil de un usuario. 
	 * Se asume que 'aConfirmacion' contiene el ID del usuario como cadena. 
	 * 'aMotivo' se guarda o se ignora según necesidad (aquí se ignora).
	 */
	public void borrarPerfil(String aMotivo, String aConfirmacion) throws PersistentException {
		// Convertimos la confirmación a entero para obtener el ID de usuario
		int idUsuario;
		try {
			idUsuario = Integer.parseInt(aConfirmacion);
		} catch (NumberFormatException ex) {
			// Si la confirmación no es un número válido, abortamos
			throw new PersistentException("ID de usuario inválido en la confirmación: " + aConfirmacion);
		}

		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		try {
			Usuario usuario = UsuarioDAO.loadUsuarioByORMID(idUsuario);
			if (usuario != null) {
				UsuarioDAO.delete(usuario);
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		} finally {
			MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
		}
	}

	/**
	 * Hace que un usuario (aIdSeguidor) empiece a seguir a otro usuario (aIdSeguido).
	 */
	public void seguirUsuario(int aIdSeguidor, int aIdSeguido) throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		try {
			Usuario seguidor = UsuarioDAO.loadUsuarioByORMID(aIdSeguidor);
			Usuario seguido = UsuarioDAO.loadUsuarioByORMID(aIdSeguido);
			if (seguidor != null && seguido != null) {
				// Añadimos la relación MANY-TO-MANY: seguidor.sigue incluye a seguido
				if (!seguidor.sigue.contains(seguido)) {
					seguidor.sigue.add(seguido);
					UsuarioDAO.save(seguidor);
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
	 * Hace que un usuario (aIdSeguidor) deje de seguir a otro usuario (aIdSeguido).
	 */
	public void dejarSeguir(int aIdSeguidor, int aIdSeguido) throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		try {
			Usuario seguidor = UsuarioDAO.loadUsuarioByORMID(aIdSeguidor);
			Usuario seguido = UsuarioDAO.loadUsuarioByORMID(aIdSeguido);
			if (seguidor != null && seguido != null) {
				// Removemos la relación MANY-TO-MANY si existe
				if (seguidor.sigue.contains(seguido)) {
					seguidor.sigue.remove(seguido);
					UsuarioDAO.save(seguidor);
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
	 * Actualiza los datos de un usuario existente (nombre, nick, contraseña, fotos, descripción).
	 */
	public void actualizar(int aId, String aNombre, String aNickUsuario, String aContrasenia, String aFotoPerfil, String aImgPerfil, String aDescripcion) throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		try {
			Usuario usuario = UsuarioDAO.loadUsuarioByORMID(aId);
			if (usuario != null) {
				usuario.setNombre(aNombre);
				usuario.setNick(aNickUsuario);
				usuario.setPassword(aContrasenia);
				usuario.setFotoPerfil(aFotoPerfil);
				usuario.setFotoFondo(aImgPerfil);
				usuario.setDescripcion(aDescripcion);
				UsuarioDAO.save(usuario);
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		} finally {
			MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
		}
	}

	/**
	 * Carga y devuelve el perfil de un usuario dado su ID.
	 */
	public Usuario cargarPerfiilUsuarioregistrado(int aIdUsuario) throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		Usuario usuario = null;
		try {
			usuario = UsuarioDAO.loadUsuarioByORMID(aIdUsuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		} finally {
			MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
		}
		return usuario;
	}

	/**
	 * Devuelve todos los usuarios registrados en la base de datos.
	 */
	public Usuario[] cargarUsuarios() throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		Usuario[] resultados = new Usuario[0];
		try {
			resultados = UsuarioDAO.listUsuarioByQuery(null, null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		} finally {
			MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
		}
		return resultados;
	}

	/**
     * Devuelve un arreglo de usuarios cuyos tweets han sido "likeados" por el usuario con ID `aIdUsuario`.
     * - Se obtiene TweetSetCollection de tweets marcados como "Me gusta".
     * - Para cada tweet, se extrae el autor y se añade a un HashSet para evitar duplicados.
     *
     * Nota: TweetSetCollection no implementa Iterable, así que usamos toArray() para recorrerlo.
     */
    public Usuario[] cargarUsuariosMegustaTweet(int aIdUsuario) throws PersistentException {
        PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
                .instance().getSession().beginTransaction();
        Usuario[] resultadoArray = new Usuario[0];
        try {
            Usuario usuario = UsuarioDAO.loadUsuarioByORMID(aIdUsuario);
            if (usuario != null) {
                // TweetSetCollection es la colección generada por ORM, no Iterable
                Object[] tweetsLikeadosArray = usuario.likea.toArray();
                Set<Usuario> autores = new HashSet<>();
                for (Object obj : tweetsLikeadosArray) {
                    Tweet tweet = (Tweet) obj;
                    Usuario autor = tweet.getTweeteado_por();
                    if (autor != null) {
                        autores.add(autor);
                    }
                }
                resultadoArray = autores.toArray(new Usuario[0]);
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
	 * Hace que un usuario (aIdUsuario) retuitee un tweet (aIdTweetRetweteado).
	 */
	public void asociarUsuarioTweet(int aIdTweetRetweteado, int aIdUsuario) throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		try {
			Usuario usuario = UsuarioDAO.loadUsuarioByORMID(aIdUsuario);
			Tweet tweet = TweetDAO.loadTweetByORMID(aIdTweetRetweteado);
			if (usuario != null && tweet != null) {
				// Añadimos la relación MANY-TO-MANY en el lado del tweet: retweteado_por
				if (!tweet.reetweteado_por.contains(usuario)) {
					tweet.reetweteado_por.add(usuario);
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
	 * Marca como "baneado" un usuario.
	 * Ahora recibe tanto el ID del administrador que realiza el baneo
	 * como el ID del usuario que debe ser baneado.
	 */
	public void banearUsuario(int aIdAdministrador, int idUsuario) throws PersistentException {
	    PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
	            .instance().getSession().beginTransaction();
	    try {
	        // 1. Cargamos el Administrador que realiza el baneo
	        base_de_datos.Administrador administrador = AdministradorDAO.loadAdministradorByORMID(aIdAdministrador);
	        if (administrador == null) {
	            throw new PersistentException("Administrador con ID " + aIdAdministrador + " no encontrado.");
	        }

	        // 2. Cargamos el Usuario que será baneado
	        Usuario usuario = UsuarioDAO.loadUsuarioByORMID(idUsuario);
	        if (usuario == null) {
	            throw new PersistentException("Usuario con ID " + idUsuario + " no encontrado.");
	        }

	        // 3. Asignamos el administrador como quien banea al usuario
	        usuario.setEs_baneado(administrador);

	        // 4. Guardamos el cambio en el usuario
	        UsuarioDAO.save(usuario);

	        t.commit();
	    } catch (Exception e) {
	        t.rollback();
	    } finally {
	        MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
	    }
	}

	public Usuario registrarse(String aNombre, String aPassword, String aMail, String aNickusuario, String aFotoFondo, String aFotoPerfil, String aDescripcion, Date aFecha_creacion) throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager.instance()
				.getSession().beginTransaction();
		Usuario usuario = null;
		try {
			usuario = UsuarioDAO.createUsuario();
			usuario.setDescripcion(aDescripcion);
			usuario.setFotoFondo(aFotoFondo);
			usuario.setFotoPerfil(aFotoPerfil);
			usuario.setMail(aMail);
			usuario.setNick(aNickusuario);
			usuario.setPassword(aPassword);
			usuario.setNombre(aNombre);
			UsuarioDAO.save(usuario);
			t.commit();
		}
		catch (Exception e){
			t.rollback();
		}
		
		MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
		return usuario;
	}

	/**
	 * Intenta iniciar sesión buscándolo por mail y contraseña.
	 * Devuelve el usuario coincidente, o null si no existe.
	 */
	public Usuario iniciarSesion(String aMail, String aPassword) throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		Usuario usuario = null;
		try {
			String condicion = "Mail = '" + aMail.replace("'", "''") + "' AND Password = '" + aPassword.replace("'", "''") + "'";
			Usuario[] encontrados = UsuarioDAO.listUsuarioByQuery(condicion, null);
			if (encontrados != null && encontrados.length > 0) {
				usuario = encontrados[0];
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		} finally {
			MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
		}
		return usuario;
	}
}