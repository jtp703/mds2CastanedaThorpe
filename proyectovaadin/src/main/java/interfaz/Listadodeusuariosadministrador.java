package interfaz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Usuario;

public class Listadodeusuariosadministrador extends Listadousuarios {
	
	public VerlistadoglobaldeusuariosAdministrador _verlistadoglobaldeusuariosAdministrador;
	public Vector<Listadodeusuariosadministrador_item> listado = new Vector<Listadodeusuariosadministrador_item>();
	
	public Listadodeusuariosadministrador(VerlistadoglobaldeusuariosAdministrador _verlistadoglobaldeusuariosAdministrador){
		super(_verlistadoglobaldeusuariosAdministrador);
		this._verlistadoglobaldeusuariosAdministrador = _verlistadoglobaldeusuariosAdministrador;

		Vector<base_de_datos.Usuario> usuarios = new Vector<>(Arrays
				.asList(this._verlistadoglobaldeusuariosAdministrador.administrador._iAdministrador
						.cargarUsuarios()));
		usuarios.sort(Comparator.comparingInt((Usuario u) -> u.es_seguido.size()).reversed());
		for (base_de_datos.Usuario usuario : usuarios) {
			Listadodeusuariosadministrador_item item = new Listadodeusuariosadministrador_item(this,
					usuario);
			listado.add(item);
			this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item);
		}
	}

}
