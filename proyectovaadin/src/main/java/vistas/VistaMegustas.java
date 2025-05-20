package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

@Tag("vista-megustas")
@JsModule("./views/vista-megustas.ts")
public class VistaMegustas extends LitTemplate {

    @Id("contenedorMegustas")
	private Element contenedorMegustas;
	
	public Element getContenedorMegustas() {
		return contenedorMegustas;
	}

	public void setContenedorMegustas(Element contenedorMegustas) {
		this.contenedorMegustas = contenedorMegustas;
	}

	public VistaMegustas() {
        // You can initialise any data required for the connected UI components here.
    }

}