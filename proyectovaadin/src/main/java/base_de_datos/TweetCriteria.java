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
	public final IntegerExpression idTweet;
	public final IntegerExpression tweetId;
	public final AssociationExpression tweet;
	public final IntegerExpression tweeteado_porId;
	public final AssociationExpression tweeteado_por;
	public final IntegerExpression es_eliminadoId;
	public final AssociationExpression es_eliminado;
	public final StringExpression texto;
	public final DateExpression fechaCreacion;
	public final CollectionExpression contiene;
	public final CollectionExpression retweet;
	public final CollectionExpression reetweteado_por;
	public final CollectionExpression likeado_por;
	public final CollectionExpression tiene_comentario;
	public final CollectionExpression tweet_contiene;
	
	public TweetCriteria(Criteria criteria) {
		super(criteria);
		idTweet = new IntegerExpression("idTweet", this);
		tweetId = new IntegerExpression("tweet.idTweet", this);
		tweet = new AssociationExpression("tweet", this);
		tweeteado_porId = new IntegerExpression("tweeteado_por.", this);
		tweeteado_por = new AssociationExpression("tweeteado_por", this);
		es_eliminadoId = new IntegerExpression("es_eliminado.", this);
		es_eliminado = new AssociationExpression("es_eliminado", this);
		texto = new StringExpression("texto", this);
		fechaCreacion = new DateExpression("fechaCreacion", this);
		contiene = new CollectionExpression("ORM_contiene", this);
		retweet = new CollectionExpression("ORM_retweet", this);
		reetweteado_por = new CollectionExpression("ORM_reetweteado_por", this);
		likeado_por = new CollectionExpression("ORM_likeado_por", this);
		tiene_comentario = new CollectionExpression("ORM_tiene_comentario", this);
		tweet_contiene = new CollectionExpression("ORM_tweet_contiene", this);
	}
	
	public TweetCriteria(PersistentSession session) {
		this(session.createCriteria(Tweet.class));
	}
	
	public TweetCriteria() throws PersistentException {
		this(base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession());
	}
	
	public TweetCriteria createTweetCriteria() {
		return new TweetCriteria(createCriteria("tweet"));
	}
	
	public UsuarioCriteria createTweeteado_porCriteria() {
		return new UsuarioCriteria(createCriteria("tweeteado_por"));
	}
	
	public AdministradorCriteria createEs_eliminadoCriteria() {
		return new AdministradorCriteria(createCriteria("es_eliminado"));
	}
	
	public base_de_datos.HashtagCriteria createContieneCriteria() {
		return new base_de_datos.HashtagCriteria(createCriteria("ORM_contiene"));
	}
	
	public base_de_datos.TweetCriteria createRetweetCriteria() {
		return new base_de_datos.TweetCriteria(createCriteria("ORM_retweet"));
	}
	
	public base_de_datos.UsuarioCriteria createReetweteado_porCriteria() {
		return new base_de_datos.UsuarioCriteria(createCriteria("ORM_reetweteado_por"));
	}
	
	public base_de_datos.UsuarioCriteria createLikeado_porCriteria() {
		return new base_de_datos.UsuarioCriteria(createCriteria("ORM_likeado_por"));
	}
	
	public base_de_datos.ComentarioCriteria createTiene_comentarioCriteria() {
		return new base_de_datos.ComentarioCriteria(createCriteria("ORM_tiene_comentario"));
	}
	
	public base_de_datos.DocumentoCriteria createTweet_contieneCriteria() {
		return new base_de_datos.DocumentoCriteria(createCriteria("ORM_tweet_contiene"));
	}
	
	public Tweet uniqueTweet() {
		return (Tweet) super.uniqueResult();
	}
	
	public Tweet[] listTweet() {
		java.util.List list = super.list();
		return (Tweet[]) list.toArray(new Tweet[list.size()]);
	}
}

