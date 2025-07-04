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

public class HashtagDAO {
	public static Hashtag loadHashtagByORMID(int idHashtag) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadHashtagByORMID(session, idHashtag);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag getHashtagByORMID(int idHashtag) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return getHashtagByORMID(session, idHashtag);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag loadHashtagByORMID(int idHashtag, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadHashtagByORMID(session, idHashtag, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag getHashtagByORMID(int idHashtag, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return getHashtagByORMID(session, idHashtag, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag loadHashtagByORMID(PersistentSession session, int idHashtag) throws PersistentException {
		try {
			return (Hashtag) session.load(base_de_datos.Hashtag.class, Integer.valueOf(idHashtag));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag getHashtagByORMID(PersistentSession session, int idHashtag) throws PersistentException {
		try {
			return (Hashtag) session.get(base_de_datos.Hashtag.class, Integer.valueOf(idHashtag));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag loadHashtagByORMID(PersistentSession session, int idHashtag, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hashtag) session.load(base_de_datos.Hashtag.class, Integer.valueOf(idHashtag), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag getHashtagByORMID(PersistentSession session, int idHashtag, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hashtag) session.get(base_de_datos.Hashtag.class, Integer.valueOf(idHashtag), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHashtag(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return queryHashtag(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHashtag(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return queryHashtag(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag[] listHashtagByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return listHashtagByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag[] listHashtagByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return listHashtagByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHashtag(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Hashtag as Hashtag");
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
	
	public static List queryHashtag(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Hashtag as Hashtag");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Hashtag", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag[] listHashtagByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHashtag(session, condition, orderBy);
			return (Hashtag[]) list.toArray(new Hashtag[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag[] listHashtagByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHashtag(session, condition, orderBy, lockMode);
			return (Hashtag[]) list.toArray(new Hashtag[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag loadHashtagByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadHashtagByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag loadHashtagByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadHashtagByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag loadHashtagByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Hashtag[] hashtags = listHashtagByQuery(session, condition, orderBy);
		if (hashtags != null && hashtags.length > 0)
			return hashtags[0];
		else
			return null;
	}
	
	public static Hashtag loadHashtagByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Hashtag[] hashtags = listHashtagByQuery(session, condition, orderBy, lockMode);
		if (hashtags != null && hashtags.length > 0)
			return hashtags[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHashtagByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return iterateHashtagByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHashtagByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return iterateHashtagByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHashtagByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Hashtag as Hashtag");
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
	
	public static java.util.Iterator iterateHashtagByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Hashtag as Hashtag");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Hashtag", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag createHashtag() {
		return new base_de_datos.Hashtag();
	}
	
	public static boolean save(base_de_datos.Hashtag hashtag) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().saveObject(hashtag);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(base_de_datos.Hashtag hashtag) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().deleteObject(hashtag);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Hashtag hashtag)throws PersistentException {
		try {
			base_de_datos.Tweet[] lAparece_ens = hashtag.aparece_en.toArray();
			for(int i = 0; i < lAparece_ens.length; i++) {
				lAparece_ens[i].contiene.remove(hashtag);
			}
			return delete(hashtag);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Hashtag hashtag, org.orm.PersistentSession session)throws PersistentException {
		try {
			base_de_datos.Tweet[] lAparece_ens = hashtag.aparece_en.toArray();
			for(int i = 0; i < lAparece_ens.length; i++) {
				lAparece_ens[i].contiene.remove(hashtag);
			}
			try {
				session.delete(hashtag);
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
	
	public static boolean refresh(base_de_datos.Hashtag hashtag) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession().refresh(hashtag);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(base_de_datos.Hashtag hashtag) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession().evict(hashtag);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hashtag loadHashtagByCriteria(HashtagCriteria hashtagCriteria) {
		Hashtag[] hashtags = listHashtagByCriteria(hashtagCriteria);
		if(hashtags == null || hashtags.length == 0) {
			return null;
		}
		return hashtags[0];
	}
	
	public static Hashtag[] listHashtagByCriteria(HashtagCriteria hashtagCriteria) {
		return hashtagCriteria.listHashtag();
	}
}
