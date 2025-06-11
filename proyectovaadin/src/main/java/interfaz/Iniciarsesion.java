package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Usuario;
import base_de_datos.UsuarioAutentificado;
import base_de_datos.iUsuarionoregistrado;
import vistas.VistaIniciarsesion;

public class Iniciarsesion extends VistaIniciarsesion{
	/*private textLabel _correo;
	private textLabel _contrasenia;
	private button _acceder;
	private button _accedrGoogle;*/
	public Registrarse _registrarse;
	public Recuperarcontrasenia _recuperarcontrasenia;
	public Usuarionoregistrado usuarionoregistrado;
	
	public Iniciarsesion(Registrarse _registrarse) {
		this._registrarse = _registrarse;
		this.usuarionoregistrado = _registrarse._usuarionoregistrado;
		this.getBtnIniciarSesion().addClickListener(event -> Validardatosdelogin());
		this.getBtnVolver().addClickListener(event -> Volver());
		this.getRecuperarContrasenia().addClickListener(event -> recuperarContrasenia());
	}
	
	public Iniciarsesion(Recuperarcontrasenia _recuperarcontrasenia) {
		this._recuperarcontrasenia = _recuperarcontrasenia;
	}

	public void Validardatosdelogin() {
		UsuarioAutentificado r = this._registrarse._usuarionoregistrado._iUsuarionoregistrado
				.iniciarSesion(this.getCorreo().getValue(), this.getContrasenia1().getValue());
		if (r instanceof Usuario) {
			Usuarioregistrado u = new Usuarioregistrado(this._registrarse._usuarionoregistrado.mainView, (base_de_datos.Usuario) r);
			if(u._usuarioregistrado.getEs_baneado() != null) {
				Notification.show("Este usuario ha sido baneado");
				return;
			}
			MainView.Pantalla.cambiarVista(u);
		} else if (r instanceof base_de_datos.Administrador){
			Administrador a = new Administrador(this._registrarse._usuarionoregistrado.mainView, (base_de_datos.Administrador) r);
			MainView.Pantalla.cambiarVista(a);
		} else {
			this.usuarionoregistrado.mainView.add(this.usuarionoregistrado);
			
			Notification.show("Este usuario no existe");
		}
	}
	private void Volver() {
		MainView.Pantalla.volver();
	}
	
	public void recuperarContrasenia() {
	    // Crear el contenido personalizado
	    Span contenido = new Span("Ponte en contacto con el administrador");
	    contenido.getStyle()
	             .set("color", "red")
	             .set("font-size", "20px");

	    // Crear la notificación
	    Notification notification = new Notification();
	    notification.add(contenido);
	    notification.setDuration(4000); // 4 segundos
	    notification.setPosition(Notification.Position.MIDDLE);
	    notification.open();
	}


}