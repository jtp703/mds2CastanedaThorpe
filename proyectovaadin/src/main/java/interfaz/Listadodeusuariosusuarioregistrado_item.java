package interfaz;

import org.vaadin.example.MainView;

public class Listadodeusuariosusuarioregistrado_item extends Listadousuarios_item {
//	private event _seguir_usuario_desde_listado_global_de_usuarios;
	public Listadodeusuariosusuarioregistrado _listadodeusuariosusuarioregistrado;

	public VerperfilUsuarioregistrado _verPerfilUsuarioregistrado;
	public Usuarioregistrado usuarioRegistrado;
	public base_de_datos.Usuario usuario;
	public base_de_datos.Usuario usuarioListado;
	
	public Listadodeusuariosusuarioregistrado_item(Listadodeusuariosusuarioregistrado listadodeusuariosusuarioregistrado, base_de_datos.Usuario usuario){
		super(listadodeusuariosusuarioregistrado, usuario);
		this.usuarioListado = usuario;
		this.usuario = listadodeusuariosusuarioregistrado._verlistadoglobaldeusuariosUsuarioregistrado._usuarioregistrado._usuarioregistrado;
		this._listadodeusuariosusuarioregistrado = listadodeusuariosusuarioregistrado;
		
		this.getSeguirUsuario().addClickListener(event -> Seguir_usuario_desde_listado_global_de_usuarios());
		this.getVerperfil().addClickListener(event -> VerperfilUsuarioregistrado(usuarioRegistrado));
	}
	
	public Listadodeusuariosusuarioregistrado_item(VerperfilUsuarioregistrado _verPerfilUsuarioregistrado, base_de_datos.Usuario usuario) {
		super(_verPerfilUsuarioregistrado, usuario);
		this.usuarioListado = usuario;
		this.getVerperfil().addClickListener(event -> VerperfilUsuarioregistrado(usuarioRegistrado));
	}
	
	public void Seguir_usuario_desde_listado_global_de_usuarios() {
		_listadodeusuariosusuarioregistrado._verlistadoglobaldeusuariosUsuarioregistrado.
		_usuarioregistrado.iUsuarioregistrado.seguirUsuario(usuario.getID(), usuarioListado.getID());
		
	}
	
	public void VerperfilUsuarioregistrado(Usuarioregistrado usuario) {
		_verPerfilUsuarioregistrado = new VerperfilUsuarioregistrado(usuario, usuarioListado);
		MainView.Pantalla.cambiarVista(_verPerfilUsuarioregistrado);
	}
}