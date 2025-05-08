package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerlistadodetweetsfiltradoUsuarioregistrado extends Verlistadodetweetsfiltrado {

	public Usuarioregistrado _usuarioregistrado;
	public ListadotweetsUsuarioregistrado _listadotweetsUsuarioregistrado;

	public VerlistadodetweetsfiltradoUsuarioregistrado(Usuarioregistrado _usuarioregistrado) {
		super(_usuarioregistrado);
		_usuarioregistrado.getContenedorRegistro().setVisible(false);
		this.getContenedorCibernauta().as(VerticalLayout.class).add(_usuarioregistrado);
		ListadotweetsUsuarioregistrado_item item0 = new ListadotweetsUsuarioregistrado_item(_listadotweetsUsuarioregistrado);
		this.getContenedorListadoTweetsFiltrado().as(VerticalLayout.class).add(item0);
		ListadotweetsUsuarioregistrado_item item1 = new ListadotweetsUsuarioregistrado_item(_listadotweetsUsuarioregistrado);
		this.getContenedorListadoTweetsFiltrado().as(VerticalLayout.class).add(item1);
	}

	public VerlistadodetweetsfiltradoUsuarioregistrado(ListadotweetsUsuarioregistrado _listadotweetsUsuarioregistrado) {
		super(_listadotweetsUsuarioregistrado);
	}

	public void ListadotweetsUsuarioregistrado() {
		throw new UnsupportedOperationException();
	}
}