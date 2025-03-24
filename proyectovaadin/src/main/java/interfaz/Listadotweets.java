package interfaz;

import java.util.Vector;

import vistas.VistaListadotweets;

public class Listadotweets extends VistaListadotweets{
	public Megustas _megustas;
	public Retweets _retweets;
	public Verlistadodetweetsfiltrado _verlistadodetweetsfiltrado;
	public Verperfildeusuario _verperfildeusuario;
	public Vermuroprincipal _vermuroprincipal;
	public Vector<Listadotweets_item> _item = new Vector<Listadotweets_item>();
}