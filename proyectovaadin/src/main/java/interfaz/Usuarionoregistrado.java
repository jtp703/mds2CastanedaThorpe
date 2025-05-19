package interfaz;

//import basededatos.iUsuarionoregistrado;
import org.vaadin.example.*;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Usuarionoregistrado extends Cibernauta {
	/*private label _registrarse;
	public iUsuarionoregistrado _iUsuarionoregistrado;*/
	public Registrarse _registrarse;
	public VermuroprincipalUsuarionoregistrado _vermuroprincipalUsuarionoregistrado;
	public VerlistadoglobaldeusuariosUsuarionoregistrado _verlistadoglobaldeusuariosUsuarionoregistrado;
	public VerListadohashtags _verlistadohashtags;
	
	public Usuarionoregistrado(MainView MainView) {
		super(MainView);
		this.getContenedorVerPerfilPersonal().setVisible(false);
		this.getVerNotificaciones().setVisible(false);
		this.getBtnCerrrarSesion().setVisible(false);
		this.getVerMuroPrincipal().addClickListener(event -> VermuroprincipalUsuarioregistrado());
		this.getVerListadoUsuarios().addClickListener(event -> VerlistadoglobaldeusuariosUsuarioregistrado());
		this.getVerListadoHashtags().addClickListener(event -> VerListadohashtags());
		this.getRegistrarse().addClickListener(event -> Registrarse());
	}

	public void Registrarse() {
		this.getContenedorPrincipal().as(VerticalLayout.class).removeAll();
		_registrarse = new Registrarse(this);
		this.getContenedorPrincipal().as(VerticalLayout.class).add(_registrarse);
	}
	
	public void VermuroprincipalUsuarioregistrado() {
		this.getContenedorContenido().as(VerticalLayout.class).removeAll();
		_vermuroprincipalUsuarionoregistrado = new VermuroprincipalUsuarionoregistrado(this);
		this.getContenedorContenido().as(VerticalLayout.class).add(_vermuroprincipalUsuarionoregistrado);
	}
	
	public void VerlistadoglobaldeusuariosUsuarioregistrado() {
		this.getContenedorContenido().as(VerticalLayout.class).removeAll();
		_verlistadoglobaldeusuariosUsuarionoregistrado = new VerlistadoglobaldeusuariosUsuarionoregistrado(this);
		this.getContenedorContenido().as(VerticalLayout.class).add(_verlistadoglobaldeusuariosUsuarionoregistrado);
	}
	
	public void VerListadohashtags() {
		this.getContenedorContenido().as(VerticalLayout.class).removeAll();
		_verlistadohashtags = new VerListadohashtags(this);
		this.getContenedorContenido().as(VerticalLayout.class).add(_verlistadohashtags);
	}
}