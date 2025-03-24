package interfaz;

import vistas.VistaListadodehashtags_item;

public class Listadodehashtags_item extends VistaListadodehashtags_item{
	/*private label _hashtag;
	private label _menciones;*/
	private int _numeroMenciones;
	public Listadodehashtags _listadodehashtags;
	public Verlistadodetweetsfiltrado _verlistadodetweetsfiltrado;
	
	Listadodehashtags_item(Listadodehashtags listadodehashtag){
		_listadodehashtags = listadodehashtag;
	}
}