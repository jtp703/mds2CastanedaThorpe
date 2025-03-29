package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadocomentarios")
@JsModule("./views/vista-listadocomentarios.ts")
public class VistaListadocomentarios extends LitTemplate {

    @Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}


	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}


	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}


	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}


	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}


	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


	public Element getVistaListadotweets_item() {
		return vistaListadotweets_item;
	}


	public void setVistaListadotweets_item(Element vistaListadotweets_item) {
		this.vistaListadotweets_item = vistaListadotweets_item;
	}


	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}


	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}


	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}


	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}


	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}


	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}


	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}


	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}


	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}


	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}


	public Element getVistaListadocomentarios_item() {
		return vistaListadocomentarios_item;
	}


	public void setVistaListadocomentarios_item(Element vistaListadocomentarios_item) {
		this.vistaListadocomentarios_item = vistaListadocomentarios_item;
	}


	public HorizontalLayout getVaadinHorizontalLayout4() {
		return vaadinHorizontalLayout4;
	}


	public void setVaadinHorizontalLayout4(HorizontalLayout vaadinHorizontalLayout4) {
		this.vaadinHorizontalLayout4 = vaadinHorizontalLayout4;
	}


	public Element getVistaListadocomentarios_item1() {
		return vistaListadocomentarios_item1;
	}


	public void setVistaListadocomentarios_item1(Element vistaListadocomentarios_item1) {
		this.vistaListadocomentarios_item1 = vistaListadocomentarios_item1;
	}


	public VistaListadocomentarios() {
        // You can initialise any data required for the connected UI components here.
    }

}