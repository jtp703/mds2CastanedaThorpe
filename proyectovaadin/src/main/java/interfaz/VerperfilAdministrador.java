package interfaz;

import org.vaadin.example.MainView;

public class VerperfilAdministrador extends Verperfildeusuario {
	public Administrador _administrador;
	public Banearusuario _banearusuario;
	
	public VerperfilAdministrador(Administrador _administrador) {
		super(_administrador);
		this.getBtnBloquear().setVisible(false);
		this.getBtnSeguir().setVisible(false);
		this.getBtnEliminarPerfil().setVisible(false);
		this.getBtnEditarPerfil().setVisible(false);
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getBtnBanearUsuario().addClickListener(event -> Banear_usuarios());
	}

	public void Banear_usuarios() {
		_banearusuario = new Banearusuario(this);
		MainView.Pantalla.cambiarVista(_banearusuario);
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
		System.out.println("Volver a la vista anterior desde ver perfil administrador");
	}
	
}