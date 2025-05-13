package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Verlistadodeseguidores extends Verlistado {
	
	public Listadousuarios _listadousuarios;
	public VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado;
	
	public Verlistadodeseguidores(Listadousuarios _listadousuarios) {
		super(_listadousuarios);
		this.getListadoSeguidos().setVisible(false);
		this.getSeguidos().setVisible(false);
		Listadousuarios_item item0 = new Listadousuarios_item(_listadousuarios);
		item0.getseguirUsuario().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item0);
		
		Listadousuarios_item item1 = new Listadousuarios_item(_listadousuarios);
		item1.getseguirUsuario().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item1);
	}
	public Verlistadodeseguidores(VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado) {
		super(_verperfildeusuariousuarioregistrado);
		this.getListadoSeguidos().setVisible(false);
		this.getSeguidos().setVisible(false);
		this.getBtnCerrar().addClickListener(event -> btnCerrar());
		Listadousuarios_item item0 = new Listadousuarios_item(_listadousuarios);
		item0.getseguirUsuario().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item0);
		
		Listadousuarios_item item1 = new Listadousuarios_item(_listadousuarios);
		item1.getseguirUsuario().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item1);
	}
	
	private void btnCerrar() {
		MainView.Pantalla.volver();
	}
}