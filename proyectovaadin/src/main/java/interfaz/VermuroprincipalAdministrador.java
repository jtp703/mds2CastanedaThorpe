package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VermuroprincipalAdministrador extends Vermuroprincipal {

	public Administrador _administrador;
	public ListadotweetsAdministrador _listadotweetsAdministrador;

	public VermuroprincipalAdministrador(Administrador _administrador) {
		super(_administrador);
		this._administrador = _administrador;
		_listadotweetsAdministrador = new ListadotweetsAdministrador(this);
		this.getContenedorListadoTweetsMuroPrincipal().as(VerticalLayout.class).add(_listadotweetsAdministrador);
	}

	public VermuroprincipalAdministrador(ListadotweetsAdministrador _listadotweetsAdministrador) {
		super(_listadotweetsAdministrador);
	}

	public void ListadotweetsAdministrador() {
		throw new UnsupportedOperationException();
	}
}