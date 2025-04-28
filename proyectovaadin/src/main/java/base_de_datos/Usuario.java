/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Diego(University of Almeria)
 * License Type: Academic
 */
package base_de_datos;

public class Usuario extends base_de_datos.UsuarioAutentificado {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_USUARIO_BLOQUEA) {
			return ORM_bloquea;
		}
		else if (key == base_de_datos.ORMConstants.KEY_USUARIO_SIGUE) {
			return ORM_sigue;
		}
		else if (key == base_de_datos.ORMConstants.KEY_USUARIO_PUBLICA) {
			return ORM_publica;
		}
		else if (key == base_de_datos.ORMConstants.KEY_USUARIO_ES_BLOQUEADO) {
			return ORM_es_bloqueado;
		}
		else if (key == base_de_datos.ORMConstants.KEY_USUARIO_ES_SEGUIDO) {
			return ORM_es_seguido;
		}
		else if (key == base_de_datos.ORMConstants.KEY_USUARIO_PUBLICA_COMENTARIO) {
			return ORM_publica_comentario;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_USUARIO_ES_BANEADO) {
			this.es_baneado = (base_de_datos.Administrador) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private long idUsuario;
	
	private String nick;
	
	private String fotoFondo;
	
	private String fotoPerfil;
	
	private String descripcion;
	
	private base_de_datos.Administrador es_baneado;
	
	private java.util.Set ORM_bloquea = new java.util.HashSet();
	
	private java.util.Set ORM_sigue = new java.util.HashSet();
	
	private java.util.Set ORM_publica = new java.util.HashSet();
	
	private java.util.Set ORM_es_bloqueado = new java.util.HashSet();
	
	private java.util.Set ORM_es_seguido = new java.util.HashSet();
	
	private java.util.Set ORM_publica_comentario = new java.util.HashSet();
	
	public void setIdUsuario(long value) {
		this.idUsuario = value;
	}
	
	public long getIdUsuario() {
		return idUsuario;
	}
	
	public void setNick(String value) {
		this.nick = value;
	}
	
	public String getNick() {
		return nick;
	}
	
	public void setFotoFondo(String value) {
		this.fotoFondo = value;
	}
	
	public String getFotoFondo() {
		return fotoFondo;
	}
	
	public void setFotoPerfil(String value) {
		this.fotoPerfil = value;
	}
	
	public String getFotoPerfil() {
		return fotoPerfil;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setEs_baneado(base_de_datos.Administrador value) {
		if (es_baneado != null) {
			es_baneado.banea.remove(this);
		}
		if (value != null) {
			value.banea.add(this);
		}
	}
	
	public base_de_datos.Administrador getEs_baneado() {
		return es_baneado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_baneado(base_de_datos.Administrador value) {
		this.es_baneado = value;
	}
	
	private base_de_datos.Administrador getORM_Es_baneado() {
		return es_baneado;
	}
	
	private void setORM_Bloquea(java.util.Set value) {
		this.ORM_bloquea = value;
	}
	
	private java.util.Set getORM_Bloquea() {
		return ORM_bloquea;
	}
	
	public final base_de_datos.UsuarioSetCollection bloquea = new base_de_datos.UsuarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_USUARIO_BLOQUEA, base_de_datos.ORMConstants.KEY_USUARIO_ES_BLOQUEADO, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Sigue(java.util.Set value) {
		this.ORM_sigue = value;
	}
	
	private java.util.Set getORM_Sigue() {
		return ORM_sigue;
	}
	
	public final base_de_datos.UsuarioSetCollection sigue = new base_de_datos.UsuarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_USUARIO_SIGUE, base_de_datos.ORMConstants.KEY_USUARIO_ES_SEGUIDO, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Publica(java.util.Set value) {
		this.ORM_publica = value;
	}
	
	private java.util.Set getORM_Publica() {
		return ORM_publica;
	}
	
	public final base_de_datos.TweetSetCollection publica = new base_de_datos.TweetSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_USUARIO_PUBLICA, base_de_datos.ORMConstants.KEY_TWEET_TWEET_USUARIO, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_bloqueado(java.util.Set value) {
		this.ORM_es_bloqueado = value;
	}
	
	private java.util.Set getORM_Es_bloqueado() {
		return ORM_es_bloqueado;
	}
	
	public final base_de_datos.UsuarioSetCollection es_bloqueado = new base_de_datos.UsuarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_USUARIO_ES_BLOQUEADO, base_de_datos.ORMConstants.KEY_USUARIO_BLOQUEA, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_seguido(java.util.Set value) {
		this.ORM_es_seguido = value;
	}
	
	private java.util.Set getORM_Es_seguido() {
		return ORM_es_seguido;
	}
	
	public final base_de_datos.UsuarioSetCollection es_seguido = new base_de_datos.UsuarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_USUARIO_ES_SEGUIDO, base_de_datos.ORMConstants.KEY_USUARIO_SIGUE, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Publica_comentario(java.util.Set value) {
		this.ORM_publica_comentario = value;
	}
	
	private java.util.Set getORM_Publica_comentario() {
		return ORM_publica_comentario;
	}
	
	public final base_de_datos.ComentarioSetCollection publica_comentario = new base_de_datos.ComentarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_USUARIO_PUBLICA_COMENTARIO, base_de_datos.ORMConstants.KEY_COMENTARIO_COMENTARIO_USUARIO, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
