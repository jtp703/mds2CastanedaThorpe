package interfaz;

import org.vaadin.example.MainView;

public class Listadodeusuariosusuarioregistrado_item extends Listadousuarios_item {
//	private event _seguir_usuario_desde_listado_global_de_usuarios;
	public Listadodeusuariosusuarioregistrado _listadodeusuariosusuarioregistrado;

	public VerperfilUsuarioregistrado _verPerfilUsuarioregistrado;
	public Usuarioregistrado usuario;
	
	public Listadodeusuariosusuarioregistrado_item(Listadodeusuariosusuarioregistrado listadodeusuariosusuarioregistrado){
		super(listadodeusuariosusuarioregistrado);
		this.getVerperfil().addClickListener(event -> VerperfilUsuarioregistrado(usuario));
	}
	
	public Listadodeusuariosusuarioregistrado_item(VerperfilUsuarioregistrado _verPerfilUsuarioregistrado) {
		super(_verPerfilUsuarioregistrado);
		this.getVerperfil().addClickListener(event -> VerperfilUsuarioregistrado(usuario));
	}
	
	public void Seguir_usuario_desde_listado_global_de_usuarios() {
		throw new UnsupportedOperationException();
	}
	
	public void VerperfilUsuarioregistrado(Usuarioregistrado usuario) {
		_verPerfilUsuarioregistrado = new VerperfilUsuarioregistrado(usuario);
		System.out.println("Ejecución ver perfil de usuario");
		MainView.Pantalla.cambiarVista(_verPerfilUsuarioregistrado);
	}
}