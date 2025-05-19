package interfaz;

import java.util.Vector;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosUsuarioregistrado extends Listadocomentarios {
	
	public VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado;
	public ListadocomentariosUsuarioregistrado_item _item;
	public ListadotweetsUsuarioregistrado listadoTweetsUsuarioregistrado;
	
	
	public ListadocomentariosUsuarioregistrado(VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado) {
		super(_vercomentariosUsuarioregistrado);
		this._item = new ListadocomentariosUsuarioregistrado_item(this);
		this.getContenedorComentariosItem().as(VerticalLayout.class).add(this._item);
		this.getBtnEnviarComentario().addClickListener(event -> Comentar());
	}
	
	public void Comentar() {
		this._item = new ListadocomentariosUsuarioregistrado_item(this);
		this.getContenedorComentariosItem().as(VerticalLayout.class).add(this._item);
	}
	
}