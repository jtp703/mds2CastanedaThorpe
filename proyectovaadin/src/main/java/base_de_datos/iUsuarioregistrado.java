package base_de_datos;

import base_de_datos.Tweet;
import base_de_datos.Comentario;
import base_de_datos.Usuario;

public interface iUsuarioregistrado extends iCibernauta {

	public void borrarPerfil(String aMotivo, String aConfirmacion);

	public void seguirUsuario(int aIdSeguidor, int aIdSeguido);

	public void dejarSeguir(int aIdSeguidor, int aIdSeguido);

	public void quitarMegustaComentario(int aIdUsuario, int aIdComentario);

	public void actualizar(int aId, String aNombre, String aNickUsuario, String aContrasenia, String aFotoPerfil, String aImgPerfil, String aDescripcion);

	public Tweet escribirTweet(int idUsuario, String aTexto, String[] aDocumentos, String[] aTipo);

	public Comentario escribirComentario(int idUsuario, int idTweet, String aTexto);

	public void darMegustaTweet(int aIdUsuario, int aIdTweet);

	public void darMegustaComentario(int aIdUsuario, String aIdComentario);

	public void quitarMegusta(int aIdUsuario, int aIdTweet);

	public Usuario[] cargarUsuariosMegustaTweet(int aIdUsuario);

	public Tweet[] getTweetsByUserId(int aIdUsuario);

	public Tweet retweet(int aIdTweetRetweteado, String aTexto);
}