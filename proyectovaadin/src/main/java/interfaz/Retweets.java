package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaRetweets;

public class Retweets extends VistaRetweets {
	public Verperfildeusuario _verperfildeusuario;
	public Listadotweets _listadotweets;
	ListadotweetsUsuarionoregistrado ltunr;

	public Retweets(Verperfildeusuario _verperfildeusuario) {
		this._verperfildeusuario = _verperfildeusuario;
		ListadotweetsUsuarionoregistrado_item item0 = new ListadotweetsUsuarionoregistrado_item(ltunr);
		this.getContenedorListadoRetweets().as(VerticalLayout.class).add(item0);
	}
	
	public Retweets(Listadotweets _listadotweets) {
		this._listadotweets = _listadotweets;
	}
	
	public void Listadotweets() {
		throw new UnsupportedOperationException();
	}
}