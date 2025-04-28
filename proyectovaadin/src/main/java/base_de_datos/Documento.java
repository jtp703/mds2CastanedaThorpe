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

public class Documento {
	public Documento() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_DOCUMENTO_PERTENECEA_TWEET) {
			this.pertenecea_tweet = (base_de_datos.Tweet) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_DOCUMENTO_PERTENECEA_COMENTARIO) {
			this.pertenecea_comentario = (base_de_datos.Comentario) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private long idDocumento;
	
	private base_de_datos.Comentario pertenecea_comentario;
	
	private base_de_datos.Tweet pertenecea_tweet;
	
	private String url;
	
	private String tipo;
	
	private void setIdDocumento(long value) {
		this.idDocumento = value;
	}
	
	public long getIdDocumento() {
		return idDocumento;
	}
	
	public long getORMID() {
		return getIdDocumento();
	}
	
	public void setUrl(String value) {
		this.url = value;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setPertenecea_tweet(base_de_datos.Tweet value) {
		if (pertenecea_tweet != null) {
			pertenecea_tweet.tweet_contiene.remove(this);
		}
		if (value != null) {
			value.tweet_contiene.add(this);
		}
	}
	
	public base_de_datos.Tweet getPertenecea_tweet() {
		return pertenecea_tweet;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenecea_tweet(base_de_datos.Tweet value) {
		this.pertenecea_tweet = value;
	}
	
	private base_de_datos.Tweet getORM_Pertenecea_tweet() {
		return pertenecea_tweet;
	}
	
	public void setPertenecea_comentario(base_de_datos.Comentario value) {
		if (pertenecea_comentario != null) {
			pertenecea_comentario.comentario_contiene.remove(this);
		}
		if (value != null) {
			value.comentario_contiene.add(this);
		}
	}
	
	public base_de_datos.Comentario getPertenecea_comentario() {
		return pertenecea_comentario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenecea_comentario(base_de_datos.Comentario value) {
		this.pertenecea_comentario = value;
	}
	
	private base_de_datos.Comentario getORM_Pertenecea_comentario() {
		return pertenecea_comentario;
	}
	
	public String toString() {
		return String.valueOf(getIdDocumento());
	}
	
}
