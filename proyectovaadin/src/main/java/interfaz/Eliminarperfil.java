package interfaz;

import org.vaadin.example.MainView;

import vistas.VistaEliminarperfil;

public class Eliminarperfil extends VistaEliminarperfil {
//	private label _motivo;
	public Verperfilpersonal _verperfilpersonal;
	
	public Eliminarperfil(Verperfilpersonal _verperfilpersonal) {
		this._verperfilpersonal = _verperfilpersonal;
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getBtnEliminarCuenta().addClickListener(evet -> Validar_datos());
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
	}
	
	public void Validar_datos() {
		MainView.Pantalla.volver();
	}
}