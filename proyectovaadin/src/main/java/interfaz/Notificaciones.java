package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNotificaciones;

public class Notificaciones extends VistaNotificaciones {

	public Notificacionesdeusuario notificacionesDeUsuario;
	public Vector<Notificaciones_item> _vectoritem = new Vector<Notificaciones_item>();
	
	public Notificaciones(Notificacionesdeusuario notificacionesDeUsuario) {
		this.notificacionesDeUsuario = notificacionesDeUsuario;
		this.getBtnMegustas().addClickListener(event -> VerNoticacionesMeGustas());
		this.getBtnRetweets().addClickListener(event -> VerNoticacionesRetweets());
		this.getBtnMenciones().addClickListener(event -> VerNoticacionesMenciones());
		this.getBtnSeguidores().addClickListener(event -> VerNoticacionesSeguidores());
		
		
	}
	
	public void VerNoticacionesMeGustas() {
		this.getContenedorNofiticiacionesItem().as(VerticalLayout.class).removeAll();
		Notificaciones_item item0 = new Notificaciones_item(this, null);
		Notificaciones_item item1 = new Notificaciones_item(this, null);
		_vectoritem.add(item0);
		_vectoritem.add(item1);
		for(Notificaciones_item item: _vectoritem) {
			item.getTipoNotificacion().setText("Te ha dado me gusta en un tweet");
			this.getContenedorNofiticiacionesItem().as(VerticalLayout.class).add(item);
		}
	}
	public void VerNoticacionesRetweets() {
		this.getContenedorNofiticiacionesItem().as(VerticalLayout.class).removeAll();
		Notificaciones_item item0 = new Notificaciones_item(this, null);
		Notificaciones_item item1 = new Notificaciones_item(this, null);
		_vectoritem.add(item0);
		_vectoritem.add(item1);
		for(Notificaciones_item item: _vectoritem) {
			item.getTipoNotificacion().setText("Te ha retweeteado un tweet");
			this.getContenedorNofiticiacionesItem().as(VerticalLayout.class).add(item);
		}
	}
	public void VerNoticacionesMenciones() {
		this.getContenedorNofiticiacionesItem().as(VerticalLayout.class).removeAll();
		Notificaciones_item item0 = new Notificaciones_item(this, null);
		Notificaciones_item item1 = new Notificaciones_item(this, null);
		_vectoritem.add(item0);
		_vectoritem.add(item1);
		for(Notificaciones_item item: _vectoritem) {
			item.getTipoNotificacion().setText("Te ha mencionado en un tweet");
			this.getContenedorNofiticiacionesItem().as(VerticalLayout.class).add(item);
		}
	}
	public void VerNoticacionesSeguidores() {
		this.getContenedorNofiticiacionesItem().as(VerticalLayout.class).removeAll();
		Notificaciones_item item0 = new Notificaciones_item(this, null);
		Notificaciones_item item1 = new Notificaciones_item(this, null);
		_vectoritem.add(item0);
		_vectoritem.add(item1);
		for(Notificaciones_item item: _vectoritem) {
			item.getTipoNotificacion().setText("Te ha seguido");
			this.getContenedorNofiticiacionesItem().as(VerticalLayout.class).add(item);
		}
	}
}
