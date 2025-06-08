package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
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
		if(this._usuarionoregistrado._iUsuarionoregistrado.findByUserMail(this.getCorreo().getValue()) != null){
			Notification.show("Este correo ya esta registrado");
			return;
		}
		if(this.getCorreo().getValue().isEmpty() || 
		   this.getContrasenia().getValue().isEmpty() || 
		   this.getNickUsuario().getValue().isEmpty() || this.getNombreCompleto().getValue().isEmpty()){
			Notification.show("Porfavor rellene todos los campos obligatorios");
			return;
		}
		
		 // Validación de contraseña: 8–14 caracteres, al menos una mayúscula y un carácter especial
        String password = this.getContrasenia().getValue().trim();
        String pattern = "^(?=.*[A-Z])(?=.*[^a-zA-Z0-9]).{8,14}$";
        if (!password.matches(pattern)) {
            Notification.show(
                "Contraseña no válida: debe tener 8–14 caracteres, al menos una mayúscula y un carácter especial",
                3000,
                Position.MIDDLE
            );
            return;
        }
		
		//fecha de registro, necesita ser actualizada en la base de datos
		Usuarioregistrado u = new Usuarioregistrado(this._usuarionoregistrado.mainView,
				(base_de_datos.Usuario) this._usuarionoregistrado._iUsuarionoregistrado.registrarse(this.getNombreCompleto().getValue(), 
						this.getContrasenia().getValue(), 
						this.getCorreo().getValue(),
						this.getNickUsuario().getValue(),
						this.getImgFondo().getValue(),
						this.getImgPerfil().getValue(),
						this.getDescripción().getValue(),
						null));
		MainView.Pantalla.cambiarVista(u);
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