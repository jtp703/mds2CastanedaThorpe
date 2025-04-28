package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerlistadoglobaldeusuariosAdministrador extends Verlistadogloblaldeusuarios {

	public MainView main;
	public Administrador administrador;
	public Listadodeusuariosadministrador listadoDeUsuariosAdministrador;

	public VerlistadoglobaldeusuariosAdministrador(Administrador administrador) {
		super(administrador);
		this.administrador = new Administrador(main);
		this.getContenedorCibernauta().as(VerticalLayout.class).add(this.administrador);
		this.listadoDeUsuariosAdministrador = new Listadodeusuariosadministrador(this);
		this.getContenedorListadoUsuarios().as(VerticalLayout.class).add(this.listadoDeUsuariosAdministrador);
	}

	public VerlistadoglobaldeusuariosAdministrador(Listadodeusuariosadministrador listadoDeUsuariosAdministrador) {
		super(listadoDeUsuariosAdministrador);
	}

	public void Listado_Usuarios__Administrador_() {
		throw new UnsupportedOperationException();
	}
}
