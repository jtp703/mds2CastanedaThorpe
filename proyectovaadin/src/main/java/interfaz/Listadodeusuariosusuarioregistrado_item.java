package interfaz;

import org.vaadin.example.MainView;

public class Listadodeusuariosusuarioregistrado_item extends Listadousuarios_item {
//	private event _seguir_usuario_desde_listado_global_de_usuarios;
	public Listadodeusuariosusuarioregistrado _listadodeusuariosusuarioregistrado;

	public VerperfilUsuarioregistrado _verPerfilUsuarioregistrado;
	public Usuarioregistrado usuarioRegistrado;
	public base_de_datos.Usuario _usuario;
	
	public Listadodeusuariosusuarioregistrado_item(Listadodeusuariosusuarioregistrado listadodeusuariosusuarioregistrado, base_de_datos.Usuario usuario){
		super(listadodeusuariosusuarioregistrado, usuario);
		this.getVerperfil().addClickListener(event -> VerperfilUsuarioregistrado(usuarioRegistrado));
	}
	
	public Listadodeusuariosusuarioregistrado_item(VerperfilUsuarioregistrado _verPerfilUsuarioregistrado, base_de_datos.Usuario usuario) {
		super(_verPerfilUsuarioregistrado, usuario);
		this.getVerperfil().addClickListener(event -> VerperfilUsuarioregistrado(usuarioRegistrado));
	}
	
	public void Seguir_usuario_desde_listado_global_de_usuarios() {
		throw new UnsupportedOperationException();
	}
	
	public void VerperfilUsuarioregistrado(Usuarioregistrado usuario) {
		_verPerfilUsuarioregistrado = new VerperfilUsuarioregistrado(usuario);
		MainView.Pantalla.cambiarVista(_verPerfilUsuarioregistrado);
	}
}