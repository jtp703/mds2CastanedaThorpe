package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-notificaciones_item")
@JsModule("./views/vista-notificaciones_item.ts")
public class VistaNotificaciones_item extends LitTemplate {

    @Id("_layoutNotificacionUsuario")
	private Element _layoutNotificacionUsuario;
	@Id("_LayoutRetweetUsuario")
	private Element _LayoutRetweetUsuario;
	@Id("_LayoutMegustaUsuario")
	private Element _LayoutMegustaUsuario;
	@Id("_LayoutSeguimientoUsuario")
	private Element _LayoutSeguimientoUsuario;
	@Id("_LayoutMencionUsuario")
	private Element _LayoutMencionUsuario;
	@Id("_verPerfilRetweet")
	private Element _verPerfilRetweet;
	@Id("_verPerfilMegusta")
	private Element _verPerfilMegusta;
	@Id("_verPerfilSeguidor")
	private Element _verPerfilSeguidor;
	@Id("_verPerfilMencion")
	private Element _verPerfilMencion;

	public VistaNotificaciones_item() {
        // You can initialise any data required for the connected UI components here.
    }

}