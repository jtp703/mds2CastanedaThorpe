package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Listadodeusuariosusuarioregistrado extends Listadousuarios {
	public VerlistadoglobaldeusuariosUsuarioregistrado _verlistadoglobaldeusuariosUsuarioregistrado;
	public Vector<Listadodeusuariosusuarioregistrado_item> _item = new Vector<Listadodeusuariosusuarioregistrado_item>();
	
	public Listadodeusuariosusuarioregistrado(VerlistadoglobaldeusuariosUsuarioregistrado _verlistadoglobaldeusuariosUsuarioregistrado){
		super(_verlistadoglobaldeusuariosUsuarioregistrado);
		this._verlistadoglobaldeusuariosUsuarioregistrado = _verlistadoglobaldeusuariosUsuarioregistrado;
		
		for (base_de_datos.Usuario u : _verlistadoglobaldeusuariosUsuarioregistrado._usuarioregistrado.iUsuarioregistrado.cargarUsuarios()) {
			if(u.getID() == _verlistadoglobaldeusuariosUsuarioregistrado._usuarioregistrado._usuarioregistrado.getID()){
				continue;
			}
			Listadodeusuariosusuarioregistrado_item item = new Listadodeusuariosusuarioregistrado_item(this, u);
			_item.add(item);
			this.getContenedorItemsUsuario().as(VerticalLayout.class).add(item);
		}
	}
}