package interfaz;

import vistas.VistaDarretweet;

public class Darretweet extends VistaDarretweet {
	/*private event _enviarretweet;
	private label _nickUsuario;
	private image _perfilUsuario;
	private textField _texto;*/
	public ListadotweetsUsuarioregistrado_item _listadotweetsUsuarioregistrado;

	Darretweet(ListadotweetsUsuarioregistrado_item listadotweetsUsuarioregistrado_item){
		this._listadotweetsUsuarioregistrado = listadotweetsUsuarioregistrado_item;
	}
	
	public void Enviarretweet() {
		throw new UnsupportedOperationException();
	}
	
}