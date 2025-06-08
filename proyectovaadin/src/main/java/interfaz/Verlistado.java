package interfaz;

import vistas.VistaVerlistado;

public abstract class Verlistado extends VistaVerlistado {
	
	public Verlistadogloblaldeusuarios _verlistadogloblaldeusuarios;
	public Verperfildeusuario _verperfildeusuario;
	public Listadousuarios_item listadousuarios_item_;
	public Listadousuarios listado;

	public Verlistado(Verlistadogloblaldeusuarios _verlistadogloblaldeusuarios) {
		this._verlistadogloblaldeusuarios = _verlistadogloblaldeusuarios;
	}
	
	public Verlistado(Verperfildeusuario _verperfildeusuario) {
		this._verperfildeusuario = _verperfildeusuario;
	}
	
	public Verlistado(Listadousuarios_item listadousuarios_item_) {
		this.listadousuarios_item_ = listadousuarios_item_;
	}
	
	public Verlistado(Listadousuarios listado) {
		this.listado = listado;
	}
	
	public void Listadousuarios() {
		throw new UnsupportedOperationException();
	}
}