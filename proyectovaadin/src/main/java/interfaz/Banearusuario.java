package interfaz;

import vistas.VistaBanearusuario;

public class Banearusuario extends VistaBanearusuario{
	/*private event _banearcuenta;
	private textField _motivoBaneo;
	private button _pruebaVisual;
	private button _confirmar;*/
	public VerperfilAdministrador _verperfilAdministrador;
	
	public Banearusuario(VerperfilAdministrador _verperfilAdministrador) {
		this._verperfilAdministrador = _verperfilAdministrador;
	}

	public void Banearcuenta() {
		throw new UnsupportedOperationException();
	}
}