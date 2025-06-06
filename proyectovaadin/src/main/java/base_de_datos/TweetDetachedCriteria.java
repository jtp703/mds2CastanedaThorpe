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
	
	public TweetDetachedCriteria() {
		super(base_de_datos.Tweet.class, base_de_datos.TweetCriteria.class);
		idTweet = new IntegerExpression("idTweet", this.getDetachedCriteria());
		tweetId = new IntegerExpression("tweet.idTweet", this.getDetachedCriteria());
		tweet = new AssociationExpression("tweet", this.getDetachedCriteria());
		tweeteado_porId = new IntegerExpression("tweeteado_por.", this.getDetachedCriteria());
		tweeteado_por = new AssociationExpression("tweeteado_por", this.getDetachedCriteria());
		es_eliminadoId = new IntegerExpression("es_eliminado.", this.getDetachedCriteria());
		es_eliminado = new AssociationExpression("es_eliminado", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		fechaCreacion = new DateExpression("fechaCreacion", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		retweet = new CollectionExpression("ORM_retweet", this.getDetachedCriteria());
		reetweteado_por = new CollectionExpression("ORM_reetweteado_por", this.getDetachedCriteria());
		likeado_por = new CollectionExpression("ORM_likeado_por", this.getDetachedCriteria());
		tiene_comentario = new CollectionExpression("ORM_tiene_comentario", this.getDetachedCriteria());
		tweet_contiene = new CollectionExpression("ORM_tweet_contiene", this.getDetachedCriteria());
	}
	
	public TweetDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.TweetCriteria.class);
		idTweet = new IntegerExpression("idTweet", this.getDetachedCriteria());
		tweetId = new IntegerExpression("tweet.idTweet", this.getDetachedCriteria());
		tweet = new AssociationExpression("tweet", this.getDetachedCriteria());
		tweeteado_porId = new IntegerExpression("tweeteado_por.", this.getDetachedCriteria());
		tweeteado_por = new AssociationExpression("tweeteado_por", this.getDetachedCriteria());
		es_eliminadoId = new IntegerExpression("es_eliminado.", this.getDetachedCriteria());
		es_eliminado = new AssociationExpression("es_eliminado", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		fechaCreacion = new DateExpression("fechaCreacion", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		retweet = new CollectionExpression("ORM_retweet", this.getDetachedCriteria());
		reetweteado_por = new CollectionExpression("ORM_reetweteado_por", this.getDetachedCriteria());
		likeado_por = new CollectionExpression("ORM_likeado_por", this.getDetachedCriteria());
		tiene_comentario = new CollectionExpression("ORM_tiene_comentario", this.getDetachedCriteria());
		tweet_contiene = new CollectionExpression("ORM_tweet_contiene", this.getDetachedCriteria());
	}
	
	public TweetDetachedCriteria createTweetCriteria() {
		return new TweetDetachedCriteria(createCriteria("tweet"));
	}
	
	public UsuarioDetachedCriteria createTweeteado_porCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("tweeteado_por"));
	}
	
	public AdministradorDetachedCriteria createEs_eliminadoCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("es_eliminado"));
	}
	
	public base_de_datos.HashtagDetachedCriteria createContieneCriteria() {
		return new base_de_datos.HashtagDetachedCriteria(createCriteria("ORM_contiene"));
	}
	
	public base_de_datos.TweetDetachedCriteria createRetweetCriteria() {
		return new base_de_datos.TweetDetachedCriteria(createCriteria("ORM_retweet"));
	}
	
	public base_de_datos.UsuarioDetachedCriteria createReetweteado_porCriteria() {
		return new base_de_datos.UsuarioDetachedCriteria(createCriteria("ORM_reetweteado_por"));
	}
	
	public base_de_datos.UsuarioDetachedCriteria createLikeado_porCriteria() {
		return new base_de_datos.UsuarioDetachedCriteria(createCriteria("ORM_likeado_por"));
	}
	
	public base_de_datos.ComentarioDetachedCriteria createTiene_comentarioCriteria() {
		return new base_de_datos.ComentarioDetachedCriteria(createCriteria("ORM_tiene_comentario"));
	}
	
	public base_de_datos.DocumentoDetachedCriteria createTweet_contieneCriteria() {
		return new base_de_datos.DocumentoDetachedCriteria(createCriteria("ORM_tweet_contiene"));
	}
	
	public Tweet uniqueTweet(PersistentSession session) {
		return (Tweet) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tweet[] listTweet(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tweet[]) list.toArray(new Tweet[list.size()]);
	}
}

