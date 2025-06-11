package interfaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import base_de_datos.Usuario;
import base_de_datos.iUsuarioregistrado;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listadodeusuariosusuarioregistrado extends Listadousuarios {

	public VerlistadoglobaldeusuariosUsuarioregistrado _verlistadoglobaldeusuariosUsuarioregistrado;
	public Vector<Listadodeusuariosusuarioregistrado_item> listado = new Vector<Listadodeusuariosusuarioregistrado_item>();
	public iUsuarioregistrado iUsuarioregistrado;

	public Listadodeusuariosusuarioregistrado(
			VerlistadoglobaldeusuariosUsuarioregistrado _verlistadoglobaldeusuariosUsuarioregistrado) {
		super(_verlistadoglobaldeusuariosUsuarioregistrado);
		this._verlistadoglobaldeusuariosUsuarioregistrado = _verlistadoglobaldeusuariosUsuarioregistrado;
		this.iUsuarioregistrado = _verlistadoglobaldeusuariosUsuarioregistrado._usuarioregistrado.iUsuarioregistrado;
		
		int IdUsuarioActual = _verlistadoglobaldeusuariosUsuarioregistrado._usuarioregistrado._usuarioregistrado.getID();

		Vector<base_de_datos.Usuario> usuarios = new Vector<>(Arrays
				.asList(this._verlistadoglobaldeusuariosUsuarioregistrado._usuarioregistrado.iUsuarioregistrado
						.cargarUsuarios()));
		
		usuarios.sort(Comparator.comparingInt((Usuario u) -> u.es_seguido.size()).reversed());
		
		
		for (base_de_datos.Usuario usuario : usuarios) {
			Listadodeusuariosusuarioregistrado_item item = new Listadodeusuariosusuarioregistrado_item(this,
					usuario);
			if (usuario.getID() != IdUsuarioActual) {
				listado.add(item);
				this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item);
			}
			
		}
	}
}