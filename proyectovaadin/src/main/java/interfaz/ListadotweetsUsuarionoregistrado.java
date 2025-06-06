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
		this.getContenedorNuevoTweet().setVisible(false);
		ListadotweetsUsuarionoregistrado_item item1 = new ListadotweetsUsuarionoregistrado_item(this, null);
		ListadotweetsUsuarionoregistrado_item item2 = new ListadotweetsUsuarionoregistrado_item(this, null);
		_listadotweetsUsuarionoregistrado.add(item1);
		_listadotweetsUsuarionoregistrado.add(item2);
		for(ListadotweetsUsuarionoregistrado_item item: _listadotweetsUsuarionoregistrado) {
			this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
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
		
		ListadotweetsUsuarionoregistrado_item item1 = new ListadotweetsUsuarionoregistrado_item(this, null);
		ListadotweetsUsuarionoregistrado_item item2 = new ListadotweetsUsuarionoregistrado_item(this, null);
		_listadotweetsUsuarionoregistrado.add(item1);
		_listadotweetsUsuarionoregistrado.add(item2);
		for(ListadotweetsUsuarionoregistrado_item item: _listadotweetsUsuarionoregistrado) {
			this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		}
	}
}
