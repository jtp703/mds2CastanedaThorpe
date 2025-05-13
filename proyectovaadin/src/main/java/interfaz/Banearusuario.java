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
	}

	public void Banearcuenta() {
		throw new UnsupportedOperationException();
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
		System.out.println("Volver a la vista anterior desde ver perfil administrador");
	}
}