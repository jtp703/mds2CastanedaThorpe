package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Hashtag;
import vistas.VistaListadotweets;

public class Listadotweets extends VistaListadotweets {
	public Megustas _megustas;
	public Retweets _retweets;
	public Verlistadodetweetsfiltrado _verlistadodetweetsfiltrado;
	public Verperfildeusuario _verperfildeusuario;
	public Vermuroprincipal _vermuroprincipal;
	public Vector<Listadotweets_item> _item = new Vector<Listadotweets_item>();
	

	public Listadotweets(Megustas _megustas) {
		this._megustas = _megustas;
	}
	public Listadotweets(Retweets _retweets) {
		this._retweets = _retweets;
	}
	public Listadotweets(Verlistadodetweetsfiltrado _verlistadodetweetsfiltrado, Hashtag _hashtag) {
		this._verlistadodetweetsfiltrado = _verlistadodetweetsfiltrado;
		Listadotweets_item i = new Listadotweets_item(this, null);
		i.getBtnEliminarTweet().setVisible(false);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(i);
		Listadotweets_item is = new Listadotweets_item(this, null);
		is.getBtnEliminarTweet().setVisible(false);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(is);
		
		if(_hashtag != null) {
			try {
				for(base_de_datos.Tweet tweet: _verlistadodetweetsfiltrado.cibernauta._iCibernauta.cargarTweetsFiltrados(_hashtag.getIdHashtag())) {
					Listadotweets_item item = new Listadotweets_item(this, tweet);
					item.getBtnEliminarTweet().setVisible(false);
					item.getContenedorInteracciones().setVisible(false);
					_item.add(item);
					this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
				}
			} catch (Exception e) {
				e.printStackTrace();
	            Notification.show(
	                    "No se pudieron cargar los tweets dado que no hay tweets con dicho hashtag " + e.getMessage(),
	                    3000, Position.MIDDLE
	                );
			}
		}
		
	}
	public Listadotweets(Verperfildeusuario _verperfildeusuario) {
		this._verperfildeusuario = _verperfildeusuario;
	}
	public Listadotweets(Vermuroprincipal _vermuroprincipal) {
		this._vermuroprincipal = _vermuroprincipal;
	}
	
}