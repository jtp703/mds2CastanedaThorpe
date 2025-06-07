package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Tweet;

public class VercomentariosUsuarioregistrado extends Vercomentarios {

	// private event _comentar;
	public ListadotweetsUsuarioregistrado_item _listadotweetsUsuarioregistradoitem;
	public ListadocomentariosUsuarioregistrado _listadocomentariosUsuarioregistrado;
	public Tweet _tweet;

	public VercomentariosUsuarioregistrado(ListadotweetsUsuarioregistrado_item _listadotweetsUsuarioregistradoitem) {
		super(_listadotweetsUsuarioregistradoitem);
		this._tweet = _listadotweetsUsuarioregistradoitem.tweet;
		this._listadotweetsUsuarioregistradoitem = _listadotweetsUsuarioregistradoitem;
		this._listadotweetsUsuarioregistradoitem.getContenedorInteracciones().setVisible(false);
		this.getContenedorTweet().as(VerticalLayout.class).add(this._listadotweetsUsuarioregistradoitem);
		ListadocomentariosUsuarioregistrado listadoComentarios = new ListadocomentariosUsuarioregistrado(this);
		this.getContenedorListadoComentarios().as(VerticalLayout.class).add(listadoComentarios);
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