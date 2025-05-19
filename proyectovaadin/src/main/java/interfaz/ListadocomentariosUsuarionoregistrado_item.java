package interfaz;

import org.vaadin.example.MainView;

public class ListadocomentariosUsuarionoregistrado_item extends Listadocomentarios_item {

	public ListadocomentariosUsuarionoregistrado listadoComentariosUsuarionoregistrado;

	public ListadocomentariosUsuarionoregistrado_item(
			ListadocomentariosUsuarionoregistrado listadoComentariosUsuarionoregistrado) {
		super(listadoComentariosUsuarionoregistrado);
		this.getBotonEliminarComentario().setVisible(false);
		this.getBtnDarMegusta().setVisible(false);
	}

}
