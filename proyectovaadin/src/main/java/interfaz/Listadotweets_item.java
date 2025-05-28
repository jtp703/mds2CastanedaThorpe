package interfaz;

import vistas.VistaListadotweets_item;

public class Listadotweets_item extends VistaListadotweets_item {
	
	//private event _darmegusta;
	//private label _nickUsuario;
	//private image _perfilUsuario;
	private int _numRetweets;
	private int _numComentarios;
	
	public base_de_datos.Tweet tweet;

	public Listadotweets _listadotweets;
	public Vercomentarios _vercomentarios;

	public Listadotweets_item(Listadotweets listadoTweets, base_de_datos.Tweet tweet) {
		this._listadotweets = listadoTweets;
		this.tweet = tweet;
		this.getVerperfil().setText(tweet.getTweeteado_por().getNick());
		this.getTextoTweet().setText(tweet.getTexto());
		this.getnComentarios().setText(String.valueOf(tweet.getNumComentarios()));
		this.getnRetweets().setText(String.valueOf(tweet.getNumRetweets()));
		this.getnMegustas().setText(String.valueOf(tweet.getNumMegustas()));
		//falta funcionalidad settear mg y retweet con color si el usuario ya lo ha hecho.
		//falta funcionalidad imagen.
	}

	public Listadotweets_item(Vercomentarios _vercomentarios, base_de_datos.Tweet tweet) {
		this._vercomentarios = _vercomentarios;
		this.tweet = tweet;
	}
}