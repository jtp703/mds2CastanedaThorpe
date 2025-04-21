package interfaz;

import vistas.*;
import org.vaadin.example.*;

/*import basededatos.iCibernauta;*/


public class Cibernauta extends VistaCibernauta{
	/*public iCibernauta _iCibernauta;*/
	public VerListadohashtags _verListadohashtags;
	public Vermuroprincipal _vermuroprincipal;
	public Verlistadogloblaldeusuarios _verlistadogloblaldeusuarios;
	
	MainView MainView;
	
	public Cibernauta(MainView MainView) {
		this.MainView = MainView;
	}
	
	public Cibernauta() {
		
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
}