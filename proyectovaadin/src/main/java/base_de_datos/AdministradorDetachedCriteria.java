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

public class AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression mail;
	public final StringExpression password;
	public final CollectionExpression elimina;
	public final CollectionExpression elimina_tweet;
	public final CollectionExpression banea;
	
	public AdministradorDetachedCriteria() {
		super(base_de_datos.Administrador.class, base_de_datos.AdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		elimina = new CollectionExpression("ORM_elimina", this.getDetachedCriteria());
		elimina_tweet = new CollectionExpression("ORM_elimina_tweet", this.getDetachedCriteria());
		banea = new CollectionExpression("ORM_banea", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.AdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		elimina = new CollectionExpression("ORM_elimina", this.getDetachedCriteria());
		elimina_tweet = new CollectionExpression("ORM_elimina_tweet", this.getDetachedCriteria());
		banea = new CollectionExpression("ORM_banea", this.getDetachedCriteria());
	}
	
	public base_de_datos.ComentarioDetachedCriteria createEliminaCriteria() {
		return new base_de_datos.ComentarioDetachedCriteria(createCriteria("ORM_elimina"));
	}
	
	public base_de_datos.TweetDetachedCriteria createElimina_tweetCriteria() {
		return new base_de_datos.TweetDetachedCriteria(createCriteria("ORM_elimina_tweet"));
	}
	
	public base_de_datos.UsuarioDetachedCriteria createBaneaCriteria() {
		return new base_de_datos.UsuarioDetachedCriteria(createCriteria("ORM_banea"));
	}
	
	public Administrador uniqueAdministrador(PersistentSession session) {
		return (Administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador[] listAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

