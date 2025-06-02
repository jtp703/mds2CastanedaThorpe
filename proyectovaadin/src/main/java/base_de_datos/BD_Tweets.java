package base_de_datos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import base_de_datos.Tweet;

public class BD_Tweets {
	public BDPrincipal _bD_principal;
	public Vector<Tweet> _contiene_publicaciones = new Vector<Tweet>();

	public Tweet[] cargarTweets() {
		throw new UnsupportedOperationException();
	}

	public void borrarTweet(int aIdTweet) {
		throw new UnsupportedOperationException();
	}

	public Tweet escribirTweet(String aTexto, String[] aDocumentos, String[] aTipo) {
		throw new UnsupportedOperationException();
	}

	public void darMegustaTweet(int aIdUsuario, int aIdTweet) {
		throw new UnsupportedOperationException();
	}

	public void quitarMegusta(int aIdUsuario, int aIdTweet) {
		throw new UnsupportedOperationException();
	}

	public Tweet[] getTweetsByUserId(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Tweet[] cargarTweetsFiltrados(int aIdHashtag) {
		throw new UnsupportedOperationException();
	}

	public Tweet retweet(int aIdTweetRetweteado, String aTexto) {
		throw new UnsupportedOperationException();
	}
}