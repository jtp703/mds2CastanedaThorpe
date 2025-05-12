package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadotweetsUsuarioregistrado_item extends Listadotweets_item {
	//	private event _darmegusta;
	//	private label _nickUsuario;
	//	private image _perfilUsuario;
	private int _numRetweets;
	private int _numComentarios;
	//public ListadotweetsUsuarioregistrado _listadotweetsUsuarioregistrado;
	public VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado;
	public Darretweet _darretweet;
	public Usuarioregistrado usuario;
	
	ListadotweetsUsuarioregistrado_item(ListadotweetsUsuarioregistrado listadotweetsUsuarioregistrado) {
		super(listadotweetsUsuarioregistrado);
		this.getBtnEliminarTweet().setVisible(false);
		System.out.println("Ejecución usuario boton");
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
		throw new UnsupportedOperationException();
	}

	public void VercomentariosUsuarioregistrado() {
		throw new UnsupportedOperationException();
	}

	public void Darretweet() {
		throw new UnsupportedOperationException();
	}
	
	public void VerperfilUsuarioregistrado() {
		
	}
	
}