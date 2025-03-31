package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosAdministrador extends Listadocomentarios {
	
	public Vector<ListadocomentariosAdministrador_item> _item = new Vector<ListadocomentariosAdministrador_item>();
	public VercomentariosAdminstrador _vercomentariosAdminstrador;
	
	
	public ListadocomentariosAdministrador(VercomentariosAdminstrador _vercomentariosAdministrador) {
		super(_vercomentariosAdministrador);
		this.getContenedorEscribirComentario().setVisible(false);
		ListadocomentariosAdministrador_item item = new ListadocomentariosAdministrador_item(this);
		this.getContenedorListadoComentariosItem().as(VerticalLayout.class).add(item);
		ListadocomentariosAdministrador_item item2 = new ListadocomentariosAdministrador_item(this);
		this.getContenedorListadoComentariosItem().as(VerticalLayout.class).add(item2);
	}
}