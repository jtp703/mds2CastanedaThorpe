package interfaz;

import java.util.Vector;

public class ListadotweetsAdministrador extends Listadotweets {
	public VermuroprincipalAdministrador _vermuroprincipalAdministrador;
	public VerlistadodetweetsfiltradoAdministrador _verlistadodetweetsfiltradoAdministrador;
	public Vector<ListadotweetsAdministrador_item> _item = new Vector<ListadotweetsAdministrador_item>();
	
	public ListadotweetsAdministrador(VermuroprincipalAdministrador _vermuroprincipalAdministrador) {
		super(_vermuroprincipalAdministrador);
	}
	public ListadotweetsAdministrador(VerlistadodetweetsfiltradoAdministrador _verlistadodetweetsfiltradoAdministrador) {
		super(_verlistadodetweetsfiltradoAdministrador);
	}
}