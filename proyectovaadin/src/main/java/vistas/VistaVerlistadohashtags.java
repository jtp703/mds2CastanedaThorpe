package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-verlistadohashtags")
@JsModule("./views/vista-verlistadohashtags.ts")
public class VistaVerlistadohashtags extends LitTemplate {

    @Id("contenedorVerListadoHashtags")
	private Element contenedorVerListadoHashtags;
	@Id("contenedorCibernauta")
	private Element contenedorCibernauta;
	@Id("contenedorListadoHashtags")
	private Element contenedorListadoHashtags;
	
	

	public Element getContenedorVerListadoHashtags() {
		return contenedorVerListadoHashtags;
	}



	public void setContenedorVerListadoHashtags(Element contenedorVerListadoHashtags) {
		this.contenedorVerListadoHashtags = contenedorVerListadoHashtags;
	}



	public Element getContenedorCibernauta() {
		return contenedorCibernauta;
	}



	public void setContenedorCibernauta(Element contenedorCibernauta) {
		this.contenedorCibernauta = contenedorCibernauta;
	}



	public Element getContenedorListadoHashtags() {
		return contenedorListadoHashtags;
	}



	public void setContenedorListadoHashtags(Element contenedorListadoHashtags) {
		this.contenedorListadoHashtags = contenedorListadoHashtags;
	}



	public VistaVerlistadohashtags() {
        // You can initialise any data required for the connected UI components here.
    }

}