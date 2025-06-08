package interfaz;

import org.vaadin.example.MainView;

public class Listadodeusuariosadministrador_item extends Listadousuarios_item{
	
	public Verlistadodeseguidores verListadoseguidores;
	public Verlistadodeseguidos verListadoseguidos;
	public VerperfilAdministrador _verperfiladministrador;
	public Listadodeusuariosadministrador _listadodeusuariosadministrador;
	public Administrador administrador;
	public base_de_datos.Usuario usuarioListado;
	
	public Listadodeusuariosadministrador_item(Listadodeusuariosadministrador listadodeusuariosadministrador, base_de_datos.Usuario usuarioListado){
		super(listadodeusuariosadministrador, usuarioListado);
		this.usuarioListado = usuarioListado;
		this._listadodeusuariosadministrador = listadodeusuariosadministrador;
		this.administrador = listadodeusuariosadministrador._verlistadoglobaldeusuariosAdministrador.administrador;
		
		this.getSeguirUsuario().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilAdministrador(administrador));
		this.getVerSeguidores().addClickListener(event -> Verlistadodeseguidores());
		this.getVerSeguidos().addClickListener(event -> Verlistadodeseguidos());
	}
	
	public Listadodeusuariosadministrador_item(VerperfilAdministrador _verperfiladministrador, base_de_datos.Usuario usuario) {
		super(_verperfiladministrador, usuario);
		this._verperfiladministrador = _verperfiladministrador;
		this._usuario = usuario;
		this.administrador = _verperfiladministrador._administrador;
		this.getSeguirUsuario().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilAdministrador(administrador));
	}
	
	
	public void VerperfilAdministrador(Administrador administrador) {
		_verperfiladministrador = new VerperfilAdministrador(administrador, _usuario);
		MainView.Pantalla.cambiarVista(_verperfiladministrador);
	}
	
	private void Verlistadodeseguidores() {
        verListadoseguidores = new Verlistadodeseguidores(this._listadodeusuariosadministrador, usuarioListado.es_seguido.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidores);
    }

    private void Verlistadodeseguidos() {
        verListadoseguidos = new Verlistadodeseguidos(this._listadodeusuariosadministrador, usuarioListado.sigue.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidos);
    }
	

}
