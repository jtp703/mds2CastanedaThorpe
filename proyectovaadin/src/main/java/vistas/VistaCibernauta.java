package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.icon.IronIcon;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.avatar.Avatar;

@Tag("vista-cibernauta")
@JsModule("./views/vista-cibernauta.ts")
public class VistaCibernauta extends LitTemplate {

	@Id("contenedorPrincipal")
	private Element contenedorPrincipal;
	@Id("imgPerfilPersonal")
	private Avatar imgPerfilPersonal;
	@Id("contenedorVerPerfilPersonal")
	private HorizontalLayout contenedorVerPerfilPersonal;
	@Id("contenedorContenido")
	private Element contenedorContenido;
	@Id("verMuroPrincipal")
	private Button verMuroPrincipal;
	@Id("verListadoUsuarios")
	private Button verListadoUsuarios;
	@Id("verListadoHashtags")
	private Button verListadoHashtags;
	@Id("verNotificaciones")
	private Button verNotificaciones;
	@Id("Registrarse")
	private Button registrarse;
	@Id("contenedorRegistro")
	private HorizontalLayout contenedorRegistro;
	@Id("verPerfilPersonal")
	private Button verPerfilPersonal;
	@Id("btnCerrrarSesion")
	private Button btnCerrrarSesion;

	public VistaCibernauta() {
		// You can initialise any data required for the connected UI components here.
	}

	public Button getRegistrarse() {
		return registrarse;
	}

	public void setRegistrarse(Button registrarse) {
		this.registrarse = registrarse;
	}

	public HorizontalLayout getContenedorRegistro() {
		return contenedorRegistro;
	}

	public void setContenedorRegistro(HorizontalLayout contenedorRegistro) {
		this.contenedorRegistro = contenedorRegistro;
	}

	public Element getContenedorPrincipal() {
		return contenedorPrincipal;
	}

	public void setContenedorPrincipal(Element contenedorPrincipal) {
		this.contenedorPrincipal = contenedorPrincipal;
	}

	public Avatar getImgPerfilPersonal() {
		return imgPerfilPersonal;
	}

	public void setImgPerfilPersonal(Avatar imgPerfilPersonal) {
		this.imgPerfilPersonal = imgPerfilPersonal;
	}

	public Button getVerPerfilPersonal() {
		return verPerfilPersonal;
	}

	public void setVerPerfilPersonal(Button verPerfilPersonal) {
		this.verPerfilPersonal = verPerfilPersonal;
	}

	public HorizontalLayout getContenedorVerPerfilPersonal() {
		return contenedorVerPerfilPersonal;
	}

	public void setContenedorVerPerfilPersonal(HorizontalLayout contenedorVerPerfilPersonal) {
		this.contenedorVerPerfilPersonal = contenedorVerPerfilPersonal;
	}

	public Element getContenedorContenido() {
		return contenedorContenido;
	}

	public void setContenedorContenido(Element contenedorContenido) {
		this.contenedorContenido = contenedorContenido;
	}

	public Button getVerMuroPrincipal() {
		return verMuroPrincipal;
	}

	public void setVerMuroPrincipal(Button verMuroPrincipal) {
		this.verMuroPrincipal = verMuroPrincipal;
	}

	public Button getVerListadoUsuarios() {
		return verListadoUsuarios;
	}

	public void setVerListadoUsuarios(Button verListadoUsuarios) {
		this.verListadoUsuarios = verListadoUsuarios;
	}

	public Button getVerListadoHashtags() {
		return verListadoHashtags;
	}

	public void setVerListadoHashtags(Button verListadoHashtags) {
		this.verListadoHashtags = verListadoHashtags;
	}

	public Button getVerNotificaciones() {
		return verNotificaciones;
	}

	public void setVerNotificaciones(Button verNotificaciones) {
		this.verNotificaciones = verNotificaciones;
	}
	
	public Button getBtnCerrrarSesion() {
		return btnCerrrarSesion;
	}
	public void setBtnCerrrarSesion(Button btnCerrrarSesion) {
		this.btnCerrrarSesion = btnCerrrarSesion;
	}
}