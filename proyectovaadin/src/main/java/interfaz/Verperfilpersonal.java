package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Usuario;

public class Verperfilpersonal extends Verperfildeusuario {

	public Usuarioregistrado usuarioregistrado;
	public VermuroprincipalUsuarioregistrado vermuroprincipalUsuarioregistrado;
	public ListadotweetsUsuarioregistrado listadotweetsUsuarioregistrado;
	public Usuario usuario;
	
	public Verperfilpersonal(Usuarioregistrado usuarioregistrado) {
		super(usuarioregistrado, usuarioregistrado._usuarioregistrado);
		this.usuarioregistrado = usuarioregistrado;
		this.usuario = usuarioregistrado._usuarioregistrado;
		this.getBtnBanearUsuario().setVisible(false);
		this.getBtnSeguir().setVisible(false);
		this.getBtnBloquear().setVisible(false);
		
		this.vermuroprincipalUsuarioregistrado = usuarioregistrado._vermuroprincipalUsuarioregistrado;
		this.listadotweetsUsuarioregistrado = new ListadotweetsUsuarioregistrado(this);
		this.listadotweetsUsuarioregistrado.getContenedorNuevoTweet().setVisible(false);
		
		
		
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getBtnEliminarPerfil().addClickListener(event -> Eliminar_perfil());
		this.getBtnEditarPerfil().addClickListener(event -> Editar_perfil());
		this.getBtnCerrarSesion().addClickListener(event -> Cerrar_sesion());
		

		this.getVerPosts().addClickListener(event -> Posts(listadotweetsUsuarioregistrado));
		this.getVerMegustas().addClickListener(event -> Megustas(new Megustas(this)));
		//sustituir por listado filtrado de retweets
		this.getVerRetweets().addClickListener(event -> Retweets(new Retweets(this)));
		
	}
	
	public void Posts(ListadotweetsUsuarioregistrado _listadotweets) {
		this.getContenedorListadotweets().as(VerticalLayout.class).removeAll();
		this.getContenedorListadotweets().as(VerticalLayout.class).add(listadotweetsUsuarioregistrado);
	}
	
	public void Retweets(Retweets _retweets) {
		this.getContenedorListadotweets().as(VerticalLayout.class).removeAll();
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_retweets);
	}
	public void Megustas(Megustas _megustas) {
		this.getContenedorListadotweets().as(VerticalLayout.class).removeAll();
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_megustas);
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