package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-notificaciones")
@JsModule("./views/vista-notificaciones.ts")
public class VistaNotificaciones extends LitTemplate {

    @Id("contenedorNotificaciones")
	private Element contenedorNotificaciones;
	@Id("contenedorNofiticiacionesItem")
	private Element contenedorNofiticiacionesItem;
	@Id("btnSeguidores")
	private Button btnSeguidores;
	@Id("btnMegustas")
	private Button btnMegustas;
	@Id("btnRetweets")
	private Button btnRetweets;
	@Id("btnMenciones")
	private Button btnMenciones;



	public Element getContenedorNotificaciones() {
		return contenedorNotificaciones;
	}

	public Element getContenedorNofiticiacionesItem() {
		return contenedorNofiticiacionesItem;
	}
	public void setContenedorNotificaciones(Element contenedorNotificaciones) {
		this.contenedorNotificaciones = contenedorNotificaciones;
	}
	
	public void setContenedorNofiticiacionesItem(Element contenedorNofiticiacionesItem) {
		this.contenedorNofiticiacionesItem = contenedorNofiticiacionesItem;
	}
	
	public Button getBtnSeguidores() {
		return btnSeguidores;
	}
	public void setBtnSeguidores(Button btnSeguidores) {
		this.btnSeguidores = btnSeguidores;
	}
	public Button getBtnMegustas() {
		return btnMegustas;
	}
	public void setBtnMegustas(Button btnMegustas) {
		this.btnMegustas = btnMegustas;
	}
	public Button getBtnRetweets() {
		return btnRetweets;
	}
	public void setBtnRetweets(Button btnRetweets) {
		this.btnRetweets = btnRetweets;
	}
	public Button getBtnMenciones() {
		return btnMenciones;
	}
	public void setBtnMenciones(Button btnMenciones) {
		this.btnMenciones = btnMenciones;
	}
	

	// You can initialise any data required for the connected UI components here.

	public VistaNotificaciones() {
        // You can initialise any data required for the connected UI components here.
    }

}