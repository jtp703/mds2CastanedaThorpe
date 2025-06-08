package base_de_datos;

import base_de_datos.Tweet;
import base_de_datos.Comentario;
import base_de_datos.Hashtag;
import base_de_datos.Usuario;

public interface iCibernauta {

	public Tweet[] cargarTweets();

	public Comentario[] cargarComentarios();

	public Hashtag[] cargarHashtags();

	public Usuario cargarPerfilUsuarioregistrado(int aIdUsuario);

	public Usuario[] cargarUsuarios();

	public Tweet[] cargarTweetsFiltrados(int aIdHashtag);
}