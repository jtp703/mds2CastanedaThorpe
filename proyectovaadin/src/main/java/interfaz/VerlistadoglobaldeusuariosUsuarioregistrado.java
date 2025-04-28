package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerlistadoglobaldeusuariosUsuarioregistrado extends Verlistadogloblaldeusuarios {
	public MainView main;
	public Usuarioregistrado _usuarioregistrado;
	public Listadodeusuariosusuarioregistrado _listadodeusuariosusuarioregistrado;
	
	public VerlistadoglobaldeusuariosUsuarioregistrado(Usuarioregistrado _usuarioregistrado){
		super(_usuarioregistrado);
		this._usuarioregistrado = new Usuarioregistrado(main);
		this.getContenedorCibernauta().as(VerticalLayout.class).add(this._usuarioregistrado);
		this._listadodeusuariosusuarioregistrado = new Listadodeusuariosusuarioregistrado(this);
		this.getContenedorListadoUsuarios().as(VerticalLayout.class).add(this._listadodeusuariosusuarioregistrado);
	}
	
	public VerlistadoglobaldeusuariosUsuarioregistrado(Listadodeusuariosusuarioregistrado _listadodeusuariosusuarioregistrado) {
		super(_listadodeusuariosusuarioregistrado);
	}

	public void Listado_Usuarios__Usuario_Registrado_() {
		throw new UnsupportedOperationException();
	}
}