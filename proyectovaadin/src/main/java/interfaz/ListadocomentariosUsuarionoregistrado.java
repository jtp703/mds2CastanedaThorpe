package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Comentario;

public class ListadocomentariosUsuarionoregistrado extends Listadocomentarios {

	public Vector<ListadocomentariosUsuarionoregistrado_item> listadocomentariosUsuarionoregistrado_item = new Vector<ListadocomentariosUsuarionoregistrado_item>();
	public VercomentariosUsuarionoregistrado _usuarioNoRegistrado;
	public ListadotweetsUsuarionoregistrado _listadoUsuarioNoRegistrado;

	public ListadocomentariosUsuarionoregistrado(VercomentariosUsuarionoregistrado _usuarioNoRegistrado) {
		super(_usuarioNoRegistrado);
		this.getContenedorEscribirComentarios().setVisible(false);
		Comentario[] comentarios = _usuarioNoRegistrado.tweet.tiene_comentario.toArray();
		
		if(comentarios.length != 0) {
			for(Comentario comentario : comentarios) {
				ListadocomentariosUsuarionoregistrado_item item = new ListadocomentariosUsuarionoregistrado_item(this, comentario);
				listadocomentariosUsuarionoregistrado_item.add(item);
				this.getContenedorComentariosItem().as(VerticalLayout.class).add(item);
			}
		}else {
			Notification.show("No hay comentarios para este tweet");
		}
		
	}

}
