package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerperfilUsuarioregistrado extends Verperfildeusuario {
	/*private event _bloquear_usuario;
	private event _seguir_usuario_desde_perfil;*/
	
	public Usuarioregistrado usuarioregistrado;
	public ListadotweetsUsuarioregistrado listadotweetsUsuarioregistrado;
	public Verlistadodeseguidores verListadoseguidores;
	public Verlistadodeseguidos verListadoseguidos;
	
	public VerperfilUsuarioregistrado(Usuarioregistrado usuarioregistrado) {
		super(usuarioregistrado);
		this.listadotweetsUsuarioregistrado = new ListadotweetsUsuarioregistrado(this);
		this.listadotweetsUsuarioregistrado.getContenedorNuevoTweet().setVisible(false);
		this.getContenedorListadotweets().as(VerticalLayout.class).add(listadotweetsUsuarioregistrado);
		this.getBtnBanearUsuario().setVisible(false);
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getVerSeguidores().addClickListener(event -> Verlistadodeseguidores());
		this.getVerSeguidos().addClickListener(event -> Verlistadodeseguidos());
		this.getVerRetweets().addClickListener(event -> Retweets(this._retweets));
	}
	
	public VerperfilUsuarioregistrado(ListadotweetsUsuarioregistrado listadotweetsUsuarioregistrado) {
		super(listadotweetsUsuarioregistrado); 
	}
	
	public void Retweets(Retweets _retweets) {
		this._retweets = _retweets;
	}
	public void Me_gustas(Megustas _megustas) {
		this._megustas = _megustas;
	}
	public void Ver_Listado(Verlistado _verlistado) {
		this._verlistado = _verlistado;
	}
	public void Listadotweets(Listadotweets _listadotweets) {
		this._listadotweets = _listadotweets;
	}
	public void Bloquear_usuario() {
		throw new UnsupportedOperationException();
	}

	public void Seguir_usuario_desde_perfil() {
		throw new UnsupportedOperationException();
	}

	public void VerListadoTweets() {
		throw new UnsupportedOperationException();
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
		System.out.println("Volver a la vista anterior desde ver perfil personal");
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