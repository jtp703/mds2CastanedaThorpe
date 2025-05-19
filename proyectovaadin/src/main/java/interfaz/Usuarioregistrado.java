package interfaz;

//import basededatos.iUsuarioregistrado;
import org.vaadin.example.*;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;

public class Usuarioregistrado extends Cibernauta {
//	public iUsuarioregistrado _iUsuarioregistrado;
	public Notificacionesdeusuario _notificacionesdeusuario;
	public VermuroprincipalUsuarioregistrado _vermuroprincipalUsuarioregistrado;
	public VerListadohashtags _verlistadohashtags;
//	public VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado;
	public VerlistadoglobaldeusuariosUsuarioregistrado _verlistadoglobaldeusuariosUsuarioregistrado;
	public Verperfilpersonal _verperfilpersonal;

	public Usuarioregistrado(MainView mainView) {
		super(mainView);
		this.getContenedorRegistro().setVisible(false);
		this.getBtnCerrrarSesion().setVisible(false);
		//VermuroprincipalUsuarioregistrado();
		System.out.println("Ejecucion clase usuario");
		this.getVerMuroPrincipal().addClickListener(event -> VermuroprincipalUsuarioregistrado());
		this.getVerListadoUsuarios().addClickListener(event -> VerlistadoglobaldeusuariosUsuarioregistrado());
		this.getVerListadoHashtags().addClickListener(event -> VerListadohashtags());
		this.getVerNotificaciones().addClickListener(event -> Notificacionesdeusuario());
		this.getVerPerfilPersonal().addClickListener(event -> Verperfilpersonal());
	}

	public void Notificacionesdeusuario() {
		this.getContenedorContenido().as(VerticalLayout.class).removeAll();
		_notificacionesdeusuario = new Notificacionesdeusuario(this);
		this.getContenedorContenido().as(VerticalLayout.class).add(_notificacionesdeusuario);
	}

	public void VermuroprincipalUsuarioregistrado() {
		this.getContenedorContenido().as(VerticalLayout.class).removeAll();
		_vermuroprincipalUsuarioregistrado = new VermuroprincipalUsuarioregistrado(this);
		this.getContenedorContenido().as(VerticalLayout.class).add(_vermuroprincipalUsuarioregistrado);
	}

	public void VerlistadoglobaldeusuariosUsuarioregistrado() {
		this.getContenedorContenido().as(VerticalLayout.class).removeAll();
		_verlistadoglobaldeusuariosUsuarioregistrado = new VerlistadoglobaldeusuariosUsuarioregistrado(this);
		this.getContenedorContenido().as(VerticalLayout.class).add(_verlistadoglobaldeusuariosUsuarioregistrado);

	}

	public void Verperfilpersonal() {
		Verperfilpersonal _verperfilpersonal = new Verperfilpersonal(this);
		System.out.println("Ejecucion clase usuario");
		MainView.Pantalla.cambiarVista(_verperfilpersonal);
	}

	public void VerListadohashtags() {
		this.getContenedorContenido().as(VerticalLayout.class).removeAll();
		_verlistadohashtags = new VerListadohashtags(this);
		this.getContenedorContenido().as(VerticalLayout.class).add(_verlistadohashtags);
	}
	
	public MainView getMainView() {
	    return this.mainView;
	}
}