package interfaz;

import vistas.VistaListadotweets_item;

public class Listadotweets_item extends VistaListadotweets_item{
	public Listadotweets _listadotweets;
	public Vercomentarios _vercomentarios;
	
	public Listadotweets_item(Listadotweets listadoTweets){
		_listadotweets = listadoTweets;
	}
}