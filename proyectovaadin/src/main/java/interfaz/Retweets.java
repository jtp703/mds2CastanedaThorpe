package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaRetweets;

public class Retweets extends VistaRetweets {
	public Verperfildeusuario _verperfildeusuario;
	public ListadotweetsUsuarioregistrado _listadotweetsUsuarioregistrado;
	public ListadotweetsAdministrador _listadotweetsAdministrador;
	public ListadotweetsUsuarionoregistrado _listadotweetsUsuarionoregistrado;

	public Retweets(ListadotweetsUsuarioregistrado _listadotweets) {
		this._listadotweetsUsuarioregistrado = _listadotweets;
		
		System.out.println("Retweets Encontrados");
		this.getContenedorRetweets().as(VerticalLayout.class).add(_listadotweetsUsuarioregistrado);
		
	}
	public Retweets(ListadotweetsAdministrador _listadotweets) {
		this._listadotweetsAdministrador = _listadotweets;
		this.getContenedorRetweets().as(VerticalLayout.class).add(_listadotweetsAdministrador);
	}
	public Retweets(ListadotweetsUsuarionoregistrado _listadotweets) {
		this._listadotweetsUsuarionoregistrado = _listadotweets;
		this.getContenedorRetweets().as(VerticalLayout.class).add(_listadotweetsUsuarionoregistrado);
	}
	
	public Retweets(VerperfilUsuarioregistrado _verperfilUsuarioregistrado) {
		this._verperfildeusuario = _verperfilUsuarioregistrado;
		this.getContenedorRetweets().as(VerticalLayout.class).add(_verperfilUsuarioregistrado);
	}
	
	public void Listadotweets() {
		throw new UnsupportedOperationException();
	}
}