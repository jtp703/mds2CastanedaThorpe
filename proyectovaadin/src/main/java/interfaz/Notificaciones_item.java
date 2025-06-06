package interfaz;

import org.vaadin.example.MainView;

import vistas.VistaNotificaciones_item;

public class Notificaciones_item extends VistaNotificaciones_item{

	public Notificaciones _notificaciones;
	
	public Notificaciones_item(Notificaciones _notificaciones, base_de_datos.Usuario _usuario, String _texto) {
		this._notificaciones = _notificaciones;
		this.getVerperfil().setText(_usuario.getNick());
		this.getTipoNotificacion().setText(_texto);
		this.getVerperfil().addClickListener(event -> {
			VerperfilUsuarioregistrado _verperfilUsuarioregistrado = new VerperfilUsuarioregistrado(
					_notificaciones.notificacionesDeUsuario._usuarioregistrado,
					_usuario
					);
			MainView.Pantalla.cambiarVista(_verperfilUsuarioregistrado);
		});
	}
}
