package interfaz;

import org.vaadin.example.MainView;

public class ListadocomentariosUsuarionoregistrado_item extends Listadocomentarios_item {

	public ListadocomentariosUsuarionoregistrado listadoComentariosUsuarionoregistrado;

	public ListadocomentariosUsuarionoregistrado_item(
			ListadocomentariosUsuarionoregistrado listadoComentariosUsuarionoregistrado, base_de_datos.Comentario comentario) {
		super(listadoComentariosUsuarionoregistrado, comentario);
		this.getBotonEliminarComentario().setVisible(false);
		this.getBtnDarMegusta().setVisible(false);
	}

}
