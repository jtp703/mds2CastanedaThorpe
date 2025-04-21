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

public class Hashtag {
	public Hashtag() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_HASHTAG_APARECE_EN) {
			return ORM_aparece_en;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private long idHashtag;
	
	private String nombre;
	
	private int numMenciones;
	
	private java.util.Set ORM_aparece_en = new java.util.HashSet();
	
	private void setIdHashtag(long value) {
		this.idHashtag = value;
	}
	
	public long getIdHashtag() {
		return idHashtag;
	}
	
	public long getORMID() {
		return getIdHashtag();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNumMenciones(int value) {
		this.numMenciones = value;
	}
	
	public int getNumMenciones() {
		return numMenciones;
	}
	
	private void setORM_Aparece_en(java.util.Set value) {
		this.ORM_aparece_en = value;
	}
	
	private java.util.Set getORM_Aparece_en() {
		return ORM_aparece_en;
	}
	
	public final base_de_datos.TweetSetCollection aparece_en = new base_de_datos.TweetSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_HASHTAG_APARECE_EN, base_de_datos.ORMConstants.KEY_TWEET_CONTIENE, base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdHashtag());
	}
	
}
