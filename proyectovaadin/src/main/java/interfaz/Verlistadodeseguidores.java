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

	public Verlistadodeseguidores(Listadodeusuariosusuarioregistrado _listadousuariosusuarioregistrado) {
		super(_listadousuariosusuarioregistrado);
		eliminarSeguidos();
		Listadousuarios_item item0 = new Listadousuarios_item(_listadousuariosusuarioregistrado, null);
		item0.getSeguirUsuario().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item0);

		Listadousuarios_item item1 = new Listadousuarios_item(_listadousuariosusuarioregistrado, null);
		item1.getSeguirUsuario().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item1);
	}

	public Verlistadodeseguidores(VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado,
			Usuario[] _usuarioSetCollection) {
		super(_verperfildeusuariousuarioregistrado);
		this._verperfildeusuariousuarioregistrado = _verperfildeusuariousuarioregistrado;

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

	public Verlistadodeseguidores(VerperfilUsuarionoregistrado _verperfilusuarionoregistrado, Usuario[] _usuarioSetCollection) {
		super(_verperfilusuarionoregistrado);
		this._verperfilusuarionoregistrado = _verperfilusuarionoregistrado;
		eliminarSeguidos();
		this.getBtnCerrar().addClickListener(event -> btnCerrar());

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
		eliminarSeguidos();
		this.getBtnCerrar().addClickListener(event -> btnCerrar());
		for (Usuario usuario : _usuarioSetCollection) {
			Listadodeusuariosadministrador_item item = new Listadodeusuariosadministrador_item(_verperfilaministrador,
					usuario);
			eliminarSeguidoresYSeguidos(item);
			this.getListadoSeguidores().as(VerticalLayout.class).add(item);
		}
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