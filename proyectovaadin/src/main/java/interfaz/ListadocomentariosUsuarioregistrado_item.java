package interfaz;

import org.vaadin.example.MainView;

public class ListadocomentariosUsuarioregistrado_item extends Listadocomentarios_item {

	// private event _darmegustaacomentario;
	private int _numeroMegustas;
	private boolean megusta = false;
	public ListadocomentariosUsuarioregistrado _listadocomentariosUsuarioregistrado;

	public ListadocomentariosUsuarioregistrado_item(
			ListadocomentariosUsuarioregistrado _listadocomentariosUsuarioregistrado, base_de_datos.Comentario comentario) {
		super(_listadocomentariosUsuarioregistrado, comentario);
		this.getBotonEliminarComentario().setVisible(false);
		this.getBtnDarMegusta().addClickListener(event -> Darmegustaacomentario());
	}

	public void Darmegustaacomentario() {
		megusta = !megusta;

		if (megusta) {
			System.out.println("Comentario gustado");
			this.getBtnDarMegusta().getStyle().set("color", "red");
		} else {
			System.out.println("Me gusta retirado");
			this.getBtnDarMegusta().getStyle().set("color", "black");
		}
	}

}