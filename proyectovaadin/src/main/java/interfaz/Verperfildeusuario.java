package interfaz;

import vistas.VistaVerperfildeusuario;

public class Verperfildeusuario extends VistaVerperfildeusuario {
	/*private image _imagenFondo;
	private image _fotoPerfil;
	private label _nombreUsuario;
	private label _descripcion;
	private button _volverMuroPrincipal;
	public Retweets _unnamed_Retweets_;
	public Megustas _unnamed_Megustas_;
	public Verlistado _unnamed_Verlistado_;
	public Listadotweets _unnamed_Listadotweets_;*/
	public Cibernauta cibernauta;
	public Retweets _retweets;
	public Megustas _megustas;
	public Verlistado _verlistado;
	public Listadotweets _listadotweets;
	
	public Verperfildeusuario(Cibernauta cibernauta) {
		this.cibernauta = cibernauta;
	}
	
	public Verperfildeusuario(Retweets _retweets) {
		this._retweets = _retweets;
	}
	
	public Verperfildeusuario(Megustas _megustas) {
		this._megustas = _megustas;
	}
	
	public Verperfildeusuario(Verlistado _verlistado) {
		this._verlistado = _verlistado;
	}
	
	public Verperfildeusuario(Listadotweets _listadotweets) {
		this._listadotweets = _listadotweets;
	}

	public void Retweets(Retweets _retweets) {
		this._retweets = _retweets;
	}

	public void Me_gustas(Megustas _megustas) {
		this._megustas = _megustas;
	}

	public void Ver_Listado(Verlistado _verlistado) {
		this._verlistado = _verlistado;
	}

	public void Listadotweets(Listadotweets _listadotweets) {
		this._listadotweets = _listadotweets;
	}
}