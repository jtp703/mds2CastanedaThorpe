package interfaz;

public class ListadocomentariosUsuarionoregistrado_item extends Listadocomentarios_item {
	
	ListadocomentariosAdministrador listadoComentariosAdministrador;
	
	public ListadocomentariosUsuarionoregistrado_item(ListadocomentariosAdministrador listadoComentariosAdministrador) {
		super(listadoComentariosAdministrador);
		this.getBotonEliminarComentario().setVisible(false);
	}

}
