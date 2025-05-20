package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaRegistrarse;

public class Registrarse extends VistaRegistrarse{
	/*private textField _correo;
	private textField _nick;
	private textField _fotoPerfil;
	private textField _imagenFondo;
	private textField _descripcion;
	private textField _contrasenia;
	private button _acceder;*/
	public Usuarionoregistrado _usuarionoregistrado;
	public GoogleLogin _googleLogin;
	public Iniciarsesion _iniciarsesion;
	
	public Registrarse(Usuarionoregistrado _usuarionoregistrado) {
		this._usuarionoregistrado = _usuarionoregistrado;
		this.getIniciarsesion().addClickListener(event -> IniciarSesion());
		this.getBtnVolver().addClickListener(event -> btnVolver());
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
	}
	
	public Registrarse(GoogleLogin _googleLogin) {
		this._googleLogin = _googleLogin;
	}
	
	public void IniciarSesion() {
		this.getContenedorRegistrarse().as(VerticalLayout.class).removeAll();
		this._iniciarsesion = new Iniciarsesion(this);
		this.getContenedorRegistrarse().as(VerticalLayout.class).add(this._iniciarsesion);
	}
}