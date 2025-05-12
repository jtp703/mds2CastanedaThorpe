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
	
	public Listadodehashtags_item(Listadodehashtags listadodehashtag){
		_listadodehashtags = listadodehashtag;
		this.getNombrehashtag().addClickListener(event -> Verlistadodetweetsfiltrado());
	}
	
	public void Verlistadodetweetsfiltrado() {
		
		this._listadodehashtags.getContenedorHashtags().as(VerticalLayout.class).removeAll();
		
		_verlistadodetweetsfiltrado = new Verlistadodetweetsfiltrado(this);
		this._listadodehashtags.getContenedorHashtags().as(VerticalLayout.class).add(_verlistadodetweetsfiltrado);
		/*
		MainView mn = MainView.getInstance();
		System.out.println(mn.getComponentCount());
		System.out.println("Listado item hashtags");
		mn.u.getContenedorContenido().as(VerticalLayout.class).removeAll();
		mn.u.getContenedorContenido().as(VerticalLayout.class).add(_verlistadodetweetsfiltrado);
		*/
	}
	
}