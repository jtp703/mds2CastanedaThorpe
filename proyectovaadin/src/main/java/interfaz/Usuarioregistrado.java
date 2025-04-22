package interfaz;

//import basededatos.iUsuarioregistrado;
import org.vaadin.example.*;

public class Usuarioregistrado extends Cibernauta {
//	public iUsuarioregistrado _iUsuarioregistrado;
	public Notificacionesdeusuario _notificacionesdeusuario;
	public VermuroprincipalUsuarioregistrado _vermuroprincipalUsuarioregistrado;
	public VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado;
	public VerlistadoglobaldeusuariosUsuarioregistrado _verlistadoglobaldeusuariosUsuarioregistrado;
	public Verperfilpersonal _verperfilpersonal;
	public VerperfilUsuarioregistrado _verperfilUsuarioregistrado;

	public Usuarioregistrado() {
		
	}
	
	public Usuarioregistrado(MainView MainView) {
		super(MainView);
		this.getContenedorRegistro().setVisible(false);
	}
	
	public void Notificacionesdeusuario() {
		throw new UnsupportedOperationException();
	}

	public void VermuroprincipalUsuarioregistrado() {
		throw new UnsupportedOperationException();
	}

	public void VerlistadodetweetsfiltradoUsuarioregistrado() {
		throw new UnsupportedOperationException();
	}

	public void VerlistadoglobaldeusuariosUsuarioregistrado() {
		throw new UnsupportedOperationException();
	}

	public void Verperfilpersonal() {
		throw new UnsupportedOperationException();
	}

	public void VerperfilUsuarioregistrado() {
		throw new UnsupportedOperationException();
	}
}