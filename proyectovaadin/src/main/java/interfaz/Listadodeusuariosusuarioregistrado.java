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
	public Vector<Listadodeusuariosusuarioregistrado_item> _item = new Vector<Listadodeusuariosusuarioregistrado_item>();
	public iUsuarioregistrado iUsuarioregistrado;

	public Listadodeusuariosusuarioregistrado(
			VerlistadoglobaldeusuariosUsuarioregistrado _verlistadoglobaldeusuariosUsuarioregistrado) {
		super(_verlistadoglobaldeusuariosUsuarioregistrado);
		this._verlistadoglobaldeusuariosUsuarioregistrado = _verlistadoglobaldeusuariosUsuarioregistrado;
		this.iUsuarioregistrado = _verlistadoglobaldeusuariosUsuarioregistrado._usuarioregistrado.iUsuarioregistrado;

		try {
			// 1) Cargar todos los usuarios
			List<Usuario> usuarios = new ArrayList<Usuario>(Arrays.asList(iUsuarioregistrado.cargarUsuarios()));
			// 2) Eliminar al usuario actual
			int miId = _verlistadoglobaldeusuariosUsuarioregistrado._usuarioregistrado._usuarioregistrado.getID();
			usuarios.removeIf(u -> u.getID() == miId);
			// 3) Ordenar de mayor a menor por número de seguidores
			usuarios.sort(Comparator.comparingInt((Usuario u) -> u.es_seguido.size()).reversed());
			// 4) Crear y añadir cada ítem
			if (!usuarios.isEmpty()) {
				for (Usuario u : usuarios) {
					Listadodeusuariosusuarioregistrado_item item = new Listadodeusuariosusuarioregistrado_item(this, u);
					_item.add(item);
					this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item);
				}
			}
		} catch (Exception ex) {
			Notification.show("No se pudieron cargar los usuarios: " + ex.getMessage(), 3000, Position.MIDDLE);
		}
	}
}