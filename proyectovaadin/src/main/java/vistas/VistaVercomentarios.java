package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-vercomentarios")
@JsModule("./views/vista-vercomentarios.ts")
public class VistaVercomentarios extends LitTemplate {

	@Id("contenedorTweet")
	private Element contenedorTweet;
	@Id("contenedorListadoComentarios")
	private Element contenedorListadoComentarios;
	@Id("btnVovler")
	private Button btnVovler;

	public Element getContenedorTweet() {
		return contenedorTweet;
	}

	public void setContenedorTweet(Element contenedorTweet) {
		this.contenedorTweet = contenedorTweet;
	}

	public Element getContenedorListadoComentarios() {
		return contenedorListadoComentarios;
	}

	public void setContenedorListadoComentarios(Element contenedorListadoComentarios) {
		this.contenedorListadoComentarios = contenedorListadoComentarios;
	}

	public Button getBtnVovler() {
		return btnVovler;
	}

	public void setBtnVovler(Button btnVovler) {
		this.btnVovler = btnVovler;
	}

	public VistaVercomentarios() {
		// You can initialise any data required for the connected UI components here.
	}

}