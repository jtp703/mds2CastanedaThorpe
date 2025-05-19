package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosUsuarionoregistrado extends Listadocomentarios {

	public ListadocomentariosUsuarionoregistrado_item _item;
	public VercomentariosUsuarionoregistrado _usuarioNoRegistrado;
	public ListadotweetsUsuarionoregistrado _listadoUsuarioNoRegistrado;

	public ListadocomentariosUsuarionoregistrado(VercomentariosUsuarionoregistrado _usuarioNoRegistrado) {
		super(_usuarioNoRegistrado);
		this._item = new ListadocomentariosUsuarionoregistrado_item(this);
		this.getContenedorComentariosItem().as(VerticalLayout.class).add(this._item);
		this.getContenedorEscribirComentarios().setVisible(false);
	}

}
