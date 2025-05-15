package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.html.Paragraph;

import vistas.VistaDarretweet;

public class Darretweet extends VistaDarretweet {
	/*private event _enviarretweet;
	private label _nickUsuario;
	private image _perfilUsuario;
	private textField _texto;*/
	public ListadotweetsUsuarioregistrado_item _listadotweetsUsuarioregistrado;
	//public ListadotweetsUsuarioregistrado ltur;
	private boolean retweet = false;

	public Darretweet(ListadotweetsUsuarioregistrado_item listadotweetsUsuarioregistrado_item){
		this._listadotweetsUsuarioregistrado = listadotweetsUsuarioregistrado_item;
		String autor = _listadotweetsUsuarioregistrado.getNombreUsuario();
	    String texto = _listadotweetsUsuarioregistrado.getContenidoTexto();

	    Paragraph lblAutor = new Paragraph("@" + autor);
	    Paragraph lblTexto = new Paragraph(texto);
	    lblAutor.getStyle().set("font-weight", "bold");
	    lblTexto.getStyle().set("margin-top", "0.25em");

	    this.getContenedorTweetsItem().add(lblAutor, lblTexto);
		
		this.getVolver().addClickListener(event -> btnVolver());
		this.getIdEnviarRetweet().addClickListener(event -> Enviarretweet());
	}
	
	
	public void Enviarretweet() {
		_listadotweetsUsuarioregistrado.marcarRetweet();
		System.out.println("Retweet enviado");
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
	}
	
}