package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Hashtag;
import vistas.VistaVerlistadodetweetsfiltrado;

public class Verlistadodetweetsfiltrado extends VistaVerlistadodetweetsfiltrado {
	
	public Listadodehashtags_item _item;
	public Listadotweets _listadotweets;
	public Cibernauta cibernauta;

	public Verlistadodetweetsfiltrado(Cibernauta cibernauta) {
		this.cibernauta = cibernauta;
	}
	
	public Verlistadodetweetsfiltrado(Listadodehashtags_item _item, Hashtag _hashtag) {
		this._item = _item;
		_listadotweets = new Listadotweets(this, _hashtag);
		_listadotweets.getContenedorNuevoTweet().setVisible(false);
		this.getContenedorListadoTweetsFiltrado().as(VerticalLayout.class).add(_listadotweets);
	}
	
	public Verlistadodetweetsfiltrado(Listadotweets _listadotweets) {
		this._listadotweets = _listadotweets;
	}
	
	public void Listado_Tweets() {
		throw new UnsupportedOperationException();
	}
}