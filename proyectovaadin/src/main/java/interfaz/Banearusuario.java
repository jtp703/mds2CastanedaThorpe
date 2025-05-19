package interfaz;

import org.vaadin.example.MainView;

import vistas.VistaBanearusuario;

public class Banearusuario extends VistaBanearusuario{
	/*private event _banearcuenta;
	private textField _motivoBaneo;
	private button _pruebaVisual;
	private button _confirmar;*/
	public VerperfilAdministrador _verperfilAdministrador;
	
	public Banearusuario(VerperfilAdministrador _verperfilAdministrador) {
		this._verperfilAdministrador = _verperfilAdministrador;
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getBtnEnviarBaneo().addClickListener(event -> Banearcuenta());
	}

	public void Banearcuenta() {
		MainView.Pantalla.volver();
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
	}
}