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

public class UsuarioAutentificadoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression mail;
	public final StringExpression password;
	
	public UsuarioAutentificadoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		mail = new StringExpression("mail", this);
		password = new StringExpression("password", this);
	}
	
	public UsuarioAutentificadoCriteria(PersistentSession session) {
		this(session.createCriteria(UsuarioAutentificado.class));
	}
	
	public UsuarioAutentificadoCriteria() throws PersistentException {
		this(base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession());
	}
	
	public UsuarioAutentificado uniqueUsuarioAutentificado() {
		return (UsuarioAutentificado) super.uniqueResult();
	}
	
	public UsuarioAutentificado[] listUsuarioAutentificado() {
		java.util.List list = super.list();
		return (UsuarioAutentificado[]) list.toArray(new UsuarioAutentificado[list.size()]);
	}
}

