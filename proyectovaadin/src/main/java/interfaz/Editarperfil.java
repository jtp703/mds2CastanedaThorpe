package interfaz;

import org.vaadin.example.MainView;

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
		this.getBtnVolver().addClickListener(event -> btnVolver());
	}
	
	public void Guardarcambios() {
		throw new UnsupportedOperationException();
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
		System.out.println("Volver a la vista anterior desde editar perfil");
	}
}