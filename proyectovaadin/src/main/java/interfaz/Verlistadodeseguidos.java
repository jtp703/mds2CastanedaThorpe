package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Verlistadodeseguidos extends Verlistado {
	
	public Listadousuarios _listadousuarios;
	
	public Verlistadodeseguidos(Listadousuarios _listadousuarios) {
		super(_listadousuarios);
		this.getListadoSeguidores().setVisible(false);
		this.getTituloSeguidores().setVisible(false);
		Listadousuarios_item item0 = new Listadousuarios_item(_listadousuarios);
		item0.getseguirUsuario().setVisible(false);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item0);
		
	}
}