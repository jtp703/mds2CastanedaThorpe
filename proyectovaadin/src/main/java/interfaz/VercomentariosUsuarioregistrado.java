package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VercomentariosUsuarioregistrado extends Vercomentarios {
//	private event _comentar;
	public ListadotweetsUsuarioregistrado_item _listadotweetsUsuarioregistradoitem;
	public ListadocomentariosUsuarioregistrado _listadocomentariosUsuarioregistrado;
	
	public VercomentariosUsuarioregistrado() {
	}
	
	public VercomentariosUsuarioregistrado(ListadocomentariosUsuarioregistrado _listadocomentariosUsuarioregistrado) {
		super(_listadocomentariosUsuarioregistrado);
		ListadotweetsUsuarioregistrado_item item = new ListadotweetsUsuarioregistrado_item(this);
		this.getContenedorTweet().as(VerticalLayout.class).add(item);
		ListadocomentariosUsuarioregistrado listado = new ListadocomentariosUsuarioregistrado(this);
		this.getContenedorListadoComentarios().as(VerticalLayout.class).add(listado);
		this.getBtnVovler().setVisible(false);
	}
	
	public VercomentariosUsuarioregistrado(ListadotweetsUsuarioregistrado_item _listadotweetsUsuarioregistradoitem) {
		super(_listadotweetsUsuarioregistradoitem);
	}

	public void ListadocomentariosUsuarioregistrado() {
		throw new UnsupportedOperationException();
	}

	public void Comentar() {
		throw new UnsupportedOperationException();
	}
}