package interfaz;

import org.vaadin.example.MainView;

import vistas.VistaEditarperfil;

public class Editarperfil extends VistaEditarperfil{
	
//	private event _guardarcambios;
	public Verperfilpersonal _verperfilpersonal;
	public Usuarioregistrado usuarioregistrado;
	
	public Editarperfil(Verperfilpersonal _verperfilpersonal) {
		this._verperfilpersonal = _verperfilpersonal;
		this._verperfilpersonal.usuarioregistrado = usuarioregistrado;
		this.get_nickUsuario().setValue(usuarioregistrado._usuarioregistrado.getNick());
		this.get_NombreUsuario().setValue(usuarioregistrado._usuarioregistrado.getNombre());
		this.get_DescripcionPerfil().setValue(usuarioregistrado._usuarioregistrado.getDescripcion());
		this.get_UrlImagenFondo().setValue(usuarioregistrado._usuarioregistrado.getFotoFondo());
		this.get_UrlImagenPerfil().setValue(usuarioregistrado._usuarioregistrado.getFotoPerfil());
		this.get_contraUsuario().setValue(usuarioregistrado._usuarioregistrado.getPassword());
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