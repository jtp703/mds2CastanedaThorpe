package interfaz;

public class ListadotweetsAdministrador_item extends Listadotweets_item {
	//	private event _eliminartweet;
	private int _numRetweets;
	private int _numComentarios;
	public ListadotweetsAdministrador _listadotweetsAdministrador;
	public VercomentariosAdminstrador _vercomentariosAdminstrador;
	
	ListadotweetsAdministrador_item(ListadotweetsAdministrador listadotweetsAdministrador) {
		super(listadotweetsAdministrador);
		this.getDarRetweet().setVisible(false);
		this.getMeGusta().setVisible(false);
	}
	
	public void Eliminartweet() {
		throw new UnsupportedOperationException();
	}
}