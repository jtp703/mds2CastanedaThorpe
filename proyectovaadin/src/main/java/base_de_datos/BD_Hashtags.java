package base_de_datos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import base_de_datos.Hashtag;

public class BD_Hashtags {
	public BDPrincipal _bD_principal;
	public Vector<Hashtag> _contiene_hashtags = new Vector<Hashtag>();

	public Hashtag[] cargarHashtags() {
		throw new UnsupportedOperationException();
	}

	public void addHashtag(int aIdTweet, int aIdHashtag) {
		throw new UnsupportedOperationException();
	}
}