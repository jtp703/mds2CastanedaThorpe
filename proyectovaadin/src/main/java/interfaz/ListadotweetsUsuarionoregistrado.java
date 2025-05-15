package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadotweetsUsuarionoregistrado extends Listadotweets {
	
	public VerperfilUsuarionoregistrado _verperfilUsuarionoregistrado;
	public VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado;
	public VermuroprincipalUsuarionoregistrado _vermuroPrincipalUsuarionoregistrado;
	public Vector<ListadotweetsUsuarionoregistrado_item> _listadotweetsUsuarionoregistrado = new Vector<ListadotweetsUsuarionoregistrado_item>();

	public ListadotweetsUsuarionoregistrado(VerperfilUsuarionoregistrado _verperfilUsuarionoregistrado) {
		super(_verperfilUsuarionoregistrado);
		this.getContenedorNuevoTweet().setVisible(false);
		ListadotweetsUsuarionoregistrado_item item = new ListadotweetsUsuarionoregistrado_item(this);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		ListadotweetsUsuarionoregistrado_item item2 = new ListadotweetsUsuarionoregistrado_item(this);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(item2);
	}
	
	public ListadotweetsUsuarionoregistrado(VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado) {
		super(_verlistadodetweetsfiltradoUsuarioregistrado);
	}
	
	public ListadotweetsUsuarionoregistrado(VermuroprincipalUsuarionoregistrado _vermuroPrincipalUsuarionoregistrado) {
		super(_vermuroPrincipalUsuarionoregistrado);
		this.getContenedorNuevoTweet().setVisible(false);
		ListadotweetsUsuarionoregistrado_item item = new ListadotweetsUsuarionoregistrado_item(this);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		ListadotweetsUsuarionoregistrado_item item2 = new ListadotweetsUsuarionoregistrado_item(this);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(item2);
	}
}
