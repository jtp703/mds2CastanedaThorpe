package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-notificaciones_item")
@JsModule("./views/vista-notificaciones_item.ts")
public class VistaNotificaciones_item extends LitTemplate {

    @Id("_layoutNotificacionUsuario")
	private Element _layoutNotificacionUsuario;
	@Id("_LayoutRetweetUsuario")
	private Element _LayoutRetweetUsuario;
	@Id("verperfil")
	private Button verperfil;

	public VistaNotificaciones_item() {
        // You can initialise any data required for the connected UI components here.
    }

}