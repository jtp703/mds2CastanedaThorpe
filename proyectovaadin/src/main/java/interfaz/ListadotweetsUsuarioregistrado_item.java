package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadotweetsUsuarioregistrado_item extends Listadotweets_item {
	//	private event _darmegusta;
	//	private label _nickUsuario;
	//	private image _perfilUsuario;
	private int _numRetweets;
	private int _numComentarios;
	private boolean megusta = false;
	
	//public ListadotweetsUsuarioregistrado _listadotweetsUsuarioregistrado;
	public VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado;
	public Darretweet _darretweet;
	public Usuarioregistrado usuario;
	public VerperfilUsuarioregistrado _verperfilUsuarioregistrado;
	
	ListadotweetsUsuarioregistrado_item(ListadotweetsUsuarioregistrado listadotweetsUsuarioregistrado) {
		super(listadotweetsUsuarioregistrado);
		this.getBtnEliminarTweet().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilUsuarioregistrado(usuario));
		this.getComentar().addClickListener(event -> VercomentariosUsuarioregistrado());
		this.getDarRetweet().addClickListener(even -> Darretweet());
		this.getMeGusta().addClickListener(event -> Darmegusta());
	}
	
	ListadotweetsUsuarioregistrado_item(VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado) {
		super(_vercomentariosUsuarioregistrado);
		this.getBtnEliminarTweet().setVisible(false);
	}
	
	ListadotweetsUsuarioregistrado_item(Usuarioregistrado usu) {
		super();
		usuario=usu;
	}
	public void Darmegusta() {
		megusta = !megusta; // invierte el estado

	    if (megusta) {
	        System.out.println("Tweet gustado");
	        this.getMeGusta().getStyle().set("color", "red");
	    } else {
	        System.out.println("Me gusta retirado");
	        this.getMeGusta().getStyle().set("color", "black");
	    }
	}

	public void VercomentariosUsuarioregistrado() {
		_vercomentariosUsuarioregistrado = new VercomentariosUsuarioregistrado(this);
		MainView.Pantalla.cambiarVista(_vercomentariosUsuarioregistrado);
	}

	public void Darretweet() {
		_darretweet = new Darretweet(this);
		MainView.Pantalla.cambiarVista(_darretweet);
		this.getDarRetweet().getStyle().set("background-color", "#00cc66");
	    this.getDarRetweet().getStyle().set("color", "white");
	}
	
	public void VerperfilUsuarioregistrado(Usuarioregistrado usuario) {
		_verperfilUsuarioregistrado = new VerperfilUsuarioregistrado(usuario);
		System.out.println("Ejecución ver perfil de usuario");
		MainView.Pantalla.cambiarVista(_verperfilUsuarioregistrado);
	}
	
}