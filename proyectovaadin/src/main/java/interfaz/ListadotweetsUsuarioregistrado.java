package interfaz;

import java.util.Vector;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadotweetsUsuarioregistrado extends Listadotweets {
	
	public VermuroprincipalUsuarioregistrado _vermuroprincipalUsuarioregistrado;
	public VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado;
	public VerperfilUsuarioregistrado _verperfilUsuarioregistrado;
	public ListadotweetsUsuarioregistrado_item _listadotweetsUsuarioregistrado;
	public Verperfilpersonal _verperfilpersonal;
	
	public ListadotweetsUsuarioregistrado(VermuroprincipalUsuarioregistrado vermuroprincipalUsuarioregistrado) {
		super(vermuroprincipalUsuarioregistrado);
		//_verperfilpersonal = new Verperfilpersonal(new Usuarioregistrado(this));
		this._listadotweetsUsuarioregistrado = new ListadotweetsUsuarioregistrado_item(this, null);
		this.getContenedorListadoTweets_item().as(VerticalLayout.class).add(_listadotweetsUsuarioregistrado);
		ListadotweetsUsuarioregistrado_item item2 = new ListadotweetsUsuarioregistrado_item(this, null);
		this.getContenedorListadoTweets_item().as(VerticalLayout.class).add(item2);
		this.getBtnEnviarTweet().addClickListener(event -> Enviartweet());
		//this.getVerPerfilPersonal().addClickListener(event -> verPerfilPersonal());
	}
	
	public ListadotweetsUsuarioregistrado(VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado) {
		super(_verlistadodetweetsfiltradoUsuarioregistrado);
	}
	
	public ListadotweetsUsuarioregistrado(VerperfilUsuarioregistrado _verperfilUsuarioregistrado) {
		super(_verperfilUsuarioregistrado);
		_listadotweetsUsuarioregistrado = new ListadotweetsUsuarioregistrado_item(this, null);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(_listadotweetsUsuarioregistrado);
		ListadotweetsUsuarioregistrado_item item2 = new ListadotweetsUsuarioregistrado_item(this, null);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(item2);
	}
	
	public void verPerfilPersonal() {
		MainView.Pantalla.cambiarVista(_verperfilpersonal);
	}
	
	public void Enviartweet() {
		this._listadotweetsUsuarioregistrado = new ListadotweetsUsuarioregistrado_item(this, null);
		this.getContenedorListadoTweets_item().as(VerticalLayout.class).add(_listadotweetsUsuarioregistrado);
	}
}