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

public class UsuarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression mail;
	public final StringExpression password;
	public final IntegerExpression idUsuario;
	public final StringExpression nick;
	public final StringExpression fotoFondo;
	public final StringExpression fotoPerfil;
	public final StringExpression descripcion;
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
	
	public UsuarioCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		mail = new StringExpression("mail", this);
		password = new StringExpression("password", this);
		idUsuario = new IntegerExpression("idUsuario", this);
		nick = new StringExpression("nick", this);
		fotoFondo = new StringExpression("fotoFondo", this);
		fotoPerfil = new StringExpression("fotoPerfil", this);
		descripcion = new StringExpression("descripcion", this);
		es_baneadoId = new IntegerExpression("es_baneado.", this);
		es_baneado = new AssociationExpression("es_baneado", this);
		bloquea = new CollectionExpression("ORM_bloquea", this);
		sigue = new CollectionExpression("ORM_sigue", this);
		tweetea = new CollectionExpression("ORM_tweetea", this);
		es_bloqueado = new CollectionExpression("ORM_es_bloqueado", this);
		es_seguido = new CollectionExpression("ORM_es_seguido", this);
		publica_comentario = new CollectionExpression("ORM_publica_comentario", this);
		retweetea = new CollectionExpression("ORM_retweetea", this);
		likea = new CollectionExpression("ORM_likea", this);
		likea_comentario = new CollectionExpression("ORM_likea_comentario", this);
	}
	
	public UsuarioCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario.class));
	}
	
	public UsuarioCriteria() throws PersistentException {
		this(base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createEs_baneadoCriteria() {
		return new AdministradorCriteria(createCriteria("es_baneado"));
	}
	
	public base_de_datos.UsuarioCriteria createBloqueaCriteria() {
		return new base_de_datos.UsuarioCriteria(createCriteria("ORM_bloquea"));
	}
	
	public base_de_datos.UsuarioCriteria createSigueCriteria() {
		return new base_de_datos.UsuarioCriteria(createCriteria("ORM_sigue"));
	}
	
	public base_de_datos.TweetCriteria createTweeteaCriteria() {
		return new base_de_datos.TweetCriteria(createCriteria("ORM_tweetea"));
	}
	
	public base_de_datos.UsuarioCriteria createEs_bloqueadoCriteria() {
		return new base_de_datos.UsuarioCriteria(createCriteria("ORM_es_bloqueado"));
	}
	
	public base_de_datos.UsuarioCriteria createEs_seguidoCriteria() {
		return new base_de_datos.UsuarioCriteria(createCriteria("ORM_es_seguido"));
	}
	
	public base_de_datos.ComentarioCriteria createPublica_comentarioCriteria() {
		return new base_de_datos.ComentarioCriteria(createCriteria("ORM_publica_comentario"));
	}
	
	public base_de_datos.TweetCriteria createRetweeteaCriteria() {
		return new base_de_datos.TweetCriteria(createCriteria("ORM_retweetea"));
	}
	
	public base_de_datos.TweetCriteria createLikeaCriteria() {
		return new base_de_datos.TweetCriteria(createCriteria("ORM_likea"));
	}
	
	public base_de_datos.ComentarioCriteria createLikea_comentarioCriteria() {
		return new base_de_datos.ComentarioCriteria(createCriteria("ORM_likea_comentario"));
	}
	
	public Usuario uniqueUsuario() {
		return (Usuario) super.uniqueResult();
	}
	
	public Usuario[] listUsuario() {
		java.util.List list = super.list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

