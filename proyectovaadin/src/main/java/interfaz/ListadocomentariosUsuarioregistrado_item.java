package interfaz;

public class ListadocomentariosUsuarioregistrado_item extends Listadocomentarios_item {
//	private event _darmegustaacomentario;
	private int _numeroMegustas;
	public ListadocomentariosUsuarioregistrado _listadocomentariosUsuarioregistrado;

	public ListadocomentariosUsuarioregistrado_item(ListadocomentariosUsuarioregistrado _listadocomentariosUsuarioregistrado) {
		super(_listadocomentariosUsuarioregistrado);
		this.getBotonEliminarComentario().setVisible(false);
	}

	public void Darmegustaacomentario() {
		throw new UnsupportedOperationException();
	}
}