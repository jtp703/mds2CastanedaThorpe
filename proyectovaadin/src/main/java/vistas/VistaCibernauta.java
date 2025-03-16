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

@Tag("vista-cibernauta")
@JsModule("./views/vista-cibernauta.ts")
public class VistaCibernauta extends LitTemplate {

	@Id("panelPrincipal")
	private Element panelPrincipal;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("lRegistro")
	private Element lRegistro;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vaadinTabs")
	private Tabs vaadinTabs;
	@Id("vaadinTab")
	private Tab vaadinTab;
	@Id("_idMuroPrincipal")
	private Span _idMuroPrincipal;
	@Id("vaadinTab1")
	private Tab vaadinTab1;
	@Id("_idListadoUsuarios")
	private Span _idListadoUsuarios;
	@Id("vaadinTab2")
	private Tab vaadinTab2;
	@Id("_idListadoHashtags")
	private Span _idListadoHashtags;
	@Id("vaadinTab3")
	private Tab vaadinTab3;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("_idNotificaciones")
	private Span _idNotificaciones;
	@Id("panelVerPerfil")
	private Element panelVerPerfil;
	@Id("_verPerfil")
	private Element _verPerfil;
	public Element getPanelPrincipal() {
		return panelPrincipal;
	}
	public void setPanelPrincipal(Element panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}
	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}
	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}
	public Element getlRegistro() {
		return lRegistro;
	}
	public void setlRegistro(Element lRegistro) {
		this.lRegistro = lRegistro;
	}
	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}
	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}
	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}
	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}
	public Tabs getVaadinTabs() {
		return vaadinTabs;
	}
	public void setVaadinTabs(Tabs vaadinTabs) {
		this.vaadinTabs = vaadinTabs;
	}
	public Tab getVaadinTab() {
		return vaadinTab;
	}
	public void setVaadinTab(Tab vaadinTab) {
		this.vaadinTab = vaadinTab;
	}
	public Span get_idMuroPrincipal() {
		return _idMuroPrincipal;
	}
	public void set_idMuroPrincipal(Span _idMuroPrincipal) {
		this._idMuroPrincipal = _idMuroPrincipal;
	}
	public Tab getVaadinTab1() {
		return vaadinTab1;
	}
	public void setVaadinTab1(Tab vaadinTab1) {
		this.vaadinTab1 = vaadinTab1;
	}
	public Span get_idListadoUsuarios() {
		return _idListadoUsuarios;
	}
	public void set_idListadoUsuarios(Span _idListadoUsuarios) {
		this._idListadoUsuarios = _idListadoUsuarios;
	}
	public Tab getVaadinTab2() {
		return vaadinTab2;
	}
	public void setVaadinTab2(Tab vaadinTab2) {
		this.vaadinTab2 = vaadinTab2;
	}
	public Span get_idListadoHashtags() {
		return _idListadoHashtags;
	}
	public void set_idListadoHashtags(Span _idListadoHashtags) {
		this._idListadoHashtags = _idListadoHashtags;
	}
	public Tab getVaadinTab3() {
		return vaadinTab3;
	}
	public void setVaadinTab3(Tab vaadinTab3) {
		this.vaadinTab3 = vaadinTab3;
	}
	public HorizontalLayout getVaadinHorizontalLayout4() {
		return vaadinHorizontalLayout4;
	}
	public void setVaadinHorizontalLayout4(HorizontalLayout vaadinHorizontalLayout4) {
		this.vaadinHorizontalLayout4 = vaadinHorizontalLayout4;
	}
	public Span get_idNotificaciones() {
		return _idNotificaciones;
	}
	public void set_idNotificaciones(Span _idNotificaciones) {
		this._idNotificaciones = _idNotificaciones;
	}
	public Element getPanelVerPerfil() {
		return panelVerPerfil;
	}
	public void setPanelVerPerfil(Element panelVerPerfil) {
		this.panelVerPerfil = panelVerPerfil;
	}
	public Element get_verPerfil() {
		return _verPerfil;
	}
	public void set_verPerfil(Element _verPerfil) {
		this._verPerfil = _verPerfil;
	}

	
}