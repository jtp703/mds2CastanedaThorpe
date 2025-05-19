package interfaz;

import java.util.Vector;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosUsuarioregistrado extends Listadocomentarios {
	
	public VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado;
	public Vector<ListadocomentariosUsuarioregistrado_item> listadoComentariosUsuarioregistrado_item = new Vector<ListadocomentariosUsuarioregistrado_item>();
	public ListadotweetsUsuarioregistrado listadoTweetsUsuarioregistrado;
	
	
	public ListadocomentariosUsuarioregistrado(VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado) {
		super(_vercomentariosUsuarioregistrado);
		ListadocomentariosUsuarioregistrado_item item01 = new ListadocomentariosUsuarioregistrado_item(this);
		ListadocomentariosUsuarioregistrado_item item02 = new ListadocomentariosUsuarioregistrado_item(this);
		for(ListadocomentariosUsuarioregistrado_item item: listadoComentariosUsuarioregistrado_item) {
			this.getContenedorComentariosItem().as(VerticalLayout.class).add(item);
		}
		this.getBtnEnviarComentario().addClickListener(event -> Comentar());
	}
	
	public void Comentar() {
		ListadocomentariosUsuarioregistrado_item item = new ListadocomentariosUsuarioregistrado_item(this);
		this.getContenedorComentariosItem().as(VerticalLayout.class).add(item);
	}
	
}