package interfaz;

import org.vaadin.example.MainView;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadotweetsUsuarioregistrado_item extends Listadotweets_item {

    public ListadotweetsUsuarioregistrado _listadotweetsUsuarioregistrado;
    public VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado;
    public Darretweet _darretweet;
    public Usuarioregistrado usuario;
    public VerperfilUsuarioregistrado _verperfilUsuarioregistrado;
    private boolean retweeteado = false;
    private boolean megusta = false;
    public base_de_datos.Usuario usu;
    public base_de_datos.Tweet tweet;

    public ListadotweetsUsuarioregistrado_item(ListadotweetsUsuarioregistrado listadotweetsUsuarioregistrado, base_de_datos.Tweet tweet) {
        super(listadotweetsUsuarioregistrado, tweet);
        this.getBtnEliminarTweet().setVisible(false);
        this._listadotweetsUsuarioregistrado = listadotweetsUsuarioregistrado;
        this.usuario = listadotweetsUsuarioregistrado._vermuroprincipalUsuarioregistrado._usuarioregistrado;
        this.usu = tweet.tweeteado_por;
        this.tweet = tweet;
        if (this.usu.getID() == usuario._usuarioregistrado.getID()) {
            this.getVerperfil().addClickListener(event ->
                MainView.Pantalla.cambiarVista(new Verperfilpersonal(usuario))
            );
        } else {
            this.getVerperfil().addClickListener(event ->
                MainView.Pantalla.cambiarVista(new VerperfilUsuarioregistrado(usuario, usu))
            );
        }
        this.getComentar().addClickListener(event-> VercomentariosUsuarioregistrado());
        this.getDarRetweet().addClickListener(even-> Darretweet());
        this.getMeGusta().addClickListener(event      -> Darmegusta());

        for (base_de_datos.Usuario u : tweet.likeado_por.toArray()) {
            if (u.getID() == usuario._usuarioregistrado.getID()) {
                megusta = true;
                break;
            }
        }
        this.getMeGusta().getStyle().set("color", megusta ? "red" : "black");
    }

    public ListadotweetsUsuarioregistrado_item(VercomentariosUsuarioregistrado _vercomentariosUsuarioregistrado, base_de_datos.Tweet tweet) {
        super(_vercomentariosUsuarioregistrado, tweet);
        this.getBtnEliminarTweet().setVisible(false);
        this.getContenedorInteracciones().setVisible(false);
    }

    public void Darmegusta() {
        megusta = !megusta;

        int idUsuario = usuario._usuarioregistrado.getID();
        int idTweet   = tweet.getIdTweet();

        if (megusta) {
            usuario.iUsuarioregistrado.darMegustaTweet(idUsuario, idTweet);
            this.getMeGusta().getStyle().set("color", "red");
        } else {
            usuario.iUsuarioregistrado.quitarMegusta(idUsuario, idTweet);
            this.getMeGusta().getStyle().set("color", "black");
        }

        // Recargar vista principal con perfil actualizado
        Usuarioregistrado usuarioregistrado = new Usuarioregistrado(
            usuario.mainView,
            usuario.iUsuarioregistrado.cargarPerfilUsuarioregistrado(usuario._usuarioregistrado.getID())
        );
        usuario.mainView.removeAll();
        usuario.mainView.add(usuarioregistrado);
    }

    public void Darretweet() {
        _darretweet = new Darretweet(this);
        MainView.Pantalla.cambiarVista(_darretweet);
    }

    public void VercomentariosUsuarioregistrado() {
        this._vercomentariosUsuarioregistrado = new VercomentariosUsuarioregistrado(this);
        MainView.Pantalla.cambiarVista(_vercomentariosUsuarioregistrado);
    }

    public void marcarRetweet() {
        retweeteado = true;
        this.getDarRetweet().setColor("#00cc66");
    }
}
