package interfaz;

import vistas.VistaListadotweets_item;

public class Listadotweets_item extends VistaListadotweets_item{
	public Listadotweets _listadotweets;
	public Vercomentarios _vercomentarios;
	public Cibernauta ciber;
	
	public Listadotweets_item() {
		
	}
	public Listadotweets_item(Listadotweets listadoTweets){
		this._listadotweets = listadoTweets;
	}
	
	public Listadotweets_item(Vercomentarios _vercomentarios) {
	this._vercomentarios = _vercomentarios;
	}
	
	public Listadotweets_item(Cibernauta ciber) {
		this.ciber = ciber;
		}
	
}