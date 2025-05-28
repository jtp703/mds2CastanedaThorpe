package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosAdministrador_item extends Listadocomentarios_item {

	// private event _eliminar_comentario;
	public ListadocomentariosAdministrador _listadocomentariosAdministrador;

	public ListadocomentariosAdministrador_item(ListadocomentariosAdministrador _listadocomentariosAdministrador,base_de_datos.Comentario comentario) {
		super(_listadocomentariosAdministrador, comentario);
		this.getBtnDarMegusta().setVisible(false);
		this.getBotonEliminarComentario().addClickListener(event -> Eliminar_Comentario());
	}

	public void Eliminar_Comentario() {
		//eliminar comentario debera eliminar el comentario de la base de datos y la referencia sera este mismo item
		this.getContenedorcontenido().as(VerticalLayout.class).remove(this);
	}

}