package interfaz;

import vistas.VistaListadocomentarios_item;

public class Listadocomentarios_item extends VistaListadocomentarios_item {
	/*
	 * private label _nickUsuario; private image _fotoPerfil; private textField
	 * _textoComentario; private button _enviar;
	 */
	public Listadocomentarios listadoComentarios;
	public base_de_datos.Comentario comentario;
	
	
	public Listadocomentarios_item(Listadocomentarios listadoComentarios, base_de_datos.Comentario comentario) {
		this.listadoComentarios = listadoComentarios;
		this.comentario = comentario;
		this.getVerperfil().setText(comentario.getComentado_por().getNick());
		this.getTextoComentario().setText(comentario.getTexto());
		this.getnMegustas().setText(String.valueOf(comentario.getNumMegustas()));
		//funcionalidad imagen perfil
		//funcionalidad dar me gusta comentario si ya lo ha hecho
	}
}