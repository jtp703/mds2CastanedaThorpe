package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosAdministrador_item extends Listadocomentarios_item {

	// private event _eliminar_comentario;
	public ListadocomentariosAdministrador _listadocomentariosAdministrador;

	public ListadocomentariosAdministrador_item(ListadocomentariosAdministrador _listadocomentariosAdministrador) {
		super(_listadocomentariosAdministrador);
		this.getBtnDarMegusta().setVisible(false);
		this.getBotonEliminarComentario().addClickListener(event -> Eliminar_Comentario());
	}

	public void Eliminar_Comentario() {
		this.getContenedorcontenido().as(VerticalLayout.class).removeAll();
	}

}