package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListadodehashtags_item;

public class Listadodehashtags_item extends VistaListadodehashtags_item{
	/*private label _hashtag;
	private label _menciones;*/
	private int _numeroMenciones;
	public Listadodehashtags _listadodehashtags;
	public Verlistadodetweetsfiltrado _verlistadodetweetsfiltrado;
	public base_de_datos.Hashtag _hashtag;
	
	public Listadodehashtags_item(Listadodehashtags listadodehashtag, base_de_datos.Hashtag hashtag) {
		_listadodehashtags = listadodehashtag;
		this._hashtag = hashtag;
		this.getNombrehashtag().setText(hashtag.getNombre());
		this.getIdNumeroInteraccionesHashtag().setText(String.valueOf(hashtag.getNumMenciones()));
		this.getNombrehashtag().addClickListener(event -> Verlistadodetweetsfiltrado());
		
	}
	
	public void Verlistadodetweetsfiltrado() {
		
		this._listadodehashtags.getContenedorHashtags().as(VerticalLayout.class).removeAll();
		
		_verlistadodetweetsfiltrado = new Verlistadodetweetsfiltrado(this);
		this._listadodehashtags.getContenedorHashtags().as(VerticalLayout.class).add(_verlistadodetweetsfiltrado);
		
	}
	
}