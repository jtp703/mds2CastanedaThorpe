package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Verlistadodeseguidores extends Verlistado {
	
	public Listadodeusuariosusuarioregistrado _listadousuariosusuarioregistrado;
	public VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado;
	
	public Verlistadodeseguidores(Listadousuarios _listadousuarios) {
		super(_listadousuarios);
		this.getListadoSeguidos().setVisible(false);
		this.getSeguidos().setVisible(false);
		Listadousuarios_item item0 = new Listadousuarios_item(_listadousuarios);
		item0.getSeguirUsuario().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item0);
		
		Listadousuarios_item item1 = new Listadousuarios_item(_listadousuarios);
		item1.getSeguirUsuario().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item1);
	}
	public Verlistadodeseguidores(VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado) {
		super(_verperfildeusuariousuarioregistrado);
		this.getListadoSeguidos().setVisible(false);
		this.getSeguidos().setVisible(false);
		this.getBtnCerrar().addClickListener(event -> btnCerrar());
		
		Listadodeusuariosusuarioregistrado_item item0 = new Listadodeusuariosusuarioregistrado_item(_verperfildeusuariousuarioregistrado);
		item0.getSeguirUsuario().setVisible(false);		
		this.getListadoSeguidores().as(VerticalLayout.class).add(item0);
		
		Listadodeusuariosusuarioregistrado_item item1 = new Listadodeusuariosusuarioregistrado_item(_verperfildeusuariousuarioregistrado);
		item1.getSeguirUsuario().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item1);
	}
	
	private void btnCerrar() {
		MainView.Pantalla.volver();
	}
}