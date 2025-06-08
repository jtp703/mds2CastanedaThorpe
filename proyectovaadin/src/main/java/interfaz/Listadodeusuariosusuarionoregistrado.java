package interfaz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Usuario;

public class Listadodeusuariosusuarionoregistrado extends Listadousuarios {
	// confirmar si es necesario verlistadoglobaldeusuariosUsuarioNOregistrado
	// especifico en lugar de usuario registrados
	public VerlistadoglobaldeusuariosUsuarionoregistrado verlistadoglobaldeusuariosUsuarionoregistrado;
	public Vector<Listadodeusuariosusuarionoregistrado_item> _listadodeusuariosusuarionoregistrado = new Vector<Listadodeusuariosusuarionoregistrado_item>();

	public Listadodeusuariosusuarionoregistrado(
			VerlistadoglobaldeusuariosUsuarionoregistrado _verlistadoglobaldeusuariosUsuarionoregistrado) {
		super(_verlistadoglobaldeusuariosUsuarionoregistrado);
		this.verlistadoglobaldeusuariosUsuarionoregistrado = _verlistadoglobaldeusuariosUsuarionoregistrado;

		Vector<base_de_datos.Usuario> usuarios = new Vector<>(Arrays
				.asList(this.verlistadoglobaldeusuariosUsuarionoregistrado.usuarioNoRegistrado._iUsuarionoregistrado
						.cargarUsuarios()));
		usuarios.sort(Comparator.comparingInt((Usuario u) -> u.es_seguido.size()).reversed());
		for (base_de_datos.Usuario usuario : usuarios) {
			Listadodeusuariosusuarionoregistrado_item item = new Listadodeusuariosusuarionoregistrado_item(this,
					usuario);
			_listadodeusuariosusuarionoregistrado.add(item);
			this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item);
		}
	}

}
