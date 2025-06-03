package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Usuario;

public class Verlistadodeseguidos extends Verlistado {

	public Listadodeusuariosusuarioregistrado _listadousuariosusuarioregistrado;
	public VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado;
	public VerperfilUsuarionoregistrado _verperfilusuarionoregistrado;
	public VerperfilAdministrador _verperfilaministrador;

	public Verlistadodeseguidos(Listadousuarios _listadousuarios) {
		super(_listadousuarios);
		this.getListadoSeguidores().setVisible(false);
		this.getTituloSeguidores().setVisible(false);
		Listadousuarios_item item0 = new Listadousuarios_item(_listadousuarios, null);
		item0.getSeguirUsuario().setVisible(false);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item0);

		Listadousuarios_item item1 = new Listadousuarios_item(_listadousuarios, null);
		item1.getSeguirUsuario().setVisible(false);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item1);

		this.getBtnCerrar().addClickListener(event -> btnCerrar());
	}

	public Verlistadodeseguidos(VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado) {
		super(_verperfildeusuariousuarioregistrado);
		this.getListadoSeguidores().setVisible(false);
		this.getTituloSeguidores().setVisible(false);
		Listadodeusuariosusuarioregistrado_item item0 = new Listadodeusuariosusuarioregistrado_item(_verperfildeusuariousuarioregistrado, null);
		eliminarSeguidoresYSeguidos(item0);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item0);

		Listadodeusuariosusuarioregistrado_item item1 = new Listadodeusuariosusuarioregistrado_item(_verperfildeusuariousuarioregistrado, null);
		eliminarSeguidoresYSeguidos(item1);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item1);

		this.getBtnCerrar().addClickListener(event -> btnCerrar());
	}
	
	public Verlistadodeseguidos(VerperfilUsuarionoregistrado _verperfilusuarionoregistrado) {
		super(_verperfilusuarionoregistrado);
		this.getListadoSeguidores().setVisible(false);
		this.getTituloSeguidores().setVisible(false);
		Listadodeusuariosusuarionoregistrado_item item0 = new Listadodeusuariosusuarionoregistrado_item(_verperfilusuarionoregistrado, null);
		eliminarSeguidoresYSeguidos(item0);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item0);

		Listadodeusuariosusuarionoregistrado_item item1 = new Listadodeusuariosusuarionoregistrado_item(_verperfilusuarionoregistrado, null);
		eliminarSeguidoresYSeguidos(item1);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item1);

		this.getBtnCerrar().addClickListener(event -> btnCerrar());
	}
	
	public Verlistadodeseguidos(VerperfilAdministrador _verperfilaministrador, Usuario[] _usuarioSetCollection) {
		super(_verperfilaministrador);
		this.getListadoSeguidores().setVisible(false);
		this.getTituloSeguidores().setVisible(false);
		for (Usuario usuario : _usuarioSetCollection) {
			Listadodeusuariosadministrador_item item = new Listadodeusuariosadministrador_item(_verperfilaministrador, usuario);
			eliminarSeguidoresYSeguidos(item);
			this.getListadoSeguidos().as(VerticalLayout.class).add(item);
		}

		this.getBtnCerrar().addClickListener(event -> btnCerrar());
	}
	
	private void eliminarSeguidoresYSeguidos(Listadousuarios_item item) {
		item.getSeguirUsuario().setVisible(false);
		item.getContenedorSeguidoresSeguidos().setVisible(false);
	}

	private void btnCerrar() {
		MainView.Pantalla.volver();
	}
}