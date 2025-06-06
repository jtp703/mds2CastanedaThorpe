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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Documento")
public class Documento implements Serializable {
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
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdDocumento", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_DOCUMENTO_IDDOCUMENTO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_DOCUMENTO_IDDOCUMENTO_GENERATOR", strategy="native")	
	private int idDocumento;
	
	@ManyToOne(targetEntity=base_de_datos.Comentario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ComentarioIdComentario", referencedColumnName="IdComentario") }, foreignKey=@ForeignKey(name="FKDocumento471192"))	
	private base_de_datos.Comentario pertenecea_comentario;
	
	@ManyToOne(targetEntity=base_de_datos.Tweet.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TweetIdTweet", referencedColumnName="IdTweet") }, foreignKey=@ForeignKey(name="FKDocumento977943"))	
	private base_de_datos.Tweet pertenecea_tweet;
	
	@Column(name="Url", nullable=true, length=255)	
	private String url;
	
	@Column(name="Tipo", nullable=true, length=255)	
	private String tipo;
	
	private void setIdDocumento(int value) {
		this.idDocumento = value;
	}
	
	public int getIdDocumento() {
		return idDocumento;
	}
	
	public int getORMID() {
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
