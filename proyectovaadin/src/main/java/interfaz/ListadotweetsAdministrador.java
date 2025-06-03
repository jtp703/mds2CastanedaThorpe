package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Tweet;

public class ListadotweetsAdministrador extends Listadotweets {
	
	public VermuroprincipalAdministrador _vermuroprincipalAdministrador;
	public VerlistadodetweetsfiltradoAdministrador _verlistadodetweetsfiltradoAdministrador;
	public VerperfilAdministrador _verperfiladministrador;
	public Vector<ListadotweetsAdministrador_item> _item = new Vector<ListadotweetsAdministrador_item>();
	public Administrador _administrador;
	
	public ListadotweetsAdministrador(VermuroprincipalAdministrador _vermuroprincipalAdministrador) {
		super(_vermuroprincipalAdministrador);
		this.getContenedorNuevoTweet().setVisible(false);
		
		this._administrador = _vermuroprincipalAdministrador._administrador;
		
		Tweet[] tweets = this._administrador._iAdministrador.cargarTweets();
		for (int i = 0; i < tweets.length; i++) {
			ListadotweetsAdministrador_item item = new ListadotweetsAdministrador_item(this, tweets[i]);
			_item.add(item);
			this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		}
		
	}
	public ListadotweetsAdministrador(VerlistadodetweetsfiltradoAdministrador _verlistadodetweetsfiltradoAdministrador) {
		super(_verlistadodetweetsfiltradoAdministrador);
	}
	
	public ListadotweetsAdministrador(VerperfilAdministrador _verperfiladministrador) {
		super(_verperfiladministrador);
		this.getContenedorNuevoTweet().setVisible(false);
		
		Tweet[] tweets = this._administrador._iAdministrador.cargarTweets();
		
		for (int i = 0; i < tweets.length; i++) {
			ListadotweetsAdministrador_item item = new ListadotweetsAdministrador_item(this, tweets[i]);
			_item.add(item);
			this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		}
	}
	
}