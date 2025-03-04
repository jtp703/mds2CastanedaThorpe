package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

@Tag("vista-retweets")
@JsModule("./views/vista-retweets.ts")
public class VistaRetweets extends LitTemplate {

    public VistaRetweets() {
        // You can initialise any data required for the connected UI components here.
    }

}