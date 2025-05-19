package interfaz;

import org.vaadin.example.MainView;

import vistas.VistaEditarperfil;

public class Editarperfil extends VistaEditarperfil{
	
//	private event _guardarcambios;
	public Verperfilpersonal _verperfilpersonal;

	public Editarperfil(Verperfilpersonal _verperfilpersonal) {
		this._verperfilpersonal = _verperfilpersonal;
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getBtnGuardar().addClickListener(event -> Guardarcambios());
	}
	
	public void Guardarcambios() {
		MainView.Pantalla.volver();
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
	}
}