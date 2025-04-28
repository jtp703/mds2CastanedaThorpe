package interfaz;

import vistas.VistaEditarperfil;

public class Editarperfil extends VistaEditarperfil{
//	private event _guardarcambios;
	public Verperfilpersonal _verperfilpersonal;
	public Usuarioregistrado _usuarioregistrado;
	
	public Editarperfil(Usuarioregistrado usuarioregistrado) {
		this._usuarioregistrado = usuarioregistrado;
	}
	public Editarperfil(Verperfilpersonal _verperfilpersonal) {
		this._verperfilpersonal = _verperfilpersonal;
	}
	
	public void Guardarcambios() {
		throw new UnsupportedOperationException();
	}
}