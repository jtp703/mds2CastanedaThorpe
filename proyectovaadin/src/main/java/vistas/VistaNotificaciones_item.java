package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

@Tag("vista-notificaciones_item")
@JsModule("./views/vista-notificaciones_item.ts")
public class VistaNotificaciones_item extends LitTemplate {

    @Id("_layoutNotificacionUsuario")
	private Element _layoutNotificacionUsuario;
	@Id("verperfil")
	private Button verperfil;
	@Id("tipoNotificacion")
	private Label tipoNotificacion;

	public VistaNotificaciones_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element get_layoutNotificacionUsuario() {
		return _layoutNotificacionUsuario;
	}

	public void set_layoutNotificacionUsuario(Element _layoutNotificacionUsuario) {
		this._layoutNotificacionUsuario = _layoutNotificacionUsuario;
	}

	public Button getVerperfil() {
		return verperfil;
	}

	public void setVerperfil(Button verperfil) {
		this.verperfil = verperfil;
	}

	public Label getTipoNotificacion() {
		return tipoNotificacion;
	}

	public void setTipoNotificacion(Label tipoNotificacion) {
		this.tipoNotificacion = tipoNotificacion;
	}
	
	
}