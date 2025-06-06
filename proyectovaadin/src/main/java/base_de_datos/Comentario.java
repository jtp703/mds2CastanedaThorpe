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
@Table(name="Comentario")
public class Comentario implements Serializable {
	public Comentario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_COMENTARIO_COMENTARIO_CONTIENE) {
			return ORM_comentario_contiene;
		}
		else if (key == base_de_datos.ORMConstants.KEY_COMENTARIO_COMLIKEADO_POR) {
			return ORM_comlikeado_por;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_COMENTARIO_PERTENECEA_TWEET) {
			this.pertenecea_tweet = (base_de_datos.Tweet) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_COMENTARIO_COMENTADO_POR) {
			this.comentado_por = (base_de_datos.Usuario) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_COMENTARIO_ES_ELIMINADO) {
			this.es_eliminado = (base_de_datos.Administrador) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdComentario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_COMENTARIO_IDCOMENTARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_COMENTARIO_IDCOMENTARIO_GENERATOR", strategy="native")	
	private int idComentario;
	
	@ManyToOne(targetEntity=base_de_datos.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioUsuarioAutentificadoID", referencedColumnName="UsuarioAutentificadoID", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario113281"))	
	private base_de_datos.Usuario comentado_por;
	
	@ManyToOne(targetEntity=base_de_datos.Tweet.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TweetIdTweet", referencedColumnName="IdTweet", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario689142"))	
	private base_de_datos.Tweet pertenecea_tweet;
	
	@ManyToOne(targetEntity=base_de_datos.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorUsuarioAutentificadoID", referencedColumnName="UsuarioAutentificadoID") }, foreignKey=@ForeignKey(name="FKComentario705012"))	
	private base_de_datos.Administrador es_eliminado;
	
	@Column(name="Texto", nullable=true, length=255)	
	private String texto;
	
	@Column(name="Foto_video", nullable=true, length=255)	
	private String foto_video;
	
	@Column(name="FechaCreacion", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fechaCreacion;
	
	@OneToMany(mappedBy="pertenecea_comentario", targetEntity=base_de_datos.Documento.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentario_contiene = new java.util.HashSet();
	
	@ManyToMany(targetEntity=base_de_datos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Comentario", joinColumns={ @JoinColumn(name="ComentarioIdComentario") }, inverseJoinColumns={ @JoinColumn(name="UsuarioUsuarioAutentificadoID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comlikeado_por = new java.util.HashSet();
	
	private void setIdComentario(int value) {
		this.idComentario = value;
	}
	
	public int getIdComentario() {
		return idComentario;
	}
	
	public int getORMID() {
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
	
	public void setFechaCreacion(java.util.Date value) {
		this.fechaCreacion = value;
	}
	
	public java.util.Date getFechaCreacion() {
		return fechaCreacion;
	}
	
	public void setPertenecea_tweet(base_de_datos.Tweet value) {
		if (pertenecea_tweet != null) {
			pertenecea_tweet.tiene_comentario.remove(this);
		}
		if (value != null) {
			value.tiene_comentario.add(this);
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
	
	private void setORM_Comentario_contiene(java.util.Set value) {
		this.ORM_comentario_contiene = value;
	}
	
	private java.util.Set getORM_Comentario_contiene() {
		return ORM_comentario_contiene;
	}
	
	@Transient	
	public final base_de_datos.DocumentoSetCollection comentario_contiene = new base_de_datos.DocumentoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_COMENTARIO_COMENTARIO_CONTIENE, base_de_datos.ORMConstants.KEY_DOCUMENTO_PERTENECEA_COMENTARIO, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setComentado_por(base_de_datos.Usuario value) {
		if (comentado_por != null) {
			comentado_por.publica_comentario.remove(this);
		}
		if (value != null) {
			value.publica_comentario.add(this);
		}
	}
	
	public base_de_datos.Usuario getComentado_por() {
		return comentado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Comentado_por(base_de_datos.Usuario value) {
		this.comentado_por = value;
	}
	
	private base_de_datos.Usuario getORM_Comentado_por() {
		return comentado_por;
	}
	
	private void setORM_Comlikeado_por(java.util.Set value) {
		this.ORM_comlikeado_por = value;
	}
	
	private java.util.Set getORM_Comlikeado_por() {
		return ORM_comlikeado_por;
	}
	
	@Transient	
	public final base_de_datos.UsuarioSetCollection comlikeado_por = new base_de_datos.UsuarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_COMENTARIO_COMLIKEADO_POR, base_de_datos.ORMConstants.KEY_USUARIO_LIKEA_COMENTARIO, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
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
