package interfaz;

import org.vaadin.example.MainView;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import base_de_datos.UsuarioSetCollection;

public class VerperfilUsuarioregistrado extends Verperfildeusuario {
    public Usuarioregistrado usuarioregistrado;
    private Icon iconoSeguir;
    private Icon iconoBloquear;
    public Verlistadodeseguidores verListadoseguidores;
    public Verlistadodeseguidos verListadoseguidos;
    public base_de_datos.Usuario usuario;

    public VerperfilUsuarioregistrado(Usuarioregistrado usuarioregistrado, base_de_datos.Usuario _usuario) {
        super(usuarioregistrado);
        this.usuarioregistrado = usuarioregistrado;
        this.usuario = _usuario;

        // 1) Ocultar botón de banear (los usuarios normales no ven “banear”):
        this.getBtnBanearUsuario().setVisible(false);

        // 2) Configurar iconos de “seguir” / “bloquear” (tal y como ya tenías):
        iconoSeguir = new Icon(VaadinIcon.USER_CHECK); // estado inicial: “no siguiendo”
        this.getBtnSeguir().setIcon(iconoSeguir);
        iconoBloquear = new Icon(VaadinIcon.BAN); // estado inicial: “no bloqueado”
        this.getBtnBloquear().setIcon(iconoBloquear);

        // 3) Cargar perfil (nombre, fotos, desc, contadores):
        super.cargarPerfil(_usuario);

        // 4) Mostrar tweets propios al entrar:
        super.mostrarTweetsPropios(_usuario);

        // 5) Listeners de “Volver”, “Ver Seguidores/Seguidos”:
        this.getBtnVolver().addClickListener(evt -> btnVolver());
        this.getVerSeguidores().addClickListener(evt -> Verlistadodeseguidores());
        this.getVerSeguidos().addClickListener(evt -> Verlistadodeseguidos());

        // 6) Listeners de “Me Gusta” y “Retweets”:
        this.getVerMegustas().addClickListener(evt -> super.mostrarMeGustas(_usuario));
        this.getVerRetweets().addClickListener(evt -> super.mostrarRetweets(_usuario));

        // 7) Listeners de “Bloquear” y “Seguir” (lógica que ya tenías):
        this.getBtnBloquear().addClickListener(evt -> Bloquear_usuario());
        this.getBtnSeguir().addClickListener(evt -> Seguir_usuario_desde_perfil());
    }

    public void Bloquear_usuario() {
        boolean bloqueado = iconoBloquear.getElement().getAttribute("icon")
            .equals("vaadin:" + VaadinIcon.BAN.name().toLowerCase());

        if (bloqueado) {
            iconoBloquear = new Icon(VaadinIcon.CHECK);
            getBtnBloquear().setIcon(iconoBloquear);
            getBtnBloquear().setText("Desbloquear");
            getBtnBloquear().getStyle().set("color", "red");
        } else {
            iconoBloquear = new Icon(VaadinIcon.BAN);
            getBtnBloquear().setIcon(iconoBloquear);
            getBtnBloquear().setText("Bloquear");
            getBtnBloquear().getStyle().set("color", "black");
        }
    }

    public void Seguir_usuario_desde_perfil() {
        boolean siguiendo = iconoSeguir.getElement().getAttribute("icon")
            .equals("vaadin:" + VaadinIcon.USER_CHECK.name().toLowerCase());

        if (siguiendo) {
            iconoSeguir = new Icon(VaadinIcon.USER);
            getBtnSeguir().setIcon(iconoSeguir);
            getBtnSeguir().setText("Siguiendo");
            getBtnSeguir().getStyle().set("color", "blue");
        } else {
            iconoSeguir = new Icon(VaadinIcon.USER_CHECK);
            getBtnSeguir().setIcon(iconoSeguir);
            getBtnSeguir().setText("Seguir");
            getBtnSeguir().getStyle().set("color", "green");
        }
    }

    private void btnVolver() {
        MainView.Pantalla.volver();
        System.out.println("Volver a la vista anterior desde ver perfil personal");
    }

    private void Verlistadodeseguidores() {
        verListadoseguidores = new Verlistadodeseguidores(this, usuarioregistrado.es_seguido.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidores);
    }

    private void Verlistadodeseguidos() {
        verListadoseguidos = new Verlistadodeseguidos(this, usuarioregistrado.sigue.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidos);
    }
}
