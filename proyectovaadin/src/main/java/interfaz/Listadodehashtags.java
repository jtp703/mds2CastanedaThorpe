package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListadodehashtags;

public class Listadodehashtags extends VistaListadodehashtags{
	
	public VerListadohashtags _verListadohashtags;
	public Vector<Listadodehashtags_item> _item = new Vector<Listadodehashtags_item>();
	public Listadodehashtags(VerListadohashtags verListadohashtags) {
		_verListadohashtags = verListadohashtags;
		if(verListadohashtags._cibernauta._iCibernauta.cargarHashtags() == null) {
			Notification.show("El listado hashtags puede estar vacío");
			return;
		}
			
		for(base_de_datos.Hashtag hashtag: verListadohashtags._cibernauta._iCibernauta.cargarHashtags()) {
			Listadodehashtags_item item = new Listadodehashtags_item(this, hashtag);
			_item.add(item);
			this.getContenedorHashtags().as(VerticalLayout.class).add(item);
		}
	}
}