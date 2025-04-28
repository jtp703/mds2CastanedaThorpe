package interfaz;

public class ListadotweetsUsuarioregistrado_item extends Listadotweets_item {
	//	private event _darmegusta;
	//	private label _nickUsuario;
	//	private image _perfilUsuario;
	private int _numRetweets;
	private int _numComentarios;
	//public ListadotweetsUsuarioregistrado _listadotweetsUsuarioregistrado;
	public VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado;
	public Darretweet _darretweet;
	
	ListadotweetsUsuarioregistrado_item(ListadotweetsUsuarioregistrado listadotweetsUsuarioregistrado) {
		super(listadotweetsUsuarioregistrado);
		this.getBtnEliminarTweet().setVisible(false);
	}
	
	ListadotweetsUsuarioregistrado_item(VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado) {
		super(_vercomentariosUsuarioregistrado);
		this.getBtnEliminarTweet().setVisible(false);
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
}