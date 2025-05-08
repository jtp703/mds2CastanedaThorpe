package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.vaadin.example.*;

public class VerlistadoglobaldeusuariosUsuarioregistrado extends Verlistadogloblaldeusuarios {
	public MainView main;
	public Usuarioregistrado _usuarioregistrado;
	public Listadodeusuariosusuarioregistrado _listadodeusuariosusuarioregistrado;
	
	public VerlistadoglobaldeusuariosUsuarioregistrado(Usuarioregistrado _usuarioregistrado){
		super(_usuarioregistrado);
<<<<<<< HEAD
		this.getContenedorCibernauta().as(VerticalLayout.class).add(_usuarioregistrado);
		Listadodeusuariosusuarioregistrado_item item0 = new Listadodeusuariosusuarioregistrado_item(_listadodeusuariosusuarioregistrado);
		this.getContenedorListadoUsuarios().as(VerticalLayout.class).add(item0);
		Listadodeusuariosusuarioregistrado_item item1 = new Listadodeusuariosusuarioregistrado_item(_listadodeusuariosusuarioregistrado);
		this.getContenedorListadoUsuarios().as(VerticalLayout.class).add(item1);
=======
		this._usuarioregistrado = new Usuarioregistrado(main);
		this.getContenedorCibernauta().as(VerticalLayout.class).add(this._usuarioregistrado);
		this._listadodeusuariosusuarioregistrado = new Listadodeusuariosusuarioregistrado(this);
		this.getContenedorListadoUsuarios().as(VerticalLayout.class).add(this._listadodeusuariosusuarioregistrado);
>>>>>>> branch 'vistaListasDiego' of git@github.com:jtp703/mds2CastanedaThorpe.git
	}
	
	public VerlistadoglobaldeusuariosUsuarioregistrado(Listadodeusuariosusuarioregistrado _listadodeusuariosusuarioregistrado) {
		super(_listadodeusuariosusuarioregistrado);
	}

	public void Listado_Usuarios__Usuario_Registrado_() {
		throw new UnsupportedOperationException();
	}
}