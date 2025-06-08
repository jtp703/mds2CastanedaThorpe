package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Tweet;

public class VercomentariosAdminstrador extends Vercomentarios {
	public ListadotweetsAdministrador_item _listadotweetsAdministradoritem;
	public ListadocomentariosAdministrador _listadocomentariosAdministrador;
	public ListadotweetsAdministrador_item _item;
	public Tweet tweet;

	// VercomentariosAdminstrador.java

	public VercomentariosAdminstrador(ListadotweetsAdministrador_item originalItem) {
	    super(originalItem);
	    // Guardamos referencia al item de la lista principal
	    this._listadotweetsAdministradoritem = originalItem;
	    this.tweet = originalItem.tweet;
	    this._item = originalItem;
	    // Creamos una nueva cabecera para esta vista de comentarios
	    ListadotweetsAdministrador_item headerItem =
	        new ListadotweetsAdministrador_item(this, this.tweet);
	    headerItem.getContenedorInteracciones().setVisible(false);
	    this.getContenedorTweet()
	        .as(VerticalLayout.class)
	        .add(headerItem);

	    // Añadimos el listado de comentarios
	    ListadocomentariosAdministrador listadoComentarios =
	        new ListadocomentariosAdministrador(this);
	    this.getContenedorListadoComentarios()
	        .as(VerticalLayout.class)
	        .add(listadoComentarios);

	    // Botón “volver”
	    this.getBtnVovler()
	        .addClickListener(event -> btnVolver());
	}

	public void btnVolver() {
	    MainView.Pantalla.volver();
	}

}