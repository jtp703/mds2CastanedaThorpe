package interfaz;

import java.util.Vector;

import vistas.VistaListadousuarios;

public class Listadousuarios extends VistaListadousuarios{
	public Verlistadodeseguidos _verlistadodeseguidos;
	public Verlistadodeseguidores _verlistadodeseguidores;
	public Verlistadogloblaldeusuarios _verlistadogloblaldeusuarios;
	public Verlistado _verlistado;
	public Vector<Listadousuarios_item> _item = new Vector<Listadousuarios_item>();
	
	public Listadousuarios(Verlistadodeseguidos _verlistadodeseguidos) {
		this._verlistadodeseguidos = _verlistadodeseguidos;
	}
	
	public Listadousuarios(Verlistadogloblaldeusuarios _verlistadogloblaldeusuarios) {
		this._verlistadogloblaldeusuarios = _verlistadogloblaldeusuarios;
	}
	
	public Listadousuarios(Verlistado _verlistado) {
		this._verlistado = _verlistado;
	}
	
	public Listadousuarios(Verlistadodeseguidores _verlistadodeseguidores) {
		this._verlistadodeseguidores = _verlistadodeseguidores;
	}

}