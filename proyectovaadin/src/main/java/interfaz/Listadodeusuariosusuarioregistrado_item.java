package interfaz;

import org.vaadin.example.MainView;
import com.vaadin.flow.component.button.Button;

public class Listadodeusuariosusuarioregistrado_item extends Listadousuarios_item {
	public Listadodeusuariosusuarioregistrado _listadodeusuariosusuarioregistrado;

	public VerperfilUsuarioregistrado _verPerfilUsuarioregistrado;
	public Usuarioregistrado usuarioRegistrado;
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
		this.getVerperfil().addClickListener(event -> VerperfilUsuarioregistrado(usuarioRegistrado));
	}

	public Listadodeusuariosusuarioregistrado_item(VerperfilUsuarioregistrado _verPerfilUsuarioregistrado, base_de_datos.Usuario usuarioListado) {
		super(_verPerfilUsuarioregistrado, usuarioListado);
		this.usuarioListado = usuarioListado;
		this.getVerperfil().addClickListener(event -> VerperfilUsuarioregistrado(usuarioRegistrado));
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
}
