package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Verperfilpersonal extends Verperfildeusuario {
//	private event _cerrar_sesion__Usuario_registrado_;
	public Usuarioregistrado usuarioregistrado;
	public Usuarionoregistrado _usuarioNoRegistrado;
	public Eliminarperfil _eliminarperfil;
	public Editarperfil _editarperfil;
	
	public Verperfilpersonal(Usuarioregistrado usuarioregistrado) {
		super(usuarioregistrado, usuarioregistrado._usuarioregistrado);
		this.usuarioregistrado = usuarioregistrado;
		this.getBtnBanearUsuario().setVisible(false);
		this.getBtnSeguir().setVisible(false);
		this.getBtnBloquear().setVisible(false);
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getBtnEliminarPerfil().addClickListener(event -> Eliminar_perfil());
		this.getBtnEditarPerfil().addClickListener(event -> Editar_perfil());
		_usuarioNoRegistrado = new Usuarionoregistrado(new MainView());
		this.getBtnCerrarSesion().addClickListener(event -> Cerrar_sesion__Usuario_registrado_(_usuarioNoRegistrado));
	}

	public void Eliminar_perfil() {
		_eliminarperfil = new Eliminarperfil(this);
		MainView.Pantalla.cambiarVista(_eliminarperfil);
		
	}

	public void Editar_perfil() {
		_editarperfil = new Editarperfil(this);
		MainView.Pantalla.cambiarVista(_editarperfil);
	}

	public void Cerrar_sesion__Usuario_registrado_(Usuarionoregistrado usuarioNoRegistrado) {
		MainView.Pantalla.cambiarVista(usuarioNoRegistrado);
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
		System.out.println("Volver a la vista anterior desde ver perfil personal");
	}
}