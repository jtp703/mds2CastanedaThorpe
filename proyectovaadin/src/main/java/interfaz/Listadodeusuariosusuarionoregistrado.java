package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listadodeusuariosusuarionoregistrado extends Listadousuarios {
	//confirmar si es necesario verlistadoglobaldeusuariosUsuarioNOregistrado especifico en lugar de usuario registrados
	public VerlistadoglobaldeusuariosUsuarionoregistrado _verlistadoglobaldeusuariosUsuarionoregistrado;
	public Vector<Listadodeusuariosusuarionoregistrado_item> _listadodeusuariosusuarionoregistrado = new Vector<Listadodeusuariosusuarionoregistrado_item>();
	
	public Listadodeusuariosusuarionoregistrado(VerlistadoglobaldeusuariosUsuarionoregistrado _verlistadoglobaldeusuariosUsuarionoregistrado){
		super(_verlistadoglobaldeusuariosUsuarionoregistrado);
		Listadodeusuariosusuarionoregistrado_item item1 = new Listadodeusuariosusuarionoregistrado_item(this);
		Listadodeusuariosusuarionoregistrado_item item2 = new Listadodeusuariosusuarionoregistrado_item(this);
		_listadodeusuariosusuarionoregistrado.add(item1);
		_listadodeusuariosusuarionoregistrado.add(item2);
		for(Listadodeusuariosusuarionoregistrado_item item: _listadodeusuariosusuarionoregistrado) {
			this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item);
		}
	}

}
