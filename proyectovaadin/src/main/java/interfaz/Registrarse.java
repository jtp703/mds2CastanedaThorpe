package interfaz;

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
	}
	
	public Registrarse(GoogleLogin _googleLogin) {
		this._googleLogin = _googleLogin;
	}
	
	public Registrarse(Iniciarsesion _iniciarsesion) {
		this._iniciarsesion = _iniciarsesion;
	}
}