package interfaz;

import vistas.*;
import org.vaadin.example.*;

import base_de_datos.iCibernauta;

/*import basededatos.iCibernauta;*/


public class Cibernauta extends VistaCibernauta{
	public iCibernauta _iCibernauta = new base_de_datos.BDPrincipal();
	public VerListadohashtags _verListadohashtags;
	public Vermuroprincipal _vermuroprincipal;
	public Verlistadogloblaldeusuarios _verlistadogloblaldeusuarios;
	public Notificacionesdeusuario _verNotificaciones;
	
	MainView mainView;
	
	public Cibernauta(MainView mainView) {
		this.mainView = mainView;
	}

	public void VerListadohashtags() {
		throw new UnsupportedOperationException();
	}

	public void Vermuroprincipal() {
		throw new UnsupportedOperationException();
	}

	public void Verlistadogloblaldeusuarios() {
		throw new UnsupportedOperationException();
	}
	
	public void VerNotificaciones() {
		throw new UnsupportedOperationException();
	}
}