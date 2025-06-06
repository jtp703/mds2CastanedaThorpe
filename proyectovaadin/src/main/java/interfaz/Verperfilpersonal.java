package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Verperfilpersonal extends Verperfildeusuario {

	public Usuarioregistrado usuarioregistrado;
	
	public Verperfilpersonal(Usuarioregistrado usuarioregistrado) {
		super(usuarioregistrado, usuarioregistrado._usuarioregistrado);
		this.usuarioregistrado = usuarioregistrado;
		
		this.getBtnBanearUsuario().setVisible(false);
		this.getBtnSeguir().setVisible(false);
		this.getBtnBloquear().setVisible(false);
		
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getBtnEliminarPerfil().addClickListener(event -> Eliminar_perfil());
		this.getBtnEditarPerfil().addClickListener(event -> Editar_perfil());
		this.getBtnCerrarSesion().addClickListener(event -> Cerrar_sesion());
	}

	public void Eliminar_perfil() {
		Eliminarperfil _eliminarperfil = new Eliminarperfil(this);
		MainView.Pantalla.cambiarVista(_eliminarperfil);
	}

	public void Editar_perfil() {
		Editarperfil _editarperfil = new Editarperfil(this);
		MainView.Pantalla.cambiarVista(_editarperfil);
	}

	public void Cerrar_sesion() {
		Usuarionoregistrado _usuarioNoRegistrado = new Usuarionoregistrado(new MainView());
		MainView.Pantalla.cambiarVista(_usuarioNoRegistrado);
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
	}
}