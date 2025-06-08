package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerperfilUsuarioregistrado extends Verperfildeusuario {
	/*private event _bloquear_usuario;
	private event _seguir_usuario_desde_perfil;*/
	
	public Usuarioregistrado usuarioregistrado;
	public ListadotweetsUsuarioregistrado listadotweetsUsuarioregistrado;
	public Verlistadodeseguidores verListadoseguidores;
	public Verlistadodeseguidos verListadoseguidos;
	public VermuroprincipalUsuarioregistrado vermuroprincipalUsuarioregistrado;
	
	private Icon iconoSeguir;
	private Icon iconoBloquear;
    public base_de_datos.Usuario usuario;
    private boolean yaLoSigue;

    public VerperfilUsuarioregistrado(Usuarioregistrado usuarioregistrado, base_de_datos.Usuario _usuario) {
        super(usuarioregistrado, _usuario);
        this.usuarioregistrado = usuarioregistrado;
        this.usuario = _usuario;
        if(this.usuario.bloquea.contains(usuarioregistrado._usuarioregistrado)) {
			Notification.show("No puedes ver el perfil de un usuario que te ha bloqueado.");
        	return;
		}
        this.getBtnEditarPerfil().setVisible(false);
        this.getBtnEliminarPerfil().setVisible(false);
		this.getBtnBanearUsuario().setVisible(false);
		this.getBtnCerrarSesion().setVisible(false);
		
        this.vermuroprincipalUsuarioregistrado = usuarioregistrado._vermuroprincipalUsuarioregistrado;
		this.listadotweetsUsuarioregistrado = new ListadotweetsUsuarioregistrado(this);
		this.listadotweetsUsuarioregistrado.getContenedorNuevoTweet().setVisible(false);
		
		this.getContenedorListadotweets().as(VerticalLayout.class).add(listadotweetsUsuarioregistrado);
		super.cargarUsuario(_usuario);
		
		yaLoSigue = usuarioregistrado._usuarioregistrado.sigue.contains(usuario);
		Seguir_usuario_desde_perfil();
		
		this.getBtnSeguir().addClickListener(event -> alternarSeguir());
		//iconoSeguir = new Icon(VaadinIcon.USER_CHECK);
		//this.getBtnSeguir().setIcon(iconoSeguir);
		iconoBloquear = new Icon(VaadinIcon.BAN);
		this.getBtnBloquear().setIcon(iconoBloquear);
		
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getVerSeguidores().addClickListener(event -> Verlistadodeseguidores());
		this.getVerSeguidos().addClickListener(event -> Verlistadodeseguidos());
		this.getBtnBloquear().addClickListener(event -> Bloquear_usuario());
		this.getBtnSeguir().addClickListener(event -> Seguir_usuario_desde_perfil());
		//sustiuir por listado filtrado de megustras
		this.getVerPosts().addClickListener(event -> Posts(listadotweetsUsuarioregistrado));
		this.getVerMegustas().addClickListener(event -> Megustas(new Megustas(this)));
		//sustituir por listado filtrado de retweets
		this.getVerRetweets().addClickListener(event -> Retweets(new Retweets(this)));
	}
	
	public VerperfilUsuarioregistrado(ListadotweetsUsuarioregistrado listadotweetsUsuarioregistrado) {
		super(listadotweetsUsuarioregistrado);
	}
	
	public void Posts(ListadotweetsUsuarioregistrado _listadotweets) {
		this.getContenedorListadotweets().as(VerticalLayout.class).removeAll();
		this.getContenedorListadotweets().as(VerticalLayout.class).add(listadotweetsUsuarioregistrado);
	}
	
	public void Retweets(Retweets _retweets) {
		this.getContenedorListadotweets().as(VerticalLayout.class).removeAll();
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_retweets);
	}
	public void Megustas(Megustas _megustas) {
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
	        this.getBtnBloquear().addClickListener(event -> {
	            usuarioregistrado._usuarioregistrado.es_bloqueado.remove(usuario);
	            Seguir_usuario_desde_perfil();
	        });
	    } else {
	        iconoBloquear = new Icon(VaadinIcon.BAN);
	        getBtnBloquear().setIcon(iconoBloquear);
	        getBtnBloquear().setText("Bloquear");
	        getBtnBloquear().getStyle().set("color", "black");
	        this.getBtnBloquear().addClickListener(event -> {
	            usuarioregistrado._usuarioregistrado.es_bloqueado.add(usuario);
	            Seguir_usuario_desde_perfil();
	        });
	    }
	}

	public void Seguir_usuario_desde_perfil() {
		Button boton = this.getBtnSeguir();
		if (yaLoSigue) {
			boton.setText("Siguiendo");
			boton.getStyle().set("color", "white");
			boton.getStyle().set("background-color", "red");
		} else {
			boton.setText("Seguir");
			boton.getStyle().set("color", "white");
			boton.getStyle().set("background-color", "green");
		}
	}
	
	private void alternarSeguir() {
	    try {
	        if (yaLoSigue) {
	            this.usuarioregistrado.iUsuarioregistrado.dejarSeguir(usuarioregistrado._usuarioregistrado.getID(), usuario.getID());
	            // usuario.sigue.remove(usuarioListado);  // opcional: puedes quitarlo
	            yaLoSigue = false;
	        } else {
	            this.usuarioregistrado.iUsuarioregistrado.seguirUsuario(usuarioregistrado._usuarioregistrado.getID(), usuario.getID());
	            // usuario.sigue.add(usuarioListado);  // opcional: puedes quitarlo
	            yaLoSigue = true;
	        }
	        Seguir_usuario_desde_perfil();
	        Usuarioregistrado ur = new Usuarioregistrado(
	        		usuarioregistrado.mainView, usuarioregistrado.iUsuarioregistrado.
	        		cargarPerfilUsuarioregistrado(
	        				usuarioregistrado._usuarioregistrado.getID()
	        				));
	        
	        MainView.Pantalla.cambiarVista(ur);
	        
	    
	    } catch (Exception e) {
	        System.out.println("Error al alternar seguimiento:");
	        e.printStackTrace();
	    }
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