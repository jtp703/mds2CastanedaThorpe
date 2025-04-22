package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerlistadoglobaldeusuariosUsuarionoregistrado extends Verlistadogloblaldeusuarios{

	public Usuarionoregistrado usuarioNoRegistrado;
	public Listadodeusuariosusuarionoregistrado listadoDeUsuariosUsuarioNoRegistrado;
	
	public VerlistadoglobaldeusuariosUsuarionoregistrado(Usuarionoregistrado usuarioNoRegistrado) {
		super(usuarioNoRegistrado);
		Usuarionoregistrado unr = new Usuarionoregistrado();
		this.getContenedorCibernauta().as(VerticalLayout.class).add(unr);
		Listadodeusuariosusuarionoregistrado_item item0 = new Listadodeusuariosusuarionoregistrado_item(listadoDeUsuariosUsuarioNoRegistrado);
		this.getContenedorListadoUsuarios().as(VerticalLayout.class).add(item0);
		Listadodeusuariosusuarionoregistrado_item item1 = new Listadodeusuariosusuarionoregistrado_item(listadoDeUsuariosUsuarioNoRegistrado);
		this.getContenedorListadoUsuarios().as(VerticalLayout.class).add(item1);
	}
	
	public VerlistadoglobaldeusuariosUsuarionoregistrado(Listadodeusuariosusuarionoregistrado listadoDeUsuariosUsuarioNoRegistrado) {
		super(listadoDeUsuariosUsuarioNoRegistrado);
	}
	
	public void Listado_Usuarios__Usuario_No_Registrado_() {
		throw new UnsupportedOperationException();
	}
}
