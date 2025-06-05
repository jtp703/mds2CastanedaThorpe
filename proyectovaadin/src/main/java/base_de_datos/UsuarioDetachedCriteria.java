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

public class UsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression mail;
	public final StringExpression password;
	public final StringExpression nick;
	public final StringExpression fotoFondo;
	public final StringExpression fotoPerfil;
	public final StringExpression descripcion;
	public final BooleanExpression baneado;
	public final IntegerExpression es_baneadoId;
	public final AssociationExpression es_baneado;
	public final CollectionExpression bloquea;
	public final CollectionExpression sigue;
	public final CollectionExpression tweetea;
	public final CollectionExpression es_bloqueado;
	public final CollectionExpression es_seguido;
	public final CollectionExpression publica_comentario;
	public final CollectionExpression retweetea;
	public final CollectionExpression likea;
	public final CollectionExpression likea_comentario;
	
	public UsuarioDetachedCriteria() {
		super(base_de_datos.Usuario.class, base_de_datos.UsuarioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		fotoFondo = new StringExpression("fotoFondo", this.getDetachedCriteria());
		fotoPerfil = new StringExpression("fotoPerfil", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		baneado = new BooleanExpression("baneado", this.getDetachedCriteria());
		es_baneadoId = new IntegerExpression("es_baneado.", this.getDetachedCriteria());
		es_baneado = new AssociationExpression("es_baneado", this.getDetachedCriteria());
		bloquea = new CollectionExpression("ORM_bloquea", this.getDetachedCriteria());
		sigue = new CollectionExpression("ORM_sigue", this.getDetachedCriteria());
		tweetea = new CollectionExpression("ORM_tweetea", this.getDetachedCriteria());
		es_bloqueado = new CollectionExpression("ORM_es_bloqueado", this.getDetachedCriteria());
		es_seguido = new CollectionExpression("ORM_es_seguido", this.getDetachedCriteria());
		publica_comentario = new CollectionExpression("ORM_publica_comentario", this.getDetachedCriteria());
		retweetea = new CollectionExpression("ORM_retweetea", this.getDetachedCriteria());
		likea = new CollectionExpression("ORM_likea", this.getDetachedCriteria());
		likea_comentario = new CollectionExpression("ORM_likea_comentario", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.UsuarioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		fotoFondo = new StringExpression("fotoFondo", this.getDetachedCriteria());
		fotoPerfil = new StringExpression("fotoPerfil", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		baneado = new BooleanExpression("baneado", this.getDetachedCriteria());
		es_baneadoId = new IntegerExpression("es_baneado.", this.getDetachedCriteria());
		es_baneado = new AssociationExpression("es_baneado", this.getDetachedCriteria());
		bloquea = new CollectionExpression("ORM_bloquea", this.getDetachedCriteria());
		sigue = new CollectionExpression("ORM_sigue", this.getDetachedCriteria());
		tweetea = new CollectionExpression("ORM_tweetea", this.getDetachedCriteria());
		es_bloqueado = new CollectionExpression("ORM_es_bloqueado", this.getDetachedCriteria());
		es_seguido = new CollectionExpression("ORM_es_seguido", this.getDetachedCriteria());
		publica_comentario = new CollectionExpression("ORM_publica_comentario", this.getDetachedCriteria());
		retweetea = new CollectionExpression("ORM_retweetea", this.getDetachedCriteria());
		likea = new CollectionExpression("ORM_likea", this.getDetachedCriteria());
		likea_comentario = new CollectionExpression("ORM_likea_comentario", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createEs_baneadoCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("es_baneado"));
	}
	
	public base_de_datos.UsuarioDetachedCriteria createBloqueaCriteria() {
		return new base_de_datos.UsuarioDetachedCriteria(createCriteria("ORM_bloquea"));
	}
	
	public base_de_datos.UsuarioDetachedCriteria createSigueCriteria() {
		return new base_de_datos.UsuarioDetachedCriteria(createCriteria("ORM_sigue"));
	}
	
	public base_de_datos.TweetDetachedCriteria createTweeteaCriteria() {
		return new base_de_datos.TweetDetachedCriteria(createCriteria("ORM_tweetea"));
	}
	
	public base_de_datos.UsuarioDetachedCriteria createEs_bloqueadoCriteria() {
		return new base_de_datos.UsuarioDetachedCriteria(createCriteria("ORM_es_bloqueado"));
	}
	
	public base_de_datos.UsuarioDetachedCriteria createEs_seguidoCriteria() {
		return new base_de_datos.UsuarioDetachedCriteria(createCriteria("ORM_es_seguido"));
	}
	
	public base_de_datos.ComentarioDetachedCriteria createPublica_comentarioCriteria() {
		return new base_de_datos.ComentarioDetachedCriteria(createCriteria("ORM_publica_comentario"));
	}
	
	public base_de_datos.TweetDetachedCriteria createRetweeteaCriteria() {
		return new base_de_datos.TweetDetachedCriteria(createCriteria("ORM_retweetea"));
	}
	
	public base_de_datos.TweetDetachedCriteria createLikeaCriteria() {
		return new base_de_datos.TweetDetachedCriteria(createCriteria("ORM_likea"));
	}
	
	public base_de_datos.ComentarioDetachedCriteria createLikea_comentarioCriteria() {
		return new base_de_datos.ComentarioDetachedCriteria(createCriteria("ORM_likea_comentario"));
	}
	
	public Usuario uniqueUsuario(PersistentSession session) {
		return (Usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario[] listUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

