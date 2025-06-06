package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listadodeusuariosusuarionoregistrado extends Listadousuarios {
	//confirmar si es necesario verlistadoglobaldeusuariosUsuarioNOregistrado especifico en lugar de usuario registrados
	public VerlistadoglobaldeusuariosUsuarionoregistrado verlistadoglobaldeusuariosUsuarionoregistrado;
	public Vector<Listadodeusuariosusuarionoregistrado_item> _listadodeusuariosusuarionoregistrado = new Vector<Listadodeusuariosusuarionoregistrado_item>();
	
	public Listadodeusuariosusuarionoregistrado(VerlistadoglobaldeusuariosUsuarionoregistrado _verlistadoglobaldeusuariosUsuarionoregistrado){
		super(_verlistadoglobaldeusuariosUsuarionoregistrado);
		this.verlistadoglobaldeusuariosUsuarionoregistrado = _verlistadoglobaldeusuariosUsuarionoregistrado;
		for(base_de_datos.Usuario usuario : this.verlistadoglobaldeusuariosUsuarionoregistrado.usuarioNoRegistrado._iUsuarionoregistrado.cargarUsuarios()) {
			Listadodeusuariosusuarionoregistrado_item item = new Listadodeusuariosusuarionoregistrado_item(this, usuario);
			_listadodeusuariosusuarionoregistrado.add(item);
			this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item);
		}
	}

}
