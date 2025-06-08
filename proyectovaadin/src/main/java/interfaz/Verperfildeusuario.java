package interfaz;

import com.vaadin.flow.component.html.Image;

import vistas.VistaVerperfildeusuario;

public class Verperfildeusuario extends VistaVerperfildeusuario {
	public Cibernauta cibernauta;
	public Retweets _retweets;
	public Megustas _megustas;
	public Verlistado _verlistado;
	public Listadotweets _listadotweets;
	
	public Verperfildeusuario(Cibernauta cibernauta, base_de_datos.Usuario usuario) {
		this.cibernauta = cibernauta;
		cargarUsuario(usuario);
		
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

	public void Ver_Listado(Verlistado _verlistado) {
		this._verlistado = _verlistado;
	}

	public void Listadotweets(Listadotweets _listadotweets) {
		this._listadotweets = _listadotweets;
	}
	public void cargarUsuario(base_de_datos.Usuario usuario) {
	    // 1) Texto del perfil
	    this.getNombreUsuario().setText(usuario.getNombre());
	    this.getNickUsuario().setText(usuario.getNick());
	    this.getDescripcionPerfil().setText(usuario.getDescripcion());

	    // 2) Foto de perfil: actualizamos el src del <img id="imgPerfil">
	    this.getImgPerfil().setSrc(usuario.getFotoPerfil());
	    this.getImgPerfil().setAlt("Perfil de " + usuario.getNick());
	    this.getImgPerfil().setWidth("150px");                     // opcional
	    this.getImgPerfil().getStyle().set("border-radius", "50%");// opcional
	    
	    this.getImgFondo().setSrc(usuario.getFotoFondo());
	    this.getImgFondo().setAlt("Fondo de " + usuario.getNick());
	    this.getImgFondo().setWidth("100%");

	    // 4) Contadores de seguidores y seguidos
	    int seguidos  = usuario.sigue     == null ? 0 : usuario.sigue.size();
	    int seguidores= usuario.es_seguido == null ? 0 : usuario.es_seguido.size();
	    this.getVerSeguidores().setText(String.valueOf(seguidores));
	    this.getVerSeguidos() .setText(String.valueOf(seguidos));
	}

}