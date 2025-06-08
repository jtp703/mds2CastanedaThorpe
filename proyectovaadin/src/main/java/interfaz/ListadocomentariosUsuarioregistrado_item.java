package interfaz;

@SuppressWarnings("serial")
public class ListadocomentariosUsuarioregistrado_item extends Listadocomentarios_item {

	private boolean megusta = false;
	public ListadocomentariosUsuarioregistrado _listadocomentariosUsuarioregistrado;

	public ListadocomentariosUsuarioregistrado_item(
			ListadocomentariosUsuarioregistrado _listadocomentariosUsuarioregistrado, base_de_datos.Comentario comentario) {
		super(_listadocomentariosUsuarioregistrado, comentario);
		this._listadocomentariosUsuarioregistrado = _listadocomentariosUsuarioregistrado;
		this.getBotonEliminarComentario().setVisible(false);
		this.getBtnDarMegusta().addClickListener(event -> Darmegustaacomentario());
		
		for(base_de_datos.Usuario u : comentario.comlikeado_por.toArray()) {
			if (u.getID() == _listadocomentariosUsuarioregistrado.usuario.getID()) {
				megusta = true;
				break;
			}
		}
	    if (megusta) {
	        this.getBtnDarMegusta().getStyle().set("color", "red");
	    } else {
	        this.getBtnDarMegusta().getStyle().set("color", "black");
	    }
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