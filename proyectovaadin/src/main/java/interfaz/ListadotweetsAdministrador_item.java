package interfaz;

import org.vaadin.example.MainView;

public class ListadotweetsAdministrador_item extends Listadotweets_item {
	//	private event _eliminartweet;
	private int _numRetweets;
	private int _numComentarios;
	public ListadotweetsAdministrador _listadotweetsAdministrador;
	public VercomentariosAdminstrador _vercomentariosAdminstrador;
	public Administrador admin;
	public base_de_datos.Tweet tweet;
	
	public ListadotweetsAdministrador_item(ListadotweetsAdministrador listadotweetsAdministrador, base_de_datos.Tweet tweet) {
		super(listadotweetsAdministrador, tweet);
		this.tweet = tweet;
		this.getDarRetweet().setVisible(false);
		this.getMeGusta().setVisible(false);
		this.getVerperfil().addClickListener(event -> verPerfilUsuarioRegistrado());
		this.getComentar().addClickListener(event -> VercomentariosAdministrador());
	}
	
	public ListadotweetsAdministrador_item(VercomentariosAdminstrador _vercomentariosAdminstrador, base_de_datos.Tweet tweet) {
		super(_vercomentariosAdminstrador, tweet);
		this.getDarRetweet().setVisible(false);
		this.getMeGusta().setVisible(false);
		this.getVerperfil().addClickListener(event -> verPerfilUsuarioRegistrado());
		this.getComentar().addClickListener(event -> VercomentariosAdministrador());
	}
	
	public void Eliminartweet() {
		throw new UnsupportedOperationException();
	}
	
	public void VercomentariosAdministrador() {
		this._vercomentariosAdminstrador = new VercomentariosAdminstrador(this);
		MainView.Pantalla.cambiarVista(this._vercomentariosAdminstrador);
	}
	
	private void verPerfilUsuarioRegistrado() {
		VerperfilAdministrador _verperfilAdministrador = new VerperfilAdministrador(this.admin, this.tweet.tweeteado_por);
		
		MainView.Pantalla.cambiarVista(_verperfilAdministrador);
	}
}