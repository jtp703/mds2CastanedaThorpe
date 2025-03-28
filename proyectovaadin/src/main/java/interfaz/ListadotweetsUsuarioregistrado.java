package interfaz;

import java.util.Vector;

public class ListadotweetsUsuarioregistrado extends Listadotweets {
	public VermuroprincipalUsuarioregistrado _vermuroprincipalUsuarioregistrado;
	public VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado;
	public VerperfilUsuarioregistrado _verperfilUsuarioregistrado;
	public Vector<ListadotweetsUsuarioregistrado_item> _listadotweetsUsuarioregistrado = new Vector<ListadotweetsUsuarioregistrado_item>();
	
	public ListadotweetsUsuarioregistrado(VermuroprincipalUsuarioregistrado _vermuroprincipalUsuarioregistrado) {
		super(_vermuroprincipalUsuarioregistrado);
	}
	
	public ListadotweetsUsuarioregistrado(VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado) {
		super(_verlistadodetweetsfiltradoUsuarioregistrado);
	}
	
	public ListadotweetsUsuarioregistrado(VerperfilUsuarioregistrado _verperfilUsuarioregistrado) {
		super(_verperfilUsuarioregistrado);
	}
}