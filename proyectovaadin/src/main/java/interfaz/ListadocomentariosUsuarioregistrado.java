package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosUsuarioregistrado extends Listadocomentarios {
	
	public VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado;
	public Vector<ListadocomentariosUsuarioregistrado_item> _item = new Vector();
	ListadotweetsUsuarioregistrado listadoTweetsUsuarioregistrado;
	
	
	public ListadocomentariosUsuarioregistrado(VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado) {
		super(_vercomentariosUsuarioregistrado);
		
	}
	
	
}