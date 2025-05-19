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

public class ComentarioDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ComentarioDetachedCriteria() {
		super(base_de_datos.Comentario.class, base_de_datos.ComentarioCriteria.class);
		idComentario = new IntegerExpression("idComentario", this.getDetachedCriteria());
		comentado_porId = new IntegerExpression("comentado_por.", this.getDetachedCriteria());
		comentado_por = new AssociationExpression("comentado_por", this.getDetachedCriteria());
		pertenecea_tweetId = new IntegerExpression("pertenecea_tweet.idTweet", this.getDetachedCriteria());
		pertenecea_tweet = new AssociationExpression("pertenecea_tweet", this.getDetachedCriteria());
		es_eliminadoId = new IntegerExpression("es_eliminado.", this.getDetachedCriteria());
		es_eliminado = new AssociationExpression("es_eliminado", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		foto_video = new StringExpression("foto_video", this.getDetachedCriteria());
		numMegustas = new IntegerExpression("numMegustas", this.getDetachedCriteria());
		comentario_contiene = new CollectionExpression("ORM_comentario_contiene", this.getDetachedCriteria());
		comlikeado_por = new CollectionExpression("ORM_comlikeado_por", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.ComentarioCriteria.class);
		idComentario = new IntegerExpression("idComentario", this.getDetachedCriteria());
		comentado_porId = new IntegerExpression("comentado_por.", this.getDetachedCriteria());
		comentado_por = new AssociationExpression("comentado_por", this.getDetachedCriteria());
		pertenecea_tweetId = new IntegerExpression("pertenecea_tweet.idTweet", this.getDetachedCriteria());
		pertenecea_tweet = new AssociationExpression("pertenecea_tweet", this.getDetachedCriteria());
		es_eliminadoId = new IntegerExpression("es_eliminado.", this.getDetachedCriteria());
		es_eliminado = new AssociationExpression("es_eliminado", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		foto_video = new StringExpression("foto_video", this.getDetachedCriteria());
		numMegustas = new IntegerExpression("numMegustas", this.getDetachedCriteria());
		comentario_contiene = new CollectionExpression("ORM_comentario_contiene", this.getDetachedCriteria());
		comlikeado_por = new CollectionExpression("ORM_comlikeado_por", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createComentado_porCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("comentado_por"));
	}
	
	public TweetDetachedCriteria createPertenecea_tweetCriteria() {
		return new TweetDetachedCriteria(createCriteria("pertenecea_tweet"));
	}
	
	public AdministradorDetachedCriteria createEs_eliminadoCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("es_eliminado"));
	}
	
	public base_de_datos.DocumentoDetachedCriteria createComentario_contieneCriteria() {
		return new base_de_datos.DocumentoDetachedCriteria(createCriteria("ORM_comentario_contiene"));
	}
	
	public base_de_datos.UsuarioDetachedCriteria createComlikeado_porCriteria() {
		return new base_de_datos.UsuarioDetachedCriteria(createCriteria("ORM_comlikeado_por"));
	}
	
	public Comentario uniqueComentario(PersistentSession session) {
		return (Comentario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comentario[] listComentario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

