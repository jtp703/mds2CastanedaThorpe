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

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("a")
	private Element a;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vaadinTabs")
	private Tabs vaadinTabs;
	@Id("vaadinTab")
	private Tab vaadinTab;
	@Id("ironIcon")
	private IronIcon ironIcon;
	@Id("_idMuroPrincipal")
	private Span _idMuroPrincipal;
	@Id("vaadinTab1")
	private Tab vaadinTab1;
	@Id("ironIcon1")
	private IronIcon ironIcon1;
	@Id("_idListadoUsuarios")
	private Span _idListadoUsuarios;
	@Id("_idListadoHashtags")
	private Tab _idListadoHashtags;
	@Id("ironIcon2")
	private IronIcon ironIcon2;
	@Id("span")
	private Span span;
	@Id("vaadinTab2")
	private Tab vaadinTab2;
	@Id("ironIcon3")
	private IronIcon ironIcon3;
	@Id("_idNotificaciones")
	private Span _idNotificaciones;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("ironIcon4")
	private IronIcon ironIcon4;
	@Id("a1")
	private Element a1;
	@Id("vaadinHorizontalLayout6")
	private HorizontalLayout vaadinHorizontalLayout6;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("vaadinVerticalLayout4")
	private Element vaadinVerticalLayout4;
	@Id("vaadinHorizontalLayout5")
	private HorizontalLayout vaadinHorizontalLayout5;

	public VistaCibernauta() {
		// You can initialise any data required for the connected UI components here.
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
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

	public Element getA() {
		return a;
	}

	public void setA(Element a) {
		this.a = a;
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

	public IronIcon getIronIcon() {
		return ironIcon;
	}

	public void setIronIcon(IronIcon ironIcon) {
		this.ironIcon = ironIcon;
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

	public IronIcon getIronIcon1() {
		return ironIcon1;
	}

	public void setIronIcon1(IronIcon ironIcon1) {
		this.ironIcon1 = ironIcon1;
	}

	public Span get_idListadoUsuarios() {
		return _idListadoUsuarios;
	}

	public void set_idListadoUsuarios(Span _idListadoUsuarios) {
		this._idListadoUsuarios = _idListadoUsuarios;
	}

	public Tab get_idListadoHashtags() {
		return _idListadoHashtags;
	}

	public void set_idListadoHashtags(Tab _idListadoHashtags) {
		this._idListadoHashtags = _idListadoHashtags;
	}

	public IronIcon getIronIcon2() {
		return ironIcon2;
	}

	public void setIronIcon2(IronIcon ironIcon2) {
		this.ironIcon2 = ironIcon2;
	}

	public Span getSpan() {
		return span;
	}

	public void setSpan(Span span) {
		this.span = span;
	}

	public Tab getVaadinTab2() {
		return vaadinTab2;
	}

	public void setVaadinTab2(Tab vaadinTab2) {
		this.vaadinTab2 = vaadinTab2;
	}

	public IronIcon getIronIcon3() {
		return ironIcon3;
	}

	public void setIronIcon3(IronIcon ironIcon3) {
		this.ironIcon3 = ironIcon3;
	}

	public Span get_idNotificaciones() {
		return _idNotificaciones;
	}

	public void set_idNotificaciones(Span _idNotificaciones) {
		this._idNotificaciones = _idNotificaciones;
	}

	public HorizontalLayout getVaadinHorizontalLayout4() {
		return vaadinHorizontalLayout4;
	}

	public void setVaadinHorizontalLayout4(HorizontalLayout vaadinHorizontalLayout4) {
		this.vaadinHorizontalLayout4 = vaadinHorizontalLayout4;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public IronIcon getIronIcon4() {
		return ironIcon4;
	}

	public void setIronIcon4(IronIcon ironIcon4) {
		this.ironIcon4 = ironIcon4;
	}

	public Element getA1() {
		return a1;
	}

	public void setA1(Element a1) {
		this.a1 = a1;
	}

	public HorizontalLayout getVaadinHorizontalLayout6() {
		return vaadinHorizontalLayout6;
	}

	public void setVaadinHorizontalLayout6(HorizontalLayout vaadinHorizontalLayout6) {
		this.vaadinHorizontalLayout6 = vaadinHorizontalLayout6;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}

	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}

	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}

	public Element getVaadinVerticalLayout4() {
		return vaadinVerticalLayout4;
	}

	public void setVaadinVerticalLayout4(Element vaadinVerticalLayout4) {
		this.vaadinVerticalLayout4 = vaadinVerticalLayout4;
	}

	public HorizontalLayout getVaadinHorizontalLayout5() {
		return vaadinHorizontalLayout5;
	}

	public void setVaadinHorizontalLayout5(HorizontalLayout vaadinHorizontalLayout5) {
		this.vaadinHorizontalLayout5 = vaadinHorizontalLayout5;
	}

}