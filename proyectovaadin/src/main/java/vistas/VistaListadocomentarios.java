package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadocomentarios")
@JsModule("./views/vista-listadocomentarios.ts")
public class VistaListadocomentarios extends LitTemplate {

	@Id("contenedorListadoComentariosItem")
	private Element contenedorListadoComentariosItem;
	@Id("contenedorEscribirComentario")
	private HorizontalLayout contenedorEscribirComentario;
	@Id("contenedorListadoTweets")
	private Element contenedorListadoTweets;
	

	public Element getContenedorListadoComentariosItem() {
		return contenedorListadoComentariosItem;
	}


	public void setContenedorListadoComentariosItem(Element contenedorListadoComentariosItem) {
		this.contenedorListadoComentariosItem = contenedorListadoComentariosItem;
	}


	public HorizontalLayout getContenedorEscribirComentario() {
		return contenedorEscribirComentario;
	}


	public void setContenedorEscribirComentario(HorizontalLayout contenedorEscribirComentario) {
		this.contenedorEscribirComentario = contenedorEscribirComentario;
	}


	public Element getContenedorListadoTweets() {
		return contenedorListadoTweets;
	}


	public void setContenedorListadoTweets(Element contenedorListadoTweets) {
		this.contenedorListadoTweets = contenedorListadoTweets;
	}


	public VistaListadocomentarios() {
		// You can initialise any data required for the connected UI components here.
	}

}