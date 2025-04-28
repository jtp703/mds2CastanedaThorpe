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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TweetDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression retweetId;
	public final AssociationExpression retweet;
	public final IntegerExpression tweet_usuarioId;
	public final AssociationExpression tweet_usuario;
	public final IntegerExpression es_eliminadoId;
	public final AssociationExpression es_eliminado;
	public final LongExpression idTweet;
	public final StringExpression texto;
	public final IntegerExpression numMegustas;
	public final IntegerExpression numRetweets;
	public final IntegerExpression numComentarios;
	public final DateExpression fechaCreacion;
	public final CollectionExpression contiene;
	public final CollectionExpression tiene_comentario;
	public final CollectionExpression tweet_contiene;
	public final IntegerExpression tweetId;
	public final AssociationExpression tweet;
	
	public TweetDetachedCriteria() {
		super(base_de_datos.Tweet.class, base_de_datos.TweetCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		retweetId = new IntegerExpression("retweet.ID", this.getDetachedCriteria());
		retweet = new AssociationExpression("retweet", this.getDetachedCriteria());
		tweet_usuarioId = new IntegerExpression("tweet_usuario.", this.getDetachedCriteria());
		tweet_usuario = new AssociationExpression("tweet_usuario", this.getDetachedCriteria());
		es_eliminadoId = new IntegerExpression("es_eliminado.", this.getDetachedCriteria());
		es_eliminado = new AssociationExpression("es_eliminado", this.getDetachedCriteria());
		idTweet = new LongExpression("idTweet", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		numMegustas = new IntegerExpression("numMegustas", this.getDetachedCriteria());
		numRetweets = new IntegerExpression("numRetweets", this.getDetachedCriteria());
		numComentarios = new IntegerExpression("numComentarios", this.getDetachedCriteria());
		fechaCreacion = new DateExpression("fechaCreacion", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_Contiene", this.getDetachedCriteria());
		tiene_comentario = new CollectionExpression("ORM_Tiene_comentario", this.getDetachedCriteria());
		tweet_contiene = new CollectionExpression("ORM_Tweet_contiene", this.getDetachedCriteria());
		tweetId = new IntegerExpression("tweet.ID", this.getDetachedCriteria());
		tweet = new AssociationExpression("tweet", this.getDetachedCriteria());
	}
	
	public TweetDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.TweetCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		retweetId = new IntegerExpression("retweet.ID", this.getDetachedCriteria());
		retweet = new AssociationExpression("retweet", this.getDetachedCriteria());
		tweet_usuarioId = new IntegerExpression("tweet_usuario.", this.getDetachedCriteria());
		tweet_usuario = new AssociationExpression("tweet_usuario", this.getDetachedCriteria());
		es_eliminadoId = new IntegerExpression("es_eliminado.", this.getDetachedCriteria());
		es_eliminado = new AssociationExpression("es_eliminado", this.getDetachedCriteria());
		idTweet = new LongExpression("idTweet", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		numMegustas = new IntegerExpression("numMegustas", this.getDetachedCriteria());
		numRetweets = new IntegerExpression("numRetweets", this.getDetachedCriteria());
		numComentarios = new IntegerExpression("numComentarios", this.getDetachedCriteria());
		fechaCreacion = new DateExpression("fechaCreacion", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_Contiene", this.getDetachedCriteria());
		tiene_comentario = new CollectionExpression("ORM_Tiene_comentario", this.getDetachedCriteria());
		tweet_contiene = new CollectionExpression("ORM_Tweet_contiene", this.getDetachedCriteria());
		tweetId = new IntegerExpression("tweet.ID", this.getDetachedCriteria());
		tweet = new AssociationExpression("tweet", this.getDetachedCriteria());
	}
	
	public TweetDetachedCriteria createRetweetCriteria() {
		return new TweetDetachedCriteria(createCriteria("retweet"));
	}
	
	public UsuarioDetachedCriteria createTweet_usuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("tweet_usuario"));
	}
	
	public AdministradorDetachedCriteria createEs_eliminadoCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("es_eliminado"));
	}
	
	public base_de_datos.HashtagDetachedCriteria createContieneCriteria() {
		return new base_de_datos.HashtagDetachedCriteria(createCriteria("ORM_Contiene"));
	}
	
	public base_de_datos.ComentarioDetachedCriteria createTiene_comentarioCriteria() {
		return new base_de_datos.ComentarioDetachedCriteria(createCriteria("ORM_Tiene_comentario"));
	}
	
	public base_de_datos.DocumentoDetachedCriteria createTweet_contieneCriteria() {
		return new base_de_datos.DocumentoDetachedCriteria(createCriteria("ORM_Tweet_contiene"));
	}
	
	public TweetDetachedCriteria createTweetCriteria() {
		return new TweetDetachedCriteria(createCriteria("tweet"));
	}
	
	public Tweet uniqueTweet(PersistentSession session) {
		return (Tweet) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tweet[] listTweet(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tweet[]) list.toArray(new Tweet[list.size()]);
	}
}

