package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listadodeusuariosusuarioregistrado extends Listadousuarios {
	public VerlistadoglobaldeusuariosUsuarioregistrado _verlistadoglobaldeusuariosUsuarioregistrado;
	public Listadodeusuariosusuarioregistrado_item _item;
	
	public Listadodeusuariosusuarioregistrado(VerlistadoglobaldeusuariosUsuarioregistrado _verlistadoglobaldeusuariosUsuarioregistrado){
		super(_verlistadoglobaldeusuariosUsuarioregistrado);
		Listadodeusuariosusuarioregistrado_item item = new Listadodeusuariosusuarioregistrado_item(this);
		this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item);
		Listadodeusuariosusuarioregistrado_item item2 = new Listadodeusuariosusuarioregistrado_item(this);
		this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item2);
	}
}