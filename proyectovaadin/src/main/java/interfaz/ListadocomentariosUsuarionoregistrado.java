package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosUsuarionoregistrado extends Listadocomentarios {

	public Vector<ListadocomentariosUsuarionoregistrado_item> listadocomentariosUsuarionoregistrado_item = new Vector<ListadocomentariosUsuarionoregistrado_item>();
	public VercomentariosUsuarionoregistrado _usuarioNoRegistrado;
	public ListadotweetsUsuarionoregistrado _listadoUsuarioNoRegistrado;

	public ListadocomentariosUsuarionoregistrado(VercomentariosUsuarionoregistrado _usuarioNoRegistrado) {
		super(_usuarioNoRegistrado);
		this.getContenedorEscribirComentarios().setVisible(false);
		ListadocomentariosUsuarionoregistrado_item item0 = new ListadocomentariosUsuarionoregistrado_item(this);
		ListadocomentariosUsuarionoregistrado_item item1 = new ListadocomentariosUsuarionoregistrado_item(this);
		for (ListadocomentariosUsuarionoregistrado_item item : listadocomentariosUsuarionoregistrado_item) {
			this.getContenedorComentariosItem().as(VerticalLayout.class).add(item);
		}
		
	}

}
