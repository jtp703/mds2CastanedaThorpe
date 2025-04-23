package interfaz;

import java.util.Vector;

import vistas.VistaListadodehashtags;

public class Listadodehashtags extends VistaListadodehashtags{
	
	public VerListadohashtags _verListadohashtags;
	public Vector<Listadodehashtags_item> _item = new Vector<Listadodehashtags_item>();
	
	public Listadodehashtags(VerListadohashtags verListadohashtags) {
		_verListadohashtags = verListadohashtags;
	}
}