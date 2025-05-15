package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadotweetsAdministrador extends Listadotweets {
	
	public VermuroprincipalAdministrador _vermuroprincipalAdministrador;
	public VerlistadodetweetsfiltradoAdministrador _verlistadodetweetsfiltradoAdministrador;
	public VerperfilAdministrador _verperfiladministrador;
	public Vector<ListadotweetsAdministrador_item> _item = new Vector<ListadotweetsAdministrador_item>();
	
	public ListadotweetsAdministrador(VermuroprincipalAdministrador _vermuroprincipalAdministrador) {
		super(_vermuroprincipalAdministrador);
		this.getContenedorNuevoTweet().setVisible(false);
		ListadotweetsAdministrador_item item = new ListadotweetsAdministrador_item(this);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		ListadotweetsAdministrador_item item2 = new ListadotweetsAdministrador_item(this);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(item2);
	}
	public ListadotweetsAdministrador(VerlistadodetweetsfiltradoAdministrador _verlistadodetweetsfiltradoAdministrador) {
		super(_verlistadodetweetsfiltradoAdministrador);
	}
	
	public ListadotweetsAdministrador(VerperfilAdministrador _verperfiladministrador) {
		super(_verperfiladministrador);
		this.getContenedorNuevoTweet().setVisible(false);
		ListadotweetsAdministrador_item item = new ListadotweetsAdministrador_item(this);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		ListadotweetsAdministrador_item item2 = new ListadotweetsAdministrador_item(this);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(item2);
	}
	
}