package interfaz;

import java.util.Collection;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Usuario;
import base_de_datos.UsuarioSetCollection;

public class VerperfilAdministrador extends Verperfildeusuario {
	
	public Administrador _administrador;
	public Usuarioregistrado _usuarioregistrado;
	public ListadotweetsAdministrador _listadotweetsadministrador;
	public Banearusuario _banearusuario;
	public VermuroprincipalAdministrador _vermuroprincipalAdministrador;
	public Verlistadodeseguidores verListadoseguidores;
	public Verlistadodeseguidos verListadoseguidos;
	public base_de_datos.Usuario usuario;
	
	public VerperfilAdministrador(Administrador _administrador, Usuario _usuario) {
		super(_administrador, _usuario);
		this.usuario = _usuario;
		this.getBtnBloquear().setVisible(false);
		this.getBtnSeguir().setVisible(false);
		this.getBtnEditarPerfil().setVisible(false);
		this.getBtnEliminarPerfil().setVisible(false);
		this.getBtnCerrarSesion().setVisible(false);
		
		this._vermuroprincipalAdministrador = _administrador._vermuroprincipalAdministrador;
		this._listadotweetsadministrador = new ListadotweetsAdministrador(this);
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_listadotweetsadministrador);
		this._listadotweetsadministrador.getContenedorNuevoTweet().setVisible(false);
		
		//cargar perfil
		super.cargarUsuario(_usuario);
		
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getVerSeguidores().addClickListener(event -> Verlistadodeseguidores(_usuario.es_seguido));
		this.getVerSeguidos().addClickListener(event -> Verlistadodeseguidos(_usuario.sigue));
		this.getBtnBanearUsuario().addClickListener(event -> Banear_usuarios());
		this.getVerPosts().addClickListener(event -> Posts(_listadotweetsadministrador));
		//sustituir por listado filtrado de megustras
		this.getVerMegustas().addClickListener(event -> Megustas(new Megustas(this)));
		//sustituir por listado filtrado de retweets
		this.getVerRetweets().addClickListener(event -> Retweets(new Retweets(this)));
	}
	
	public void Posts(ListadotweetsAdministrador _listadotweets) {
		this.getContenedorListadotweets().as(VerticalLayout.class).removeAll();
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_listadotweets);
	}
	public void Retweets(Retweets _retweets) {
		this.getContenedorListadotweets().as(VerticalLayout.class).removeAll();
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_retweets);
	}
	public void Megustas(Megustas _megustas) {
		this.getContenedorListadotweets().as(VerticalLayout.class).removeAll();
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_megustas);
	}
	
	public void Ver_Listado(Verlistado _verlistado) {
		this._verlistado = _verlistado;
	}
	public void Listadotweets(Listadotweets _listadotweets) {
		this._listadotweets = _listadotweets;
	}

	public void Banear_usuarios() {
		_banearusuario = new Banearusuario(this);
		MainView.Pantalla.cambiarVista(_banearusuario);
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
		System.out.println("Volver a la vista anterior desde ver perfil administrador");
	}
	
	private void Verlistadodeseguidores(UsuarioSetCollection es_seguido) {
		
		verListadoseguidores = new Verlistadodeseguidores(this, es_seguido.toArray());
		MainView.Pantalla.cambiarVista(verListadoseguidores);
	}

	private void Verlistadodeseguidos(UsuarioSetCollection seguidos) {
		verListadoseguidos = new Verlistadodeseguidos(this, seguidos.toArray());
		MainView.Pantalla.cambiarVista(verListadoseguidos);
	}
	
}