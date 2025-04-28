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

	@Id("contenedorEscribirComentarios")
	private Element contenedorEscribirComentarios;
	@Id("contenedorComentariosItem")
	private Element contenedorComentariosItem;
	@Id("contendorListadoComentarios")
	private Element contendorListadoComentarios;
	@Id("verPerfil")
	private Element verPerfil;
	@Id("textAreaComentario")
	private TextArea textAreaComentario;
	@Id("btnEnviarComentario")
	private Button btnEnviarComentario;

	public Element getContenedorEscribirComentarios() {
		return contenedorEscribirComentarios;
	}

	public void setContenedorEscribirComentarios(Element contenedorEscribirComentarios) {
		this.contenedorEscribirComentarios = contenedorEscribirComentarios;
	}

	public Element getContenedorComentariosItem() {
		return contenedorComentariosItem;
	}

	public void setContenedorComentariosItem(Element contenedorComentariosItem) {
		this.contenedorComentariosItem = contenedorComentariosItem;
	}

	public Element getContendorListadoComentarios() {
		return contendorListadoComentarios;
	}

	public void setContendorListadoComentarios(Element contendorListadoComentarios) {
		this.contendorListadoComentarios = contendorListadoComentarios;
	}

	public Element getVerPerfil() {
		return verPerfil;
	}

	public void setVerPerfil(Element verPerfil) {
		this.verPerfil = verPerfil;
	}

	public TextArea getTextAreaComentario() {
		return textAreaComentario;
	}

	public void setTextAreaComentario(TextArea textAreaComentario) {
		this.textAreaComentario = textAreaComentario;
	}

	public Button getBtnEnviarComentario() {
		return btnEnviarComentario;
	}

	public void setBtnEnviarComentario(Button btnEnviarComentario) {
		this.btnEnviarComentario = btnEnviarComentario;
	}

	public VistaListadocomentarios() {
		// You can initialise any data required for the connected UI components here.
	}

}