package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;

@Tag("vista-googlelogin")
@JsModule("./views/vista-googlelogin.ts")
public class VistaGooglelogin extends LitTemplate {

    @Id("div")
    private Div div;

    public VistaGooglelogin() {
        // You can initialise any data required for the connected UI components here.
    }

}