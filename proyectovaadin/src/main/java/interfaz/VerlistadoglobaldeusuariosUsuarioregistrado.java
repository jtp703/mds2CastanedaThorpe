package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.vaadin.example.*;

public class VerlistadoglobaldeusuariosUsuarioregistrado extends Verlistadogloblaldeusuarios {
	public Usuarioregistrado _usuarioregistrado;
	public Listadodeusuariosusuarioregistrado _listadodeusuariosusuarioregistrado;
	
	public VerlistadoglobaldeusuariosUsuarioregistrado(Usuarioregistrado _usuarioregistrado){
		super(_usuarioregistrado);
		this._usuarioregistrado = _usuarioregistrado;
		_listadodeusuariosusuarioregistrado = new Listadodeusuariosusuarioregistrado(this);
		this.getContenedorListadoUsuarios().as(VerticalLayout.class).add(_listadodeusuariosusuarioregistrado);
	}
	
	public VerlistadoglobaldeusuariosUsuarioregistrado(Listadodeusuariosusuarioregistrado _listadodeusuariosusuarioregistrado) {
		super(_listadodeusuariosusuarioregistrado);
	}

	public void Listado_Usuarios__Usuario_Registrado_() {
		throw new UnsupportedOperationException();
	}
}