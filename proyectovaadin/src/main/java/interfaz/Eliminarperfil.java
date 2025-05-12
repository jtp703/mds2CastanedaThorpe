package interfaz;

import org.vaadin.example.MainView;

import vistas.VistaEliminarperfil;

public class Eliminarperfil extends VistaEliminarperfil {
//	private label _motivo;
	public Verperfilpersonal _verperfilpersonal;
	
	public Eliminarperfil(Verperfilpersonal _verperfilpersonal) {
		this._verperfilpersonal = _verperfilpersonal;
		this.getBtnVolver().addClickListener(event -> btnVolver());
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
	    System.out.println("Volver a la vista anterior desde eliminar perfil");
	}
	
	public void Validar_datos() {
		throw new UnsupportedOperationException();
	}
}