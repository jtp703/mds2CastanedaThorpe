package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VercomentariosUsuarionoregistrado extends Vercomentarios {
	
	//	private event _comentar;
	public ListadotweetsUsuarionoregistrado_item _listadotweetsUsuarionoregistradoitem;
	public ListadocomentariosUsuarionoregistrado _listadocomentariosUsuarionoregistrado;

	public VercomentariosUsuarionoregistrado(
			ListadocomentariosUsuarionoregistrado _listadocomentariosUsuarionoregistrado) {
		super(_listadocomentariosUsuarionoregistrado);
		this._listadotweetsUsuarionoregistradoitem = new ListadotweetsUsuarionoregistrado_item(this);
		this._listadotweetsUsuarionoregistradoitem.getContenedorInteracciones().setVisible(false);
		this.getContenedorTweet().as(VerticalLayout.class).add(this._listadotweetsUsuarionoregistradoitem);
		ListadocomentariosUsuarionoregistrado listado = new ListadocomentariosUsuarionoregistrado(this);
		this.getContenedorListadoComentarios().as(VerticalLayout.class).add(listado);
		this.getBtnVovler().addClickListener(event -> btnVolver());
	}

	public VercomentariosUsuarionoregistrado(
			ListadotweetsUsuarionoregistrado_item _listadotweetsUsuarionoregistradoitem) {
		super(_listadotweetsUsuarionoregistradoitem);
		this._listadotweetsUsuarionoregistradoitem = new ListadotweetsUsuarionoregistrado_item(this);
		this._listadotweetsUsuarionoregistradoitem.getContenedorInteracciones().setVisible(false);
		this.getContenedorTweet().as(VerticalLayout.class).add(this._listadotweetsUsuarionoregistradoitem);
		ListadocomentariosUsuarionoregistrado listado = new ListadocomentariosUsuarionoregistrado(this);
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
