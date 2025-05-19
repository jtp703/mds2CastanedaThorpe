package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosAdministrador extends Listadocomentarios {
	
	public ListadocomentariosAdministrador_item _item;
	public VercomentariosAdminstrador _vercomentariosAdminstrador;
	public ListadotweetsAdministrador _listadoTweetsAdministrador;
	
	
	public ListadocomentariosAdministrador(VercomentariosAdminstrador _vercomentariosAdministrador) {
		super(_vercomentariosAdministrador);
		this.getContenedorEscribirComentarios().setVisible(false);
		this._item = new ListadocomentariosAdministrador_item(this);
		this.getContenedorComentariosItem().as(VerticalLayout.class).add(this._item);
	}
	
}