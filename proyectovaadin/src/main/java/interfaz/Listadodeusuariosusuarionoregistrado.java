package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listadodeusuariosusuarionoregistrado extends Listadousuarios {
	//confirmar si es necesario verlistadoglobaldeusuariosUsuarioNOregistrado especifico en lugar de usuario registrados
	public VerlistadoglobaldeusuariosUsuarionoregistrado _verlistadoglobaldeusuariosUsuarionoregistrado;
	public Listadodeusuariosusuarionoregistrado_item _item;
	
	public Listadodeusuariosusuarionoregistrado(VerlistadoglobaldeusuariosUsuarionoregistrado _verlistadoglobaldeusuariosUsuarionoregistrado){
		super(_verlistadoglobaldeusuariosUsuarionoregistrado);
		Listadodeusuariosusuarionoregistrado_item item = new Listadodeusuariosusuarionoregistrado_item(this);
		this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item);
		Listadodeusuariosusuarionoregistrado_item item2 = new Listadodeusuariosusuarionoregistrado_item(this);
		this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item2);
	}

}
