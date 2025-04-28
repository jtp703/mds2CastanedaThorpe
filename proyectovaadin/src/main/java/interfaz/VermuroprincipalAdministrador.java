package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VermuroprincipalAdministrador extends Vermuroprincipal {

	public MainView main;
	public Administrador _administrador;
	public ListadotweetsAdministrador _listadotweetsAdministrador;
	
	public VermuroprincipalAdministrador() {
		
	}

	public VermuroprincipalAdministrador(Administrador _administrador) {
		super(_administrador);
		Administrador admin = new Administrador(main);
		this.getContenedorCibernauta().as(VerticalLayout.class).add(admin);
		ListadotweetsAdministrador lta = new ListadotweetsAdministrador(this);
		this.getContenedorListadoTweetsMuroPrincipal().as(VerticalLayout.class).add(lta);
	}

	public VermuroprincipalAdministrador(ListadotweetsAdministrador _listadotweetsAdministrador) {
		super(_listadotweetsAdministrador);
	}


	public void ListadotweetsAdministrador() {
		throw new UnsupportedOperationException();
	}
}