package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Verlistadodeseguidores extends Verlistado {
	
	public Listadodeusuariosusuarioregistrado _listadousuariosusuarioregistrado;
	public Listadodeusuariosusuarionoregistrado _listadodeusuariosusuarionoregistrado;
	public Listadodeusuariosadministrador _listadodeusuariosadministrador;
	public VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado;
	public VerperfilUsuarionoregistrado _verperfilusuarionoregistrado;
	public VerperfilAdministrador _verperfilaministrador;
	
	
	public Verlistadodeseguidores(Listadodeusuariosusuarioregistrado _listadousuariosusuarioregistrado) {
		super(_listadousuariosusuarioregistrado);
		this.getListadoSeguidos().setVisible(false);
		this.getSeguidos().setVisible(false);
		Listadousuarios_item item0 = new Listadousuarios_item(_listadousuariosusuarioregistrado);
		item0.getSeguirUsuario().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item0);
		
		Listadousuarios_item item1 = new Listadousuarios_item(_listadousuariosusuarioregistrado);
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
		item0.getContenedorSeguidoresSeguidos().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item0);
		
		Listadodeusuariosusuarioregistrado_item item1 = new Listadodeusuariosusuarioregistrado_item(_verperfildeusuariousuarioregistrado);
		item1.getSeguirUsuario().setVisible(false);
		item1.getContenedorSeguidoresSeguidos().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item1);
	}
	
	public Verlistadodeseguidores(VerperfilUsuarionoregistrado _verperfilusuarionoregistrado) {
		super(_verperfilusuarionoregistrado);
		this.getListadoSeguidos().setVisible(false);
		this.getSeguidos().setVisible(false);
		this.getBtnCerrar().addClickListener(event -> btnCerrar());
		
		Listadodeusuariosusuarionoregistrado_item item0 = new Listadodeusuariosusuarionoregistrado_item(_verperfilusuarionoregistrado);
		item0.getSeguirUsuario().setVisible(false);	
		item0.getContenedorSeguidoresSeguidos().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item0);
		
		Listadodeusuariosusuarionoregistrado_item item1 = new Listadodeusuariosusuarionoregistrado_item(_verperfilusuarionoregistrado);
		item1.getSeguirUsuario().setVisible(false);
		item1.getContenedorSeguidoresSeguidos().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item1);
	}
	
	public Verlistadodeseguidores(VerperfilAdministrador _verperfilaministrador) {
		super(_verperfilaministrador);
		this.getListadoSeguidos().setVisible(false);
		this.getSeguidos().setVisible(false);
		this.getBtnCerrar().addClickListener(event -> btnCerrar());
		
		Listadodeusuariosadministrador_item item0 = new Listadodeusuariosadministrador_item(_verperfilaministrador);
		item0.getSeguirUsuario().setVisible(false);
		item0.getContenedorSeguidoresSeguidos().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item0);
		
		Listadodeusuariosadministrador_item item1 = new Listadodeusuariosadministrador_item(_verperfilaministrador);
		item1.getSeguirUsuario().setVisible(false);
		item1.getContenedorSeguidoresSeguidos().setVisible(false);
		this.getListadoSeguidores().as(VerticalLayout.class).add(item1);
	}
	
	private void btnCerrar() {
		MainView.Pantalla.volver();
	}
}