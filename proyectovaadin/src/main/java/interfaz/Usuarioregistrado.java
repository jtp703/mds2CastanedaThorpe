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
	public VerListadohashtags _listadohashtags;
	public VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado;
	public VerlistadoglobaldeusuariosUsuarioregistrado _verlistadoglobaldeusuariosUsuarioregistrado;
	public Verperfilpersonal _verperfilpersonal;
	public VerperfilUsuarioregistrado _verperfilUsuarioregistrado;
	
	public Usuarioregistrado(MainView mainView) {
		super(mainView);
		this.getContenedorRegistro().setVisible(false);
		VermuroprincipalUsuarioregistrado();
		this.getVerMuroPrincipal().addClickListener(event -> VermuroprincipalUsuarioregistrado());
		this.getVerListadoUsuarios().addClickListener(event -> VerlistadoglobaldeusuariosUsuarioregistrado());
		this.getVerListadoHashtags().addClickListener(event -> VerListadohashtags());
		this.getVerNotificaciones().addClickListener(event -> Notificacionesdeusuario());
		
	}
	
	    

	public void Notificacionesdeusuario() {
		this.getContenedorContenido().as(VerticalLayout.class).removeAll();
		System.out.println("Notificaciones de usuario");
		
		_notificacionesdeusuario = new Notificacionesdeusuario(this);
		Notificaciones _notificaciones = new Notificaciones(_notificacionesdeusuario);
		this.getContenedorContenido().as(VerticalLayout.class).add(_notificaciones);
		//mainView.removeAll();
		//mainView.add(_notificacionesdeusuario);
		
	}

	public void VermuroprincipalUsuarioregistrado() {
		//this.getContenedorContenido().removeAllChildren();
		this.getContenedorContenido().as(VerticalLayout.class).removeAll();
		ListadotweetsUsuarioregistrado _listadotweetsUsuarioregistrado = new ListadotweetsUsuarioregistrado(this._vermuroprincipalUsuarioregistrado);
		this.getContenedorContenido().as(VerticalLayout.class).add(_listadotweetsUsuarioregistrado);
	}

	public void VerlistadodetweetsfiltradoUsuarioregistrado() {
		throw new UnsupportedOperationException();
	}

	public void VerlistadoglobaldeusuariosUsuarioregistrado() {
		//mainView.removeAll();
		this.getContenedorContenido().as(VerticalLayout.class).removeAll();
		_verlistadoglobaldeusuariosUsuarioregistrado = new VerlistadoglobaldeusuariosUsuarioregistrado(this);
		Listadodeusuariosusuarioregistrado _listadousuariousuarioregistrado = new Listadodeusuariosusuarioregistrado(this._verlistadoglobaldeusuariosUsuarioregistrado);
		this.getContenedorContenido().as(VerticalLayout.class).add(_listadousuariousuarioregistrado);
	}

	public void Verperfilpersonal() {
		throw new UnsupportedOperationException();
	}

	public void VerperfilUsuarioregistrado() {
		throw new UnsupportedOperationException();
	}
	
	public void VerListadohashtags() {
		this.getContenedorContenido().as(VerticalLayout.class).removeAll();
		System.out.println("Listado de hashtags");
		_listadohashtags = new VerListadohashtags();
		this.getContenedorContenido().as(VerticalLayout.class).add(_listadohashtags);
	}
}