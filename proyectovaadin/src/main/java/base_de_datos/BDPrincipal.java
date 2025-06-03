package base_de_datos;

import base_de_datos.BD_Usuarios;
import base_de_datos.BD_Tweets;
import base_de_datos.BD_Comentarios;
import base_de_datos.BD_Administradores;
import base_de_datos.BD_Hashtags;
import base_de_datos.BD_Documentos;
import base_de_datos.Tweet;
import base_de_datos.Comentario;
import base_de_datos.Usuario;
import base_de_datos.Hashtag;

import java.util.Date;

import interfaz.Usuarioregistrado;
import interfaz.Cibernauta;
import interfaz.Administrador;
import interfaz.GoogleLogin;
import interfaz.Usuarionoregistrado;
import interfaz.Correo;

import org.orm.PersistentException;

/**
 * Clase principal que expone todos los servicios de BD_* a las interfaces exteriores.
 */
public class BDPrincipal implements 
        iUsuarioregistrado, 
        iAdministrador, 
        iGoogleLogin, 
        iCibernauta, 
        iUsuarionoregistrado, 
        iCorreo 
{
    public BD_Usuarios _bD_Usuario;
    public BD_Tweets _bD_Publicaciones;
    public BD_Comentarios _bD_Comentario;
    public BD_Administradores _bD_Administrador;
    public BD_Hashtags _bD_Hashtag;
    public BD_Documentos _bD_Documentos;

    public BDPrincipal() {
        _bD_Usuario = new BD_Usuarios();
        _bD_Publicaciones = new BD_Tweets();
        _bD_Comentario = new BD_Comentarios();
        _bD_Administrador = new BD_Administradores();
        _bD_Hashtag = new BD_Hashtags();
        _bD_Documentos = new BD_Documentos();
    }

    // iUsuarioregistrado / iCibernauta / iUsuarionoregistrado

    @Override
    public void borrarPerfil(String aMotivo, String aConfirmacion) {
        try {
            _bD_Usuario.borrarPerfil(aMotivo, aConfirmacion);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void seguirUsuario(int aIdSeguidor, int aIdSeguido) {
        try {
            _bD_Usuario.seguirUsuario(aIdSeguidor, aIdSeguido);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void dejarSeguir(int aIdSeguidor, int aIdSeguido) {
        try {
            _bD_Usuario.dejarSeguir(aIdSeguidor, aIdSeguido);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void quitarMegustaComentario(int aIdUsuario, int aIdComentario) {
        try {
            _bD_Comentario.quitarMegustaComentario(aIdUsuario, aIdComentario);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void actualizar(int aId, String aNombre, String aNickUsuario, String aContrasenia, 
            String aFotoPerfil, String aImgPerfil, String aDescripcion) 
    {
        try {
            _bD_Usuario.actualizar(aId, aNombre, aNickUsuario, aContrasenia, aFotoPerfil, aImgPerfil, aDescripcion);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Tweet escribirTweet(String aTexto, String[] aDocumentos, String[] aTipo) {
        // Nota: BD_Tweets.escribirTweet ahora requiere ID de usuario. 
        // Aquí asumimos que el usuario aIdUsuario se obtiene de contexto externo (por ejemplo, de la sesión).
        // Debe reemplazarse "0" por el ID real del usuario registrado que publica.
        int aIdUsuario = 0; // TODO: sustituir con ID real del usuario actual
        try {
            return _bD_Publicaciones.escribirTweet(aIdUsuario, aTexto, aDocumentos, aTipo);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Comentario escribirComentario(String aTexto) {
        try {
            return _bD_Comentario.escribirComentario(aTexto);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void darMegustaTweet(int aIdUsuario, int aIdTweet) {
        try {
            _bD_Publicaciones.darMegustaTweet(aIdUsuario, aIdTweet);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void darMegustaComentario(int aIdUsuario, String aIdComentario) {
        // BD_Comentarios.darMegustaComentario espera int aIdComentario
        int idComentarioInt = Integer.parseInt(aIdComentario);
        try {
            _bD_Comentario.darMegustaComentario(aIdUsuario, idComentarioInt);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void quitarMegusta(int aIdUsuario, int aIdTweet) {
        try {
            _bD_Publicaciones.quitarMegusta(aIdUsuario, aIdTweet);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Usuario[] cargarUsuariosMegustaTweet(int aIdUsuario) {
        try {
            return _bD_Usuario.cargarUsuariosMegustaTweet(aIdUsuario);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Tweet[] getTweetsByUserId(int aIdUsuario) {
        try {
            return _bD_Publicaciones.getTweetsByUserId(aIdUsuario);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Tweet retweet(int aIdTweetRetweteado, String aTexto) {
        // Al igual que escribirTweet, retweet requiere ID de usuario; usamos 0 como placeholder
        int aIdUsuario = 0; // TODO: sustituir por ID real del usuario actual
        try {
            return _bD_Publicaciones.retweet(aIdTweetRetweteado, aIdUsuario, aTexto);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Tweet[] cargarTweets() {
        try {
            return _bD_Publicaciones.cargarTweets();
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Comentario[] cargarComentarios() {
        try {
            return _bD_Comentario.cargarComentarios();
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Hashtag[] cargarHashtags() {
        try {
            return _bD_Hashtag.cargarHashtags();
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Usuario cargarPerfilUsuarioregistrado(int aIdUsuario) {
        try {
            return _bD_Usuario.cargarPerfiilUsuarioregistrado(aIdUsuario);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Usuario[] cargarUsuarios() {
        try {
            return _bD_Usuario.cargarUsuarios();
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Tweet[] cargarTweetsFiltrados(int aIdHashtag) {
        try {
            return _bD_Publicaciones.cargarTweetsFiltrados(aIdHashtag);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void borrarTweet(int aIdTweet) {
        try {
            _bD_Publicaciones.borrarTweet(aIdTweet);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void borrarComentario(int aIdComentario) {
        try {
            _bD_Comentario.borrarComentario(aIdComentario);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void banearUsuario(int aIdAdministrador, int aIdUsuario) {
        try {
            _bD_Usuario.banearUsuario(aIdAdministrador, aIdUsuario);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Usuario registrarse(String aNombre, String aPassword, String aMail, String aNickusuario, 
            String aFotoFondo, String aFotoPerfil, String aDescripcion, Date aFecha_creacion) 
    {
    	Usuario usuario = null;
        try {
            usuario = _bD_Usuario.registrarse(aNombre, aPassword, aMail, aNickusuario, aFotoFondo, aFotoPerfil, aDescripcion, aFecha_creacion);
        } catch (PersistentException e) {
            throw new RuntimeException(e);
        }
        return usuario;
    }

    @Override
    public UsuarioAutentificado iniciarSesion(String aMail, String aPassword) {
        UsuarioAutentificado u = null;
        try {
            // 1. Primero intentamos autenticación como usuario registrado
            u = _bD_Usuario.iniciarSesion(aMail, aPassword);
            if (u == null) {
                // 2. Si no encontramos usuario, probamos como administrador
                u = _bD_Administrador.iniciarSesion(aMail, aPassword);
            }
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return u;
    }

	@Override
	public UsuarioAutentificado findByUserMail(String aMail) {
		UsuarioAutentificado u = null;
		try {
			// 1. Primero intentamos encontrar usuario registrado
			u = _bD_Usuario.findByUserMail(aMail);
			if (u == null) {
				// 2. Si no encontramos usuario, probamos como administrador
				u = _bD_Administrador.findByUserMail(aMail);
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return u;
	}
}
