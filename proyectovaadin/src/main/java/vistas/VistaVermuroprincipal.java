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

	public VistaVermuroprincipal() {
        // You can initialise any data required for the connected UI components here.
    }

}