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
@Table(name="Tweet")
public class Tweet implements Serializable {
	public Tweet() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_TWEET_CONTIENE) {
			return ORM_contiene;
		}
		else if (key == base_de_datos.ORMConstants.KEY_TWEET_RETWEET) {
			return ORM_retweet;
		}
		else if (key == base_de_datos.ORMConstants.KEY_TWEET_REETWETEADO_POR) {
			return ORM_reetweteado_por;
		}
		else if (key == base_de_datos.ORMConstants.KEY_TWEET_LIKEADO_POR) {
			return ORM_likeado_por;
		}
		else if (key == base_de_datos.ORMConstants.KEY_TWEET_TIENE_COMENTARIO) {
			return ORM_tiene_comentario;
		}
		else if (key == base_de_datos.ORMConstants.KEY_TWEET_TWEET_CONTIENE) {
			return ORM_tweet_contiene;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == base_de_datos.ORMConstants.KEY_TWEET_TWEETEADO_POR) {
			this.tweeteado_por = (base_de_datos.Usuario) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_TWEET_ES_ELIMINADO) {
			this.es_eliminado = (base_de_datos.Administrador) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_TWEET_TWEET) {
			this.tweet = (base_de_datos.Tweet) owner;
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
	
	@Column(name="IdTweet", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_TWEET_IDTWEET_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_TWEET_IDTWEET_GENERATOR", strategy="native")	
	private int idTweet;
	
	@ManyToOne(targetEntity=base_de_datos.Tweet.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TweetIdTweet", referencedColumnName="IdTweet", nullable=false) }, foreignKey=@ForeignKey(name="FKTweet701049"))	
	private base_de_datos.Tweet tweet;
	
	@ManyToOne(targetEntity=base_de_datos.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioUsuarioAutentificadoID", referencedColumnName="UsuarioAutentificadoID", nullable=false) }, foreignKey=@ForeignKey(name="FKTweet870216"))	
	public base_de_datos.Usuario tweeteado_por;
	
	@ManyToOne(targetEntity=base_de_datos.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorUsuarioAutentificadoID", referencedColumnName="UsuarioAutentificadoID", nullable=true) }, foreignKey=@ForeignKey(name="FKTweet278485"))	
	private base_de_datos.Administrador es_eliminado;
	
	@Column(name="Texto", nullable=true, length=255)	
	private String texto;
	
	@Column(name="NumMegustas", nullable=false, length=10)	
	private int numMegustas;
	
	@Column(name="NumRetweets", nullable=false, length=10)	
	private int numRetweets;
	
	@Column(name="NumComentarios", nullable=false, length=10)	
	private int numComentarios;
	
	@Column(name="FechaCreacion", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fechaCreacion;
	
	@ManyToMany(targetEntity=base_de_datos.Hashtag.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Hashtag_Tweet", joinColumns={ @JoinColumn(name="TweetIdTweet") }, inverseJoinColumns={ @JoinColumn(name="HashtagIdHashtag") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
	@OneToMany(mappedBy="tweet", targetEntity=base_de_datos.Tweet.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_retweet = new java.util.HashSet();
	
	@ManyToMany(targetEntity=base_de_datos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Tweet", joinColumns={ @JoinColumn(name="TweetIdTweet") }, inverseJoinColumns={ @JoinColumn(name="UsuarioUsuarioAutentificadoID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reetweteado_por = new java.util.HashSet();
	
	@ManyToMany(targetEntity=base_de_datos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Tweet2", joinColumns={ @JoinColumn(name="TweetIdTweet") }, inverseJoinColumns={ @JoinColumn(name="UsuarioUsuarioAutentificadoID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_likeado_por = new java.util.HashSet();
	
	@OneToMany(mappedBy="pertenecea_tweet", targetEntity=base_de_datos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene_comentario = new java.util.HashSet();
	
	@OneToMany(mappedBy="pertenecea_tweet", targetEntity=base_de_datos.Documento.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tweet_contiene = new java.util.HashSet();
	
	private void setIdTweet(int value) {
		this.idTweet = value;
	}
	
	public int getIdTweet() {
		return idTweet;
	}
	
	public int getORMID() {
		return getIdTweet();
	}
	
	public void setTexto(String value) {
		this.texto = value;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setNumMegustas(int value) {
		this.numMegustas = value;
	}
	
	public int getNumMegustas() {
		return numMegustas;
	}
	
	public void setNumRetweets(int value) {
		this.numRetweets = value;
	}
	
	public int getNumRetweets() {
		return numRetweets;
	}
	
	public void setNumComentarios(int value) {
		this.numComentarios = value;
	}
	
	public int getNumComentarios() {
		return numComentarios;
	}
	
	public void setFechaCreacion(java.util.Date value) {
		this.fechaCreacion = value;
	}
	
	public java.util.Date getFechaCreacion() {
		return fechaCreacion;
	}
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	@Transient	
	public final base_de_datos.HashtagSetCollection contiene = new base_de_datos.HashtagSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_TWEET_CONTIENE, base_de_datos.ORMConstants.KEY_HASHTAG_APARECE_EN, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setTweeteado_por(base_de_datos.Usuario value) {
		if (tweeteado_por != null) {
			tweeteado_por.tweetea.remove(this);
		}
		if (value != null) {
			value.tweetea.add(this);
		}
	}
	
	public base_de_datos.Usuario getTweeteado_por() {
		return tweeteado_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tweeteado_por(base_de_datos.Usuario value) {
		this.tweeteado_por = value;
	}
	
	private base_de_datos.Usuario getORM_Tweeteado_por() {
		return tweeteado_por;
	}
	
	private void setORM_Retweet(java.util.Set value) {
		this.ORM_retweet = value;
	}
	
	private java.util.Set getORM_Retweet() {
		return ORM_retweet;
	}
	
	@Transient	
	public final base_de_datos.TweetSetCollection retweet = new base_de_datos.TweetSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_TWEET_RETWEET, base_de_datos.ORMConstants.KEY_TWEET_TWEET, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Reetweteado_por(java.util.Set value) {
		this.ORM_reetweteado_por = value;
	}
	
	private java.util.Set getORM_Reetweteado_por() {
		return ORM_reetweteado_por;
	}
	
	@Transient	
	public final base_de_datos.UsuarioSetCollection reetweteado_por = new base_de_datos.UsuarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_TWEET_REETWETEADO_POR, base_de_datos.ORMConstants.KEY_USUARIO_RETWEETEA, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Likeado_por(java.util.Set value) {
		this.ORM_likeado_por = value;
	}
	
	private java.util.Set getORM_Likeado_por() {
		return ORM_likeado_por;
	}
	
	@Transient	
	public final base_de_datos.UsuarioSetCollection likeado_por = new base_de_datos.UsuarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_TWEET_LIKEADO_POR, base_de_datos.ORMConstants.KEY_USUARIO_LIKEA, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setEs_eliminado(base_de_datos.Administrador value) {
		if (es_eliminado != null) {
			es_eliminado.elimina_tweet.remove(this);
		}
		if (value != null) {
			value.elimina_tweet.add(this);
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
	
	private void setORM_Tiene_comentario(java.util.Set value) {
		this.ORM_tiene_comentario = value;
	}
	
	private java.util.Set getORM_Tiene_comentario() {
		return ORM_tiene_comentario;
	}
	
	@Transient	
	public final base_de_datos.ComentarioSetCollection tiene_comentario = new base_de_datos.ComentarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_TWEET_TIENE_COMENTARIO, base_de_datos.ORMConstants.KEY_COMENTARIO_PERTENECEA_TWEET, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Tweet_contiene(java.util.Set value) {
		this.ORM_tweet_contiene = value;
	}
	
	private java.util.Set getORM_Tweet_contiene() {
		return ORM_tweet_contiene;
	}
	
	@Transient	
	public final base_de_datos.DocumentoSetCollection tweet_contiene = new base_de_datos.DocumentoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_TWEET_TWEET_CONTIENE, base_de_datos.ORMConstants.KEY_DOCUMENTO_PERTENECEA_TWEET, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setTweet(base_de_datos.Tweet value) {
		if (tweet != null) {
			tweet.retweet.remove(this);
		}
		if (value != null) {
			value.retweet.add(this);
		}
	}
	
	public base_de_datos.Tweet getTweet() {
		return tweet;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tweet(base_de_datos.Tweet value) {
		this.tweet = value;
	}
	
	private base_de_datos.Tweet getORM_Tweet() {
		return tweet;
	}
	
	public String toString() {
		return String.valueOf(getIdTweet());
	}
	
}
