package interfaz;

import java.util.Vector;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Comentario;
import base_de_datos.iUsuarioregistrado;

public class ListadocomentariosUsuarioregistrado extends Listadocomentarios {

	public VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado;
	public Vector<ListadocomentariosUsuarioregistrado_item> listadoComentariosUsuarioregistrado_item = new Vector<ListadocomentariosUsuarioregistrado_item>();
	public ListadotweetsUsuarioregistrado listadoTweetsUsuarioregistrado;
	public Usuarioregistrado usuarioRegistrado;
	public base_de_datos.Usuario usuario;

	public ListadocomentariosUsuarioregistrado(VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado) {
		super(_vercomentariosUsuarioregistrado);
		this._vercomentariosUsuarioregistrado = _vercomentariosUsuarioregistrado;
		this.usuarioRegistrado = _vercomentariosUsuarioregistrado._listadotweetsUsuarioregistradoitem.
				_listadotweetsUsuarioregistrado._vermuroprincipalUsuarioregistrado._usuarioregistrado;
		this.usuario = this.usuarioRegistrado._usuarioregistrado;
		
		Comentario[] comentarios = _vercomentariosUsuarioregistrado.tweet.tiene_comentario.toArray();
		
		if(comentarios.length != 0) {
		
			for (Comentario comentario : comentarios) {
				ListadocomentariosUsuarioregistrado_item item = new ListadocomentariosUsuarioregistrado_item(this, comentario);
				listadoComentariosUsuarioregistrado_item.add(item);
				this.getContenedorComentariosItem().as(VerticalLayout.class).add(item);
			}
		}else {
			Notification.show("No hay comentarios para este tweet");
		}
		this.getBtnEnviarComentario().addClickListener(event -> Comentar());
	}

	public void Comentar() {
		String textoComentario = this.getTextAreaComentario().getValue().trim();

		if (textoComentario.isEmpty()) {
			Notification.show("El texto del comentario no puede estar vacío");
			return;
		}
		int idUsuario = usuarioRegistrado._usuarioregistrado.getID();
		// Si tu ruta es diferente, ajústala a tu modelo

		try {
			Comentario nuevoComentario = this.usuarioRegistrado.iUsuarioregistrado.escribirComentario(
					idUsuario, 
					_vercomentariosUsuarioregistrado.tweet.getIdTweet(), 
					textoComentario
					);

			// Ahora creas el item visual pasándole el objeto Comentario
			ListadocomentariosUsuarioregistrado_item itemNuevo = new ListadocomentariosUsuarioregistrado_item(this,
					nuevoComentario);

			this.getContenedorComentariosItem().as(VerticalLayout.class).addComponentAsFirst(itemNuevo);

			this.getTextAreaComentario().clear();
			Notification.show("Comentario enviado correctamente");
		} catch (Exception ex) {
			Notification.show("Error al enviar comentario: " + ex.getMessage());
		}

	}
}