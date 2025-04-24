package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosAdministrador extends Listadocomentarios {
	
	public Vector<ListadocomentariosAdministrador_item> _item = new Vector<ListadocomentariosAdministrador_item>();
	public VercomentariosAdminstrador _vercomentariosAdminstrador;
	ListadotweetsAdministrador _listadoTweetsAdministrador;
	
	
	public ListadocomentariosAdministrador(VercomentariosAdminstrador _vercomentariosAdministrador) {
		super(_vercomentariosAdministrador);
		
	}
}