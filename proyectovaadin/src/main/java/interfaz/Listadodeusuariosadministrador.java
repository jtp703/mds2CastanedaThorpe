package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listadodeusuariosadministrador extends Listadousuarios {
	public VerlistadoglobaldeusuariosAdministrador _verlistadoglobaldeusuariosAdministrador;
	public Vector<Listadodeusuariosadministrador_item> _item = new Vector<Listadodeusuariosadministrador_item>();
	
	public Listadodeusuariosadministrador(VerlistadoglobaldeusuariosAdministrador _verlistadoglobaldeusuariosAdministrador){
		super(_verlistadoglobaldeusuariosAdministrador);
		Listadodeusuariosadministrador_item item0 = new Listadodeusuariosadministrador_item(this, null);
		Listadodeusuariosadministrador_item item1 = new Listadodeusuariosadministrador_item(this, null);
		_item.add(item0);
		_item.add(item1);
		for(Listadodeusuariosadministrador_item item: _item) {
			this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item);
		}
	}

}
