package interfaz;

public class ListadotweetsUsuarionoregistrado_item extends Listadotweets_item {
	
	private int _numRetweets;
	private int _numComentarios;
	public ListadotweetsUsuarionoregistrado _listadotweetsUsuarionoregistrado;
	public VercomentariosUsuarioregistrado _vercomentariosUsuarionoregistrado;
	
	public ListadotweetsUsuarionoregistrado_item(ListadotweetsUsuarionoregistrado listadotweetsUsuarionoregistrado) {
		super(listadotweetsUsuarionoregistrado);
		this.getBtnEliminarTweet().setVisible(false);
	}
	
	//Probablemente deba ser especifico para el no registrado, pero aun no se sabe
	public void VercomentariosUsuarioregistrado() {
		throw new UnsupportedOperationException();
	}
}
