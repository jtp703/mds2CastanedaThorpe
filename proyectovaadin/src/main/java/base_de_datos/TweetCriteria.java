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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TweetCriteria extends AbstractORMCriteria {
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
	
	public TweetCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		retweetId = new IntegerExpression("retweet.ID", this);
		retweet = new AssociationExpression("retweet", this);
		tweet_usuarioId = new IntegerExpression("tweet_usuario.", this);
		tweet_usuario = new AssociationExpression("tweet_usuario", this);
		es_eliminadoId = new IntegerExpression("es_eliminado.", this);
		es_eliminado = new AssociationExpression("es_eliminado", this);
		idTweet = new LongExpression("idTweet", this);
		texto = new StringExpression("texto", this);
		numMegustas = new IntegerExpression("numMegustas", this);
		numRetweets = new IntegerExpression("numRetweets", this);
		numComentarios = new IntegerExpression("numComentarios", this);
		fechaCreacion = new DateExpression("fechaCreacion", this);
		contiene = new CollectionExpression("ORM_Contiene", this);
		tiene_comentario = new CollectionExpression("ORM_Tiene_comentario", this);
		tweet_contiene = new CollectionExpression("ORM_Tweet_contiene", this);
		tweetId = new IntegerExpression("tweet.ID", this);
		tweet = new AssociationExpression("tweet", this);
	}
	
	public TweetCriteria(PersistentSession session) {
		this(session.createCriteria(Tweet.class));
	}
	
	public TweetCriteria() throws PersistentException {
		this(base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession());
	}
	
	public TweetCriteria createRetweetCriteria() {
		return new TweetCriteria(createCriteria("retweet"));
	}
	
	public UsuarioCriteria createTweet_usuarioCriteria() {
		return new UsuarioCriteria(createCriteria("tweet_usuario"));
	}
	
	public AdministradorCriteria createEs_eliminadoCriteria() {
		return new AdministradorCriteria(createCriteria("es_eliminado"));
	}
	
	public base_de_datos.HashtagCriteria createContieneCriteria() {
		return new base_de_datos.HashtagCriteria(createCriteria("ORM_Contiene"));
	}
	
	public base_de_datos.ComentarioCriteria createTiene_comentarioCriteria() {
		return new base_de_datos.ComentarioCriteria(createCriteria("ORM_Tiene_comentario"));
	}
	
	public base_de_datos.DocumentoCriteria createTweet_contieneCriteria() {
		return new base_de_datos.DocumentoCriteria(createCriteria("ORM_Tweet_contiene"));
	}
	
	public TweetCriteria createTweetCriteria() {
		return new TweetCriteria(createCriteria("tweet"));
	}
	
	public Tweet uniqueTweet() {
		return (Tweet) super.uniqueResult();
	}
	
	public Tweet[] listTweet() {
		java.util.List list = super.list();
		return (Tweet[]) list.toArray(new Tweet[list.size()]);
	}
}

