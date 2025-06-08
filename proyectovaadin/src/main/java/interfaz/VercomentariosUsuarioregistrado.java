package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Tweet;

public class VercomentariosUsuarioregistrado extends Vercomentarios {
	public ListadotweetsUsuarioregistrado_item _listadotweetsUsuarioregistradoitem;
	public Tweet tweet;

	public VercomentariosUsuarioregistrado(ListadotweetsUsuarioregistrado_item originalItem) {
	    super(originalItem);
	    // Guardamos referencia al item de la lista principal
	    this._listadotweetsUsuarioregistradoitem = originalItem;
	    this.tweet = originalItem.tweet;

	    // Creamos una nueva cabecera para esta vista de comentarios
	    ListadotweetsUsuarioregistrado_item headerItem =
	        new ListadotweetsUsuarioregistrado_item(this, this.tweet);
	    headerItem.getContenedorInteracciones().setVisible(false);
	    this.getContenedorTweet()
	        .as(VerticalLayout.class)
	        .add(headerItem);

	    // Añadimos el listado de comentarios
	    ListadocomentariosUsuarioregistrado listadoComentarios =
	        new ListadocomentariosUsuarioregistrado(this);
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