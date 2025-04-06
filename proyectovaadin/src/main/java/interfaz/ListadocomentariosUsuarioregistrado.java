package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosUsuarioregistrado extends Listadocomentarios {
	
	public VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado;
	public Vector<ListadocomentariosUsuarioregistrado_item> _item = new Vector();
	ListadotweetsUsuarioregistrado listadoTweetsUsuarioregistrado;
	
	
	public ListadocomentariosUsuarioregistrado(VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado) {
		super(_vercomentariosUsuarioregistrado);
		ListadotweetsUsuarioregistrado_item item0 = new ListadotweetsUsuarioregistrado_item(listadoTweetsUsuarioregistrado);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(item0);
		ListadocomentariosUsuarioregistrado_item item1 = new ListadocomentariosUsuarioregistrado_item(this);
		this.getContenedorListadoComentariosItem().as(VerticalLayout.class).add(item1);
		ListadocomentariosUsuarioregistrado_item item2 = new ListadocomentariosUsuarioregistrado_item(this);
		this.getContenedorListadoComentariosItem().as(VerticalLayout.class).add(item2);
	}
	
	
}