package interfaz;

import org.orm.PersistentException;
import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Usuario;
import base_de_datos.UsuarioSetCollection;

public class Verlistadodeseguidores extends Verlistado {

	public Listadodeusuariosusuarioregistrado _listadousuariosusuarioregistrado;
	public Listadodeusuariosusuarionoregistrado _listadodeusuariosusuarionoregistrado;
	public Listadodeusuariosadministrador _listadodeusuariosadministrador;
	public VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado;
	public VerperfilUsuarionoregistrado _verperfilusuarionoregistrado;
	public VerperfilAdministrador _verperfilaministrador;
	public Verperfilpersonal _verperfilpersonal;
	public base_de_datos.Usuario usuario;

	public Verlistadodeseguidores(Listadodeusuariosusuarioregistrado _listadousuariosusuarioregistrado,
			Usuario[] _usuarioSetCollection) {
		super(_listadousuariosusuarioregistrado);
		this._listadousuariosusuarioregistrado = _listadousuariosusuarioregistrado;
		usuario = this._listadousuariosusuarioregistrado._verlistadoglobaldeusuariosUsuarioregistrado._usuarioregistrado._usuarioregistrado;
		eliminarSeguidos();
		this.getSeguidos().setVisible(false);
		this.getBtnCerrar().addClickListener(event -> btnCerrar());

		try {

			Usuario[] todosLosSeguidores = _usuarioSetCollection;

			for (Usuario u : todosLosSeguidores) {

				Listadodeusuariosusuarioregistrado_item item = new Listadodeusuariosusuarioregistrado_item(
						this, u);

				this.getListadoSeguidores().as(VerticalLayout.class).add(item);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Verlistadodeseguidores(Listadodeusuariosusuarionoregistrado _listadousuariosusuarionoregistrado,
			Usuario[] _usuarioSetCollection) {
		super(_listadousuariosusuarionoregistrado);
		this._listadodeusuariosusuarionoregistrado = _listadousuariosusuarionoregistrado;
		
		eliminarSeguidos();

		this.getBtnCerrar().addClickListener(event -> btnCerrar());

		try {

			Usuario[] todosLosSeguidores = _usuarioSetCollection;

			for (Usuario u : todosLosSeguidores) {

				Listadodeusuariosusuarionoregistrado_item item = new Listadodeusuariosusuarionoregistrado_item(
						this._listadodeusuariosusuarionoregistrado, u);
				item.usuarionoregistrado.getVerPerfilPersonal().setText(u.getNick());
				
				item.getSeguirUsuario().setVisible(false);
				item.getContenedorSeguidoresSeguidos().setVisible(false);

				this.getListadoSeguidores().as(VerticalLayout.class).add(item);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Verlistadodeseguidores(Listadodeusuariosadministrador _listadodeusuariosadministrador,
			Usuario[] _usuarioSetCollection) {
		super(_listadodeusuariosadministrador);
		this._listadodeusuariosadministrador = _listadodeusuariosadministrador;
		
		eliminarSeguidos();
		
		this.getBtnCerrar().addClickListener(event -> btnCerrar());

		try {

			Usuario[] todosLosSeguidores = _usuarioSetCollection;

			for (Usuario u : todosLosSeguidores) {

				Listadodeusuariosadministrador_item item = new Listadodeusuariosadministrador_item(
						this._listadodeusuariosadministrador, u);
				item.administrador.getVerPerfilPersonal().setText(u.getNick());

				item.getSeguirUsuario().setVisible(false);
				item.getContenedorSeguidoresSeguidos().setVisible(false);

				this.getListadoSeguidores().as(VerticalLayout.class).add(item);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Verlistadodeseguidores(VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado,
			Usuario[] _usuarioSetCollection) {
		super(_verperfildeusuariousuarioregistrado);
		this._verperfildeusuariousuarioregistrado = _verperfildeusuariousuarioregistrado;
		this.getVerPerfil().setText(_verperfildeusuariousuarioregistrado.usuario.getNick());
		// Ocultamos la sección “Seguidos”
		eliminarSeguidos();
		// Botón Cerrar
		this.getBtnCerrar().addClickListener(event -> btnCerrar());

		try {

			Usuario[] todosLosSeguidores = _usuarioSetCollection;

			for (Usuario u : todosLosSeguidores) {

				Listadodeusuariosusuarioregistrado_item item = new Listadodeusuariosusuarioregistrado_item(
						this._verperfildeusuariousuarioregistrado, u);
				item.usuarioRegistrado.getVerPerfilPersonal().setText(u.getNick());

				item.getSeguirUsuario().setVisible(false);
				item.getContenedorSeguidoresSeguidos().setVisible(false);

				this.getListadoSeguidores().as(VerticalLayout.class).add(item);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Verlistadodeseguidores(VerperfilUsuarionoregistrado _verperfilusuarionoregistrado,
			Usuario[] _usuarioSetCollection) {
		super(_verperfilusuarionoregistrado);
		this._verperfilusuarionoregistrado = _verperfilusuarionoregistrado;
		eliminarSeguidos();
		this.getBtnCerrar().addClickListener(event -> btnCerrar());
		this.getVerPerfil().setText(_verperfilusuarionoregistrado.usuario.getNick());
		try {

			Usuario[] todosLosSeguidores = _usuarioSetCollection;

			for (Usuario u : todosLosSeguidores) {

				Listadodeusuariosusuarionoregistrado_item item = new Listadodeusuariosusuarionoregistrado_item(
						this._verperfilusuarionoregistrado, u);
				item.usuarionoregistrado.getVerPerfilPersonal().setText(u.getNick());

				item.getSeguirUsuario().setVisible(false);
				item.getContenedorSeguidoresSeguidos().setVisible(false);

				this.getListadoSeguidores().as(VerticalLayout.class).add(item);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Verlistadodeseguidores(VerperfilAdministrador _verperfilaministrador, Usuario[] _usuarioSetCollection) {
		super(_verperfilaministrador);
		this._verperfilaministrador = _verperfilaministrador;
		eliminarSeguidos();
		this.getVerPerfil().setText(_verperfilaministrador.usuario.getNick());
		this.getBtnCerrar().addClickListener(event -> btnCerrar());
		for (Usuario usuario : _usuarioSetCollection) {
			Listadodeusuariosadministrador_item item = new Listadodeusuariosadministrador_item(_verperfilaministrador,
					usuario);
			eliminarSeguidoresYSeguidos(item);
			this.getListadoSeguidores().as(VerticalLayout.class).add(item);
		}
	}
	
	public Verlistadodeseguidores(Verperfilpersonal _verperfilpersonal,
			Usuario[] _usuarioSetCollection) {
		super(_verperfilpersonal);
		this._verperfilpersonal = _verperfilpersonal;
		eliminarSeguidos();
		this.getBtnCerrar().addClickListener(event -> btnCerrar());
		

		try {

			Usuario[] todosLosSeguidores = _usuarioSetCollection;

			for (Usuario u : todosLosSeguidores) {

				Listadodeusuariosusuarionoregistrado_item item = new Listadodeusuariosusuarionoregistrado_item(
						this._verperfilpersonal, u);
				item.usuarionoregistrado.getVerPerfilPersonal().setText(u.getNick());

				item.getSeguirUsuario().setVisible(false);
				item.getContenedorSeguidoresSeguidos().setVisible(false);

				this.getListadoSeguidores().as(VerticalLayout.class).add(item);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		eliminarSeguidos();
	}
	

	private void eliminarSeguidoresYSeguidos(Listadousuarios_item item) {
		item.getSeguirUsuario().setVisible(false);
		item.getContenedorSeguidoresSeguidos().setVisible(false);
	}

	private void eliminarSeguidos() {
		
		this.getListadoSeguidos().setVisible(false);
		this.getSeguidos().setVisible(false);
	}

	private void btnCerrar() {
		MainView.Pantalla.volver();
	}
}