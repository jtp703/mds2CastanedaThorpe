package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Comentario;

public class ListadocomentariosAdministrador extends Listadocomentarios {
	
	public Vector<ListadocomentariosAdministrador_item> _item = new Vector<ListadocomentariosAdministrador_item>();
	public VercomentariosAdminstrador _vercomentariosAdminstrador;
	
	
	public ListadocomentariosAdministrador(VercomentariosAdminstrador _vercomentariosAdministrador) {
		super(_vercomentariosAdministrador);
		this._vercomentariosAdminstrador = _vercomentariosAdministrador;
		this.getContenedorEscribirComentarios().setVisible(false);
		Comentario[] comentarios = _vercomentariosAdministrador.tweet.tiene_comentario.toArray();
		
		if(comentarios.length != 0) {
			for (Comentario comentario : comentarios) {
				ListadocomentariosAdministrador_item item = new ListadocomentariosAdministrador_item(this, comentario);
				_item.add(item);
				this.getContenedorComentariosItem().as(VerticalLayout.class).add(item);
			}
		} else {
			Notification.show("No hay comentarios para este tweet");
		}
		
	}
}