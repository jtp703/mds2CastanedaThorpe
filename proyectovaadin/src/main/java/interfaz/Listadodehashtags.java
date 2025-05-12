package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListadodehashtags;

public class Listadodehashtags extends VistaListadodehashtags{
	
	public VerListadohashtags _verListadohashtags;
	public Vector<Listadodehashtags_item> _item = new Vector<Listadodehashtags_item>();
	
	public Listadodehashtags(VerListadohashtags verListadohashtags) {
		_verListadohashtags = verListadohashtags;
		
		Listadodehashtags_item item0 = new Listadodehashtags_item(this);
		this.getContenedorHashtags().as(VerticalLayout.class).add(item0);
		Listadodehashtags_item item1 = new Listadodehashtags_item(this);
		this.getContenedorHashtags().as(VerticalLayout.class).add(item1);
	}
}