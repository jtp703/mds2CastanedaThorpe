package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerperfilUsuarionoregistrado extends Verperfildeusuario{
	
	public Usuarionoregistrado _usuarioNoRegistrado;
	public ListadotweetsUsuarionoregistrado _listadotweetsUsuarioNoRegistrado;
	public Verlistadodeseguidores verListadoseguidores;
	public Verlistadodeseguidos verListadoseguidos;
	
	public VerperfilUsuarionoregistrado(Usuarionoregistrado _usuarioNoRegistrado) {
		super(_usuarioNoRegistrado);
		this._listadotweetsUsuarioNoRegistrado = new ListadotweetsUsuarionoregistrado(this);
		this._listadotweetsUsuarioNoRegistrado.getContenedorNuevoTweet().setVisible(false);
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_listadotweetsUsuarioNoRegistrado);
		this.getBtnBanearUsuario().setVisible(false);
		this.getBtnEditarPerfil().setVisible(false);
		this.getBtnEliminarPerfil().setVisible(false);
		this.getBtnBloquear().setVisible(false);
		this.getBtnSeguir().setVisible(false);
		this.getBtnCerrarSesion().setVisible(false);
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getVerSeguidores().addClickListener(event -> Verlistadodeseguidores());
		this.getVerSeguidos().addClickListener(event -> Verlistadodeseguidos());
		//sustiuir por listado filtrado de megustras
		this.getVerMegustas().addClickListener(event -> Me_gustas(new Megustas(_listadotweetsUsuarioNoRegistrado)));
		//sustituir por listado filtrado de retweets
		this.getVerRetweets().addClickListener(event -> Retweets(new Retweets(_listadotweetsUsuarioNoRegistrado)));
	}
	
	public VerperfilUsuarionoregistrado(ListadotweetsUsuarionoregistrado _listadotweetsUsuarioNoRegistrado) {
		super(_listadotweetsUsuarioNoRegistrado);
	}
	
	public void Retweets(Retweets _retweets) {
		this.getContenedorListadotweets().as(VerticalLayout.class).removeAll();
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_retweets);
	}
	public void Me_gustas(Megustas _megustas) {
		this.getContenedorListadotweets().as(VerticalLayout.class).removeAll();
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_megustas);
		
	}
	public void Ver_Listado(Verlistado _verlistado) {
		this._verlistado = _verlistado;
	}
	public void Listadotweets(Listadotweets _listadotweets) {
		this._listadotweets = _listadotweets;
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
		System.out.println("Volver a la vista anterior desde ver perfil usuario no registrado");
	}
	private void Verlistadodeseguidores() {
		verListadoseguidores = new Verlistadodeseguidores(this);
		MainView.Pantalla.cambiarVista(verListadoseguidores);
	}

	private void Verlistadodeseguidos() {
		verListadoseguidos = new Verlistadodeseguidos(this);
		MainView.Pantalla.cambiarVista(verListadoseguidos);
	}

}
