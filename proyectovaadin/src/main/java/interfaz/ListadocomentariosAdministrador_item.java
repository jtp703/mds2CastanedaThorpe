package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosAdministrador_item extends Listadocomentarios_item {

	// private event _eliminar_comentario;
	public ListadocomentariosAdministrador _listadocomentariosAdministrador;

	public ListadocomentariosAdministrador_item(ListadocomentariosAdministrador _listadocomentariosAdministrador,base_de_datos.Comentario comentario) {
		super(_listadocomentariosAdministrador, comentario);
		this._listadocomentariosAdministrador = _listadocomentariosAdministrador;
		this.getBtnDarMegusta().setVisible(false);
		this.getBotonEliminarComentario().addClickListener(event -> Eliminar_Comentario());
		
	}

	public void Eliminar_Comentario() {
		this._listadocomentariosAdministrador.
		_vercomentariosAdminstrador.
		_item.
		_listadotweetsAdministrador.
		_vermuroprincipalAdministrador.
		_administrador.
		_iAdministrador.
		borrarComentario(comentario.getIdComentario());
		this._listadocomentariosAdministrador.getContenedorComentariosItem().as(VerticalLayout.class).remove(this);
	}

}