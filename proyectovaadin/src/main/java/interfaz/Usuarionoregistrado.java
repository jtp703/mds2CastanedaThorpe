package interfaz;

//import basededatos.iUsuarionoregistrado;
import org.vaadin.example.*;

public class Usuarionoregistrado extends Cibernauta {
	/*private label _registrarse;
	public iUsuarionoregistrado _iUsuarionoregistrado;
	public Registrarse _registrarse;*/
	
	public Usuarionoregistrado() {
		
	}
	
	public Usuarionoregistrado(MainView MainView) {
		super(MainView);
		this.getContenedorVerPerfilPersonal().setVisible(false);
	}

	public void Registrarse() {
		throw new UnsupportedOperationException();
	}
}