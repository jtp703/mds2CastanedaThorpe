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

public class DocumentoDAO {
	public static Documento loadDocumentoByORMID(int idDocumento) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadDocumentoByORMID(session, idDocumento);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento getDocumentoByORMID(int idDocumento) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return getDocumentoByORMID(session, idDocumento);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento loadDocumentoByORMID(int idDocumento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadDocumentoByORMID(session, idDocumento, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento getDocumentoByORMID(int idDocumento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return getDocumentoByORMID(session, idDocumento, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento loadDocumentoByORMID(PersistentSession session, int idDocumento) throws PersistentException {
		try {
			return (Documento) session.load(base_de_datos.Documento.class, Integer.valueOf(idDocumento));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento getDocumentoByORMID(PersistentSession session, int idDocumento) throws PersistentException {
		try {
			return (Documento) session.get(base_de_datos.Documento.class, Integer.valueOf(idDocumento));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento loadDocumentoByORMID(PersistentSession session, int idDocumento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Documento) session.load(base_de_datos.Documento.class, Integer.valueOf(idDocumento), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento getDocumentoByORMID(PersistentSession session, int idDocumento, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Documento) session.get(base_de_datos.Documento.class, Integer.valueOf(idDocumento), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDocumento(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return queryDocumento(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDocumento(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return queryDocumento(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento[] listDocumentoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return listDocumentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento[] listDocumentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return listDocumentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDocumento(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Documento as Documento");
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
	
	public static List queryDocumento(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Documento as Documento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Documento", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento[] listDocumentoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDocumento(session, condition, orderBy);
			return (Documento[]) list.toArray(new Documento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento[] listDocumentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDocumento(session, condition, orderBy, lockMode);
			return (Documento[]) list.toArray(new Documento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento loadDocumentoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadDocumentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento loadDocumentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadDocumentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento loadDocumentoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Documento[] documentos = listDocumentoByQuery(session, condition, orderBy);
		if (documentos != null && documentos.length > 0)
			return documentos[0];
		else
			return null;
	}
	
	public static Documento loadDocumentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Documento[] documentos = listDocumentoByQuery(session, condition, orderBy, lockMode);
		if (documentos != null && documentos.length > 0)
			return documentos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDocumentoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return iterateDocumentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDocumentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return iterateDocumentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDocumentoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Documento as Documento");
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
	
	public static java.util.Iterator iterateDocumentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Documento as Documento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Documento", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento createDocumento() {
		return new base_de_datos.Documento();
	}
	
	public static boolean save(base_de_datos.Documento documento) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().saveObject(documento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(base_de_datos.Documento documento) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().deleteObject(documento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Documento documento)throws PersistentException {
		try {
			if (documento.getPertenecea_comentario() != null) {
				documento.getPertenecea_comentario().comentario_contiene.remove(documento);
			}
			
			if (documento.getPertenecea_tweet() != null) {
				documento.getPertenecea_tweet().tweet_contiene.remove(documento);
			}
			
			return delete(documento);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Documento documento, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (documento.getPertenecea_comentario() != null) {
				documento.getPertenecea_comentario().comentario_contiene.remove(documento);
			}
			
			if (documento.getPertenecea_tweet() != null) {
				documento.getPertenecea_tweet().tweet_contiene.remove(documento);
			}
			
			try {
				session.delete(documento);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(base_de_datos.Documento documento) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession().refresh(documento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(base_de_datos.Documento documento) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession().evict(documento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Documento loadDocumentoByCriteria(DocumentoCriteria documentoCriteria) {
		Documento[] documentos = listDocumentoByCriteria(documentoCriteria);
		if(documentos == null || documentos.length == 0) {
			return null;
		}
		return documentos[0];
	}
	
	public static Documento[] listDocumentoByCriteria(DocumentoCriteria documentoCriteria) {
		return documentoCriteria.listDocumento();
	}
}
