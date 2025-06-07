package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import base_de_datos.Tweet;

public class ListadotweetsUsuarionoregistrado extends Listadotweets {
	
	public VerperfilUsuarionoregistrado _verperfilUsuarionoregistrado;
	public VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado;
	public VermuroprincipalUsuarionoregistrado _vermuroPrincipalUsuarionoregistrado;
	public Vector<ListadotweetsUsuarionoregistrado_item> _listadotweetsUsuarionoregistrado = new Vector<ListadotweetsUsuarionoregistrado_item>();

	public ListadotweetsUsuarionoregistrado(VerperfilUsuarionoregistrado _verperfilUsuarionoregistrado) {
		super(_verperfilUsuarionoregistrado);
		
		_verperfilUsuarionoregistrado.usuario.likea.toArray();
		for (Tweet t : _verperfilUsuarionoregistrado.usuario.tweetea.toArray()) {
			ListadotweetsUsuarionoregistrado_item item = new ListadotweetsUsuarionoregistrado_item(this, t);
			_listadotweetsUsuarionoregistrado.add(item);
			this.getContenedorListadoTweets_item().as(VerticalLayout.class).add(item);
		}
	}
	
	public ListadotweetsUsuarionoregistrado(VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado) {
		super(_verlistadodetweetsfiltradoUsuarioregistrado, null);
	}
	
	public ListadotweetsUsuarionoregistrado(VermuroprincipalUsuarionoregistrado _vermuroPrincipalUsuarionoregistrado) {
		super(_vermuroPrincipalUsuarionoregistrado);
		this.getContenedorNuevoTweet().setVisible(false);
		
		try {
			Tweet[] tweets = _vermuroPrincipalUsuarionoregistrado._usuarioNoRegistrado._iUsuarionoregistrado.cargarTweets();
			if (tweets != null) {
				for (Tweet t : tweets) {
					ListadotweetsUsuarionoregistrado_item item = new ListadotweetsUsuarionoregistrado_item(this, t);
					_listadotweetsUsuarionoregistrado.add(item);
					this.getContenedorListadoTweets_item().as(VerticalLayout.class).add(item);
				}
			}
		} catch (Exception pe) {
			Notification.show("No se pudieron cargar los tweets: " + pe.getMessage(), 3000, Position.MIDDLE);
		}
	}
	
	public ListadotweetsUsuarionoregistrado(Retweets _retweets, Tweet[] tweets) {
		super(_retweets);
		this.getContenedorNuevoTweet().setVisible(false);
		this._vermuroPrincipalUsuarionoregistrado = _retweets._verperfilUsuarionoregistrado._vermuroPrincipalUsuarionoregistrado;
		if(tweets == null) {
			Notification.show("No hay tweets para mostrar.", 3000, Position.MIDDLE);
			return;
		}
		if (tweets != null) {
			for (Tweet t : tweets) {
				ListadotweetsUsuarionoregistrado_item item = new ListadotweetsUsuarionoregistrado_item(this, t);
				_listadotweetsUsuarionoregistrado.add(item);
				this.getContenedorListadoTweets_item().as(VerticalLayout.class).add(item);
			}
		}
	}

	public ListadotweetsUsuarionoregistrado(Megustas _megustas, Tweet[] tweets) {
		super(_megustas);
		this.getContenedorNuevoTweet().setVisible(false);
		this._vermuroPrincipalUsuarionoregistrado = _megustas._verperfilUsuarionoregistrado._vermuroPrincipalUsuarionoregistrado;
		if(tweets == null) {
			Notification.show("No hay tweets para mostrar.", 3000, Position.MIDDLE);
			return;
		}
		if (tweets != null) {
			for (Tweet t : tweets) {
				ListadotweetsUsuarionoregistrado_item item = new ListadotweetsUsuarionoregistrado_item(this, t);
				_listadotweetsUsuarionoregistrado.add(item);
				this.getContenedorListadoTweets_item().as(VerticalLayout.class).add(item);
			}
		}
	}
}