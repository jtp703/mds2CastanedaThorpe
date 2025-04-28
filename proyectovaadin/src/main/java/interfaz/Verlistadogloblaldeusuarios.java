package interfaz;

import vistas.VistaVerlistadogloblaldeusuarios;

public class Verlistadogloblaldeusuarios extends VistaVerlistadogloblaldeusuarios{
	
	public Cibernauta _cibernauta;
	public Listadousuarios _listadousuarios;
	public Verlistado _verlistado;
	
	public Verlistadogloblaldeusuarios(Cibernauta _cibernauta) {
		this._cibernauta = _cibernauta;
	}
	
	public Verlistadogloblaldeusuarios(Listadousuarios _listadousuarios) {
		this._listadousuarios = _listadousuarios;
	}
	
	public Verlistadogloblaldeusuarios(Verlistado _verlistado) {
		this._verlistado = _verlistado;
	}

	public void Listadousuarios() {
		throw new UnsupportedOperationException();
	}

	public void Verlistado() {
		throw new UnsupportedOperationException();
	}
}