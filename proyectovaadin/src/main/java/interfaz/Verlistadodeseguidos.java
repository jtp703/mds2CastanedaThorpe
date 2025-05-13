package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Verlistadodeseguidos extends Verlistado {

	public Listadodeusuariosusuarioregistrado _listadousuariosusuarioregistrado;
	public VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado;

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
		item0.getSeguirUsuario().setVisible(false);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item0);

		Listadodeusuariosusuarioregistrado_item item1 = new Listadodeusuariosusuarioregistrado_item(_verperfildeusuariousuarioregistrado);
		item1.getSeguirUsuario().setVisible(false);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item1);

		this.getBtnCerrar().addClickListener(event -> btnCerrar());
	}

	private void btnCerrar() {
		MainView.Pantalla.volver();
	}
}