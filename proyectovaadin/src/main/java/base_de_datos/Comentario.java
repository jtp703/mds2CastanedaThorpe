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

public class Comentario {
	public Comentario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_COMENTARIO_COMENTARIO_CONTIENE) {
			return ORM_comentario_contiene;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_COMENTARIO_COMENTARIO_TWEET) {
			this.comentario_tweet = (base_de_datos.Tweet) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_COMENTARIO_COMENTARIO_USUARIO) {
			this.comentario_usuario = (base_de_datos.Usuario) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_COMENTARIO_ES_ELIMINADO) {
			this.es_eliminado = (base_de_datos.Administrador) owner;
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
	
	private long idComentario;
	
	private base_de_datos.Usuario comentario_usuario;
	
	private base_de_datos.Tweet comentario_tweet;
	
	private base_de_datos.Administrador es_eliminado;
	
	private String texto;
	
	private String foto_video;
	
	private int numMegustas;
	
	private java.util.Set ORM_comentario_contiene = new java.util.HashSet();
	
	private void setIdComentario(long value) {
		this.idComentario = value;
	}
	
	public long getIdComentario() {
		return idComentario;
	}
	
	public long getORMID() {
		return getIdComentario();
	}
	
	public void setTexto(String value) {
		this.texto = value;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setFoto_video(String value) {
		this.foto_video = value;
	}
	
	public String getFoto_video() {
		return foto_video;
	}
	
	public void setNumMegustas(int value) {
		this.numMegustas = value;
	}
	
	public int getNumMegustas() {
		return numMegustas;
	}
	
	public void setComentario_tweet(base_de_datos.Tweet value) {
		if (comentario_tweet != null) {
			comentario_tweet.tiene_comentario.remove(this);
		}
		if (value != null) {
			value.tiene_comentario.add(this);
		}
	}
	
	public base_de_datos.Tweet getComentario_tweet() {
		return comentario_tweet;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Comentario_tweet(base_de_datos.Tweet value) {
		this.comentario_tweet = value;
	}
	
	private base_de_datos.Tweet getORM_Comentario_tweet() {
		return comentario_tweet;
	}
	
	private void setORM_Comentario_contiene(java.util.Set value) {
		this.ORM_comentario_contiene = value;
	}
	
	private java.util.Set getORM_Comentario_contiene() {
		return ORM_comentario_contiene;
	}
	
	public final base_de_datos.DocumentoSetCollection comentario_contiene = new base_de_datos.DocumentoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_COMENTARIO_COMENTARIO_CONTIENE, base_de_datos.ORMConstants.KEY_DOCUMENTO_PERTENECEA_COMENTARIO, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setComentario_usuario(base_de_datos.Usuario value) {
		if (comentario_usuario != null) {
			comentario_usuario.publica_comentario.remove(this);
		}
		if (value != null) {
			value.publica_comentario.add(this);
		}
	}
	
	public base_de_datos.Usuario getComentario_usuario() {
		return comentario_usuario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Comentario_usuario(base_de_datos.Usuario value) {
		this.comentario_usuario = value;
	}
	
	private base_de_datos.Usuario getORM_Comentario_usuario() {
		return comentario_usuario;
	}
	
	public void setEs_eliminado(base_de_datos.Administrador value) {
		if (es_eliminado != null) {
			es_eliminado.elimina.remove(this);
		}
		if (value != null) {
			value.elimina.add(this);
		}
	}
	
	public base_de_datos.Administrador getEs_eliminado() {
		return es_eliminado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_eliminado(base_de_datos.Administrador value) {
		this.es_eliminado = value;
	}
	
	private base_de_datos.Administrador getORM_Es_eliminado() {
		return es_eliminado;
	}
	
	public String toString() {
		return String.valueOf(getIdComentario());
	}
	
}
