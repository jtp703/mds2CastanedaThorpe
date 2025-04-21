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

public class Tweet {
	public Tweet() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_TWEET_CONTIENE) {
			return ORM_contiene;
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
		if (key == base_de_datos.ORMConstants.KEY_TWEET_TWEET_USUARIO) {
			this.tweet_usuario = (base_de_datos.Usuario) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_TWEET_RETWEET) {
			this.retweet = (base_de_datos.Tweet) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_TWEET_ES_ELIMINADO) {
			this.es_eliminado = (base_de_datos.Administrador) owner;
		}
		
		else if (key == base_de_datos.ORMConstants.KEY_TWEET_TWEET) {
			this.tweet = (base_de_datos.Tweet) owner;
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
	
	private int ID;
	
	private base_de_datos.Tweet retweet;
	
	private base_de_datos.Usuario tweet_usuario;
	
	private base_de_datos.Administrador es_eliminado;
	
	private long idTweet;
	
	private String texto;
	
	private int numMegustas;
	
	private int numRetweets;
	
	private int numComentarios;
	
	private java.util.Date fechaCreacion;
	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
	private java.util.Set ORM_tiene_comentario = new java.util.HashSet();
	
	private java.util.Set ORM_tweet_contiene = new java.util.HashSet();
	
	private base_de_datos.Tweet tweet;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setIdTweet(long value) {
		this.idTweet = value;
	}
	
	public long getIdTweet() {
		return idTweet;
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
	
	public final base_de_datos.HashtagSetCollection contiene = new base_de_datos.HashtagSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_TWEET_CONTIENE, base_de_datos.ORMConstants.KEY_HASHTAG_APARECE_EN, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setTweet_usuario(base_de_datos.Usuario value) {
		if (tweet_usuario != null) {
			tweet_usuario.publica.remove(this);
		}
		if (value != null) {
			value.publica.add(this);
		}
	}
	
	public base_de_datos.Usuario getTweet_usuario() {
		return tweet_usuario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tweet_usuario(base_de_datos.Usuario value) {
		this.tweet_usuario = value;
	}
	
	private base_de_datos.Usuario getORM_Tweet_usuario() {
		return tweet_usuario;
	}
	
	public void setRetweet(base_de_datos.Tweet value) {
		if (this.retweet != value) {
			base_de_datos.Tweet lretweet = this.retweet;
			this.retweet = value;
			if (value != null) {
				retweet.setTweet(this);
			}
			if (lretweet != null && lretweet.getTweet() == this) {
				lretweet.setTweet(null);
			}
		}
	}
	
	public base_de_datos.Tweet getRetweet() {
		return retweet;
	}
	
	public void setEs_eliminado(base_de_datos.Administrador value) {
		if (es_eliminado != null) {
			es_eliminado.administrador_tweet.remove(this);
		}
		if (value != null) {
			value.administrador_tweet.add(this);
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
	
	public final base_de_datos.ComentarioSetCollection tiene_comentario = new base_de_datos.ComentarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_TWEET_TIENE_COMENTARIO, base_de_datos.ORMConstants.KEY_COMENTARIO_COMENTARIO_TWEET, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Tweet_contiene(java.util.Set value) {
		this.ORM_tweet_contiene = value;
	}
	
	private java.util.Set getORM_Tweet_contiene() {
		return ORM_tweet_contiene;
	}
	
	public final base_de_datos.DocumentoSetCollection tweet_contiene = new base_de_datos.DocumentoSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_TWEET_TWEET_CONTIENE, base_de_datos.ORMConstants.KEY_DOCUMENTO_PERTENECEA_TWEET, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setTweet(base_de_datos.Tweet value) {
		if (this.tweet != value) {
			base_de_datos.Tweet ltweet = this.tweet;
			this.tweet = value;
			if (value != null) {
				tweet.setRetweet(this);
			}
			if (ltweet != null && ltweet.getRetweet() == this) {
				ltweet.setRetweet(null);
			}
		}
	}
	
	public base_de_datos.Tweet getTweet() {
		return tweet;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
