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

public class DocumentoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idDocumento;
	public final IntegerExpression pertenecea_comentarioId;
	public final AssociationExpression pertenecea_comentario;
	public final IntegerExpression pertenecea_tweetId;
	public final AssociationExpression pertenecea_tweet;
	public final StringExpression url;
	public final StringExpression tipo;
	
	public DocumentoCriteria(Criteria criteria) {
		super(criteria);
		idDocumento = new IntegerExpression("idDocumento", this);
		pertenecea_comentarioId = new IntegerExpression("pertenecea_comentario.idComentario", this);
		pertenecea_comentario = new AssociationExpression("pertenecea_comentario", this);
		pertenecea_tweetId = new IntegerExpression("pertenecea_tweet.idTweet", this);
		pertenecea_tweet = new AssociationExpression("pertenecea_tweet", this);
		url = new StringExpression("url", this);
		tipo = new StringExpression("tipo", this);
	}
	
	public DocumentoCriteria(PersistentSession session) {
		this(session.createCriteria(Documento.class));
	}
	
	public DocumentoCriteria() throws PersistentException {
		this(base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession());
	}
	
	public ComentarioCriteria createPertenecea_comentarioCriteria() {
		return new ComentarioCriteria(createCriteria("pertenecea_comentario"));
	}
	
	public TweetCriteria createPertenecea_tweetCriteria() {
		return new TweetCriteria(createCriteria("pertenecea_tweet"));
	}
	
	public Documento uniqueDocumento() {
		return (Documento) super.uniqueResult();
	}
	
	public Documento[] listDocumento() {
		java.util.List list = super.list();
		return (Documento[]) list.toArray(new Documento[list.size()]);
	}
}

