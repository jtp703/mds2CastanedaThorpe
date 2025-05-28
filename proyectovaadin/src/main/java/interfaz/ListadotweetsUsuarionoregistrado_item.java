package interfaz;

import org.vaadin.example.MainView;

public class ListadotweetsUsuarionoregistrado_item extends Listadotweets_item {
	
	private int _numRetweets;
	private int _numComentarios;
	public ListadotweetsUsuarionoregistrado _listadotweetsUsuarionoregistrado;
	public VercomentariosUsuarionoregistrado _vercomentariosUsuarionoregistrado;
	public VerperfilUsuarionoregistrado _verperfilUsuarionoregistrado;
	public Usuarionoregistrado usuario;
	
	public ListadotweetsUsuarionoregistrado_item(ListadotweetsUsuarionoregistrado listadotweetsUsuarionoregistrado, base_de_datos.Tweet tweet) {
		super(listadotweetsUsuarionoregistrado, tweet);
		this.getBtnEliminarTweet().setVisible(false);
		this.getDarRetweet().setVisible(false);
		this.getMeGusta().setVisible(false);
		this.getVerperfil().addClickListener(event -> verPerfilUsuarioNoRegistrado());
		this.getComentar().addClickListener(event -> verComentariosUsuarioNoRegistrado());
	}
	
	public ListadotweetsUsuarionoregistrado_item(VercomentariosUsuarionoregistrado _vercomentariosUsuarionoregistrado, base_de_datos.Tweet tweet) {
		super(_vercomentariosUsuarionoregistrado, tweet);
		this.getBtnEliminarTweet().setVisible(false);
		this.getDarRetweet().setVisible(false);
		this.getMeGusta().setVisible(false);
		this.getVerperfil().addClickListener(event -> verPerfilUsuarioNoRegistrado());
		this.getComentar().addClickListener(event -> verComentariosUsuarioNoRegistrado());
	}
	
	//Probablemente deba ser especifico para el no registrado, pero aun no se sabe
	public void verComentariosUsuarioNoRegistrado() {
		this._vercomentariosUsuarionoregistrado = new VercomentariosUsuarionoregistrado(this);
		MainView.Pantalla.cambiarVista(this._vercomentariosUsuarionoregistrado);
	}
	
	private void verPerfilUsuarioNoRegistrado() {
		_verperfilUsuarionoregistrado = new VerperfilUsuarionoregistrado(this.usuario);
		System.out.println("Ejecución ver perfil de usuario no registrado");
		MainView.Pantalla.cambiarVista(_verperfilUsuarionoregistrado);
	}
}
