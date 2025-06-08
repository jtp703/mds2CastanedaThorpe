package interfaz;

import vistas.VistaVercomentarios;

public class Vercomentarios extends VistaVercomentarios {
	
	public Listadotweets_item _listadotweets_item;
	public Listadocomentarios _listadocomentarios;
	
	public Vercomentarios(Listadocomentarios _listadocomentarios) {
		this._listadocomentarios = _listadocomentarios;
	}
	
	public Vercomentarios(Listadotweets_item _listadotweets_item) {
		this._listadotweets_item = _listadotweets_item;
	}
}