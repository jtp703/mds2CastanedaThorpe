package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadotweetsUsuarioregistrado extends Listadotweets {
	
	public VermuroprincipalUsuarioregistrado _vermuroprincipalUsuarioregistrado;
	public VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado;
	public VerperfilUsuarioregistrado _verperfilUsuarioregistrado;
	public Vector<ListadotweetsUsuarioregistrado_item> _listadotweetsUsuarioregistrado = new Vector<ListadotweetsUsuarioregistrado_item>();
	
	public ListadotweetsUsuarioregistrado(VermuroprincipalUsuarioregistrado vermuroprincipalUsuarioregistrado) {
		super(vermuroprincipalUsuarioregistrado);
		ListadotweetsUsuarioregistrado_item item = new ListadotweetsUsuarioregistrado_item(this);
		this.getContenedorListadoTweets_item().as(VerticalLayout.class).add(item);
		ListadotweetsUsuarioregistrado_item item2 = new ListadotweetsUsuarioregistrado_item(this);
		this.getContenedorListadoTweets_item().as(VerticalLayout.class).add(item2);
		
	}
	
	public ListadotweetsUsuarioregistrado(VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado) {
		super(_verlistadodetweetsfiltradoUsuarioregistrado);
	}
	
	public ListadotweetsUsuarioregistrado(VerperfilUsuarioregistrado _verperfilUsuarioregistrado) {
		super(_verperfilUsuarioregistrado);
		ListadotweetsUsuarioregistrado_item item = new ListadotweetsUsuarioregistrado_item(this);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		ListadotweetsUsuarioregistrado_item item2 = new ListadotweetsUsuarioregistrado_item(this);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(item2);
	}
}