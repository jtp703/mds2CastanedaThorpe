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
		Integer seguidores = usuario.es_seguido.size();
		this.getVerSeguidores().setText(Integer.toString(seguidores == null ? 0 : usuario.es_seguido.size()));
		Integer seguidos = usuario.sigue.size();
		this.getVerSeguidos().setText(Integer.toString(seguidos == null ? 0 : usuario.sigue.size()));
	}
	
	public Listadousuarios_item(Verlistado _Verlistado, base_de_datos.Usuario usuario) {
		this._Verlistado = _Verlistado;
		this._usuario = usuario;
		this.getVerperfil().setText(usuario.getNick());
		Integer seguidores = usuario.es_seguido.size();
		this.getVerSeguidores().setText(Integer.toString(seguidores == null ? 0 : usuario.es_seguido.size()));
		Integer seguidos = usuario.sigue.size();
		this.getVerSeguidos().setText(Integer.toString(seguidos == null ? 0 : usuario.sigue.size()));
	}
	
	public Listadousuarios_item(Verperfildeusuario _verPerfildeusuario, base_de_datos.Usuario usuario) {
		this._verPerfildeusuario = _verPerfildeusuario;
		this._usuario = usuario;
		this.getVerperfil().setText(usuario.getNick());
	}
}