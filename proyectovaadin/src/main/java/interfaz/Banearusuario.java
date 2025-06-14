package interfaz;

import org.vaadin.example.MainView;

import vistas.VistaBanearusuario;

public class Banearusuario extends VistaBanearusuario{
	
	public VerperfilAdministrador _verperfilAdministrador;
	
	public Banearusuario(VerperfilAdministrador _verperfilAdministrador) {
		this._verperfilAdministrador = _verperfilAdministrador;
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getBtnEnviarBaneo().addClickListener(event -> Banearcuenta());
	}

	public void Banearcuenta() {
		_verperfilAdministrador._administrador._iAdministrador.banearUsuario(_verperfilAdministrador._administrador.admin.getID(),
				_verperfilAdministrador.usuario.getID());
		Administrador admin = _verperfilAdministrador._administrador;
		MainView.Pantalla.cambiarVista(admin);
		
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
	}
}