package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadotweetsUsuarioregistrado_item extends Listadotweets_item {
	//	private event _darmegusta;
	//	private label _nickUsuario;
	//	private image _perfilUsuario;
	// private int _numRetweets;
	//private int _numComentarios;

	
	public ListadotweetsUsuarioregistrado _listadotweetsUsuarioregistrado;
	public VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado;
	public Darretweet _darretweet;
	public Usuarioregistrado usuario;
	public VerperfilUsuarioregistrado _verperfilUsuarioregistrado;
	private boolean retweeteado = false;
	private boolean megusta = false;
	public base_de_datos.Usuario usu;
	private base_de_datos.Tweet tweet;
	
	ListadotweetsUsuarioregistrado_item(ListadotweetsUsuarioregistrado listadotweetsUsuarioregistrado, base_de_datos.Tweet tweet) {
		super(listadotweetsUsuarioregistrado, tweet);
		this.getBtnEliminarTweet().setVisible(false);
		this.usuario = listadotweetsUsuarioregistrado._vermuroprincipalUsuarioregistrado._usuarioregistrado;
		this.usu = tweet.tweeteado_por;
		this.tweet = tweet;
		this.getVerperfil().addClickListener(event -> VerperfilUsuarioregistrado(usuario));
		this.getComentar().addClickListener(event -> VercomentariosUsuarioregistrado());
		this.getDarRetweet().addClickListener(even -> Darretweet());
		this.getMeGusta().addClickListener(event -> Darmegusta());
		
	}
	
	ListadotweetsUsuarioregistrado_item(VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado, base_de_datos.Tweet tweet) {
		super(_vercomentariosUsuarioregistrado, tweet);
		this.getBtnEliminarTweet().setVisible(false);
		this.getContenedorInteracciones().setVisible(false);
	}	
	
	public void Darmegusta() {
		megusta = !megusta; // invierte el estado

	    if (megusta) {
	        System.out.println("Tweet gustado");
	        usuario.iUsuarioregistrado.darMegustaTweet(usuario._usuarioregistrado.getID(), tweet.getIdTweet());
	        this.getMeGusta().getStyle().set("color", "red");
	    } else {
	        System.out.println("Me gusta retirado");
	        usuario.iUsuarioregistrado.quitarMegusta(usuario._usuarioregistrado.getID(), tweet.getIdTweet());
	        this.getMeGusta().getStyle().set("color", "black");
	    }
	    
	    Usuarioregistrado usuarioregistrado = new Usuarioregistrado(usuario.mainView, usuario.iUsuarioregistrado.cargarPerfilUsuarioregistrado(usu.getID()));
	}

	public void VercomentariosUsuarioregistrado() {
		this._vercomentariosUsuarioregistrado = new VercomentariosUsuarioregistrado(this);
		MainView.Pantalla.cambiarVista(_vercomentariosUsuarioregistrado);
	}

	public void Darretweet() {
		_darretweet = new Darretweet(this);
		MainView.Pantalla.cambiarVista(_darretweet);
	}
	
	public void VerperfilUsuarioregistrado(Usuarioregistrado usuario) {
		//usuario es aquel que inicio sesion y usu es el usuario cuyo perfil se quiere ver
		_verperfilUsuarioregistrado = new VerperfilUsuarioregistrado(usuario, usu);
		System.out.println("Ejecución ver perfil de usuario");
		MainView.Pantalla.cambiarVista(_verperfilUsuarioregistrado);
	}
	
	public void marcarRetweet() {
	    retweeteado = true;
	    this.getDarRetweet().setColor("#00cc66"); // o el color que quieras
	}
	
}