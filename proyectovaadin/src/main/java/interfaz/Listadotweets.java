package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import base_de_datos.Tweet;
import base_de_datos.Usuario;
import vistas.VistaListadotweets;

/**
 * Listadotweets: componente genérico que extiende de la vista VistaListadotweets.
 * Hemos añadido un constructor extra que recibe un Usuario y un “tipo de filtro”
 * para poblar los tweets correspondientes.
 */
public class Listadotweets extends VistaListadotweets {
    public Megustas _megustas;
    public Retweets _retweets;
    public Verlistadodetweetsfiltrado _verlistadodetweetsfiltrado;
    public Verperfildeusuario _verperfildeusuario;
    public Vermuroprincipal _vermuroprincipal;
    public Vector<Listadotweets_item> _item = new Vector<>();

    // Constructores existentes:
    public Listadotweets(Megustas _megustas) {
        this._megustas = _megustas;
    }
    public Listadotweets(Retweets _retweets) {
        this._retweets = _retweets;
    }
    public Listadotweets(Verlistadodetweetsfiltrado _verlistadodetweetsfiltrado) {
        this._verlistadodetweetsfiltrado = _verlistadodetweetsfiltrado;
        // Ejemplo fijo (yo te lo dejo, tú puedes quitarlo si no te vale):
        Listadotweets_item i = new Listadotweets_item(this, null);
        i.getBtnEliminarTweet().setVisible(false);
        this.getContenedorListadoTweets().as(VerticalLayout.class).add(i);
        Listadotweets_item is = new Listadotweets_item(this, null);
        is.getBtnEliminarTweet().setVisible(false);
        this.getContenedorListadoTweets().as(VerticalLayout.class).add(is);
    }
    public Listadotweets(Verperfildeusuario _verperfildeusuario) {
        this._verperfildeusuario = _verperfildeusuario;
    }
    public Listadotweets(Vermuroprincipal _vermuroprincipal) {
        this._vermuroprincipal = _vermuroprincipal;
    }

    /******************************************************************************************/
    /*** NUEVO CONSTRUCTOR PARA “LISTAR TWEETS” A PARTIR DE UN Usuario y un modo de filtro ***/
    public enum TipoFiltro {
        PROPIOS,    // tweets que el mismo usuario ha publicado
        ME_GUSTA,   // tweets que el usuario ha marcado como “me gusta”
        RETWEETS    // tweets que el usuario ha retuiteado
    }

    /**
     * Constructor que recibe:
     *  - parent: la vista padre (por ejemplo, un Verperfildeusuario)
     *  - usuario: instancia de Usuario de donde sacamos tweetea, likea o retweetea
     *  - tipo: indica si queremos tweets propios, me gusta o retweets
     *
     * Con esto, en lugar de repetir en cada perfil la iteración sobre usuario.tweetea,
     * usuario.likea o usuario.retweetea, lo centralizamos aquí.
     */
    public Listadotweets(Verperfildeusuario parent, Usuario usuario, TipoFiltro tipo) {
        this._verperfildeusuario = parent;
        // Ocultamos el contenedor de “nuevo tweet” porque en perfil no se publican aquí:
        this.getContenedorNuevoTweet().setVisible(false);

        // Según el tipo de filtro, obtenemos el array de Tweet:
        Tweet[] tweetsAListar;
        switch (tipo) {
            case PROPIOS:
                // Relación OneToMany: tweets publicados por el usuario
                tweetsAListar = usuario.tweetea.toArray();
                break;
            case ME_GUSTA:
                // Relación ManyToMany: tweets que el usuario ha likeado
                tweetsAListar = usuario.likea.toArray();
                break;
            case RETWEETS:
                // Relación ManyToMany: tweets que el usuario ha retuiteado
                tweetsAListar = usuario.retweetea.toArray();
                break;
            default:
                tweetsAListar = new Tweet[0];
        }

        // Recorremos el array para crear cada Listadotweets_item:
        for (Tweet t : tweetsAListar) {
            Listadotweets_item item = new Listadotweets_item(this, t);
            _item.add(item);
            this.getContenedorListadoTweets()
                .as(VerticalLayout.class)
                .add(item);
        }
    }
    /******************************************************************************************/
}
