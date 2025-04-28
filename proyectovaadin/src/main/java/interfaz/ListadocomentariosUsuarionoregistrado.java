package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosUsuarionoregistrado extends Listadocomentarios {

	public VercomentariosUsuarionoregistrado _usuarioNoRegistrado;
	public ListadotweetsUsuarionoregistrado _listadoUsuarioNoRegistrado;

	public ListadocomentariosUsuarionoregistrado(VercomentariosUsuarionoregistrado _usuarioNoRegistrado) {
		super(_usuarioNoRegistrado);
		ListadocomentariosUsuarionoregistrado_item item = new ListadocomentariosUsuarionoregistrado_item(this);
		this.getContenedorComentariosItem().as(VerticalLayout.class).add(item);
		this.getContenedorEscribirComentarios().setVisible(false);
	}

}
