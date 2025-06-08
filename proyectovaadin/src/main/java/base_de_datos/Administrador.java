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
@Table(name="Administrador")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioAutentificadoID", referencedColumnName="ID")
public class Administrador extends base_de_datos.UsuarioAutentificado implements Serializable {
	public Administrador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == base_de_datos.ORMConstants.KEY_ADMINISTRADOR_ELIMINA) {
			return ORM_elimina;
		}
		else if (key == base_de_datos.ORMConstants.KEY_ADMINISTRADOR_ELIMINA_TWEET) {
			return ORM_elimina_tweet;
		}
		else if (key == base_de_datos.ORMConstants.KEY_ADMINISTRADOR_BANEA) {
			return ORM_banea;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="es_eliminado", targetEntity=base_de_datos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_elimina = new java.util.HashSet();
	
	@OneToMany(mappedBy="es_eliminado", targetEntity=base_de_datos.Tweet.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_elimina_tweet = new java.util.HashSet();
	
	@OneToMany(mappedBy="es_baneado", targetEntity=base_de_datos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_banea = new java.util.HashSet();
	
	private void setORM_Elimina(java.util.Set value) {
		this.ORM_elimina = value;
	}
	
	private java.util.Set getORM_Elimina() {
		return ORM_elimina;
	}
	
	@Transient	
	public final base_de_datos.ComentarioSetCollection elimina = new base_de_datos.ComentarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_ADMINISTRADOR_ELIMINA, base_de_datos.ORMConstants.KEY_COMENTARIO_ES_ELIMINADO, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Elimina_tweet(java.util.Set value) {
		this.ORM_elimina_tweet = value;
	}
	
	private java.util.Set getORM_Elimina_tweet() {
		return ORM_elimina_tweet;
	}
	
	@Transient	
	public final base_de_datos.TweetSetCollection elimina_tweet = new base_de_datos.TweetSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_ADMINISTRADOR_ELIMINA_TWEET, base_de_datos.ORMConstants.KEY_TWEET_ES_ELIMINADO, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Banea(java.util.Set value) {
		this.ORM_banea = value;
	}
	
	private java.util.Set getORM_Banea() {
		return ORM_banea;
	}
	
	@Transient	
	public final base_de_datos.UsuarioSetCollection banea = new base_de_datos.UsuarioSetCollection(this, _ormAdapter, base_de_datos.ORMConstants.KEY_ADMINISTRADOR_BANEA, base_de_datos.ORMConstants.KEY_USUARIO_ES_BANEADO, base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
