package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMegustas;

public class Megustas extends VistaMegustas {
	public Verperfildeusuario _verperfildeusuario;
	public Listadotweets _listadotweets;
	Listadodeusuariosusuarioregistrado luur;
	
	public Megustas(Verperfildeusuario _verperfildeusuario) {
		this._verperfildeusuario = _verperfildeusuario;
		Listadodeusuariosusuarioregistrado_item item0 = new Listadodeusuariosusuarioregistrado_item(luur);
		this.getContenedorListadoMegustas().as(VerticalLayout.class).add(item0);
		Listadodeusuariosusuarioregistrado_item item1 = new Listadodeusuariosusuarioregistrado_item(luur);
		this.getContenedorListadoMegustas().as(VerticalLayout.class).add(item1);
		
	}
	
	public Megustas(Listadotweets _listadotweets) {
		this._listadotweets = _listadotweets;
	}

	public void Listadotweets() {
		throw new UnsupportedOperationException();
	}
}