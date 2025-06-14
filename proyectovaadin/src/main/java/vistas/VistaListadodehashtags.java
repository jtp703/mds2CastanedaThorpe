package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadodehashtags")
@JsModule("./views/vista-listadodehashtags.ts")
public class VistaListadodehashtags extends LitTemplate {

	@Id("contenedorHashtags")
	private Element contenedorHashtags;

	public Element getContenedorHashtags() {
		return contenedorHashtags;
	}

	public void setContenedorHashtags(Element contenedorHashtags) {
		this.contenedorHashtags = contenedorHashtags;
	}

	public VistaListadodehashtags() {
		// You can initialise any data required for the connected UI components here.
	}

}