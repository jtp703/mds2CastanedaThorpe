package interfaz;

import org.vaadin.example.MainView;
import com.vaadin.flow.component.button.Button;

public class Listadodeusuariosusuarioregistrado_item extends Listadousuarios_item {
	
	public Listadodeusuariosusuarioregistrado _listadodeusuariosusuarioregistrado;
	public VerperfilUsuarioregistrado _verPerfilUsuarioregistrado;
	public Usuarioregistrado usuarioRegistrado;
	public Verlistadodeseguidores verListadoseguidores;
	public Verlistadodeseguidos verListadoseguidos;
	public base_de_datos.Usuario usuario;
	public base_de_datos.Usuario usuarioListado;

	private boolean yaLoSigue;

	public Listadodeusuariosusuarioregistrado_item(Listadodeusuariosusuarioregistrado listadodeusuariosusuarioregistrado, base_de_datos.Usuario usuarioListado){
		super(listadodeusuariosusuarioregistrado, usuarioListado);
		this.usuarioListado = usuarioListado;
		this._listadodeusuariosusuarioregistrado = listadodeusuariosusuarioregistrado;
		this.usuarioRegistrado = listadodeusuariosusuarioregistrado._verlistadoglobaldeusuariosUsuarioregistrado._usuarioregistrado;
		this.usuario = listadodeusuariosusuarioregistrado._verlistadoglobaldeusuariosUsuarioregistrado._usuarioregistrado._usuarioregistrado;

		// Comprobamos si ya lo sigue
		yaLoSigue = usuario.sigue.contains(usuarioListado);
		actualizarEstadoBoton();

		this.getSeguirUsuario().addClickListener(event -> alternarSeguir());
		
		if (this.usuarioListado.getID() == usuario.getID()) {
            this.getVerperfil().addClickListener(event ->
                MainView.Pantalla.cambiarVista(new Verperfilpersonal(this.usuarioRegistrado))
            );
        } else {
            this.getVerperfil().addClickListener(event ->
                MainView.Pantalla.cambiarVista(new VerperfilUsuarioregistrado(usuarioRegistrado, usuarioListado))
            );
        }
		//this.getVerSeguidores().addClickListener(event -> Verlistadodeseguidores());
		//this.getVerSeguidos().addClickListener(event -> Verlistadodeseguidos());
		
	}

	public Listadodeusuariosusuarioregistrado_item(VerperfilUsuarioregistrado _verPerfilUsuarioregistrado, base_de_datos.Usuario usuarioListado) {
		super(_verPerfilUsuarioregistrado, usuarioListado);
		this.usuarioListado = usuarioListado;
		this._verPerfilUsuarioregistrado = _verPerfilUsuarioregistrado;
		this.usuarioRegistrado = _verPerfilUsuarioregistrado.usuarioregistrado;
		this.usuario = _verPerfilUsuarioregistrado.usuarioregistrado._usuarioregistrado;
		
		if (this.usuarioListado.getID() == usuario.getID()) {
            this.getVerperfil().addClickListener(event ->
                MainView.Pantalla.cambiarVista(new Verperfilpersonal(this.usuarioRegistrado))
            );
        } else {
            this.getVerperfil().addClickListener(event ->
                MainView.Pantalla.cambiarVista(new VerperfilUsuarioregistrado(usuarioRegistrado, usuarioListado))
            );
        }
	}
	
	public Listadodeusuariosusuarioregistrado_item(Verlistadodeseguidores _verListadoseguidores, base_de_datos.Usuario usuarioSeguidor) {
		super(_verListadoseguidores, usuarioSeguidor);
		this.usuarioListado = usuarioSeguidor;
		usuario = _verListadoseguidores.usuario;
		this.getSeguirUsuario().setVisible(false);
		
		this.getContenedorSeguidoresSeguidos().setVisible(false);
		if (this.usuarioListado.getID() == usuario.getID()) {
            this.getVerperfil().addClickListener(event ->
                MainView.Pantalla.cambiarVista(new Verperfilpersonal(this.usuarioRegistrado))
            );
        } else {
            this.getVerperfil().addClickListener(event ->
                MainView.Pantalla.cambiarVista(new VerperfilUsuarioregistrado(usuarioRegistrado, usuarioListado))
            );
        }
		
	}
	
	public Listadodeusuariosusuarioregistrado_item(Verlistadodeseguidos _verListadoseguidos, base_de_datos.Usuario usuarioSeguido) {
		super(_verListadoseguidos, usuarioSeguido);
		this.usuarioListado = usuarioSeguido;
		usuario = _verListadoseguidos.usuario;
		this.getSeguirUsuario().setVisible(false);
		this.getContenedorSeguidoresSeguidos().setVisible(false);
		if (this.usuarioListado.getID() == usuario.getID()) {
            this.getVerperfil().addClickListener(event ->
                MainView.Pantalla.cambiarVista(new Verperfilpersonal(this.usuarioRegistrado))
            );
        } else {
            this.getVerperfil().addClickListener(event ->
                MainView.Pantalla.cambiarVista(new VerperfilUsuarioregistrado(usuarioRegistrado, usuarioListado))
            );
        }
		
	}

	private void alternarSeguir() {
	    try {
	        if (yaLoSigue) {
	            _listadodeusuariosusuarioregistrado._verlistadoglobaldeusuariosUsuarioregistrado
	                ._usuarioregistrado.iUsuarioregistrado.dejarSeguir(usuario.getID(), usuarioListado.getID());
	            // usuario.sigue.remove(usuarioListado);  // opcional: puedes quitarlo
	            yaLoSigue = false;
	        } else {
	            _listadodeusuariosusuarioregistrado._verlistadoglobaldeusuariosUsuarioregistrado
	                ._usuarioregistrado.iUsuarioregistrado.seguirUsuario(usuario.getID(), usuarioListado.getID());
	            // usuario.sigue.add(usuarioListado);  // opcional: puedes quitarlo
	            yaLoSigue = true;
	        }
	        actualizarEstadoBoton();
	        Usuarioregistrado ur = new Usuarioregistrado(
	        		usuarioRegistrado.mainView , 
	        		_listadodeusuariosusuarioregistrado.
	        		_verlistadoglobaldeusuariosUsuarioregistrado.
	        		_usuarioregistrado.iUsuarioregistrado.
	        		cargarPerfilUsuarioregistrado(
	        				usuarioRegistrado._usuarioregistrado.getID()
	        				));
	        
	        MainView.Pantalla.cambiarVista(ur);
	    
	    } catch (Exception e) {
	        System.out.println("Error al alternar seguimiento:");
	        e.printStackTrace();
	    }
	}


	private void actualizarEstadoBoton() {
		Button boton = this.getSeguirUsuario();
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

	public void VerperfilUsuarioregistrado(Usuarioregistrado usuario) {
		_verPerfilUsuarioregistrado = new VerperfilUsuarioregistrado(usuario, usuarioListado);
		MainView.Pantalla.cambiarVista(_verPerfilUsuarioregistrado);
	}
	
	private void Verlistadodeseguidores() {
        verListadoseguidores = new Verlistadodeseguidores(this._listadodeusuariosusuarioregistrado, usuario.es_seguido.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidores);
    }

    private void Verlistadodeseguidos() {
        verListadoseguidos = new Verlistadodeseguidos(this._listadodeusuariosusuarioregistrado, usuario.sigue.toArray());
        MainView.Pantalla.cambiarVista(verListadoseguidos);
    }
}
