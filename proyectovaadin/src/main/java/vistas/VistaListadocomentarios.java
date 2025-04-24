package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;

@Tag("vista-listadocomentarios")
@JsModule("./views/vista-listadocomentarios.ts")
public class VistaListadocomentarios extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaListadotweets_item")
	private Element vistaListadotweets_item;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("contendorListadoComentarios")
	private Element contendorListadoComentarios;
	@Id("contenedorComentariosItem")
	private Element contenedorComentariosItem;
	@Id("contenedorEscribirComentarios")
	private Element contenedorEscribirComentarios;
	@Id("verPerfil")
	private Element verPerfil;
	@Id("textAreaComentario")
	private TextArea textAreaComentario;
	@Id("btnEnviarComentario")
	private Button btnEnviarComentario;

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