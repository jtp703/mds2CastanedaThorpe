package interfaz;

import org.vaadin.example.*;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.iAdministrador;

public class Administrador extends Cibernauta {

	public iAdministrador _iAdministrador = new base_de_datos.BDPrincipal();
	 
	public VermuroprincipalAdministrador _vermuroprincipalAdministrador;
	public VerListadohashtags _verlistadohashtags;
	public VerlistadoglobaldeusuariosAdministrador _verlistadoglobaldeusuariosAdministrador;
	public Usuarionoregistrado usuarioNoRegistrado;
	
	public base_de_datos.Administrador admin;
	
	public Administrador(MainView MainView, base_de_datos.Administrador admin) {
		super(MainView);
		this.admin = admin;
		this.getContenedorRegistro().setVisible(false);
		this.getVerPerfilPersonal().setVisible(false);
		this.getVerNotificaciones().setVisible(false);
		this.getVerMuroPrincipal().addClickListener(event -> VermuroprincipalAdministrador());
		this.getVerListadoUsuarios().addClickListener(event -> VerlistadoglobaldeusuariosUsuarioregistrado());
		this.getVerListadoHashtags().addClickListener(event -> VerListadohashtags());
		usuarioNoRegistrado = new Usuarionoregistrado(MainView);
		this.getBtnCerrrarSesion().addClickListener(event -> CerrarsesionAdministrador(usuarioNoRegistrado));
	}


	public void VermuroprincipalAdministrador() {
		this.getContenedorContenido().as(VerticalLayout.class).removeAll();
		_vermuroprincipalAdministrador = new VermuroprincipalAdministrador(this);
		this.getContenedorContenido().as(VerticalLayout.class).add(_vermuroprincipalAdministrador);
	}

	public void CerrarsesionAdministrador(Usuarionoregistrado usuarioNoRegistrado) {
		MainView.Pantalla.cambiarVista(usuarioNoRegistrado);
	}

	public void VerlistadoglobaldeusuariosUsuarioregistrado() {
		this.getContenedorContenido().as(VerticalLayout.class).removeAll();
		_verlistadoglobaldeusuariosAdministrador = new VerlistadoglobaldeusuariosAdministrador(this);
		this.getContenedorContenido().as(VerticalLayout.class).add(_verlistadoglobaldeusuariosAdministrador);
	}

	public void VerListadohashtags() {
		this.getContenedorContenido().as(VerticalLayout.class).removeAll();
		_verlistadohashtags = new VerListadohashtags(this);
		this.getContenedorContenido().as(VerticalLayout.class).add(_verlistadohashtags);
	}

}