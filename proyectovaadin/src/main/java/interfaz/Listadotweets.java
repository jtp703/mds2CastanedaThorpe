package interfaz;

import java.util.Vector;

import vistas.VistaListadotweets;

public class Listadotweets extends VistaListadotweets {
	public Megustas _megustas;
	public Retweets _retweets;
	public Verlistadodetweetsfiltrado _verlistadodetweetsfiltrado;
	public Verperfildeusuario _verperfildeusuario;
	public Vermuroprincipal _vermuroprincipal;
	public Vector<Listadotweets_item> _item = new Vector<Listadotweets_item>();

	public Listadotweets(Megustas _megustas) {
		this._megustas = _megustas;
	}
	public Listadotweets(Retweets _retweets) {
		this._retweets = _retweets;
	}
	public Listadotweets(Verlistadodetweetsfiltrado _verlistadodetweetsfiltrado) {
		this._verlistadodetweetsfiltrado = _verlistadodetweetsfiltrado;
	}
	public Listadotweets(Verperfildeusuario _verperfildeusuario) {
		this._verperfildeusuario = _verperfildeusuario;
	}
	public Listadotweets(Vermuroprincipal _vermuroprincipal) {
		this._vermuroprincipal = _vermuroprincipal;
	}
	
}