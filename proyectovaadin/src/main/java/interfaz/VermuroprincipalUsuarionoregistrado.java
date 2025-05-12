package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VermuroprincipalUsuarionoregistrado extends Vermuroprincipal {
	
	public Usuarionoregistrado _usuarioNoRegistrado;
	public ListadotweetsUsuarionoregistrado _listadotweetsUsuarioNoRegistrado;
	
	public VermuroprincipalUsuarionoregistrado(Usuarionoregistrado _usuarioNoRegistrado) {
		super(_usuarioNoRegistrado);
		this._usuarioNoRegistrado = _usuarioNoRegistrado;
		_listadotweetsUsuarioNoRegistrado = new ListadotweetsUsuarionoregistrado(this);
		this.getContenedorListadoTweetsMuroPrincipal().as(VerticalLayout.class).add(_listadotweetsUsuarioNoRegistrado);
	}
	
	public VermuroprincipalUsuarionoregistrado(ListadotweetsUsuarionoregistrado _listadotweetsUsuarioNoRegistrado) {
		super(_listadotweetsUsuarioNoRegistrado);
	}


}
