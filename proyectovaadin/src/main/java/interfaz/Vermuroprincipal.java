package interfaz;

import vistas.VistaVermuroprincipal;

public class Vermuroprincipal extends VistaVermuroprincipal {
	/*private label _nickUsuario;
	private image _fotoPerfil;
	private label _descripcion;*/
	public Cibernauta _cibernauta;
	public Listadotweets _listadotweets;
	public Vermuroprincipal() {
		
	}
	
	public Vermuroprincipal(Cibernauta _cibernauta) {
		this._cibernauta = _cibernauta;
	}
	public Vermuroprincipal(Listadotweets _listadotweets) {
		this._listadotweets = _listadotweets;
	}

	public void ListadoTweets() {
		throw new UnsupportedOperationException();
	}
}