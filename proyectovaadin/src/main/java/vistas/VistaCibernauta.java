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
	@Id("contenedorRegistro")
	private HorizontalLayout contenedorRegistro;
	@Id("verMuroPrincipal")
	private Tab verMuroPrincipal;
	@Id("verListadoUsuarios")
	private Tab verListadoUsuarios;
	@Id("verListadohashtags")
	private Tab verListadohashtags;
	@Id("verNotificacionesUsuario")
	private Tab verNotificacionesUsuario;
	@Id("imgPerfilPersonal")
	private Avatar imgPerfilPersonal;
	@Id("verPerfilPersonal")
	private Element verPerfilPersonal;
	@Id("contenedorVerPerfilPersonal")
	private HorizontalLayout contenedorVerPerfilPersonal;

	public VistaCibernauta() {
		// You can initialise any data required for the connected UI components here.
	}

	public Element getContenedorPrincipal() {
		return contenedorPrincipal;
	}

	public void setContenedorPrincipal(Element contenedorPrincipal) {
		this.contenedorPrincipal = contenedorPrincipal;
	}

	public HorizontalLayout getContenedorRegistro() {
		return contenedorRegistro;
	}

	public void setContenedorRegistro(HorizontalLayout contenedorRegistro) {
		this.contenedorRegistro = contenedorRegistro;
	}

	public Tab getVerMuroPrincipal() {
		return verMuroPrincipal;
	}

	public void setVerMuroPrincipal(Tab verMuroPrincipal) {
		this.verMuroPrincipal = verMuroPrincipal;
	}

	public Tab getVerListadoUsuarios() {
		return verListadoUsuarios;
	}

	public void setVerListadoUsuarios(Tab verListadoUsuarios) {
		this.verListadoUsuarios = verListadoUsuarios;
	}

	public Tab getVerListadohashtags() {
		return verListadohashtags;
	}

	public void setVerListadohashtags(Tab verListadohashtags) {
		this.verListadohashtags = verListadohashtags;
	}

	public Tab getVerNotificacionesUsuario() {
		return verNotificacionesUsuario;
	}

	public void setVerNotificacionesUsuario(Tab verNotificacionesUsuario) {
		this.verNotificacionesUsuario = verNotificacionesUsuario;
	}

	public Avatar getImgPerfilPersonal() {
		return imgPerfilPersonal;
	}

	public void setImgPerfilPersonal(Avatar imgPerfilPersonal) {
		this.imgPerfilPersonal = imgPerfilPersonal;
	}

	public Element getVerPerfilPersonal() {
		return verPerfilPersonal;
	}

	public void setVerPerfilPersonal(Element verPerfilPersonal) {
		this.verPerfilPersonal = verPerfilPersonal;
	}

	public HorizontalLayout getContenedorVerPerfilPersonal() {
		return contenedorVerPerfilPersonal;
	}

	public void setContenedorVerPerfilPersonal(HorizontalLayout contenedorVerPerfilPersonal) {
		this.contenedorVerPerfilPersonal = contenedorVerPerfilPersonal;
	}

}