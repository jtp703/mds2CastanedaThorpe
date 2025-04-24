package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNotificacionesdeusuario;

//import DCL.Notificaciones;

public class Notificacionesdeusuario extends VistaNotificacionesdeusuario{
	
	public MainView main;
//	private event _seguir_usuario_desde_notificaciones;
	public Usuarioregistrado _usuarioregistrado;
//	public Notificaciones _notificaciones;
	
	public Notificacionesdeusuario() {
		
	}

	public Notificacionesdeusuario(Usuarioregistrado _usuarioregistrado) {
		this._usuarioregistrado = _usuarioregistrado;
		Usuarioregistrado u = new Usuarioregistrado(main);
		this.getContenedorCibernauta().as(VerticalLayout.class).add(u);
		Notificaciones n = new Notificaciones(this);
		this.getContemdorListadoNotificaciones().as(VerticalLayout.class).add(n);
		
	}
	public void Seguir_usuario_desde_notificaciones() {
		throw new UnsupportedOperationException();
	}

	public void Comentarios() {
		throw new UnsupportedOperationException();
	}
}