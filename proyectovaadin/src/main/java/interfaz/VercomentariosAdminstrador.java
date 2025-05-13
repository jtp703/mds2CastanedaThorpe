 package interfaz;

import org.vaadin.example.MainView;

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
		this.getBtnVovler().addClickListener(event -> btnVolver());
	}
	
	public VercomentariosAdminstrador(ListadotweetsAdministrador_item _item) {
		super(_item);
		ListadotweetsAdministrador_item item = new ListadotweetsAdministrador_item(listado);
		this.getContenedorTweet().as(VerticalLayout.class).add(item);
		ListadocomentariosAdministrador listado = new ListadocomentariosAdministrador(this);
		this.getContenedorListadoComentarios().as(VerticalLayout.class).add(listado);
		this.getBtnVovler().addClickListener(event -> btnVolver());
	}

	public void Listado_comentarios_administrador() {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_tweet() {
		throw new UnsupportedOperationException();
	}
	public void btnVolver() {
		MainView.Pantalla.volver();
	}
}