package interfaz;

import vistas.VistaNotificaciones_item;

public class Notificaciones_item extends VistaNotificaciones_item{

	public Notificaciones _notificaciones;
	
	public Notificaciones_item(Notificaciones _notificaciones, base_de_datos.Usuario _usuario) {
		this._notificaciones = _notificaciones;
		//this.getVerperfil().setText(_usuario.getNick());
		//this.getTipoNotificacion().setText("Te ha emportillado");
	}
}
