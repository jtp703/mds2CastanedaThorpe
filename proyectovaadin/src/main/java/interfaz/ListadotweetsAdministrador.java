package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Tweet;

public class ListadotweetsAdministrador extends Listadotweets {
	
	public VermuroprincipalAdministrador _vermuroprincipalAdministrador;
	public VerlistadodetweetsfiltradoAdministrador _verlistadodetweetsfiltradoAdministrador;
	public VerperfilAdministrador _verperfiladministrador;
	public Vector<ListadotweetsAdministrador_item> _item = new Vector<ListadotweetsAdministrador_item>();
	public Administrador _administrador;
	
	public ListadotweetsAdministrador(VermuroprincipalAdministrador _vermuroprincipalAdministrador) {
		super(_vermuroprincipalAdministrador);
		this.getContenedorNuevoTweet().setVisible(false);
		
		this._administrador = _vermuroprincipalAdministrador._administrador;
		
		Tweet[] tweets = this._administrador._iAdministrador.cargarTweets();
		for (int i = 0; i < tweets.length; i++) {
			ListadotweetsAdministrador_item item = new ListadotweetsAdministrador_item(this, tweets[i]);
			_item.add(item);
			this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		}
		
	}
	public ListadotweetsAdministrador(VerlistadodetweetsfiltradoAdministrador _verlistadodetweetsfiltradoAdministrador) {
		super(_verlistadodetweetsfiltradoAdministrador, null);
	}
	
	public ListadotweetsAdministrador(VerperfilAdministrador _verperfiladministrador) {
		super(_verperfiladministrador);
		this.getContenedorNuevoTweet().setVisible(false);
		this._vermuroprincipalAdministrador = _verperfiladministrador._vermuroprincipalAdministrador;
		
		Tweet[] tweets = _verperfiladministrador.usuario.tweetea.toArray();
		
		for (int i = 0; i < tweets.length; i++) {
			ListadotweetsAdministrador_item item = new ListadotweetsAdministrador_item(this, tweets[i]);
			_item.add(item);
			this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		}
	}
	
	public ListadotweetsAdministrador(Retweets _retweets, Tweet[] tweets) {
		super(_retweets);
		this.getContenedorNuevoTweet().setVisible(false);
		this._vermuroprincipalAdministrador = _retweets._verperfilAdministrador._vermuroprincipalAdministrador;
		if(tweets == null) {
			Notification.show("No hay tweets para mostrar.", 3000, Position.MIDDLE);
			return;
		}
		for (int i = 0; i < tweets.length; i++) {
			ListadotweetsAdministrador_item item = new ListadotweetsAdministrador_item(this, tweets[i]);
			_item.add(item);
			this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		}
	}
	
	public ListadotweetsAdministrador(Megustas _megustas, Tweet[] tweets) {
		super(_megustas);
		this.getContenedorNuevoTweet().setVisible(false);
		this._vermuroprincipalAdministrador = _megustas._verperfilAdministrador._vermuroprincipalAdministrador;
		if(tweets == null) {
			Notification.show("No hay tweets para mostrar.", 3000, Position.MIDDLE);
			return;
		}
		for (int i = 0; i < tweets.length; i++) {
			ListadotweetsAdministrador_item item = new ListadotweetsAdministrador_item(this, tweets[i]);
			_item.add(item);
			this.getContenedorListadoTweets_item().as(VerticalLayout.class).add(item);
		}
	}
	
}