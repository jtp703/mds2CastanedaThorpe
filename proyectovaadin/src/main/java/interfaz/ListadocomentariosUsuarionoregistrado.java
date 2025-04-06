package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosUsuarionoregistrado extends Listadocomentarios {

	public VercomentariosUsuarionoregistrado _usuarioNoRegistrado;
	public ListadotweetsUsuarionoregistrado _listadoUsuarioNoRegistrado;

	public ListadocomentariosUsuarionoregistrado(VercomentariosUsuarionoregistrado _usuarioNoRegistrado) {
		super(_usuarioNoRegistrado);
		this.getContenedorEscribirComentario().setVisible(false);
		ListadotweetsUsuarionoregistrado_item item0 = new ListadotweetsUsuarionoregistrado_item(_listadoUsuarioNoRegistrado);
		item0.getVerMegustas().setVisible(false);
		item0.getVerRetweet().setVisible(false);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(item0);
		ListadocomentariosUsuarionoregistrado_item item1 = new ListadocomentariosUsuarionoregistrado_item(this);
		this.getContenedorListadoComentariosItem().as(VerticalLayout.class).add(item1);
		ListadocomentariosUsuarionoregistrado_item item2 = new ListadocomentariosUsuarionoregistrado_item(this);
		this.getContenedorListadoComentariosItem().as(VerticalLayout.class).add(item2);
		
	}

}
