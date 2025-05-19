package interfaz;

import vistas.VistaVercomentarios;

public class Vercomentarios extends VistaVercomentarios {
	
	/*private label _nickUsuario;
	private image _fotoPerfil;*/
	public Listadotweets_item _listadotweets_item;
	public Listadocomentarios _listadocomentarios;
	
	public Vercomentarios(Listadocomentarios _listadocomentarios) {
		this._listadocomentarios = _listadocomentarios;
	}
	
	public Vercomentarios(Listadotweets_item _listadotweets_item) {
		this._listadotweets_item = _listadotweets_item;
	}
	
	public void Listado_comentarios() {
		throw new UnsupportedOperationException();
	}
}