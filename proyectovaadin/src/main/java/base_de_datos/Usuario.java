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
import java.util.HashSet;
import javax.persistence.*;

@Entity
@org.hibernate.annotations.Proxy(lazy = false)
@Table(name = "Usuario")
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "UsuarioAutentificadoID", referencedColumnName = "ID")
public class Usuario extends base_de_datos.UsuarioAutentificado implements Serializable {
    public Usuario() {
    }

    private java.util.Set this_getSet(int key) {
        if (key == base_de_datos.ORMConstants.KEY_USUARIO_BLOQUEA) {
            return ORM_bloquea;
        } else if (key == base_de_datos.ORMConstants.KEY_USUARIO_SIGUE) {
            return ORM_sigue;
        } else if (key == base_de_datos.ORMConstants.KEY_USUARIO_TWEETEA) {
            return ORM_tweetea;
        } else if (key == base_de_datos.ORMConstants.KEY_USUARIO_ES_BLOQUEADO) {
            return ORM_es_bloqueado;
        } else if (key == base_de_datos.ORMConstants.KEY_USUARIO_ES_SEGUIDO) {
            return ORM_es_seguido;
        } else if (key == base_de_datos.ORMConstants.KEY_USUARIO_PUBLICA_COMENTARIO) {
            return ORM_publica_comentario;
        } else if (key == base_de_datos.ORMConstants.KEY_USUARIO_RETWEETEA) {
            return ORM_retweetea;
        } else if (key == base_de_datos.ORMConstants.KEY_USUARIO_LIKEA) {
            return ORM_likea;
        } else if (key == base_de_datos.ORMConstants.KEY_USUARIO_LIKEA_COMENTARIO) {
            return ORM_likea_comentario;
        }
        return null;
    }

    private void this_setOwner(Object owner, int key) {
        if (key == base_de_datos.ORMConstants.KEY_USUARIO_ES_BANEADO) {
            this.es_baneado = (base_de_datos.Administrador) owner;
        }
    }

    @Transient
    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public java.util.Set getSet(int key) {
            return this_getSet(key);
        }

        public void setOwner(Object owner, int key) {
            this_setOwner(owner, key);
        }
    };

    @Column(name = "Nick", nullable = true, length = 255)
    private String nick;

    @Column(name = "FotoFondo", nullable = true, length = 255)
    private String fotoFondo;

    @Column(name = "FotoPerfil", nullable = true, length = 255)
    private String fotoPerfil;

    @Column(name = "Descripcion", nullable = true, length = 255)
    private String descripcion;

    @ManyToOne(targetEntity = base_de_datos.Administrador.class, fetch = FetchType.EAGER)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})
    @JoinColumns(value = { @JoinColumn(name = "AdministradorUsuarioAutentificadoID", referencedColumnName = "UsuarioAutentificadoID") }, foreignKey = @ForeignKey(name = "FKUsuario104330"))
    private base_de_datos.Administrador es_baneado;

    @ManyToMany(targetEntity = base_de_datos.Usuario.class, fetch = FetchType.EAGER)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
    @JoinTable(name = "Usuario_Usuario", joinColumns = { @JoinColumn(name = "UsuarioUsuarioAutentificadoID2") }, inverseJoinColumns = { @JoinColumn(name = "UsuarioUsuarioAutentificadoID") })
    private java.util.Set ORM_bloquea = new java.util.HashSet();

    @ManyToMany(targetEntity = base_de_datos.Usuario.class, fetch = FetchType.EAGER)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
    @JoinTable(name = "Usuario_Usuario2", joinColumns = { @JoinColumn(name = "UsuarioUsuarioAutentificadoID2") }, inverseJoinColumns = { @JoinColumn(name = "UsuarioUsuarioAutentificadoID") })
    private java.util.Set ORM_sigue = new java.util.HashSet();

    @OneToMany(mappedBy = "tweeteado_por", targetEntity = base_de_datos.Tweet.class, fetch = FetchType.EAGER)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
    private java.util.Set ORM_tweetea = new java.util.HashSet();

    @ManyToMany(mappedBy = "ORM_bloquea", targetEntity = base_de_datos.Usuario.class, fetch = FetchType.EAGER)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
    private java.util.Set ORM_es_bloqueado = new java.util.HashSet();

    @ManyToMany(mappedBy = "ORM_sigue", targetEntity = base_de_datos.Usuario.class, fetch = FetchType.EAGER)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
    private java.util.Set ORM_es_seguido = new java.util.HashSet();

    @OneToMany(mappedBy = "comentado_por", targetEntity = base_de_datos.Comentario.class, fetch = FetchType.EAGER)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
    private java.util.Set ORM_publica_comentario = new java.util.HashSet();

    @ManyToMany(mappedBy = "ORM_reetweteado_por", targetEntity = base_de_datos.Tweet.class, fetch = FetchType.EAGER)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
    private java.util.Set ORM_retweetea = new java.util.HashSet();

    @ManyToMany(mappedBy = "ORM_likeado_por", targetEntity = base_de_datos.Tweet.class, fetch = FetchType.EAGER)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
    private java.util.Set ORM_likea = new java.util.HashSet();

    @ManyToMany(mappedBy = "ORM_comlikeado_por", targetEntity = base_de_datos.Comentario.class, fetch = FetchType.EAGER)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
    private java.util.Set ORM_likea_comentario = new java.util.HashSet();

    public void setNick(String value) {
        this.nick = value;
    }

    public String getNick() {
        return nick;
    }

    public void setFotoFondo(String value) {
        this.fotoFondo = value;
    }

    public String getFotoFondo() {
        return fotoFondo;
    }

    public void setFotoPerfil(String value) {
        this.fotoPerfil = value;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setEs_baneado(base_de_datos.Administrador value) {
        if (es_baneado != null) {
            es_baneado.banea.remove(this);
        }
        if (value != null) {
            value.banea.add(this);
        }
    }

    public base_de_datos.Administrador getEs_baneado() {
        return es_baneado;
    }

    /** This method is for internal use only. */
    public void setORM_Es_baneado(base_de_datos.Administrador value) {
        this.es_baneado = value;
    }

    private base_de_datos.Administrador getORM_Es_baneado() {
        return es_baneado;
    }

    private void setORM_Bloquea(java.util.Set value) {
        this.ORM_bloquea = value;
    }

    private java.util.Set getORM_Bloquea() {
        return ORM_bloquea;
    }

    @Transient
    public final base_de_datos.UsuarioSetCollection bloquea = new base_de_datos.UsuarioSetCollection(
            this, _ormAdapter,
            base_de_datos.ORMConstants.KEY_USUARIO_BLOQUEA,
            base_de_datos.ORMConstants.KEY_USUARIO_ES_BLOQUEADO,
            base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);

    private void setORM_Sigue(java.util.Set value) {
        this.ORM_sigue = value;
    }

    private java.util.Set getORM_Sigue() {
        return ORM_sigue;
    }

    @Transient
    public final base_de_datos.UsuarioSetCollection sigue = new base_de_datos.UsuarioSetCollection(
            this, _ormAdapter,
            base_de_datos.ORMConstants.KEY_USUARIO_SIGUE,
            base_de_datos.ORMConstants.KEY_USUARIO_ES_SEGUIDO,
            base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);

    private void setORM_Tweetea(java.util.Set value) {
        this.ORM_tweetea = value;
    }

    private java.util.Set getORM_Tweetea() {
        return ORM_tweetea;
    }

    @Transient
    public final base_de_datos.TweetSetCollection tweetea = new base_de_datos.TweetSetCollection(
            this, _ormAdapter,
            base_de_datos.ORMConstants.KEY_USUARIO_TWEETEA,
            base_de_datos.ORMConstants.KEY_TWEET_TWEETEADO_POR,
            base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);

    private void setORM_Es_bloqueado(java.util.Set value) {
        this.ORM_es_bloqueado = value;
    }

    private java.util.Set getORM_Es_bloqueado() {
        return ORM_es_bloqueado;
    }

    @Transient
    public final base_de_datos.UsuarioSetCollection es_bloqueado = new base_de_datos.UsuarioSetCollection(
            this, _ormAdapter,
            base_de_datos.ORMConstants.KEY_USUARIO_ES_BLOQUEADO,
            base_de_datos.ORMConstants.KEY_USUARIO_BLOQUEA,
            base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);

    private void setORM_Es_seguido(java.util.Set value) {
        this.ORM_es_seguido = value;
    }

    private java.util.Set getORM_Es_seguido() {
        return ORM_es_seguido;
    }

    @Transient
    public final base_de_datos.UsuarioSetCollection es_seguido = new base_de_datos.UsuarioSetCollection(
            this, _ormAdapter,
            base_de_datos.ORMConstants.KEY_USUARIO_ES_SEGUIDO,
            base_de_datos.ORMConstants.KEY_USUARIO_SIGUE,
            base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);

    private void setORM_Publica_comentario(java.util.Set value) {
        this.ORM_publica_comentario = value;
    }

    private java.util.Set getORM_Publica_comentario() {
        return ORM_publica_comentario;
    }

    @Transient
    public final base_de_datos.ComentarioSetCollection publica_comentario = new base_de_datos.ComentarioSetCollection(
            this, _ormAdapter,
            base_de_datos.ORMConstants.KEY_USUARIO_PUBLICA_COMENTARIO,
            base_de_datos.ORMConstants.KEY_COMENTARIO_COMENTADO_POR,
            base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);

    private void setORM_Retweetea(java.util.Set value) {
        this.ORM_retweetea = value;
    }

    private java.util.Set getORM_Retweetea() {
        return ORM_retweetea;
    }

    @Transient
    public final base_de_datos.TweetSetCollection retweetea = new base_de_datos.TweetSetCollection(
            this, _ormAdapter,
            base_de_datos.ORMConstants.KEY_USUARIO_RETWEETEA,
            base_de_datos.ORMConstants.KEY_TWEET_REETWETEADO_POR,
            base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);

    private void setORM_Likea(java.util.Set value) {
        this.ORM_likea = value;
    }

    private java.util.Set getORM_Likea() {
        return ORM_likea;
    }

    @Transient
    public final base_de_datos.TweetSetCollection likea = new base_de_datos.TweetSetCollection(
            this, _ormAdapter,
            base_de_datos.ORMConstants.KEY_USUARIO_LIKEA,
            base_de_datos.ORMConstants.KEY_TWEET_LIKEADO_POR,
            base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);

    private void setORM_Likea_comentario(java.util.Set value) {
        this.ORM_likea_comentario = value;
    }

    private java.util.Set getORM_Likea_comentario() {
        return ORM_likea_comentario;
    }

    @Transient
    public final base_de_datos.ComentarioSetCollection likea_comentario = new base_de_datos.ComentarioSetCollection(
            this, _ormAdapter,
            base_de_datos.ORMConstants.KEY_USUARIO_LIKEA_COMENTARIO,
            base_de_datos.ORMConstants.KEY_COMENTARIO_COMLIKEADO_POR,
            base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);

    public String toString() {
        return super.toString();
    }
}

