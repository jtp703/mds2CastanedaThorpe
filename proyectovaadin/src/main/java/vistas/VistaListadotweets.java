package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

@Tag("vista-listadotweets")
@JsModule("./views/vista-listadotweets.ts")
public class VistaListadotweets extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vistaListadotweets_item1")
	private Element vistaListadotweets_item1;
	@Id("vistaListadotweets_item")
	private Element vistaListadotweets_item;

	
	
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}



	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}



	public Element getVistaListadotweets_item1() {
		return vistaListadotweets_item1;
	}



	public void setVistaListadotweets_item1(Element vistaListadotweets_item1) {
		this.vistaListadotweets_item1 = vistaListadotweets_item1;
	}



	public Element getVistaListadotweets_item() {
		return vistaListadotweets_item;
	}



	public void setVistaListadotweets_item(Element vistaListadotweets_item) {
		this.vistaListadotweets_item = vistaListadotweets_item;
	}



	public VistaListadotweets() {
        // You can initialise any data required for the connected UI components here.
    }

}