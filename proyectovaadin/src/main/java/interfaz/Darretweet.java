package interfaz;

import org.vaadin.example.MainView;

import vistas.VistaDarretweet;

public class Darretweet extends VistaDarretweet {
	/*private event _enviarretweet;
	private label _nickUsuario;
	private image _perfilUsuario;
	private textField _texto;*/
	public ListadotweetsUsuarioregistrado_item _listadotweetsUsuarioregistrado;
	public ListadotweetsUsuarioregistrado ltur;

	public Darretweet(ListadotweetsUsuarioregistrado_item listadotweetsUsuarioregistrado_item){
		this._listadotweetsUsuarioregistrado = listadotweetsUsuarioregistrado_item;
		this.getItem().setVisible(false);
		_listadotweetsUsuarioregistrado = new ListadotweetsUsuarioregistrado_item(ltur);
		this.getContenedorTweetsItem().add(_listadotweetsUsuarioregistrado);
		this.getVolver().addClickListener(event -> btnVolver());
	}
	
	
	public void Enviarretweet() {
		throw new UnsupportedOperationException();
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
	}
	
}