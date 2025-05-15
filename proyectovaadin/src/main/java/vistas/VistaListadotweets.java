package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.NativeButton;

@Tag("vista-listadotweets")
@JsModule("./views/vista-listadotweets.ts")
public class VistaListadotweets extends LitTemplate {

	@Id("contenedorNuevoTweet")
	private Element contenedorNuevoTweet;
	@Id("enviarTweet")
	private NativeButton enviarTweet;
	@Id("verPerfilPersonal")
	private Element verPerfilPersonal;
	@Id("contenedorListadoTweets")
	private Element contenedorListadoTweets;
	@Id("contenedorListadoTweets_item")
	private Element contenedorListadoTweets_item;

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

	public NativeButton getEnviarTweet() {
		return enviarTweet;
	}

	public void setEnviarTweet(NativeButton enviarTweet) {
		this.enviarTweet = enviarTweet;
	}

	public Element getVerPerfilPersonal() {
		return verPerfilPersonal;
	}

	public void setVerPerfilPersonal(Element verPerfilPersonal) {
		this.verPerfilPersonal = verPerfilPersonal;
	}
	
	public Element getContenedorListadoTweets_item() {
		return contenedorListadoTweets_item;
	}
	public void setContenedorListadoTweets_item(Element contenedorListadoTweets_item) {
		this.contenedorListadoTweets_item = contenedorListadoTweets_item;
	}

}