package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VermuroprincipalUsuarioregistrado extends Vermuroprincipal {
	
	public Usuarioregistrado _usuarioregistrado;
	public ListadotweetsUsuarioregistrado _listadotweetsUsuarioregistrado;
	
	public VermuroprincipalUsuarioregistrado(Usuarioregistrado _usuarioregistrado) {
		super(_usuarioregistrado);
		this._usuarioregistrado = _usuarioregistrado;
		_listadotweetsUsuarioregistrado = new ListadotweetsUsuarioregistrado(this);
		this.getContenedorListadoTweetsMuroPrincipal().as(VerticalLayout.class).add(_listadotweetsUsuarioregistrado);
		
	}
}