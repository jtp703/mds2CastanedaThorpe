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

public class ComentarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression idComentario;
	public final IntegerExpression comentado_porId;
	public final AssociationExpression comentado_por;
	public final IntegerExpression pertenecea_tweetId;
	public final AssociationExpression pertenecea_tweet;
	public final IntegerExpression es_eliminadoId;
	public final AssociationExpression es_eliminado;
	public final StringExpression texto;
	public final StringExpression foto_video;
	public final IntegerExpression numMegustas;
	public final CollectionExpression comentario_contiene;
	public final CollectionExpression comlikeado_por;
	
	public ComentarioCriteria(Criteria criteria) {
		super(criteria);
		idComentario = new IntegerExpression("idComentario", this);
		comentado_porId = new IntegerExpression("comentado_por.", this);
		comentado_por = new AssociationExpression("comentado_por", this);
		pertenecea_tweetId = new IntegerExpression("pertenecea_tweet.idTweet", this);
		pertenecea_tweet = new AssociationExpression("pertenecea_tweet", this);
		es_eliminadoId = new IntegerExpression("es_eliminado.", this);
		es_eliminado = new AssociationExpression("es_eliminado", this);
		texto = new StringExpression("texto", this);
		foto_video = new StringExpression("foto_video", this);
		numMegustas = new IntegerExpression("numMegustas", this);
		comentario_contiene = new CollectionExpression("ORM_comentario_contiene", this);
		comlikeado_por = new CollectionExpression("ORM_comlikeado_por", this);
	}
	
	public ComentarioCriteria(PersistentSession session) {
		this(session.createCriteria(Comentario.class));
	}
	
	public ComentarioCriteria() throws PersistentException {
		this(base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createComentado_porCriteria() {
		return new UsuarioCriteria(createCriteria("comentado_por"));
	}
	
	public TweetCriteria createPertenecea_tweetCriteria() {
		return new TweetCriteria(createCriteria("pertenecea_tweet"));
	}
	
	public AdministradorCriteria createEs_eliminadoCriteria() {
		return new AdministradorCriteria(createCriteria("es_eliminado"));
	}
	
	public base_de_datos.DocumentoCriteria createComentario_contieneCriteria() {
		return new base_de_datos.DocumentoCriteria(createCriteria("ORM_comentario_contiene"));
	}
	
	public base_de_datos.UsuarioCriteria createComlikeado_porCriteria() {
		return new base_de_datos.UsuarioCriteria(createCriteria("ORM_comlikeado_por"));
	}
	
	public Comentario uniqueComentario() {
		return (Comentario) super.uniqueResult();
	}
	
	public Comentario[] listComentario() {
		java.util.List list = super.list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

