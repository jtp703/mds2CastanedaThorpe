package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.iUsuarioregistrado;
import base_de_datos.Usuario;
import vistas.VistaEliminarperfil;

public class Eliminarperfil extends VistaEliminarperfil {

	public Verperfilpersonal _verperfilpersonal;
	public iUsuarioregistrado _iUsuarioregistrado;
	public MainView main;
	
	public Eliminarperfil(Verperfilpersonal _verperfilpersonal) {
		this._verperfilpersonal = _verperfilpersonal;
		this._iUsuarioregistrado = _verperfilpersonal.usuarioregistrado.iUsuarioregistrado;
		
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getBtnEliminarCuenta().addClickListener(evet -> Validar_datos());
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
	}
	
	public void Validar_datos() {
	    String motivo = this.getTextFieldMotivo().getValue().trim();
	    String confirmacion = this.getTextFieldConfirmacion().getValue().trim();

	    if (motivo.isEmpty() || confirmacion.isEmpty()) {
	        Notification.show(
	            "Debes rellenar tanto el motivo como tu nick de confirmación.",
	            2000,
	            Position.TOP_CENTER
	        );
	        return;
	    }

	    try {

	        _iUsuarioregistrado.borrarPerfil(motivo, confirmacion);

	        _verperfilpersonal.usuarioregistrado._usuarioregistrado = null;

	        Notification.show(
	            "Tu cuenta ha sido eliminada correctamente.",
	            2000,
	            Position.TOP_CENTER
	        );
	        
	        this.getContenedorEliminarCuenta().as(VerticalLayout.class).removeAll();
	        Usuarionoregistrado nuevoUsuario = new Usuarionoregistrado(main);
	        MainView.Pantalla.cambiarVista(nuevoUsuario);

	    } catch (Exception e) {
	        Notification.show(
	            "Error al eliminar la cuenta: " + e.getMessage(),
	            3000,
	            Position.TOP_CENTER
	        );
	    }
	}

}