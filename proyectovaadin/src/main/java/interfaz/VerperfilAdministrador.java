package interfaz;

import org.vaadin.example.MainView;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import base_de_datos.Usuario;
import base_de_datos.UsuarioSetCollection;

public class VerperfilAdministrador extends Verperfildeusuario {
    public Administrador _administrador;
    public base_de_datos.Usuario usuario;
    public Banearusuario _banearusuario;
    public Verlistadodeseguidores verListadoseguidores;
    public Verlistadodeseguidos verListadoseguidos;

    public VerperfilAdministrador(Administrador administrador, Usuario usuario) {
        super(administrador);
        this._administrador = administrador;
        this.usuario = usuario;

        // 1) Ocultar/mostrar botones que no necesites:
        this.getBtnBloquear().setVisible(false);
        this.getBtnSeguir().setVisible(false);
        this.getBtnEditarPerfil().setVisible(false);
        this.getBtnEliminarPerfil().setVisible(false);
        this.getBtnCerrarSesion().setVisible(false);

        // 2) Cargar datos del perfil:
        super.cargarPerfil(usuario);

        // 3) Mostrar por defecto los tweets propios:
        super.mostrarTweetsPropios(usuario);

        // 4) Listeners de botones “Ver Me Gusta” y “Ver Retweets”:
        this.getVerMegustas().addClickListener(evt -> super.mostrarMeGustas(usuario));
        this.getVerRetweets().addClickListener(evt -> super.mostrarRetweets(usuario));

        // 5) Listeners de volver, ver seguidos/seguidores, banear:
        this.getBtnVolver().addClickListener(e -> btnVolver());
        this.getVerSeguidores().addClickListener(e -> Verlistadodeseguidores(usuario.es_seguido));
        this.getVerSeguidos().addClickListener(e -> Verlistadodeseguidos(usuario.sigue));
        this.getBtnBanearUsuario().addClickListener(e -> Banear_usuarios());
    }
    //Se ha cargado la interfaz megustas y la interfaz retweets, por lo que no es necesario volver a cargarlas.

    public void Banear_usuarios() {
        _banearusuario = new Banearusuario(this);
        MainView.Pantalla.cambiarVista(_banearusuario);
    }

    private void btnVolver() {
        MainView.Pantalla.volver();
        System.out.println("Volver a la vista anterior desde ver perfil administrador");
    }

    private void Verlistadodeseguidores(UsuarioSetCollection es_seguido) {
        verListadoseguidores = new Verlistadodeseguidores(this, es_seguido.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidores);
    }

    private void Verlistadodeseguidos(UsuarioSetCollection seguidos) {
        verListadoseguidos = new Verlistadodeseguidos(this, seguidos.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidos);
    }
}
