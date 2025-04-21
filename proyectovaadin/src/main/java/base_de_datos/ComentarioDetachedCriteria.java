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
	public final LongExpression idComentario;
	public final IntegerExpression comentario_usuarioId;
	public final AssociationExpression comentario_usuario;
	public final IntegerExpression comentario_tweetId;
	public final AssociationExpression comentario_tweet;
	public final IntegerExpression es_eliminadoId;
	public final AssociationExpression es_eliminado;
	public final StringExpression texto;
	public final StringExpression foto_video;
	public final IntegerExpression numMegustas;
	public final CollectionExpression comentario_contiene;
	
	public ComentarioDetachedCriteria() {
		super(base_de_datos.Comentario.class, base_de_datos.ComentarioCriteria.class);
		idComentario = new LongExpression("idComentario", this.getDetachedCriteria());
		comentario_usuarioId = new IntegerExpression("comentario_usuario.", this.getDetachedCriteria());
		comentario_usuario = new AssociationExpression("comentario_usuario", this.getDetachedCriteria());
		comentario_tweetId = new IntegerExpression("comentario_tweet.ID", this.getDetachedCriteria());
		comentario_tweet = new AssociationExpression("comentario_tweet", this.getDetachedCriteria());
		es_eliminadoId = new IntegerExpression("es_eliminado.", this.getDetachedCriteria());
		es_eliminado = new AssociationExpression("es_eliminado", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		foto_video = new StringExpression("foto_video", this.getDetachedCriteria());
		numMegustas = new IntegerExpression("numMegustas", this.getDetachedCriteria());
		comentario_contiene = new CollectionExpression("ORM_Comentario_contiene", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.ComentarioCriteria.class);
		idComentario = new LongExpression("idComentario", this.getDetachedCriteria());
		comentario_usuarioId = new IntegerExpression("comentario_usuario.", this.getDetachedCriteria());
		comentario_usuario = new AssociationExpression("comentario_usuario", this.getDetachedCriteria());
		comentario_tweetId = new IntegerExpression("comentario_tweet.ID", this.getDetachedCriteria());
		comentario_tweet = new AssociationExpression("comentario_tweet", this.getDetachedCriteria());
		es_eliminadoId = new IntegerExpression("es_eliminado.", this.getDetachedCriteria());
		es_eliminado = new AssociationExpression("es_eliminado", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		foto_video = new StringExpression("foto_video", this.getDetachedCriteria());
		numMegustas = new IntegerExpression("numMegustas", this.getDetachedCriteria());
		comentario_contiene = new CollectionExpression("ORM_Comentario_contiene", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createComentario_usuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("comentario_usuario"));
	}
	
	public TweetDetachedCriteria createComentario_tweetCriteria() {
		return new TweetDetachedCriteria(createCriteria("comentario_tweet"));
	}
	
	public AdministradorDetachedCriteria createEs_eliminadoCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("es_eliminado"));
	}
	
	public base_de_datos.DocumentoDetachedCriteria createComentario_contieneCriteria() {
		return new base_de_datos.DocumentoDetachedCriteria(createCriteria("ORM_Comentario_contiene"));
	}
	
	public Comentario uniqueComentario(PersistentSession session) {
		return (Comentario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comentario[] listComentario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

