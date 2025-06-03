package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.notification.Notification;
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
	public base_de_datos.Usuario _usuario;
	
	public Registrarse(Usuarionoregistrado _usuarionoregistrado) {
		this._usuarionoregistrado = _usuarionoregistrado;
		this.getBtnRegistrarse().addClickListener(event -> registrarse()); 
		this.getIniciarsesion().addClickListener(event -> IniciarSesion());
		this.getBtnVolver().addClickListener(event -> btnVolver());
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
	}
	
	private void registrarse() {
		
		this._usuario = new base_de_datos.Usuario();
		if(this.getCorreo().getValue().isEmpty() || 
		   this.getContrasenia().getValue().isEmpty() || 
		   this.getNickUsuario().getValue().isEmpty() || this.getNombreCompleto().getValue().isEmpty()){
			Notification.show("Porfavor rellene todos los campos obligatorios");
			return;
		}
		this._usuario.setNombre(this.getNombreCompleto().getValue());
		this._usuario.setMail(this.getCorreo().getValue());
		this._usuario.setPassword(this.getContrasenia().getValue());
		this._usuario.setNick(this.getNickUsuario().getValue());
		this._usuario.setFotoPerfil(this.getImgPerfil().getValue());
		this._usuario.setFotoFondo(this.getImgFondo().getValue());
		this._usuario.setDescripcion(this.getDescripción().getValue());
		//fecha de registro, necesita ser actualizada en la base de datos
		
		
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