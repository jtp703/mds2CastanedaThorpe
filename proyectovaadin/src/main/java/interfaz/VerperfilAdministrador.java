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
	public Verlistadodeseguidores verListadoseguidores;
	public Verlistadodeseguidos verListadoseguidos;
	public base_de_datos.Usuario usuario;
	
	public VerperfilAdministrador(Administrador _administrador, Usuario _usuario) {
		super(_administrador, _usuario);
		this._listadotweetsadministrador = new ListadotweetsAdministrador(this);
		this._listadotweetsadministrador.getContenedorNuevoTweet().setVisible(false);
		this.usuario = _usuario;
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_listadotweetsadministrador);
		this.getBtnBloquear().setVisible(false);
		this.getBtnSeguir().setVisible(false);
		this.getBtnEditarPerfil().setVisible(false);
		this.getBtnEliminarPerfil().setVisible(false);
		this.getBtnCerrarSesion().setVisible(false);
		_usuario.likea.toArray();
		
		//cargar perfil
		this.getNombreUsuario().setText(_usuario.getNombre());
		this.getNickUsuario().setText(_usuario.getNick());
		this.getImgFondo().setSrc(_usuario.getFotoFondo());
		this.getImgPerfil().setSrc(_usuario.getFotoPerfil());
		this.getDescripcionPerfil().setText(_usuario.getDescripcion());
		this.getVerSeguidos().setText(Integer.toString(_usuario.es_seguido.size()));
		this.getVerSeguidores().setText(Integer.toString(_usuario.sigue.size()));
		
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getVerSeguidores().addClickListener(event -> Verlistadodeseguidores(_usuario.es_seguido));
		this.getVerSeguidos().addClickListener(event -> Verlistadodeseguidos(_usuario.sigue));
		this.getBtnBanearUsuario().addClickListener(event -> Banear_usuarios());
		//sustituir por listado filtrado de megustras
		this.getVerMegustas().addClickListener(event -> Me_gustas(new Megustas(_listadotweetsadministrador)));
		//sustituir por listado filtrado de retweets
		this.getVerRetweets().addClickListener(event -> Retweets(new Retweets(_listadotweetsadministrador)));
	}
	
	public void Retweets(Retweets _retweets) {
		this.getContenedorListadotweets().as(VerticalLayout.class).removeAll();
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_retweets);
	}
	public void Me_gustas(Megustas _megustas) {
		this.getContenedorListadotweets().as(VerticalLayout.class).removeAll();
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_megustas);
		
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