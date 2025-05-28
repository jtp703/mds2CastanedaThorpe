package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VercomentariosUsuarioregistrado extends Vercomentarios {

	// private event _comentar;
	public ListadotweetsUsuarioregistrado_item _listadotweetsUsuarioregistradoitem;
	public ListadocomentariosUsuarioregistrado _listadocomentariosUsuarioregistrado;

	public VercomentariosUsuarioregistrado(ListadocomentariosUsuarioregistrado _listadocomentariosUsuarioregistrado) {
		super(_listadocomentariosUsuarioregistrado);
		this._listadotweetsUsuarioregistradoitem = new ListadotweetsUsuarioregistrado_item(this, _listadotweetsUsuarioregistradoitem.tweet);
		this._listadotweetsUsuarioregistradoitem.getContenedorInteracciones().setVisible(false);
		this.getContenedorTweet().as(VerticalLayout.class).add(this._listadotweetsUsuarioregistradoitem);
		ListadocomentariosUsuarioregistrado listado = new ListadocomentariosUsuarioregistrado(this);
		this.getContenedorListadoComentarios().as(VerticalLayout.class).add(listado);
		this.getBtnVovler().addClickListener(event -> btnVolver());
	}

	public VercomentariosUsuarioregistrado(ListadotweetsUsuarioregistrado_item _listadotweetsUsuarioregistradoitem) {
		super(_listadotweetsUsuarioregistradoitem);
		this._listadotweetsUsuarioregistradoitem = new ListadotweetsUsuarioregistrado_item(this, _listadotweetsUsuarioregistradoitem.tweet);
		this._listadotweetsUsuarioregistradoitem.getContenedorInteracciones().setVisible(false);
		this.getContenedorTweet().as(VerticalLayout.class).add(this._listadotweetsUsuarioregistradoitem);
		ListadocomentariosUsuarioregistrado listado = new ListadocomentariosUsuarioregistrado(this);
		this.getContenedorListadoComentarios().as(VerticalLayout.class).add(listado);
		this.getBtnVovler().addClickListener(event -> btnVolver());
	}

	/*
	 * public void ListadocomentariosUsuarioregistrado() { throw new
	 * UnsupportedOperationException(); }
	 */

	public void btnVolver() {
		MainView.Pantalla.volver();
	}
}