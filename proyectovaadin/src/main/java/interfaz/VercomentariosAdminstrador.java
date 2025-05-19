package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VercomentariosAdminstrador extends Vercomentarios {

	//	private event _eliminar_tweet;
	public ListadocomentariosAdministrador _listadocomentariosAdministrador;
	public ListadotweetsAdministrador_item _item;

	public VercomentariosAdminstrador(ListadocomentariosAdministrador _listadocomentariosAdministrador) {
		super(_listadocomentariosAdministrador);
		this._item = new ListadotweetsAdministrador_item(this);
		this._item.getContenedorInteracciones().setVisible(false);
		this.getContenedorTweet().as(VerticalLayout.class).add(this._item);
		ListadocomentariosAdministrador listado = new ListadocomentariosAdministrador(this);
		this.getContenedorListadoComentarios().as(VerticalLayout.class).add(listado);
		this.getBtnVovler().addClickListener(event -> btnVolver());
	}

	public VercomentariosAdminstrador(ListadotweetsAdministrador_item _item) {
		super(_item);
		this._item = new ListadotweetsAdministrador_item(this);
		this._item.getContenedorInteracciones().setVisible(false);
		this.getContenedorTweet().as(VerticalLayout.class).add(this._item);
		ListadocomentariosAdministrador listado = new ListadocomentariosAdministrador(this);
		this.getContenedorListadoComentarios().as(VerticalLayout.class).add(listado);
		this.getBtnVovler().addClickListener(event -> btnVolver());
	}

	/*
	 * public void Listado_comentarios_administrador() { throw new
	 * UnsupportedOperationException(); }
	 */

	public void Eliminar_tweet() {
		throw new UnsupportedOperationException();
	}

	public void btnVolver() {
		MainView.Pantalla.volver();
	}
}