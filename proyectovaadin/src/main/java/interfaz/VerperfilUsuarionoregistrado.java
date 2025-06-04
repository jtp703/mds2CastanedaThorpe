package interfaz;

import org.vaadin.example.MainView;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import base_de_datos.Usuario;

/**
 * Vista de perfil para usuarios no registrados (solo lectura).
 * Se apoya en los métodos genéricos de la superclase para mostrar
 * «tweets propios», «me gusta» y «retweets».
 */
public class VerperfilUsuarionoregistrado extends Verperfildeusuario {

    private Usuarionoregistrado usuarioNoRegistrado;
    private Verlistadodeseguidores verListadoseguidores;
    private Verlistadodeseguidos   verListadoseguidos;
    public base_de_datos.Usuario usuario;

    public VerperfilUsuarionoregistrado(Usuarionoregistrado usuarioNoRegistrado, base_de_datos.Usuario _usuario) {
        // Llamamos al constructor base para que se registre el cibernauta (en este caso, el usuarioNoRegistrado)
        super(usuarioNoRegistrado);
        this.usuarioNoRegistrado = usuarioNoRegistrado;
        this.usuario = _usuario;
        // 1) Ocultar todos los botones que no aplican a un usuario anónimo.
        //    (No puede banear, editar perfil, eliminar perfil, bloquear, seguir ni cerrar sesión).
        this.getBtnBanearUsuario().setVisible(false);
        this.getBtnEditarPerfil().setVisible(false);
        this.getBtnEliminarPerfil().setVisible(false);
        this.getBtnBloquear().setVisible(false);
        this.getBtnSeguir().setVisible(false);
        this.getBtnCerrarSesion().setVisible(false);

        // 2) Llamar a cargar datos básicos del perfil (nombre, nick, fotos, descripción, seguidores, seguidos…).
        super.cargarPerfil(_usuario);

        // 3) Mostrar por defecto los tweets propios de este usuario no registrado.
        super.mostrarTweetsPropios(_usuario);

        // 4) Configurar listener del botón “Volver”:
        this.getBtnVolver().addClickListener(event -> btnVolver());

        // 5) Configurar listener de “Ver seguidores” y “Ver seguidos”:
        this.getVerSeguidores().addClickListener(event -> Verlistadodeseguidores());
        this.getVerSeguidos().addClickListener(event -> Verlistadodeseguidos());

        // 6) Configurar listener de “Ver Me Gustas”: llama al método genérico de la clase base
        this.getVerMegustas().addClickListener(event -> super.mostrarMeGustas(_usuario));

        // 7) Configurar listener de “Ver Retweets”: llama al método genérico de la clase base
        this.getVerRetweets().addClickListener(event -> super.mostrarRetweets(_usuario));
    }

    // Este segundo constructor lo dejamos para cumplir con el contrato de la vista “por defecto”,
    // pero en nuestro caso casi nunca se usará directamente.
    public VerperfilUsuarionoregistrado(Listadotweets _listadotweets) {
        super(_listadotweets);
        // (puedes dejarlo vacío o eliminarlo si no lo necesitas)
    }

    /** Método para volver a la vista anterior */
    private void btnVolver() {
        MainView.Pantalla.volver();
        System.out.println("Volver a la vista anterior desde ver perfil usuario no registrado");
    }

    /** Abre la vista de la lista de seguidores de este usuario */
    private void Verlistadodeseguidores() {
        // Pasamos this como padre y la lista de seguidores (no son UsuariosAutentificados,
        // pero Usuarionoregistrado también hereda de Usuario, así que es válido).
        verListadoseguidores = new Verlistadodeseguidores(this, usuarioNoRegistrado.es_seguido.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidores);
    }

    /** Abre la vista de la lista de seguidos de este usuario */
    private void Verlistadodeseguidos() {
        verListadoseguidos = new Verlistadodeseguidos(this, usuarioNoRegistrado.sigue.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidos);
    }
}
