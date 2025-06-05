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
	public iUsuarioregistrado _iusuarioRegistrado;

	public ListadocomentariosUsuarioregistrado(VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado) {
		super(_vercomentariosUsuarioregistrado);
		this._iusuarioRegistrado = _vercomentariosUsuarioregistrado._listadotweetsUsuarioregistradoitem.
				_listadotweetsUsuarioregistrado._vermuroprincipalUsuarioregistrado._usuarioregistrado.iUsuarioregistrado;
		ListadocomentariosUsuarioregistrado_item item01 = new ListadocomentariosUsuarioregistrado_item(this, null);
		ListadocomentariosUsuarioregistrado_item item02 = new ListadocomentariosUsuarioregistrado_item(this, null);
		for (ListadocomentariosUsuarioregistrado_item item : listadoComentariosUsuarioregistrado_item) {
			this.getContenedorComentariosItem().as(VerticalLayout.class).add(item);
		}
		this.getBtnEnviarComentario().addClickListener(event -> Comentar());
	}

	public void Comentar() {
		String textoComentario = this.getTextAreaComentario().getValue().trim(); // Ajusta el getter si tu campo se
																					// llama diferente

		if (textoComentario.isEmpty()) {
			Notification.show("El texto del comentario no puede estar vacío");
			return;
		}

		// Supongamos que tienes acceso al usuario actual así:
		int idUsuario = this._vercomentariosUsuarioregistrado._listadotweetsUsuarioregistradoitem._listadotweetsUsuarioregistrado.
				_vermuroprincipalUsuarioregistrado._usuarioregistrado._usuarioregistrado.getID();
		// Si tu ruta es diferente, ajústala a tu modelo

		try {
			Comentario nuevoComentario = this._iusuarioRegistrado.escribirComentario(idUsuario, textoComentario);

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