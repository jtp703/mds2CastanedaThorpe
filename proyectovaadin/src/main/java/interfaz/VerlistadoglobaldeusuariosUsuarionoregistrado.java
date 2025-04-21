package interfaz;

public class VerlistadoglobaldeusuariosUsuarionoregistrado extends Verlistadogloblaldeusuarios{

	public Usuarionoregistrado usuarioNoRegistrado;
	public Listadodeusuariosusuarionoregistrado listadoDeUsuariosUsuarioNoRegistrado;
	
	public VerlistadoglobaldeusuariosUsuarionoregistrado(Usuarionoregistrado usuarioNoRegistrado) {
		super(usuarioNoRegistrado);
	}
	
	public VerlistadoglobaldeusuariosUsuarionoregistrado(Listadodeusuariosusuarionoregistrado listadoDeUsuariosUsuarioNoRegistrado) {
		super(listadoDeUsuariosUsuarioNoRegistrado);
	}
	
	public void Listado_Usuarios__Usuario_No_Registrado_() {
		throw new UnsupportedOperationException();
	}
}
