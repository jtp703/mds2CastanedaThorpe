package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VermuroprincipalUsuarionoregistrado extends Vermuroprincipal {
	
	public MainView main;
	public Usuarionoregistrado _usuarioNoRegistrado;
	public ListadotweetsUsuarionoregistrado _listadotweetsUsuarioNoRegistrado;
	
	public VermuroprincipalUsuarionoregistrado() {
		
	}
	
	public VermuroprincipalUsuarionoregistrado(Usuarionoregistrado _usuarioNoRegistrado) {
		super(_usuarioNoRegistrado);
		Usuarionoregistrado user = new Usuarionoregistrado(main);
		this.getContenedorCibernauta().as(VerticalLayout.class).add(user);
		ListadotweetsUsuarionoregistrado ltunr = new ListadotweetsUsuarionoregistrado(this);
		this.getContenedorListadoTweetsMuroPrincipal().as(VerticalLayout.class).add(ltunr);
	}
	
	public VermuroprincipalUsuarionoregistrado(ListadotweetsUsuarionoregistrado _listadotweetsUsuarioNoRegistrado) {
		super(_listadotweetsUsuarioNoRegistrado);
	}


}
