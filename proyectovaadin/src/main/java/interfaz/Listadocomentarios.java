package interfaz;

import java.util.Vector;

import vistas.VistaListadocomentarios;
import org.vaadin.example.*;

public class Listadocomentarios extends VistaListadocomentarios{
	public Vercomentarios _vercomentarios;
	public Vector<Listadocomentarios_item> _item = new Vector<Listadocomentarios_item>();
	
	
	public Listadocomentarios(Vercomentarios _vercomentarios) {
		this._vercomentarios = _vercomentarios;
	}
	
}