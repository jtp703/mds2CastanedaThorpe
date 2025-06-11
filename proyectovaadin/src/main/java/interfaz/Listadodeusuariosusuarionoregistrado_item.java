package interfaz;

import org.vaadin.example.MainView;

public class Listadodeusuariosusuarionoregistrado_item extends Listadousuarios_item {
	
	public Verlistadodeseguidores verListadoseguidores;
	public Verlistadodeseguidos verListadoseguidos;
	public VerperfilUsuarionoregistrado _verPerfilUsuarionoregistrado;
	public Verperfilpersonal _verperfilpersonal;
	public Listadodeusuariosusuarionoregistrado _listadodeusuariosusuarionoregistrado;
	public Usuarionoregistrado usuarionoregistrado;
	public base_de_datos.Usuario usuarioListado;
	
	public Listadodeusuariosusuarionoregistrado_item(Listadodeusuariosusuarionoregistrado listadodeusuariosusuarionoregistrado, base_de_datos.Usuario usuarioListado){
		super(listadodeusuariosusuarionoregistrado, usuarioListado);
		this.usuarioListado = usuarioListado;
		this._listadodeusuariosusuarionoregistrado = listadodeusuariosusuarionoregistrado;
		this.usuarionoregistrado = listadodeusuariosusuarionoregistrado.verlistadoglobaldeusuariosUsuarionoregistrado.usuarioNoRegistrado;
		
		this.getSeguirUsuario().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilUsuarionoregistrado(usuarionoregistrado));
		this.getVerSeguidores().addClickListener(event -> Verlistadodeseguidores());
		this.getVerSeguidos().addClickListener(event -> Verlistadodeseguidos());
	}
	
	public Listadodeusuariosusuarionoregistrado_item(VerperfilUsuarionoregistrado _verPerfilUsuarionoregistrado, base_de_datos.Usuario usuario) {
		super(_verPerfilUsuarionoregistrado, usuario);
		this._usuario = usuario;
		this._verPerfilUsuarionoregistrado = _verPerfilUsuarionoregistrado;
		this.usuarionoregistrado = _verPerfilUsuarionoregistrado._usuarioNoRegistrado;
		this.getSeguirUsuario().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilUsuarionoregistrado(usuarionoregistrado));
	}
	
	public Listadodeusuariosusuarionoregistrado_item(Verperfilpersonal _verperfilpersonal, base_de_datos.Usuario usuario) {
		super(_verperfilpersonal, usuario);
		this._usuario = usuario;
		this._verperfilpersonal = _verperfilpersonal;
		this.usuarionoregistrado = _verPerfilUsuarionoregistrado._usuarioNoRegistrado;
		this.getSeguirUsuario().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilUsuarionoregistrado(usuarionoregistrado));
	}
	
	public void VerperfilUsuarionoregistrado(Usuarionoregistrado usuarionoregistrado) {
		_verPerfilUsuarionoregistrado = new VerperfilUsuarionoregistrado(usuarionoregistrado, _usuario);
		MainView.Pantalla.cambiarVista(_verPerfilUsuarionoregistrado);
	}
	
	private void Verlistadodeseguidores() {
        verListadoseguidores = new Verlistadodeseguidores(this._listadodeusuariosusuarionoregistrado, usuarioListado.es_seguido.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidores);
    }

    private void Verlistadodeseguidos() {
        verListadoseguidos = new Verlistadodeseguidos(this._listadodeusuariosusuarionoregistrado, usuarioListado.sigue.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidos);
    }

}
