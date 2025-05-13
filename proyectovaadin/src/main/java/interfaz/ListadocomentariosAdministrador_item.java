package interfaz;

import org.vaadin.example.MainView;

public class ListadocomentariosAdministrador_item extends Listadocomentarios_item {
//	private event _eliminar_comentario;
	public ListadocomentariosAdministrador _listadocomentariosAdministrador;
	public Administrador usuario;

	public ListadocomentariosAdministrador_item(ListadocomentariosAdministrador _listadocomentariosAdministrador) {
		super(_listadocomentariosAdministrador);
		this.getBtnDarMegusta().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilUsuarionregistrado(usuario));
	}
	
	public void VerperfilUsuarionregistrado(Administrador usuario) {
		VerperfilAdministrador _verperfilUsuarioregistrado = new VerperfilAdministrador(usuario);
		System.out.println("Ejecución ver perfil de usuario");
		MainView.Pantalla.cambiarVista(_verperfilUsuarioregistrado);
	}
	
	public void Eliminar_Comentario() {
		throw new UnsupportedOperationException();
	}

}