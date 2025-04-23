package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerlistadohashtags;

public class VerListadohashtags extends VistaVerlistadohashtags {

	public Cibernauta _cibernauta;
	public Administrador admin;
	public Usuarioregistrado ur;
	public Usuarionoregistrado unr;
	public Listadodehashtags _listadodehashtags;
	public MainView main;
	
	public VerListadohashtags() {
		
	}

	public VerListadohashtags(Cibernauta _cibernauta) {
		this._cibernauta = _cibernauta;
	}

	public VerListadohashtags(Administrador admin) {
		this.admin = admin;
	}

	public VerListadohashtags(Usuarioregistrado ur) {
		this.ur = ur;
		Administrador admin = new Administrador(main);
		this.getContenedorCibernauta().as(VerticalLayout.class).add(admin);
		Listadodehashtags ldh = new Listadodehashtags(this);
		this.getContenedorListadoHashtags().as(VerticalLayout.class).add(ldh);
	}

	public VerListadohashtags(Usuarionoregistrado unr) {
		this.unr = unr;
	}

	public VerListadohashtags(Listadodehashtags _listadodehashtags) {
		this._listadodehashtags = _listadodehashtags;
	}

	public void Listado_Hashtags() {
		throw new UnsupportedOperationException();
	}
}