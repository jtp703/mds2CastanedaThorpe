package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerlistadoglobaldeusuariosUsuarionoregistrado extends Verlistadogloblaldeusuarios{

	public Usuarionoregistrado usuarioNoRegistrado;
	public Listadodeusuariosusuarionoregistrado listadoDeUsuariosUsuarioNoRegistrado;
	
	public VerlistadoglobaldeusuariosUsuarionoregistrado(Usuarionoregistrado usuarioNoRegistrado) {
		super(usuarioNoRegistrado);
		this.usuarioNoRegistrado = usuarioNoRegistrado;
		this.listadoDeUsuariosUsuarioNoRegistrado = new Listadodeusuariosusuarionoregistrado(this);
		this.getContenedorListadoUsuarios().as(VerticalLayout.class).add(this.listadoDeUsuariosUsuarioNoRegistrado);
	}
	
	public VerlistadoglobaldeusuariosUsuarionoregistrado(Listadodeusuariosusuarionoregistrado listadoDeUsuariosUsuarioNoRegistrado) {
		super(listadoDeUsuariosUsuarioNoRegistrado);
		
	}
	
	public void Listado_Usuarios__Usuario_No_Registrado_() {
		throw new UnsupportedOperationException();
	}
}
