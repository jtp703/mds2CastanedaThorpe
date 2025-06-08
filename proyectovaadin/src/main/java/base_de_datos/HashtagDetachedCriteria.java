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

public class HashtagDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idHashtag;
	public final StringExpression nombre;
	public final CollectionExpression aparece_en;
	
	public HashtagDetachedCriteria() {
		super(base_de_datos.Hashtag.class, base_de_datos.HashtagCriteria.class);
		idHashtag = new IntegerExpression("idHashtag", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		aparece_en = new CollectionExpression("ORM_aparece_en", this.getDetachedCriteria());
	}
	
	public HashtagDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.HashtagCriteria.class);
		idHashtag = new IntegerExpression("idHashtag", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		aparece_en = new CollectionExpression("ORM_aparece_en", this.getDetachedCriteria());
	}
	
	public base_de_datos.TweetDetachedCriteria createAparece_enCriteria() {
		return new base_de_datos.TweetDetachedCriteria(createCriteria("ORM_aparece_en"));
	}
	
	public Hashtag uniqueHashtag(PersistentSession session) {
		return (Hashtag) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hashtag[] listHashtag(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hashtag[]) list.toArray(new Hashtag[list.size()]);
	}
}

