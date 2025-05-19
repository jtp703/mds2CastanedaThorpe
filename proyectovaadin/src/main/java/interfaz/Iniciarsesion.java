package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaIniciarsesion;

public class Iniciarsesion extends VistaIniciarsesion{
	/*private textLabel _correo;
	private textLabel _contrasenia;
	private button _acceder;
	private button _accedrGoogle;*/
	public Registrarse _registrarse;
	public Recuperarcontrasenia _recuperarcontrasenia;
	public Usuarioregistrado usuarioregistrado;
	
	public Iniciarsesion(Registrarse _registrarse) {
		this._registrarse = _registrarse;
		this.getBtnIniciarSesion().addClickListener(evetn -> Validardatosdelogin());
		this.getBtnVolver().addClickListener(event -> Volver());
	}
	
	public Iniciarsesion(Recuperarcontrasenia _recuperarcontrasenia) {
		this._recuperarcontrasenia = _recuperarcontrasenia;
	}

	public void Validardatosdelogin() {
		this.getContenedorIniciarSesion().as(VerticalLayout.class).removeAll();
		
	}
	private void Volver() {
		MainView.Pantalla.volver();
	}
}