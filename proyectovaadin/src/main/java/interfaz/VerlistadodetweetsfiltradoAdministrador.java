package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerlistadodetweetsfiltradoAdministrador extends Verlistadodetweetsfiltrado {

	public Administrador _administrador;
	public ListadotweetsAdministrador _listadotweetsAdministrador;

	public VerlistadodetweetsfiltradoAdministrador(Administrador _administrador) {
		super(_administrador);
		this._administrador = _administrador;
		this._administrador.getContenedorRegistro().setVisible(false);
		this._administrador.getContenedorVerPerfilPersonal().setVisible(false);
		this.getContenedorCibernauta().as(VerticalLayout.class).add(this._administrador);
		ListadotweetsAdministrador_item item0 = new ListadotweetsAdministrador_item(_listadotweetsAdministrador);
		this.getContenedorListadoTweetsFiltrado().as(VerticalLayout.class).add(item0);
		ListadotweetsAdministrador_item item1 = new ListadotweetsAdministrador_item(_listadotweetsAdministrador);
		this.getContenedorListadoTweetsFiltrado().as(VerticalLayout.class).add(item1);
	}

	public VerlistadodetweetsfiltradoAdministrador(ListadotweetsAdministrador _listadotweetsAdministrador) {
		super(_listadotweetsAdministrador);
	}

	public void ListadotweetsAdministrador() {
		throw new UnsupportedOperationException();
	}
}