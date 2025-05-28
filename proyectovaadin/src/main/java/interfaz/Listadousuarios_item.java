package interfaz;

import vistas.VistaListadousuarios_item;

public class Listadousuarios_item extends VistaListadousuarios_item{
	/*private image _fotoPerfil;
	private label _nickUsuario;*/
	public Listadousuarios _listadousuarios;
	public Verlistado _Verlistado;
	public Verperfildeusuario _verPerfildeusuario;
	public base_de_datos.Usuario _usuario;
	
	public Listadousuarios_item(Listadousuarios listadousuarios, base_de_datos.Usuario usuario) {
		this._listadousuarios = listadousuarios;
		this._usuario = usuario;
		this.getVerperfil().setText(usuario.getNick());
		//falta funcionalidad imagen perfil, seguidores y seguidos
		this.getVerSeguidores().setText(Integer.toString(usuario.es_seguido.size()));
		//this.getVerSeguidos().setText(String.valueOf());
	}
	
	public Listadousuarios_item(Verlistado _Verlistado, base_de_datos.Usuario usuario) {
		this._Verlistado = _Verlistado;
		this._usuario = usuario;
	}
	
	public Listadousuarios_item(Verperfildeusuario _verPerfildeusuario, base_de_datos.Usuario usuario) {
		this._verPerfildeusuario = _verPerfildeusuario;
		this._usuario = usuario;
	}
}