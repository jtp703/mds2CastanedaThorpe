package interfaz;

import org.vaadin.example.MainView;

public class ListadocomentariosAdministrador_item extends Listadocomentarios_item {

	// private event _eliminar_comentario;
	public ListadocomentariosAdministrador _listadocomentariosAdministrador;

	public ListadocomentariosAdministrador_item(ListadocomentariosAdministrador _listadocomentariosAdministrador) {
		super(_listadocomentariosAdministrador);
		this.getBtnDarMegusta().setVisible(false);
	}

	public void Eliminar_Comentario() {
		throw new UnsupportedOperationException();
	}

}