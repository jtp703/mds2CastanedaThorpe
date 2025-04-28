 package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VercomentariosAdminstrador extends Vercomentarios {
//	private event _eliminar_tweet;
	public ListadocomentariosAdministrador _listadocomentariosAdministrador;
	public ListadotweetsAdministrador_item _item;
	public ListadotweetsAdministrador listado;
	
	public VercomentariosAdminstrador() {
	}
	
	public VercomentariosAdminstrador(ListadocomentariosAdministrador _listadocomentariosAdministrador) {
		super(_listadocomentariosAdministrador);
		ListadotweetsAdministrador_item item = new ListadotweetsAdministrador_item(listado);
		this.getContenedorTweet().as(VerticalLayout.class).add(item);
		ListadocomentariosAdministrador listado = new ListadocomentariosAdministrador(this);
		this.getContenedorListadoComentarios().as(VerticalLayout.class).add(listado);
		this.getBtnVovler().setVisible(false);
	}
	
	public VercomentariosAdminstrador(ListadotweetsAdministrador_item _item) {
		super(_item);
	}

	public void Listado_comentarios_administrador() {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_tweet() {
		throw new UnsupportedOperationException();
	}
}