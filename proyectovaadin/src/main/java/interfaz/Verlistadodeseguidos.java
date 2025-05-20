package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Verlistadodeseguidos extends Verlistado {

	public Listadodeusuariosusuarioregistrado _listadousuariosusuarioregistrado;
	public VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado;
	public VerperfilUsuarionoregistrado _verperfilusuarionoregistrado;
	public VerperfilAdministrador _verperfilaministrador;

	public Verlistadodeseguidos(Listadousuarios _listadousuarios) {
		super(_listadousuarios);
		this.getListadoSeguidores().setVisible(false);
		this.getTituloSeguidores().setVisible(false);
		Listadousuarios_item item0 = new Listadousuarios_item(_listadousuarios);
		item0.getSeguirUsuario().setVisible(false);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item0);

		Listadousuarios_item item1 = new Listadousuarios_item(_listadousuarios);
		item1.getSeguirUsuario().setVisible(false);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item1);

		this.getBtnCerrar().addClickListener(event -> btnCerrar());
	}

	public Verlistadodeseguidos(VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado) {
		super(_verperfildeusuariousuarioregistrado);
		this.getListadoSeguidores().setVisible(false);
		this.getTituloSeguidores().setVisible(false);
		Listadodeusuariosusuarioregistrado_item item0 = new Listadodeusuariosusuarioregistrado_item(_verperfildeusuariousuarioregistrado);
		eliminarSeguidoresYSeguidos(item0);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item0);

		Listadodeusuariosusuarioregistrado_item item1 = new Listadodeusuariosusuarioregistrado_item(_verperfildeusuariousuarioregistrado);
		eliminarSeguidoresYSeguidos(item1);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item1);

		this.getBtnCerrar().addClickListener(event -> btnCerrar());
	}
	
	public Verlistadodeseguidos(VerperfilUsuarionoregistrado _verperfilusuarionoregistrado) {
		super(_verperfilusuarionoregistrado);
		this.getListadoSeguidores().setVisible(false);
		this.getTituloSeguidores().setVisible(false);
		Listadodeusuariosusuarionoregistrado_item item0 = new Listadodeusuariosusuarionoregistrado_item(_verperfilusuarionoregistrado);
		eliminarSeguidoresYSeguidos(item0);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item0);

		Listadodeusuariosusuarionoregistrado_item item1 = new Listadodeusuariosusuarionoregistrado_item(_verperfilusuarionoregistrado);
		eliminarSeguidoresYSeguidos(item1);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item1);

		this.getBtnCerrar().addClickListener(event -> btnCerrar());
	}
	
	public Verlistadodeseguidos(VerperfilAdministrador _verperfilaministrador) {
		super(_verperfilaministrador);
		this.getListadoSeguidores().setVisible(false);
		this.getTituloSeguidores().setVisible(false);
		Listadodeusuariosadministrador_item item0 = new Listadodeusuariosadministrador_item(_verperfilaministrador);
		eliminarSeguidoresYSeguidos(item0);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item0);

		Listadodeusuariosadministrador_item item1 = new Listadodeusuariosadministrador_item(_verperfilaministrador);
		eliminarSeguidoresYSeguidos(item1);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item1);

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