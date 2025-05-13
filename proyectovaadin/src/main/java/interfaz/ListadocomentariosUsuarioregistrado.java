package interfaz;

import java.util.Vector;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadocomentariosUsuarioregistrado extends Listadocomentarios {
	
	public VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado;
	public Vector<ListadocomentariosUsuarioregistrado_item> _item = new Vector();
	public ListadotweetsUsuarioregistrado listadoTweetsUsuarioregistrado;
	
	
	public ListadocomentariosUsuarioregistrado(VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado) {
		super(_vercomentariosUsuarioregistrado);
		ListadocomentariosUsuarioregistrado_item item = new ListadocomentariosUsuarioregistrado_item(this);
		this.getContenedorComentariosItem().as(VerticalLayout.class).add(item);
		this.getBtnEnviarComentario().addClickListener(event -> Comentar());
	}
	
	public void Comentar() {
		System.out.println("Comentario enviado");
	}
	
}