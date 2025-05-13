package interfaz;

import vistas.VistaListadousuarios_item;

public class Listadousuarios_item extends VistaListadousuarios_item{
	/*private image _fotoPerfil;
	private label _nickUsuario;*/
	public Listadousuarios _listadousuarios;
	public Verlistado _Verlistado;
	public Verperfildeusuario _verPerfildeusuario;
	
	public Listadousuarios_item(Listadousuarios listadousuarios){
		this._listadousuarios = listadousuarios;
	}
	
	public Listadousuarios_item(Verlistado _Verlistado) {
		this._Verlistado = _Verlistado;
	}
	
	public Listadousuarios_item(Verperfildeusuario _verPerfildeusuario) {
		this._verPerfildeusuario = _verPerfildeusuario;
	}
}