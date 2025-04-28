package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VercomentariosUsuarionoregistrado extends Vercomentarios {
//	private event _comentar;
	public ListadotweetsUsuarionoregistrado_item _listadotweetsUsuarionoregistradoitem;
	public ListadocomentariosUsuarionoregistrado _listadocomentariosUsuarionoregistrado;
	
	public VercomentariosUsuarionoregistrado() {
	}
	
	public VercomentariosUsuarionoregistrado(ListadocomentariosUsuarionoregistrado _listadocomentariosUsuarionoregistrado) {
		super(_listadocomentariosUsuarionoregistrado);
		ListadotweetsUsuarionoregistrado_item item = new ListadotweetsUsuarionoregistrado_item(this);
		this.getContenedorTweet().as(VerticalLayout.class).add(item);
		ListadocomentariosUsuarionoregistrado listado = new ListadocomentariosUsuarionoregistrado(this);
		this.getContenedorListadoComentarios().as(VerticalLayout.class).add(listado);
		this.getBtnVovler().setVisible(false);
	}
	
	public VercomentariosUsuarionoregistrado(ListadotweetsUsuarioregistrado_item _listadotweetsUsuarionoregistradoitem) {
		super(_listadotweetsUsuarionoregistradoitem);
	}

	public void ListadocomentariosUsuarioregistrado() {
		throw new UnsupportedOperationException();
	}

	public void Comentar() {
		throw new UnsupportedOperationException();
	}

}
