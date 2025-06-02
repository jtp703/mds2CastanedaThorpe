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

public class BDPrincipal implements iUsuarioregistrado, iAdministrador, iGoogleLogin, iCibernauta, iUsuarionoregistrado, iCorreo {
	public BD_Usuarios _bD_Usuario;
	public BD_Tweets _bD_Publicaciones;
	public BD_Comentarios _bD_Comentario;
	public BD_Administradores _bD_Administrador;
	public BD_Hashtags _bD_Hashtag;
	public BD_Documentos _bD_Documentos;

	public void borrarPerfil(String aMotivo, String aConfirmacion) {
		throw new UnsupportedOperationException();
	}

	public void seguirUsuario(int aIdSeguidor, int aIdSeguido) {
		throw new UnsupportedOperationException();
	}

	public void dejarSeguir(int aIdSeguidor, int aIdSeguido) {
		throw new UnsupportedOperationException();
	}

	public void quitarMegustaComentario(int aIdUsuario, int aIdComentario) {
		throw new UnsupportedOperationException();
	}

	public void actualizar(int aId, String aNombre, String aNickUsuario, String aContrasenia, String aFotoPerfil, String aImgPerfil, String aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public Tweet escribirTweet(String aTexto, String[] aDocumentos, String[] aTipo) {
		throw new UnsupportedOperationException();
	}

	public Comentario escribirComentario(String aTexto) {
		throw new UnsupportedOperationException();
	}

	public void darMegustaTweet(int aIdUsuario, int aIdTweet) {
		throw new UnsupportedOperationException();
	}

	public void darMegustaComentario(int aIdUsuario, String aIdComentario) {
		throw new UnsupportedOperationException();
	}

	public void quitarMegusta(int aIdUsuario, int aIdTweet) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] cargarUsuariosMegustaTweet(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Tweet[] getTweetsByUserId(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Tweet retweet(int aIdTweetRetweteado, String aTexto) {
		throw new UnsupportedOperationException();
	}

	public Tweet[] cargarTweets() {
		throw new UnsupportedOperationException();
	}

	public Comentario[] cargarComentarios() {
		throw new UnsupportedOperationException();
	}

	public Hashtag[] cargarHashtags() {
		throw new UnsupportedOperationException();
	}

	public Usuario cargarPerfilUsuarioregistrado(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] cargarUsuarios() {
		throw new UnsupportedOperationException();
	}

	public Tweet[] cargarTweetsFiltrados(int aIdHashtag) {
		throw new UnsupportedOperationException();
	}

	public void borrarTweet(int aIdTweet) {
		throw new UnsupportedOperationException();
	}

	public void borrarComentario(int aIdComentario) {
		throw new UnsupportedOperationException();
	}

	public void banearUsuario(int aIdAdministrador, Object aParameter) {
		throw new UnsupportedOperationException();
	}

	public void registrarse(String aNombre, String aPassword, String aMail, String aNickusuario, String aFotoFondo, String aFotoPerfil, String aDescripcion, Date aFecha_creacion) {
		throw new UnsupportedOperationException();
	}

	public Usuario iniciarSesion(String aMail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public Usuarioregistrado get_Usuarioregistrado() {
		throw new UnsupportedOperationException();
	}

	public Cibernauta get_Cibernauta() {
		throw new UnsupportedOperationException();
	}

	public Administrador get_Administrador() {
		throw new UnsupportedOperationException();
	}

	public GoogleLogin get_GoogleLogin() {
		throw new UnsupportedOperationException();
	}

	public Usuarionoregistrado get_Usuarionoregistrado() {
		throw new UnsupportedOperationException();
	}

	public Correo get_Correo() {
		throw new UnsupportedOperationException();
	}
}