package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosAdministrador extends Listadocomentarios {
	
	public Vector<ListadocomentariosAdministrador_item> _item = new Vector<ListadocomentariosAdministrador_item>();
	public VercomentariosAdminstrador _vercomentariosAdminstrador;
	ListadotweetsAdministrador _listadoTweetsAdministrador;
	
	
	public ListadocomentariosAdministrador(VercomentariosAdminstrador _vercomentariosAdministrador) {
		super(_vercomentariosAdministrador);
		this.getContenedorEscribirComentario().setVisible(false);
		ListadotweetsAdministrador_item item0 = new ListadotweetsAdministrador_item(_listadoTweetsAdministrador);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(item0);
		ListadocomentariosAdministrador_item item1 = new ListadocomentariosAdministrador_item(this);
		this.getContenedorListadoComentariosItem().as(VerticalLayout.class).add(item1);
		ListadocomentariosAdministrador_item item2 = new ListadocomentariosAdministrador_item(this);
		this.getContenedorListadoComentariosItem().as(VerticalLayout.class).add(item2);
	}
}