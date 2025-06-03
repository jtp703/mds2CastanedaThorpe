package interfaz;

import base_de_datos.BDPrincipal;
import base_de_datos.iUsuarioregistrado;
import org.vaadin.example.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import java.util.*;

public class Usuarioregistrado extends Cibernauta {

	public iUsuarioregistrado iUsuarioregistrado = new BDPrincipal();
	public Notificacionesdeusuario _notificacionesdeusuario;
	public VermuroprincipalUsuarioregistrado _vermuroprincipalUsuarioregistrado;
	public VerListadohashtags _verlistadohashtags;
	public VerlistadoglobaldeusuariosUsuarioregistrado _verlistadoglobaldeusuariosUsuarioregistrado;
	public Verperfilpersonal _verperfilpersonal;

	public base_de_datos.Usuario _usuarioregistrado;
	
	public Usuarioregistrado(MainView mainView, base_de_datos.Usuario usuarioregistrado) {
		super(mainView);
		this._usuarioregistrado = usuarioregistrado;
		this.getContenedorRegistro().setVisible(false);
		this.getBtnCerrrarSesion().setVisible(false);

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