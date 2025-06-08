package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
		this.admin = listadotweetsAdministrador._administrador;
		this._listadotweetsAdministrador = listadotweetsAdministrador;
		this.getVerperfil().addClickListener(event -> verPerfilUsuarioRegistrado());
		this.getComentar().addClickListener(event -> VercomentariosAdministrador());
		this.getBtnEliminarTweet().addClickListener(event -> Eliminartweet());
	}
	
	public ListadotweetsAdministrador_item(VercomentariosAdminstrador _vercomentariosAdminstrador, base_de_datos.Tweet tweet) {
		super(_vercomentariosAdminstrador, tweet);
		this._vercomentariosAdminstrador = _vercomentariosAdminstrador;
		this.getVerperfil().addClickListener(event -> verPerfilUsuarioRegistrado());
		this.getComentar().addClickListener(event -> VercomentariosAdministrador());
		this.getBtnEliminarTweet().addClickListener(event -> Eliminartweet());
	}
	
	public void Eliminartweet() {
		admin._iAdministrador.borrarTweet(tweet.getIdTweet());
		this._listadotweetsAdministrador.getContenedorListadoTweets_item().as(VerticalLayout.class).remove(this);
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