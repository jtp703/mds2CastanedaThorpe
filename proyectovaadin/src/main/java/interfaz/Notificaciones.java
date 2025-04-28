package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNotificaciones;

public class Notificaciones extends VistaNotificaciones {

	public Notificacionesdeusuario notificacionesDeUsuario;
	public Vector<Notificaciones_item> _item = new Vector<Notificaciones_item>();
	
	public Notificaciones(Notificacionesdeusuario notificacionesDeUsuario) {
		this.notificacionesDeUsuario = notificacionesDeUsuario;
		
		Notificaciones_item item0 = new Notificaciones_item(this);
		this.getContenedorNotificaciones().as(VerticalLayout.class).add(item0);
		Notificaciones_item item1 = new Notificaciones_item(this);
		this.getContenedorNotificaciones().as(VerticalLayout.class).add(item1);
	}
}
