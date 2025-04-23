package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-vermuroprincipal")
@JsModule("./views/vista-vermuroprincipal.ts")
public class VistaVermuroprincipal extends LitTemplate {

    @Id("contenedorVerMuroPrincipal")
	private Element contenedorVerMuroPrincipal;
	@Id("contenedorCibernauta")
	private Element contenedorCibernauta;
	@Id("contenedorListadoTweetsMuroPrincipal")
	private Element contenedorListadoTweetsMuroPrincipal;

	
	
	public Element getContenedorVerMuroPrincipal() {
		return contenedorVerMuroPrincipal;
	}



	public void setContenedorVerMuroPrincipal(Element contenedorVerMuroPrincipal) {
		this.contenedorVerMuroPrincipal = contenedorVerMuroPrincipal;
	}



	public Element getContenedorCibernauta() {
		return contenedorCibernauta;
	}



	public void setContenedorCibernauta(Element contenedorCibernauta) {
		this.contenedorCibernauta = contenedorCibernauta;
	}



	public Element getContenedorListadoTweetsMuroPrincipal() {
		return contenedorListadoTweetsMuroPrincipal;
	}



	public void setContenedorListadoTweetsMuroPrincipal(Element contenedorListadoTweetsMuroPrincipal) {
		this.contenedorListadoTweetsMuroPrincipal = contenedorListadoTweetsMuroPrincipal;
	}



	public VistaVermuroprincipal() {
        // You can initialise any data required for the connected UI components here.
    }

}