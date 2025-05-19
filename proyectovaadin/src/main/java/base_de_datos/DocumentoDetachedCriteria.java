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

public class DocumentoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idDocumento;
	public final IntegerExpression pertenecea_comentarioId;
	public final AssociationExpression pertenecea_comentario;
	public final IntegerExpression pertenecea_tweetId;
	public final AssociationExpression pertenecea_tweet;
	public final StringExpression url;
	public final StringExpression tipo;
	
	public DocumentoDetachedCriteria() {
		super(base_de_datos.Documento.class, base_de_datos.DocumentoCriteria.class);
		idDocumento = new IntegerExpression("idDocumento", this.getDetachedCriteria());
		pertenecea_comentarioId = new IntegerExpression("pertenecea_comentario.idComentario", this.getDetachedCriteria());
		pertenecea_comentario = new AssociationExpression("pertenecea_comentario", this.getDetachedCriteria());
		pertenecea_tweetId = new IntegerExpression("pertenecea_tweet.idTweet", this.getDetachedCriteria());
		pertenecea_tweet = new AssociationExpression("pertenecea_tweet", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
	}
	
	public DocumentoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.DocumentoCriteria.class);
		idDocumento = new IntegerExpression("idDocumento", this.getDetachedCriteria());
		pertenecea_comentarioId = new IntegerExpression("pertenecea_comentario.idComentario", this.getDetachedCriteria());
		pertenecea_comentario = new AssociationExpression("pertenecea_comentario", this.getDetachedCriteria());
		pertenecea_tweetId = new IntegerExpression("pertenecea_tweet.idTweet", this.getDetachedCriteria());
		pertenecea_tweet = new AssociationExpression("pertenecea_tweet", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria createPertenecea_comentarioCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("pertenecea_comentario"));
	}
	
	public TweetDetachedCriteria createPertenecea_tweetCriteria() {
		return new TweetDetachedCriteria(createCriteria("pertenecea_tweet"));
	}
	
	public Documento uniqueDocumento(PersistentSession session) {
		return (Documento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Documento[] listDocumento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Documento[]) list.toArray(new Documento[list.size()]);
	}
}

