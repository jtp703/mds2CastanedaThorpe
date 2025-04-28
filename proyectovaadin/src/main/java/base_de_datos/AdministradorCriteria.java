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

public class AdministradorCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression mail;
	public final StringExpression password;
	public final LongExpression idAdministrador;
	public final CollectionExpression elimina;
	public final CollectionExpression administrador_tweet;
	public final CollectionExpression banea;
	
	public AdministradorCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		mail = new StringExpression("mail", this);
		password = new StringExpression("password", this);
		idAdministrador = new LongExpression("idAdministrador", this);
		elimina = new CollectionExpression("ORM_Elimina", this);
		administrador_tweet = new CollectionExpression("ORM_Administrador_tweet", this);
		banea = new CollectionExpression("ORM_Banea", this);
	}
	
	public AdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador.class));
	}
	
	public AdministradorCriteria() throws PersistentException {
		this(base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession());
	}
	
	public base_de_datos.ComentarioCriteria createEliminaCriteria() {
		return new base_de_datos.ComentarioCriteria(createCriteria("ORM_Elimina"));
	}
	
	public base_de_datos.TweetCriteria createAdministrador_tweetCriteria() {
		return new base_de_datos.TweetCriteria(createCriteria("ORM_Administrador_tweet"));
	}
	
	public base_de_datos.UsuarioCriteria createBaneaCriteria() {
		return new base_de_datos.UsuarioCriteria(createCriteria("ORM_Banea"));
	}
	
	public Administrador uniqueAdministrador() {
		return (Administrador) super.uniqueResult();
	}
	
	public Administrador[] listAdministrador() {
		java.util.List list = super.list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

