package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadotweets")
@JsModule("./views/vista-listadotweets.ts")
public class VistaListadotweets extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vistaListadotweets_item1")
	private Element vistaListadotweets_item1;
	@Id("vistaListadotweets_item")
	private Element vistaListadotweets_item;

	public VistaListadotweets() {
        // You can initialise any data required for the connected UI components here.
    }

}