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

public class HashtagCriteria extends AbstractORMCriteria {
	public final IntegerExpression idHashtag;
	public final StringExpression nombre;
	public final IntegerExpression numMenciones;
	public final CollectionExpression aparece_en;
	
	public HashtagCriteria(Criteria criteria) {
		super(criteria);
		idHashtag = new IntegerExpression("idHashtag", this);
		nombre = new StringExpression("nombre", this);
		numMenciones = new IntegerExpression("numMenciones", this);
		aparece_en = new CollectionExpression("ORM_aparece_en", this);
	}
	
	public HashtagCriteria(PersistentSession session) {
		this(session.createCriteria(Hashtag.class));
	}
	
	public HashtagCriteria() throws PersistentException {
		this(base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession());
	}
	
	public base_de_datos.TweetCriteria createAparece_enCriteria() {
		return new base_de_datos.TweetCriteria(createCriteria("ORM_aparece_en"));
	}
	
	public Hashtag uniqueHashtag() {
		return (Hashtag) super.uniqueResult();
	}
	
	public Hashtag[] listHashtag() {
		java.util.List list = super.list();
		return (Hashtag[]) list.toArray(new Hashtag[list.size()]);
	}
}

