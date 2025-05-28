package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listadodeusuariosusuarioregistrado extends Listadousuarios {
	public VerlistadoglobaldeusuariosUsuarioregistrado _verlistadoglobaldeusuariosUsuarioregistrado;
	public Vector<Listadodeusuariosusuarioregistrado_item> _item = new Vector<Listadodeusuariosusuarioregistrado_item>();
	
	public Listadodeusuariosusuarioregistrado(VerlistadoglobaldeusuariosUsuarioregistrado _verlistadoglobaldeusuariosUsuarioregistrado){
		super(_verlistadoglobaldeusuariosUsuarioregistrado);
		Listadodeusuariosusuarioregistrado_item item1 = new Listadodeusuariosusuarioregistrado_item(this, null);
		Listadodeusuariosusuarioregistrado_item item2 = new Listadodeusuariosusuarioregistrado_item(this, null);
		_item.add(item1);
		_item.add(item2);
		for(Listadodeusuariosusuarioregistrado_item item: _item) {
			this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item);
		}
	}
}