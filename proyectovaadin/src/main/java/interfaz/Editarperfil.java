package interfaz;

import vistas.VistaEditarperfil;

public class Editarperfil extends VistaEditarperfil{
//	private event _guardarcambios;
	public Verperfilpersonal _verperfilpersonal;
	public Usuarioregistrado _usuarioregistrado;
	
	Editarperfil(Usuarioregistrado usuarioregistrado) {
		this._usuarioregistrado = usuarioregistrado;
	}
	
	public void Guardarcambios() {
		throw new UnsupportedOperationException();
	}
}