package interfaz;

public class ListadocomentariosUsuarionoregistrado_item extends Listadocomentarios_item {
	
	ListadocomentariosUsuarionoregistrado listadoComentariosUsuarionoregistrado;
	
	public ListadocomentariosUsuarionoregistrado_item(ListadocomentariosUsuarionoregistrado listadoComentariosUsuarionoregistrado) {
		super(listadoComentariosUsuarionoregistrado);
		this.getBotonEliminarComentario().setVisible(false);
	}

}
