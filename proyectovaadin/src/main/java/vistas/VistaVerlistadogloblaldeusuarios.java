package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-verlistadogloblaldeusuarios")
@JsModule("./views/vista-verlistadogloblaldeusuarios.ts")
public class VistaVerlistadogloblaldeusuarios extends LitTemplate {

    @Id("contenedorVerListadoGlobalUsuarios")
	private Element contenedorVerListadoGlobalUsuarios;
	@Id("contenedorCibernauta")
	private Element contenedorCibernauta;
	@Id("contenedorListadoUsuarios")
	private Element contenedorListadoUsuarios;
	
	

	public Element getContenedorVerListadoGlobalUsuarios() {
		return contenedorVerListadoGlobalUsuarios;
	}



	public void setContenedorVerListadoGlobalUsuarios(Element contenedorVerListadoGlobalUsuarios) {
		this.contenedorVerListadoGlobalUsuarios = contenedorVerListadoGlobalUsuarios;
	}



	public Element getContenedorCibernauta() {
		return contenedorCibernauta;
	}



	public void setContenedorCibernauta(Element contenedorCibernauta) {
		this.contenedorCibernauta = contenedorCibernauta;
	}



	public Element getContenedorListadoUsuarios() {
		return contenedorListadoUsuarios;
	}



	public void setContenedorListadoUsuarios(Element contenedorListadoUsuarios) {
		this.contenedorListadoUsuarios = contenedorListadoUsuarios;
	}



	public VistaVerlistadogloblaldeusuarios() {
        // You can initialise any data required for the connected UI components here.
    }

}