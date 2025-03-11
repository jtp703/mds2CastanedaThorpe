package interfaz;

/*import basededatos.iAdministrador;*/
import org.vaadin.example.*;

public class Administrador extends Cibernauta {
	/*private event _cerrarsesionAdministrador;
	public iAdministrador _iAdministrador;*/
	public VermuroprincipalAdministrador _vermuroprincipalAdministrador;
	public VerlistadodetweetsfiltradoAdministrador _verlistadodetweetsfiltradoAdministrador;
	public VerperfilAdministrador _verperfilAdministrador;
	
	public Administrador(MainView MainView) {
		super(MainView);
		this.getVaadinVerticalLayout1().setVisible(false);
		this.getVaadinHorizontalLayout().setVisible(false);
	}

	public void VermuroprincipalAdministrador() {
		throw new UnsupportedOperationException();
	}

	public void VerlistadodetweetsfiltradoAdministrador() {
		throw new UnsupportedOperationException();
	}

	public void CerrarsesionAdministrador() {
		throw new UnsupportedOperationException();
	}

	public void VerperfilAdministrador() {
		throw new UnsupportedOperationException();
	}
}