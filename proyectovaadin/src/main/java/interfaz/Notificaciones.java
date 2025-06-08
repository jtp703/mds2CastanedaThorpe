package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Tweet;
import base_de_datos.Usuario;
import vistas.VistaNotificaciones;

public class Notificaciones extends VistaNotificaciones {

	public Notificacionesdeusuario notificacionesDeUsuario;
	public Vector<Notificaciones_item> _vectoritem = new Vector<Notificaciones_item>();
	public Usuario _usuario;
	
	public Notificaciones(Notificacionesdeusuario notificacionesDeUsuario) {
		this.notificacionesDeUsuario = notificacionesDeUsuario;
		this._usuario = notificacionesDeUsuario._usuarioregistrado._usuarioregistrado;
		this.getBtnMegustas().addClickListener(event -> VerNoticacionesMeGustas());
		this.getBtnRetweets().addClickListener(event -> VerNoticacionesRetweets());
		this.getBtnMenciones().addClickListener(event -> VerNoticacionesMenciones());
		this.getBtnSeguidores().addClickListener(event -> VerNoticacionesSeguidores());
	}
	
	public void VerNoticacionesMeGustas() {
		this.getContenedorNofiticiacionesItem().as(VerticalLayout.class).removeAll();
		if(_usuario.tweetea.toArray().length == 0) {
			return;
		}
		for(Tweet tweet: _usuario.tweetea.toArray()) {
			
			for(Usuario usuario: tweet.likeado_por.toArray()) {
				if(usuario.getNick().equals(_usuario.getNick())) {
					Notificaciones_item item = new Notificaciones_item(this, usuario, ("Te ha dado un me gusta a tu tweet"));
					this.getContenedorNofiticiacionesItem().as(VerticalLayout.class).add(item);
					_vectoritem.add(item);
				}
			}
		}
		
	}
	
	public void VerNoticacionesRetweets() {
		this.getContenedorNofiticiacionesItem().as(VerticalLayout.class).removeAll();
		
		for(Tweet tweet: _usuario.tweetea.toArray()) {
			if(tweet.reetweteado_por.toArray().length == 0) {
				return;
			}
			for(Usuario usuario: tweet.reetweteado_por.toArray()) {
				if(usuario.getNick().equals(_usuario.getNick())) {
					Notificaciones_item item = new Notificaciones_item(this, usuario, ("Te ha dado retweet a tu tweet"));
					this.getContenedorNofiticiacionesItem().as(VerticalLayout.class).add(item);
					_vectoritem.add(item);
				}
			}
		}
		
	}
	public void VerNoticacionesMenciones() {
		this.getContenedorNofiticiacionesItem().as(VerticalLayout.class).removeAll();

        Notification.show("Futura implementacion de menciones", 3000, Notification.Position.MIDDLE);
	}
	public void VerNoticacionesSeguidores() {
		this.getContenedorNofiticiacionesItem().as(VerticalLayout.class).removeAll();
		if(_usuario.es_seguido.toArray().length == 0) {
			 Notification.show("Aun no tienes seguidores nuevos", 3000, Notification.Position.MIDDLE);
			return;
		}
		for(Usuario usuario: _usuario.es_seguido.toArray()) {
			Notificaciones_item item = new Notificaciones_item(this, usuario, ("Te ha seguido"));
			
			this.getContenedorNofiticiacionesItem().as(VerticalLayout.class).add(item);
			_vectoritem.add(item);
		}
	}
}
