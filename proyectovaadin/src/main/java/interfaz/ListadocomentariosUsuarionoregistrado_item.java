package interfaz;

import org.vaadin.example.MainView;

public class ListadocomentariosUsuarionoregistrado_item extends Listadocomentarios_item {
	
	public ListadocomentariosUsuarionoregistrado listadoComentariosUsuarionoregistrado;
	public Usuarionoregistrado usuario;
	public ListadocomentariosUsuarionoregistrado_item(ListadocomentariosUsuarionoregistrado listadoComentariosUsuarionoregistrado) {
		super(listadoComentariosUsuarionoregistrado);
		this.getBotonEliminarComentario().setVisible(false);
		this.getBtnDarMegusta().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilUsuarioregistrado(usuario));
	}
	
	public void VerperfilUsuarioregistrado(Usuarionoregistrado usuario) {
		VerperfilUsuarionoregistrado _verperfilUsuarioregistrado = new VerperfilUsuarionoregistrado(usuario);
		System.out.println("Ejecución ver perfil de usuario");
		MainView.Pantalla.cambiarVista(_verperfilUsuarioregistrado);
	}
}
