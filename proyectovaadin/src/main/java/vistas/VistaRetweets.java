package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-retweets")
@JsModule("./views/vista-retweets.ts")
public class VistaRetweets extends LitTemplate {

    @Id("contenedorRetweets")
	private Element contenedorRetweets;
	@Id("btnCerrar")
	private Button btnCerrar;
	@Id("contenedorListadoRetweets")
	private Element contenedorListadoRetweets;

	public VistaRetweets() {
        // You can initialise any data required for the connected UI components here.
    }

}