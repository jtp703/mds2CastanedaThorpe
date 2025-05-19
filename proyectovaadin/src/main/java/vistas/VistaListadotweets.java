package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.button.Button;

@Tag("vista-listadotweets")
@JsModule("./views/vista-listadotweets.ts")
public class VistaListadotweets extends LitTemplate {

	@Id("contenedorNuevoTweet")
	private Element contenedorNuevoTweet;
	
	@Id("contenedorListadoTweets")
	private Element contenedorListadoTweets;
	@Id("contenedorListadoTweets_item")
	private Element contenedorListadoTweets_item;

	@Id("btnEnviarTweet")
	private Button btnEnviarTweet;

	@Id("verPerfilPersonal")
	private Button verPerfilPersonal;

	public VistaListadotweets() {
		// You can initialise any data required for the connected UI components here.
	}

	public Element getContenedorListadoTweets() {
		return contenedorListadoTweets;
	}

	public void setContenedorListadoTweets(Element contenedorListadoTweets) {
		this.contenedorListadoTweets = contenedorListadoTweets;
	}

	public Element getContenedorNuevoTweet() {
		return contenedorNuevoTweet;
	}

	public void setContenedorNuevoTweet(Element contenedorNuevoTweet) {
		this.contenedorNuevoTweet = contenedorNuevoTweet;
	}
	public Button getVerPerfilPersonal() {
		return verPerfilPersonal;
	}
	public void setVerPerfilPersonal(Button verPerfilPersonal) {
		this.verPerfilPersonal = verPerfilPersonal;
	}
	
	public Element getContenedorListadoTweets_item() {
		return contenedorListadoTweets_item;
	}
	public void setContenedorListadoTweets_item(Element contenedorListadoTweets_item) {
		this.contenedorListadoTweets_item = contenedorListadoTweets_item;
	}
	public Button getBtnEnviarTweet() {
		return btnEnviarTweet;
	}
	public void setBtnEnviarTweet(Button btnEnviarTweet) {
		this.btnEnviarTweet = btnEnviarTweet;
	}

}