package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-verlistadodetweetsfiltrado")
@JsModule("./views/vista-verlistadodetweetsfiltrado.ts")
public class VistaVerlistadodetweetsfiltrado extends LitTemplate {

    @Id("contenedorVerListadoTweetsFiltrados")
	private Element contenedorVerListadoTweetsFiltrados;
	@Id("contenedorCibernauta")
	private Element contenedorCibernauta;
	@Id("contenedorListadoTweetsFiltrado")
	private Element contenedorListadoTweetsFiltrado;

	public VistaVerlistadodetweetsfiltrado() {
        // You can initialise any data required for the connected UI components here.
    }

}