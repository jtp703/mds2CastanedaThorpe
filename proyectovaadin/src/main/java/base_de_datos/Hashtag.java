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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Hashtag")
public class Hashtag implements Serializable {
	public Hashtag() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_HASHTAG_APARECE_EN) {
			return ORM_aparece_en;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IdHashtag", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASE_DE_DATOS_HASHTAG_IDHASHTAG_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASE_DE_DATOS_HASHTAG_IDHASHTAG_GENERATOR", strategy="native")	
	private int idHashtag;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@ManyToMany(mappedBy="ORM_contiene", targetEntity=base_de_datos.Tweet.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_aparece_en = new java.util.HashSet();
	
	private void setIdHashtag(int value) {
		this.idHashtag = value;
	}
	
	public int getIdHashtag() {
		return idHashtag;
	}
	
	public int getORMID() {
		return getIdHashtag();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Aparece_en(java.util.Set value) {
		this.ORM_aparece_en = value;
	}
	
	private java.util.Set getORM_Aparece_en() {
		return ORM_aparece_en;
	}
	
	@Transient	
	public final base_de_datos.TweetSetCollection aparece_en = new base_de_datos.TweetSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_HASHTAG_APARECE_EN, base_de_datos.ORMConstants.KEY_TWEET_CONTIENE, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdHashtag());
	}
	
}
