package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Tweet;

public class VercomentariosUsuarionoregistrado extends Vercomentarios {
	public ListadotweetsUsuarionoregistrado_item _listadotweetsUsuarionoregistradoitem;
	public Tweet tweet;

	public VercomentariosUsuarionoregistrado(
            ListadotweetsUsuarionoregistrado_item originalItem) {
        super(originalItem);
        // Guardamos la referencia al item original
        this._listadotweetsUsuarionoregistradoitem = originalItem;
        this.tweet = originalItem.tweet;

        // Creamos una nueva instancia para la cabecera en la vista de comentarios
        ListadotweetsUsuarionoregistrado_item headerItem =
            new ListadotweetsUsuarionoregistrado_item(this, this.tweet);
        // Ocultamos los botones de interacción en esta cabecera
        headerItem.getContenedorInteracciones().setVisible(false);
        // La añadimos al layout de la vista de comentarios
        this.getContenedorTweet()
            .as(VerticalLayout.class)
            .add(headerItem);

        // Cargamos el listado de comentarios
        ListadocomentariosUsuarionoregistrado listado =
            new ListadocomentariosUsuarionoregistrado(this);
        this.getContenedorListadoComentarios()
            .as(VerticalLayout.class)
            .add(listado);

        // Botón “volver” a la vista anterior
        this.getBtnVovler().addClickListener(event -> btnVolver());
	}
	public void btnVolver() {
		MainView.Pantalla.volver();
	}
}
