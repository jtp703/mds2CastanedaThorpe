package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listadodeusuariosadministrador extends Listadousuarios {
	public VerlistadoglobaldeusuariosAdministrador _verlistadoglobaldeusuariosAdministrador;
	public Vector<Listadodeusuariosadministrador_item> _item = new Vector<Listadodeusuariosadministrador_item>();
	
	public Listadodeusuariosadministrador(VerlistadoglobaldeusuariosAdministrador _verlistadoglobaldeusuariosAdministrador){
		super(_verlistadoglobaldeusuariosAdministrador);
		for(base_de_datos.Usuario u : _verlistadoglobaldeusuariosAdministrador.administrador._iAdministrador.cargarUsuarios()) {
			Listadodeusuariosadministrador_item item = new Listadodeusuariosadministrador_item(this, u);
			_item.add(item);
			this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item);
		}
	}

}
