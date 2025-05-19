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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class UsuarioAutentificadoDAO {
	public static UsuarioAutentificado loadUsuarioAutentificadoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadUsuarioAutentificadoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado getUsuarioAutentificadoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return getUsuarioAutentificadoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado loadUsuarioAutentificadoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadUsuarioAutentificadoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado getUsuarioAutentificadoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return getUsuarioAutentificadoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado loadUsuarioAutentificadoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (UsuarioAutentificado) session.load(base_de_datos.UsuarioAutentificado.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado getUsuarioAutentificadoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (UsuarioAutentificado) session.get(base_de_datos.UsuarioAutentificado.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado loadUsuarioAutentificadoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioAutentificado) session.load(base_de_datos.UsuarioAutentificado.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado getUsuarioAutentificadoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioAutentificado) session.get(base_de_datos.UsuarioAutentificado.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioAutentificado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return queryUsuarioAutentificado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioAutentificado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return queryUsuarioAutentificado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado[] listUsuarioAutentificadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return listUsuarioAutentificadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado[] listUsuarioAutentificadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return listUsuarioAutentificadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioAutentificado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.UsuarioAutentificado as UsuarioAutentificado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioAutentificado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.UsuarioAutentificado as UsuarioAutentificado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioAutentificado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado[] listUsuarioAutentificadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuarioAutentificado(session, condition, orderBy);
			return (UsuarioAutentificado[]) list.toArray(new UsuarioAutentificado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado[] listUsuarioAutentificadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuarioAutentificado(session, condition, orderBy, lockMode);
			return (UsuarioAutentificado[]) list.toArray(new UsuarioAutentificado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado loadUsuarioAutentificadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadUsuarioAutentificadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado loadUsuarioAutentificadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadUsuarioAutentificadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado loadUsuarioAutentificadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UsuarioAutentificado[] usuarioAutentificados = listUsuarioAutentificadoByQuery(session, condition, orderBy);
		if (usuarioAutentificados != null && usuarioAutentificados.length > 0)
			return usuarioAutentificados[0];
		else
			return null;
	}
	
	public static UsuarioAutentificado loadUsuarioAutentificadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UsuarioAutentificado[] usuarioAutentificados = listUsuarioAutentificadoByQuery(session, condition, orderBy, lockMode);
		if (usuarioAutentificados != null && usuarioAutentificados.length > 0)
			return usuarioAutentificados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioAutentificadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return iterateUsuarioAutentificadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioAutentificadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return iterateUsuarioAutentificadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioAutentificadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.UsuarioAutentificado as UsuarioAutentificado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioAutentificadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.UsuarioAutentificado as UsuarioAutentificado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioAutentificado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado createUsuarioAutentificado() {
		return new base_de_datos.UsuarioAutentificado();
	}
	
	public static boolean save(base_de_datos.UsuarioAutentificado usuarioAutentificado) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().saveObject(usuarioAutentificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(base_de_datos.UsuarioAutentificado usuarioAutentificado) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().deleteObject(usuarioAutentificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(base_de_datos.UsuarioAutentificado usuarioAutentificado) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession().refresh(usuarioAutentificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(base_de_datos.UsuarioAutentificado usuarioAutentificado) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession().evict(usuarioAutentificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioAutentificado loadUsuarioAutentificadoByCriteria(UsuarioAutentificadoCriteria usuarioAutentificadoCriteria) {
		UsuarioAutentificado[] usuarioAutentificados = listUsuarioAutentificadoByCriteria(usuarioAutentificadoCriteria);
		if(usuarioAutentificados == null || usuarioAutentificados.length == 0) {
			return null;
		}
		return usuarioAutentificados[0];
	}
	
	public static UsuarioAutentificado[] listUsuarioAutentificadoByCriteria(UsuarioAutentificadoCriteria usuarioAutentificadoCriteria) {
		return usuarioAutentificadoCriteria.listUsuarioAutentificado();
	}
}
