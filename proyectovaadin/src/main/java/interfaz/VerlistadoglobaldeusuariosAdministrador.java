package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerlistadoglobaldeusuariosAdministrador extends Verlistadogloblaldeusuarios {

	public Administrador administrador;
	public Listadodeusuariosadministrador listadoDeUsuariosAdministrador;

	public VerlistadoglobaldeusuariosAdministrador(Administrador administrador) {
		super(administrador);
		Administrador admin = new Administrador();
		this.getContenedorCibernauta().as(VerticalLayout.class).add(admin);
	}

	public VerlistadoglobaldeusuariosAdministrador(Listadodeusuariosadministrador listadoDeUsuariosAdministrador) {
		super(listadoDeUsuariosAdministrador);
	}

	public void Listado_Usuarios__Administrador_() {
		throw new UnsupportedOperationException();
	}
}
