package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerlistadodetweetsfiltradoUsuarionoregistrado extends Verlistadodetweetsfiltrado{

	public Usuarionoregistrado unr;
	public ListadotweetsUsuarionoregistrado ltunr;
	
	public VerlistadodetweetsfiltradoUsuarionoregistrado(Usuarionoregistrado unr) {
		super(unr);
		this.unr = unr;
		unr.getContenedorVerPerfilPersonal().setVisible(false);
		this.getContenedorCibernauta().as(VerticalLayout.class).add(unr);
		ListadotweetsUsuarionoregistrado_item item0 = new ListadotweetsUsuarionoregistrado_item(ltunr, null);
		this.getContenedorListadoTweetsFiltrado().as(VerticalLayout.class).add(item0);
		ListadotweetsUsuarionoregistrado_item item1 = new ListadotweetsUsuarionoregistrado_item(ltunr, null);
		this.getContenedorListadoTweetsFiltrado().as(VerticalLayout.class).add(item1);
	}
	
	public VerlistadodetweetsfiltradoUsuarionoregistrado(ListadotweetsUsuarionoregistrado ltunr) {
		super(ltunr);
	}	
	
	public void ListadotweetsUsuarionoregistrado() {
		throw new UnsupportedOperationException();
	}
}
