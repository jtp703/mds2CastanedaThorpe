package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListadotweets;

public class Listadotweets extends VistaListadotweets {
	public Megustas _megustas;
	public Retweets _retweets;
	public Verlistadodetweetsfiltrado _verlistadodetweetsfiltrado;
	public Verperfildeusuario _verperfildeusuario;
	public Vermuroprincipal _vermuroprincipal;
	public Vector<Listadotweets_item> _item = new Vector<Listadotweets_item>();
	

	public Listadotweets(Megustas _megustas) {
		this._megustas = _megustas;
	}
	public Listadotweets(Retweets _retweets) {
		this._retweets = _retweets;
	}
	public Listadotweets(Verlistadodetweetsfiltrado _verlistadodetweetsfiltrado) {
		this._verlistadodetweetsfiltrado = _verlistadodetweetsfiltrado;
		Listadotweets_item i = new Listadotweets_item(this, null);
		i.getBtnEliminarTweet().setVisible(false);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(i);
		Listadotweets_item is = new Listadotweets_item(this, null);
		is.getBtnEliminarTweet().setVisible(false);
		this.getContenedorListadoTweets().as(VerticalLayout.class).add(is);
	}
	public Listadotweets(Verperfildeusuario _verperfildeusuario) {
		this._verperfildeusuario = _verperfildeusuario;
	}
	public Listadotweets(Vermuroprincipal _vermuroprincipal) {
		this._vermuroprincipal = _vermuroprincipal;
	}
	
}