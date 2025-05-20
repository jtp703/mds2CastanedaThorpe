package interfaz;

import java.util.Vector;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadotweetsUsuarioregistrado extends Listadotweets {
	
	public VermuroprincipalUsuarioregistrado _vermuroprincipalUsuarioregistrado;
	public VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado;
	public VerperfilUsuarioregistrado _verperfilUsuarioregistrado;
	public Vector<ListadotweetsUsuarioregistrado_item> _listadotweetsUsuarioregistrado = new Vector<ListadotweetsUsuarioregistrado_item>();
	public Verperfilpersonal _verperfilpersonal;
	
	public ListadotweetsUsuarioregistrado(VermuroprincipalUsuarioregistrado vermuroprincipalUsuarioregistrado) {
		super(vermuroprincipalUsuarioregistrado);
		//_verperfilpersonal = new Verperfilpersonal(new Usuarioregistrado(this));

		ListadotweetsUsuarioregistrado_item item1 = new ListadotweetsUsuarioregistrado_item(this, null);
		ListadotweetsUsuarioregistrado_item item2 = new ListadotweetsUsuarioregistrado_item(this, null);
		_listadotweetsUsuarioregistrado.add(item1);
		_listadotweetsUsuarioregistrado.add(item2);
		for (ListadotweetsUsuarioregistrado_item item : _listadotweetsUsuarioregistrado) {
			this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		}

		this.getBtnEnviarTweet().addClickListener(event -> Enviartweet());
		//this.getVerPerfilPersonal().addClickListener(event -> verPerfilPersonal());
	}
	
	public ListadotweetsUsuarioregistrado(VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado) {
		super(_verlistadodetweetsfiltradoUsuarioregistrado);
	}
	
	public ListadotweetsUsuarioregistrado(VerperfilUsuarioregistrado _verperfilUsuarioregistrado) {
		super(_verperfilUsuarioregistrado);

		ListadotweetsUsuarioregistrado_item item1 = new ListadotweetsUsuarioregistrado_item(this, null);
		ListadotweetsUsuarioregistrado_item item2 = new ListadotweetsUsuarioregistrado_item(this, null);
		_listadotweetsUsuarioregistrado.add(item1);
		_listadotweetsUsuarioregistrado.add(item2);
		for (ListadotweetsUsuarioregistrado_item item : _listadotweetsUsuarioregistrado) {
			this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		}

	}
	
	public void verPerfilPersonal() {
		MainView.Pantalla.cambiarVista(_verperfilpersonal);
	}
	
	public void Enviartweet() {

		ListadotweetsUsuarioregistrado_item item1 = new ListadotweetsUsuarioregistrado_item(this, null);
		this.getContenedorListadoTweets_item().as(VerticalLayout.class).add(item1);

	}
}