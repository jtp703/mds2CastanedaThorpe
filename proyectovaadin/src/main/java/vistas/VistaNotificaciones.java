package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-notificaciones")
@JsModule("./views/vista-notificaciones.ts")
public class VistaNotificaciones extends LitTemplate {

    @Id("contenedorNotificaciones")
	private Element contenedorNotificaciones;
    
    

	public Element getContenedorNotificaciones() {
		return contenedorNotificaciones;
	}



	public void setContenedorNotificaciones(Element contenedorNotificaciones) {
		this.contenedorNotificaciones = contenedorNotificaciones;
	}



	public VistaNotificaciones() {
        // You can initialise any data required for the connected UI components here.
    }

}