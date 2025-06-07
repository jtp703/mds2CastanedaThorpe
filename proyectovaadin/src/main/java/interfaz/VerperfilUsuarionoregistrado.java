package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerperfilUsuarionoregistrado extends Verperfildeusuario{
	
	public Usuarionoregistrado _usuarioNoRegistrado;
	public ListadotweetsUsuarionoregistrado _listadotweetsUsuarioNoRegistrado;
	public VermuroprincipalUsuarionoregistrado _vermuroPrincipalUsuarionoregistrado;
	public Verlistadodeseguidores verListadoseguidores;
	public Verlistadodeseguidos verListadoseguidos;
	public base_de_datos.Usuario usuario;
	
	public VerperfilUsuarionoregistrado(Usuarionoregistrado _usuarioNoRegistrado, base_de_datos.Usuario _usuario) {
		super(_usuarioNoRegistrado, _usuario);
		this.usuario = _usuario;
		
		this.getBtnBanearUsuario().setVisible(false);
		this.getBtnEditarPerfil().setVisible(false);
		this.getBtnEliminarPerfil().setVisible(false);
		this.getBtnBloquear().setVisible(false);
		this.getBtnSeguir().setVisible(false);
		this.getBtnCerrarSesion().setVisible(false);
		
		this._vermuroPrincipalUsuarionoregistrado = _usuarioNoRegistrado._vermuroprincipalUsuarionoregistrado;
		this._listadotweetsUsuarioNoRegistrado = new ListadotweetsUsuarionoregistrado(this);
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_listadotweetsUsuarioNoRegistrado);
		this._listadotweetsUsuarioNoRegistrado.getContenedorNuevoTweet().setVisible(false);
		
		super.cargarUsuario(_usuario);
		
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getVerSeguidores().addClickListener(event -> Verlistadodeseguidores());
		this.getVerSeguidos().addClickListener(event -> Verlistadodeseguidos());
		this.getVerPosts().addClickListener(event -> Posts(_listadotweetsUsuarioNoRegistrado));
		//sustiuir por listado filtrado de megustras
		this.getVerMegustas().addClickListener(event -> Me_gustas(new Megustas(this)));
		//sustituir por listado filtrado de retweets
		this.getVerRetweets().addClickListener(event -> Retweets(new Retweets(this)));
	}
	public VerperfilUsuarionoregistrado(ListadotweetsUsuarionoregistrado _listadotweetsUsuarioNoRegistrado) {
		super(_listadotweetsUsuarioNoRegistrado);
	}
	
	public void Posts(ListadotweetsUsuarionoregistrado _listadotweets) {
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_listadotweets);
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
        // Pasamos this como padre y la lista de seguidores (no son UsuariosAutentificados,
        // pero Usuarionoregistrado también hereda de Usuario, así que es válido).
        verListadoseguidores = new Verlistadodeseguidores(this, usuario.es_seguido.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidores);
    }

    /** Abre la vista de la lista de seguidos de este usuario */
    private void Verlistadodeseguidos() {
        verListadoseguidos = new Verlistadodeseguidos(this, usuario.sigue.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidos);
    }

}
