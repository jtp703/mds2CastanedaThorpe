package interfaz;

import org.vaadin.example.MainView;

public class ListadocomentariosUsuarioregistrado_item extends Listadocomentarios_item {
//	private event _darmegustaacomentario;
	private int _numeroMegustas;
	private boolean megusta = false;
	public Usuarioregistrado usuario;
	public ListadocomentariosUsuarioregistrado _listadocomentariosUsuarioregistrado;

	public ListadocomentariosUsuarioregistrado_item(ListadocomentariosUsuarioregistrado _listadocomentariosUsuarioregistrado) {
		super(_listadocomentariosUsuarioregistrado);
		this.getBotonEliminarComentario().setVisible(false);
		this.getBtnDarMegusta().addClickListener(event -> Darmegustaacomentario());
		this.getVerperfil().addClickListener(event -> VerperfilUsuarioregistrado(usuario));
	}

	public void Darmegustaacomentario() {
		megusta = !megusta; // invierte el estado

	    if (megusta) {
	        System.out.println("Comentario gustado");
	        this.getBtnDarMegusta().getStyle().set("color", "red");
	    } else {
	        System.out.println("Me gusta retirado");
	        this.getBtnDarMegusta().getStyle().set("color", "black");
	    }
	}
	
	public void VerperfilUsuarioregistrado(Usuarioregistrado usuario) {
		VerperfilUsuarioregistrado _verperfilUsuarioregistrado = new VerperfilUsuarioregistrado(usuario);
		System.out.println("Ejecución ver perfil de usuario");
		MainView.Pantalla.cambiarVista(_verperfilUsuarioregistrado);
	}
}