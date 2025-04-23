package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VermuroprincipalUsuarioregistrado extends Vermuroprincipal {
	
	public MainView main;
//	private event _enviartweet;
	public Usuarioregistrado _usuarioregistrado;
	public ListadotweetsUsuarioregistrado _listadotweetsUsuarioregistrado;
	
	public VermuroprincipalUsuarioregistrado() {
		
	}
	
	public VermuroprincipalUsuarioregistrado(Usuarioregistrado _usuarioregistrado) {
		super(_usuarioregistrado);
		Usuarioregistrado user = new Usuarioregistrado(main);
		this.getContenedorCibernauta().as(VerticalLayout.class).add(user);
		ListadotweetsUsuarioregistrado lista = new ListadotweetsUsuarioregistrado(this);
		this.getContenedorListadoTweetsMuroPrincipal().as(VerticalLayout.class).add(lista);
		
	}
	
	public VermuroprincipalUsuarioregistrado(ListadotweetsUsuarioregistrado _listadotweetsUsuarioregistrado) {
		super(_listadotweetsUsuarioregistrado);
	}

	public void ListadotweetsUsuarioregistrado() {
		throw new UnsupportedOperationException();
	}

	public void Enviartweet() {
		throw new UnsupportedOperationException();
	}
}