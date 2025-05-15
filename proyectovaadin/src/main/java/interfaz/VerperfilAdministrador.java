package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerperfilAdministrador extends Verperfildeusuario {
	
	public Administrador _administrador;
	public ListadotweetsAdministrador _listadotweetsadministrador;
	public Banearusuario _banearusuario;
	public Verlistadodeseguidores verListadoseguidores;
	public Verlistadodeseguidos verListadoseguidos;
	
	public VerperfilAdministrador(Administrador _administrador) {
		super(_administrador);
		this._listadotweetsadministrador = new ListadotweetsAdministrador(this);
		this._listadotweetsadministrador.getContenedorNuevoTweet().setVisible(false);
		this.getContenedorListadotweets().as(VerticalLayout.class).add(_listadotweetsadministrador);
		this.getBtnBloquear().setVisible(false);
		this.getBtnSeguir().setVisible(false);
		this.getBtnEditarPerfil().setVisible(false);
		this.getBtnEliminarPerfil().setVisible(false);
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getVerSeguidores().addClickListener(event -> Verlistadodeseguidores());
		this.getVerSeguidos().addClickListener(event -> Verlistadodeseguidos());
		this.getBtnBanearUsuario().addClickListener(event -> Banear_usuarios());
	}

	public void Banear_usuarios() {
		_banearusuario = new Banearusuario(this);
		MainView.Pantalla.cambiarVista(_banearusuario);
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
		System.out.println("Volver a la vista anterior desde ver perfil administrador");
	}
	
	private void Verlistadodeseguidores() {
		verListadoseguidores = new Verlistadodeseguidores(this);
		MainView.Pantalla.cambiarVista(verListadoseguidores);
	}

	private void Verlistadodeseguidos() {
		verListadoseguidos = new Verlistadodeseguidos(this);
		MainView.Pantalla.cambiarVista(verListadoseguidos);
	}
	
}