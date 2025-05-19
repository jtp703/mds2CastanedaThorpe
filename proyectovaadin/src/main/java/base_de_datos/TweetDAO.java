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

public class TweetDAO {
	public static Tweet loadTweetByORMID(int idTweet) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadTweetByORMID(session, idTweet);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet getTweetByORMID(int idTweet) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return getTweetByORMID(session, idTweet);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByORMID(int idTweet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadTweetByORMID(session, idTweet, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet getTweetByORMID(int idTweet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return getTweetByORMID(session, idTweet, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByORMID(PersistentSession session, int idTweet) throws PersistentException {
		try {
			return (Tweet) session.load(base_de_datos.Tweet.class, Integer.valueOf(idTweet));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet getTweetByORMID(PersistentSession session, int idTweet) throws PersistentException {
		try {
			return (Tweet) session.get(base_de_datos.Tweet.class, Integer.valueOf(idTweet));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByORMID(PersistentSession session, int idTweet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tweet) session.load(base_de_datos.Tweet.class, Integer.valueOf(idTweet), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet getTweetByORMID(PersistentSession session, int idTweet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tweet) session.get(base_de_datos.Tweet.class, Integer.valueOf(idTweet), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTweet(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return queryTweet(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTweet(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return queryTweet(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet[] listTweetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return listTweetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet[] listTweetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return listTweetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTweet(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Tweet as Tweet");
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
	
	public static List queryTweet(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Tweet as Tweet");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tweet", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet[] listTweetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTweet(session, condition, orderBy);
			return (Tweet[]) list.toArray(new Tweet[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet[] listTweetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTweet(session, condition, orderBy, lockMode);
			return (Tweet[]) list.toArray(new Tweet[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadTweetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return loadTweetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tweet[] tweets = listTweetByQuery(session, condition, orderBy);
		if (tweets != null && tweets.length > 0)
			return tweets[0];
		else
			return null;
	}
	
	public static Tweet loadTweetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tweet[] tweets = listTweetByQuery(session, condition, orderBy, lockMode);
		if (tweets != null && tweets.length > 0)
			return tweets[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTweetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return iterateTweetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTweetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession();
			return iterateTweetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTweetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Tweet as Tweet");
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
	
	public static java.util.Iterator iterateTweetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Tweet as Tweet");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tweet", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet createTweet() {
		return new base_de_datos.Tweet();
	}
	
	public static boolean save(base_de_datos.Tweet tweet) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().saveObject(tweet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(base_de_datos.Tweet tweet) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().deleteObject(tweet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Tweet tweet)throws PersistentException {
		try {
			if (tweet.getTweet() != null) {
				tweet.getTweet().retweet.remove(tweet);
			}
			
			if (tweet.getTweeteado_por() != null) {
				tweet.getTweeteado_por().tweetea.remove(tweet);
			}
			
			if (tweet.getEs_eliminado() != null) {
				tweet.getEs_eliminado().elimina_tweet.remove(tweet);
			}
			
			base_de_datos.Hashtag[] lContienes = tweet.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].aparece_en.remove(tweet);
			}
			base_de_datos.Tweet[] lRetweets = tweet.retweet.toArray();
			for(int i = 0; i < lRetweets.length; i++) {
				lRetweets[i].setTweet(null);
			}
			base_de_datos.Usuario[] lReetweteado_pors = tweet.reetweteado_por.toArray();
			for(int i = 0; i < lReetweteado_pors.length; i++) {
				lReetweteado_pors[i].retweetea.remove(tweet);
			}
			base_de_datos.Usuario[] lLikeado_pors = tweet.likeado_por.toArray();
			for(int i = 0; i < lLikeado_pors.length; i++) {
				lLikeado_pors[i].likea.remove(tweet);
			}
			base_de_datos.Comentario[] lTiene_comentarios = tweet.tiene_comentario.toArray();
			for(int i = 0; i < lTiene_comentarios.length; i++) {
				lTiene_comentarios[i].setPertenecea_tweet(null);
			}
			base_de_datos.Documento[] lTweet_contienes = tweet.tweet_contiene.toArray();
			for(int i = 0; i < lTweet_contienes.length; i++) {
				lTweet_contienes[i].setPertenecea_tweet(null);
			}
			return delete(tweet);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Tweet tweet, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (tweet.getTweet() != null) {
				tweet.getTweet().retweet.remove(tweet);
			}
			
			if (tweet.getTweeteado_por() != null) {
				tweet.getTweeteado_por().tweetea.remove(tweet);
			}
			
			if (tweet.getEs_eliminado() != null) {
				tweet.getEs_eliminado().elimina_tweet.remove(tweet);
			}
			
			base_de_datos.Hashtag[] lContienes = tweet.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].aparece_en.remove(tweet);
			}
			base_de_datos.Tweet[] lRetweets = tweet.retweet.toArray();
			for(int i = 0; i < lRetweets.length; i++) {
				lRetweets[i].setTweet(null);
			}
			base_de_datos.Usuario[] lReetweteado_pors = tweet.reetweteado_por.toArray();
			for(int i = 0; i < lReetweteado_pors.length; i++) {
				lReetweteado_pors[i].retweetea.remove(tweet);
			}
			base_de_datos.Usuario[] lLikeado_pors = tweet.likeado_por.toArray();
			for(int i = 0; i < lLikeado_pors.length; i++) {
				lLikeado_pors[i].likea.remove(tweet);
			}
			base_de_datos.Comentario[] lTiene_comentarios = tweet.tiene_comentario.toArray();
			for(int i = 0; i < lTiene_comentarios.length; i++) {
				lTiene_comentarios[i].setPertenecea_tweet(null);
			}
			base_de_datos.Documento[] lTweet_contienes = tweet.tweet_contiene.toArray();
			for(int i = 0; i < lTweet_contienes.length; i++) {
				lTweet_contienes[i].setPertenecea_tweet(null);
			}
			try {
				session.delete(tweet);
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
	
	public static boolean refresh(base_de_datos.Tweet tweet) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession().refresh(tweet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(base_de_datos.Tweet tweet) throws PersistentException {
		try {
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession().evict(tweet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByCriteria(TweetCriteria tweetCriteria) {
		Tweet[] tweets = listTweetByCriteria(tweetCriteria);
		if(tweets == null || tweets.length == 0) {
			return null;
		}
		return tweets[0];
	}
	
	public static Tweet[] listTweetByCriteria(TweetCriteria tweetCriteria) {
		return tweetCriteria.listTweet();
	}
}
