package interfaz;

import vistas.VistaDarretweet;

public class Darretweet extends VistaDarretweet {
	/*private event _enviarretweet;
	private label _nickUsuario;
	private image _perfilUsuario;
	private textField _texto;*/
	public ListadotweetsUsuarioregistrado_item _listadotweetsUsuarioregistrado;
	ListadotweetsUsuarioregistrado ltur;

	public Darretweet(ListadotweetsUsuarioregistrado_item listadotweetsUsuarioregistrado_item){
		this._listadotweetsUsuarioregistrado = listadotweetsUsuarioregistrado_item;
		this.getItem().setVisible(false);
		ListadotweetsUsuarioregistrado_item item0 = new ListadotweetsUsuarioregistrado_item(ltur);
		this.getContenedorTweetsItem().add(item0);
	}
	
	
	public void Enviarretweet() {
		throw new UnsupportedOperationException();
	}
	
}