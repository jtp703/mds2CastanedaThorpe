package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Span;

@Tag("vista-listadodehashtags_item")
@JsModule("./views/vista-listadodehashtags_item.ts")
public class VistaListadodehashtags_item extends LitTemplate {

    @Id("_layoutElementoHashtag")
	private HorizontalLayout _layoutElementoHashtag;
	@Id("_NombreHashtag")
	private Element _NombreHashtag;
	@Id("idNumeroInteraccionesHashtag")
	private Span idNumeroInteraccionesHashtag;

	public VistaListadodehashtags_item() {
        // You can initialise any data required for the connected UI components here.
    }
	
	public HorizontalLayout get_layoutElementoHashtag() {
		return _layoutElementoHashtag;
	}

	public void set_layoutElementoHashtag(HorizontalLayout _layoutElementoHashtag) {
		this._layoutElementoHashtag = _layoutElementoHashtag;
	}

	public Element get_NombreHashtag() {
		return _NombreHashtag;
	}

	public void set_NombreHashtag(Element _NombreHashtag) {
		this._NombreHashtag = _NombreHashtag;
	}

	public Span getIdNumeroInteraccionesHashtag() {
		return idNumeroInteraccionesHashtag;
	}

	public void setIdNumeroInteraccionesHashtag(Span idNumeroInteraccionesHashtag) {
		this.idNumeroInteraccionesHashtag = idNumeroInteraccionesHashtag;
	}

}