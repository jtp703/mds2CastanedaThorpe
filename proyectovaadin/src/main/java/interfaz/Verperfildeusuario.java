package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import base_de_datos.Tweet;
import base_de_datos.Usuario;
import vistas.VistaVerperfildeusuario;

public class Verperfildeusuario extends VistaVerperfildeusuario {
    public Cibernauta cibernauta;
    public Retweets _retweets;
    public Megustas _megustas;
    public Verlistado _verlistado;
    public Listadotweets _listadotweets;

    public Verperfildeusuario(Cibernauta cibernauta) {
        this.cibernauta = cibernauta;
    }

    public Verperfildeusuario(Retweets _retweets) {
        this._retweets = _retweets;
    }

    public Verperfildeusuario(Megustas _megustas) {
        this._megustas = _megustas;
    }

    public Verperfildeusuario(Verlistado _verlistado) {
        this._verlistado = _verlistado;
    }

    public Verperfildeusuario(Listadotweets _listadotweets) {
        this._listadotweets = _listadotweets;
    }

    // Apartir de aqui todo lo nuevo
    protected void cargarPerfil(Usuario usuario) {
        this.getNombreUsuario().setText(usuario.getNombre());
        this.getNickUsuario().setText(usuario.getNick());
        this.getImgFondo().setSrc(usuario.getFotoFondo());
        this.getImgPerfil().setSrc(usuario.getFotoPerfil());
        this.getDescripcionPerfil().setText(usuario.getDescripcion());
        this.getVerSeguidos().setText(Integer.toString(usuario.es_seguido.size()));
        this.getVerSeguidores().setText(Integer.toString(usuario.sigue.size()));
    }

    /**
     * Método auxiliar que borra todo lo que hubiera y luego añade un Listadotweets
     * en función de cuál de los tres listados queramos mostrar:
     *   PROPIOS, ME_GUSTA o RETWEETS
     */
    private void insertarEnContenedorTweets(Listadotweets listado) {
        this.getContenedorListadotweets().as(VerticalLayout.class).removeAll();
        this.getContenedorListadotweets().as(VerticalLayout.class).add(listado);
    }

    /** Muestra los tweets que el usuario ha publicado (filtro PROPIOS). */
    protected void mostrarTweetsPropios(Usuario usuario) {
        Listadotweets listado = new Listadotweets(this, usuario, Listadotweets.TipoFiltro.PROPIOS);
        insertarEnContenedorTweets(listado);
    }

    /** Muestra los tweets que el usuario ha marcado con “Me gusta” (filtro ME_GUSTA). */
    protected void mostrarMeGustas(Usuario usuario) {
        Listadotweets listado = new Listadotweets(this, usuario, Listadotweets.TipoFiltro.ME_GUSTA);
        insertarEnContenedorTweets(listado);
    }

    /** Muestra los retweets que el usuario ha hecho (filtro RETWEETS). */
    protected void mostrarRetweets(Usuario usuario) {
        Listadotweets listado = new Listadotweets(this, usuario, Listadotweets.TipoFiltro.RETWEETS);
        insertarEnContenedorTweets(listado);
    }
}
