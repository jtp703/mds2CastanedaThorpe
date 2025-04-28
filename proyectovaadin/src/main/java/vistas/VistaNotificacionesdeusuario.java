package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-notificacionesdeusuario")
@JsModule("./views/vista-notificacionesdeusuario.ts")
public class VistaNotificacionesdeusuario extends LitTemplate {

	@Id("contenedorNotificacionesUsuario")
	private Element contenedorNotificacionesUsuario;
	@Id("contenedorCibernauta")
	private Element contenedorCibernauta;
	@Id("contemdorListadoNotificaciones")
	private Element contemdorListadoNotificaciones;

	public Element getContenedorNotificacionesUsuario() {
		return contenedorNotificacionesUsuario;
	}

	public void setContenedorNotificacionesUsuario(Element contenedorNotificacionesUsuario) {
		this.contenedorNotificacionesUsuario = contenedorNotificacionesUsuario;
	}

	public Element getContenedorCibernauta() {
		return contenedorCibernauta;
	}

	public void setContenedorCibernauta(Element contenedorCibernauta) {
		this.contenedorCibernauta = contenedorCibernauta;
	}

	public Element getContemdorListadoNotificaciones() {
		return contemdorListadoNotificaciones;
	}

	public void setContemdorListadoNotificaciones(Element contemdorListadoNotificaciones) {
		this.contemdorListadoNotificaciones = contemdorListadoNotificaciones;
	}

	public VistaNotificacionesdeusuario() {
		// You can initialise any data required for the connected UI components here.
	}

}