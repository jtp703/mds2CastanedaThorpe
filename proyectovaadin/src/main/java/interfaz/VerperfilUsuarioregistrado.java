package interfaz;

import org.vaadin.example.MainView;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerperfilUsuarioregistrado extends Verperfildeusuario {
	/*private event _bloquear_usuario;
	private event _seguir_usuario_desde_perfil;*/
	
	public Usuarioregistrado usuarioregistrado;
	public ListadotweetsUsuarioregistrado listadotweetsUsuarioregistrado;
	public Verlistadodeseguidores verListadoseguidores;
	public Verlistadodeseguidos verListadoseguidos;
	
	private Icon iconoSeguir;
	private Icon iconoBloquear;
    public base_de_datos.Usuario usuario;

    public VerperfilUsuarioregistrado(Usuarioregistrado usuarioregistrado, base_de_datos.Usuario _usuario) {
        super(usuarioregistrado, _usuario);
        this.usuarioregistrado = usuarioregistrado;
        this.usuario = _usuario;
		this.listadotweetsUsuarioregistrado = new ListadotweetsUsuarioregistrado(this);
		this.listadotweetsUsuarioregistrado.getContenedorNuevoTweet().setVisible(false);
		this.getContenedorListadotweets().as(VerticalLayout.class).add(listadotweetsUsuarioregistrado);
		this.getBtnBanearUsuario().setVisible(false);
		super.cargarUsuario(_usuario);
		
		iconoSeguir = new Icon(VaadinIcon.USER_CHECK);
		this.getBtnSeguir().setIcon(iconoSeguir);
		iconoBloquear = new Icon(VaadinIcon.BAN);
		this.getBtnBloquear().setIcon(iconoBloquear);
		
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getVerSeguidores().addClickListener(event -> Verlistadodeseguidores());
		this.getVerSeguidos().addClickListener(event -> Verlistadodeseguidos());
		this.getBtnBloquear().addClickListener(event -> Bloquear_usuario());
		this.getBtnSeguir().addClickListener(event -> Seguir_usuario_desde_perfil());
		//sustiuir por listado filtrado de megustras
		this.getVerPosts().addClickListener(event -> Posts(listadotweetsUsuarioregistrado));
		this.getVerMegustas().addClickListener(event -> Me_gustas(new Megustas(listadotweetsUsuarioregistrado)));
		//sustituir por listado filtrado de retweets
		this.getVerRetweets().addClickListener(event -> Retweets(new Retweets(listadotweetsUsuarioregistrado)));
	}
	
	public VerperfilUsuarioregistrado(ListadotweetsUsuarioregistrado listadotweetsUsuarioregistrado) {
		super(listadotweetsUsuarioregistrado); 
	}
	
	public void Posts(ListadotweetsUsuarioregistrado _listadotweets) {
		this.getContenedorListadotweets().as(VerticalLayout.class);
	}
	
	public void Retweets(Retweets _retweets) {
		this.getContenedorListadotweets().as(VerticalLayout.class).removeAll();
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_retweets);
	}
	public void Me_gustas(Megustas _megustas) {
		this.getContenedorListadotweets().as(VerticalLayout.class).removeAll();
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_megustas);
	}
	public void Ver_Listado(Verlistado _verlistado) {
		this._verlistado = _verlistado;
	}
	public void Listadotweets(Listadotweets _listadotweets) {
		this._listadotweets = _listadotweets;
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



	public void VerListadoTweets() {
		throw new UnsupportedOperationException();
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
		System.out.println("Volver a la vista anterior desde ver perfil personal");
	}
    private void Verlistadodeseguidores() {
        verListadoseguidores = new Verlistadodeseguidores(this, usuario.es_seguido.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidores);
    }

    private void Verlistadodeseguidos() {
        verListadoseguidos = new Verlistadodeseguidos(this, usuario.sigue.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidos);
    }
}