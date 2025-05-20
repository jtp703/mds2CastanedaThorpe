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
		ListadotweetsAdministrador_item item1 = new ListadotweetsAdministrador_item(this);
		ListadotweetsAdministrador_item item2 = new ListadotweetsAdministrador_item(this);
		_item.add(item1);
		_item.add(item2);
		for(ListadotweetsAdministrador_item item: _item) {
			this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		}
	}
	public ListadotweetsAdministrador(VerlistadodetweetsfiltradoAdministrador _verlistadodetweetsfiltradoAdministrador) {
		super(_verlistadodetweetsfiltradoAdministrador);
	}
	
	public ListadotweetsAdministrador(VerperfilAdministrador _verperfiladministrador) {
		super(_verperfiladministrador);
		this.getContenedorNuevoTweet().setVisible(false);
		ListadotweetsAdministrador_item item1 = new ListadotweetsAdministrador_item(this);
		ListadotweetsAdministrador_item item2 = new ListadotweetsAdministrador_item(this);
		_item.add(item1);
		_item.add(item2);
		for(ListadotweetsAdministrador_item item: _item) {
			this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		}
	}
	
}