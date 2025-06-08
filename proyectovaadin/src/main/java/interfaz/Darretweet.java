package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Tweet;
import vistas.VistaDarretweet;

public class Darretweet extends VistaDarretweet {
	/*private event _enviarretweet;
	private label _nickUsuario;
	private image _perfilUsuario;
	private textField _texto;*/
	public ListadotweetsUsuarioregistrado_item _listadotweetsUsuarioregistrado_item;
	//public ListadotweetsUsuarioregistrado ltur;
	private boolean retweet = false;

	public Darretweet(ListadotweetsUsuarioregistrado_item listadotweetsUsuarioregistrado_item){
		this._listadotweetsUsuarioregistrado_item = listadotweetsUsuarioregistrado_item;
		String autor = _listadotweetsUsuarioregistrado_item.tweet.tweeteado_por.getNick();
	    String texto = _listadotweetsUsuarioregistrado_item.tweet.getTexto();

	    Paragraph lblAutor = new Paragraph("        @" + autor);
	    Paragraph lblTexto = new Paragraph(texto);
	    lblAutor.getStyle().set("font-weight", "bold");
	    lblTexto.getStyle().set("margin-top", "0.25em");
	    this.get_verPerfil().setText(_listadotweetsUsuarioregistrado_item.usuario._usuarioregistrado.getNick());
	    this.getContenedorTweetsItem().add(lblAutor, lblTexto);
		
		this.getVolver().addClickListener(event -> btnVolver());
		this.getIdEnviarRetweet().addClickListener(event -> Enviarretweet());
	}
	
	
	public void Enviarretweet() {
		int usuarioId = this._listadotweetsUsuarioregistrado_item.usuario._usuarioregistrado.getID();
		int tweetOriginalId = this._listadotweetsUsuarioregistrado_item.tweet.getIdTweet();
		if (this.get_MensajeRetweet().getValue().isEmpty()) {
			Notification.show("El mensaje del retweet no puede estar vacío.", 3000, Notification.Position.MIDDLE);
			return;
		}
		Tweet retweet = this._listadotweetsUsuarioregistrado_item.usuario.iUsuarioregistrado.retweet(usuarioId, tweetOriginalId, this.get_MensajeRetweet().getValue());
		this._listadotweetsUsuarioregistrado_item._listadotweetsUsuarioregistrado.getContenedorListadoTweets_item().as(VerticalLayout.class).addComponentAsFirst(new ListadotweetsUsuarioregistrado_item(this._listadotweetsUsuarioregistrado_item._listadotweetsUsuarioregistrado, retweet));
		_listadotweetsUsuarioregistrado_item.marcarRetweet();
		Usuarioregistrado usuario = new Usuarioregistrado(
				_listadotweetsUsuarioregistrado_item.usuario.mainView, _listadotweetsUsuarioregistrado_item.usuario.iUsuarioregistrado.cargarPerfilUsuarioregistrado(usuarioId)
				);
		MainView.Pantalla.cambiarVista(usuario);
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
	}
	
}