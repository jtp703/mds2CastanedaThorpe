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
	
	public ComentarioCriteria(Criteria criteria) {
		super(criteria);
		idComentario = new LongExpression("idComentario", this);
		comentario_usuarioId = new IntegerExpression("comentario_usuario.", this);
		comentario_usuario = new AssociationExpression("comentario_usuario", this);
		comentario_tweetId = new IntegerExpression("comentario_tweet.ID", this);
		comentario_tweet = new AssociationExpression("comentario_tweet", this);
		es_eliminadoId = new IntegerExpression("es_eliminado.", this);
		es_eliminado = new AssociationExpression("es_eliminado", this);
		texto = new StringExpression("texto", this);
		foto_video = new StringExpression("foto_video", this);
		numMegustas = new IntegerExpression("numMegustas", this);
		comentario_contiene = new CollectionExpression("ORM_Comentario_contiene", this);
	}
	
	public ComentarioCriteria(PersistentSession session) {
		this(session.createCriteria(Comentario.class));
	}
	
	public ComentarioCriteria() throws PersistentException {
		this(base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createComentario_usuarioCriteria() {
		return new UsuarioCriteria(createCriteria("comentario_usuario"));
	}
	
	public TweetCriteria createComentario_tweetCriteria() {
		return new TweetCriteria(createCriteria("comentario_tweet"));
	}
	
	public AdministradorCriteria createEs_eliminadoCriteria() {
		return new AdministradorCriteria(createCriteria("es_eliminado"));
	}
	
	public base_de_datos.DocumentoCriteria createComentario_contieneCriteria() {
		return new base_de_datos.DocumentoCriteria(createCriteria("ORM_Comentario_contiene"));
	}
	
	public Comentario uniqueComentario() {
		return (Comentario) super.uniqueResult();
	}
	
	public Comentario[] listComentario() {
		java.util.List list = super.list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

