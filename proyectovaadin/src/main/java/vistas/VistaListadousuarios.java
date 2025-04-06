package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

@Tag("vista-listadousuarios")
@JsModule("./views/vista-listadousuarios.ts")
public class VistaListadousuarios extends LitTemplate {

    @Id("contenedorItemsUsuario")
	private Element contenedorItemsUsuario;

    

	public Element getContenedorItemsUsuario() {
		return contenedorItemsUsuario;
	}



	public void setContenedorItemsUsuario(Element contenedorItemsUsuario) {
		this.contenedorItemsUsuario = contenedorItemsUsuario;
	}



	public VistaListadousuarios() {
        // You can initialise any data required for the connected UI components here.
    }

}