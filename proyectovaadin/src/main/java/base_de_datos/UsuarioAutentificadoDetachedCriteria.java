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

public class UsuarioAutentificadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression mail;
	public final StringExpression password;
	
	public UsuarioAutentificadoDetachedCriteria() {
		super(base_de_datos.UsuarioAutentificado.class, base_de_datos.UsuarioAutentificadoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public UsuarioAutentificadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.UsuarioAutentificadoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public UsuarioAutentificado uniqueUsuarioAutentificado(PersistentSession session) {
		return (UsuarioAutentificado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public UsuarioAutentificado[] listUsuarioAutentificado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (UsuarioAutentificado[]) list.toArray(new UsuarioAutentificado[list.size()]);
	}
}

