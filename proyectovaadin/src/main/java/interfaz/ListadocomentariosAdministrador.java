package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosAdministrador extends Listadocomentarios {
	
	public Vector<ListadocomentariosAdministrador_item> _item = new Vector<ListadocomentariosAdministrador_item>();
	public VercomentariosAdminstrador _vercomentariosAdminstrador;
	public ListadotweetsAdministrador _listadoTweetsAdministrador;
	
	
	public ListadocomentariosAdministrador(VercomentariosAdminstrador _vercomentariosAdministrador) {
		super(_vercomentariosAdministrador);
		this.getContenedorEscribirComentarios().setVisible(false);
		
		ListadocomentariosAdministrador_item item0 = new ListadocomentariosAdministrador_item(this);
		ListadocomentariosAdministrador_item item1 = new ListadocomentariosAdministrador_item(this);
		_item.add(item0);
		_item.add(item1);
		for(ListadocomentariosAdministrador_item item: _item) {
			this.getContenedorComentariosItem().as(VerticalLayout.class).add(item);
		}
		
	}
}