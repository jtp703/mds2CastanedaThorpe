package interfaz;

import vistas.VistaVerlistadodetweetsfiltrado;

public class Verlistadodetweetsfiltrado extends VistaVerlistadodetweetsfiltrado {
	
	public Listadodehashtags_item _item;
	public Listadotweets _listadotweets;
	public Cibernauta cibernauta;

	public Verlistadodetweetsfiltrado(Cibernauta cibernauta) {
		this.cibernauta = cibernauta;
	}
	public Verlistadodetweetsfiltrado(Listadodehashtags_item _item) {
		this._item = _item;
	}
	
	public Verlistadodetweetsfiltrado(Listadotweets _listadotweets) {
		this._listadotweets = _listadotweets;
	}
	
	public void Listado_Tweets() {
		throw new UnsupportedOperationException();
	}
}