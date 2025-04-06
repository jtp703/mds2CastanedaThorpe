package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listadodeusuariosadministrador extends Listadousuarios {
	public VerlistadoglobaldeusuariosAdministrador _verlistadoglobaldeusuariosAdministrador;
	public Listadodeusuariosadministrador_item _item;
	
	public Listadodeusuariosadministrador(VerlistadoglobaldeusuariosAdministrador _verlistadoglobaldeusuariosAdministrador){
		super(_verlistadoglobaldeusuariosAdministrador);
		Listadodeusuariosadministrador_item item0 = new Listadodeusuariosadministrador_item(this);
		
		this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item0);
		
		Listadodeusuariosadministrador_item item1 = new Listadodeusuariosadministrador_item(this);
		this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item1);
	}

}
