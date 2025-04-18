package interfaz;

import vistas.VistaRecuperarcontrasenia;

public class Recuperarcontrasenia extends VistaRecuperarcontrasenia {
	public Iniciarsesion _iniciarsesion;
	public Correo _correo;

	public Recuperarcontrasenia(Iniciarsesion _iniciarsesion) {
		this._iniciarsesion = _iniciarsesion;
	}
	
	public Recuperarcontrasenia(Correo _correo) {
		this._correo = _correo;
	}
	public void Enviarnotificacionalcorreo() {
		throw new UnsupportedOperationException();
	}
}