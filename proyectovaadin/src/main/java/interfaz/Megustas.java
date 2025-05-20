package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMegustas;

public class Megustas extends VistaMegustas {
	
	public Verperfildeusuario _verperfildeusuario;
	public ListadotweetsUsuarioregistrado _listadotweetsUsuarioregistrado;
	public ListadotweetsAdministrador _listadotweetsAdministrador;
	public ListadotweetsUsuarionoregistrado _listadotweetsUsuarionoregistrado;
	
	public Megustas(ListadotweetsUsuarioregistrado _listadotweets) {
		this._listadotweetsUsuarioregistrado = _listadotweets;
		System.out.println("Megustas Encontrados");
		this.getContenedorMegustas().as(VerticalLayout.class).add(_listadotweetsUsuarioregistrado);
	}
	public Megustas(ListadotweetsAdministrador _listadotweets) {
		this._listadotweetsAdministrador = _listadotweets;
		this.getContenedorMegustas().as(VerticalLayout.class).add(_listadotweetsAdministrador);
	}
	public Megustas(ListadotweetsUsuarionoregistrado _listadotweets) {
		this._listadotweetsUsuarionoregistrado = _listadotweets;
		this.getContenedorMegustas().as(VerticalLayout.class).add(_listadotweetsUsuarionoregistrado);
	}

	public void Listadotweets() {
		throw new UnsupportedOperationException();
	}
}