package interfaz;

import vistas.VistaIniciarsesion;

public class Iniciarsesion extends VistaIniciarsesion{
	/*private textLabel _correo;
	private textLabel _contrasenia;
	private button _acceder;
	private button _accedrGoogle;*/
	public Registrarse _registrarse;
	public Recuperarcontrasenia _recuperarcontrasenia;
	
	public Iniciarsesion(Registrarse _registrarse) {
		this._registrarse = _registrarse;
	}
	
	public Iniciarsesion(Recuperarcontrasenia _recuperarcontrasenia) {
		this._recuperarcontrasenia = _recuperarcontrasenia;
	}

	public void Validardatosdelogin() {
		throw new UnsupportedOperationException();
	}
}