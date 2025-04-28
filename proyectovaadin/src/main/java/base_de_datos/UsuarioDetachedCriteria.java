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
	public final LongExpression idUsuario;
	public final StringExpression nick;
	public final StringExpression fotoFondo;
	public final StringExpression fotoPerfil;
	public final StringExpression descripcion;
	public final IntegerExpression es_baneadoId;
	public final AssociationExpression es_baneado;
	public final CollectionExpression bloquea;
	public final CollectionExpression sigue;
	public final CollectionExpression publica;
	public final CollectionExpression es_bloqueado;
	public final CollectionExpression es_seguido;
	public final CollectionExpression publica_comentario;
	
	public UsuarioDetachedCriteria() {
		super(base_de_datos.Usuario.class, base_de_datos.UsuarioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		idUsuario = new LongExpression("idUsuario", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		fotoFondo = new StringExpression("fotoFondo", this.getDetachedCriteria());
		fotoPerfil = new StringExpression("fotoPerfil", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		es_baneadoId = new IntegerExpression("es_baneado.", this.getDetachedCriteria());
		es_baneado = new AssociationExpression("es_baneado", this.getDetachedCriteria());
		bloquea = new CollectionExpression("ORM_Bloquea", this.getDetachedCriteria());
		sigue = new CollectionExpression("ORM_Sigue", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_Publica", this.getDetachedCriteria());
		es_bloqueado = new CollectionExpression("ORM_Es_bloqueado", this.getDetachedCriteria());
		es_seguido = new CollectionExpression("ORM_Es_seguido", this.getDetachedCriteria());
		publica_comentario = new CollectionExpression("ORM_Publica_comentario", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.UsuarioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		idUsuario = new LongExpression("idUsuario", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		fotoFondo = new StringExpression("fotoFondo", this.getDetachedCriteria());
		fotoPerfil = new StringExpression("fotoPerfil", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		es_baneadoId = new IntegerExpression("es_baneado.", this.getDetachedCriteria());
		es_baneado = new AssociationExpression("es_baneado", this.getDetachedCriteria());
		bloquea = new CollectionExpression("ORM_Bloquea", this.getDetachedCriteria());
		sigue = new CollectionExpression("ORM_Sigue", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_Publica", this.getDetachedCriteria());
		es_bloqueado = new CollectionExpression("ORM_Es_bloqueado", this.getDetachedCriteria());
		es_seguido = new CollectionExpression("ORM_Es_seguido", this.getDetachedCriteria());
		publica_comentario = new CollectionExpression("ORM_Publica_comentario", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createEs_baneadoCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("es_baneado"));
	}
	
	public base_de_datos.UsuarioDetachedCriteria createBloqueaCriteria() {
		return new base_de_datos.UsuarioDetachedCriteria(createCriteria("ORM_Bloquea"));
	}
	
	public base_de_datos.UsuarioDetachedCriteria createSigueCriteria() {
		return new base_de_datos.UsuarioDetachedCriteria(createCriteria("ORM_Sigue"));
	}
	
	public base_de_datos.TweetDetachedCriteria createPublicaCriteria() {
		return new base_de_datos.TweetDetachedCriteria(createCriteria("ORM_Publica"));
	}
	
	public base_de_datos.UsuarioDetachedCriteria createEs_bloqueadoCriteria() {
		return new base_de_datos.UsuarioDetachedCriteria(createCriteria("ORM_Es_bloqueado"));
	}
	
	public base_de_datos.UsuarioDetachedCriteria createEs_seguidoCriteria() {
		return new base_de_datos.UsuarioDetachedCriteria(createCriteria("ORM_Es_seguido"));
	}
	
	public base_de_datos.ComentarioDetachedCriteria createPublica_comentarioCriteria() {
		return new base_de_datos.ComentarioDetachedCriteria(createCriteria("ORM_Publica_comentario"));
	}
	
	public Usuario uniqueUsuario(PersistentSession session) {
		return (Usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario[] listUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

