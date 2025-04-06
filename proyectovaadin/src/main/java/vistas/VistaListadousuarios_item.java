package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-listadousuarios_item")
@JsModule("./views/vista-listadousuarios_item.ts")
public class VistaListadousuarios_item extends LitTemplate {

    @Id("_SeguidosUsuario")
	private Span _SeguidosUsuario;
	@Id("_SeguidoresUsuario")
	private Span _SeguidoresUsuario;
	@Id("_LayoutUsuario")
	private HorizontalLayout _LayoutUsuario;
	@Id("SeguirUsuario")
	private Button seguirUsuario;

	public VistaListadousuarios_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getseguirUsuario() {
		return seguirUsuario;
	}

	public void set_SeguirUsuario(Button seguirUsuario) {
		this.seguirUsuario = seguirUsuario;
	}

	public Span get_SeguidosUsuario() {
		return _SeguidosUsuario;
	}

	public void set_SeguidosUsuario(Span _SeguidosUsuario) {
		this._SeguidosUsuario = _SeguidosUsuario;
	}

	public Span get_SeguidoresUsuario() {
		return _SeguidoresUsuario;
	}

	public void set_SeguidoresUsuario(Span _SeguidoresUsuario) {
		this._SeguidoresUsuario = _SeguidoresUsuario;
	}

	public HorizontalLayout get_LayoutUsuario() {
		return _LayoutUsuario;
	}

	public void set_LayoutUsuario(HorizontalLayout _LayoutUsuario) {
		this._LayoutUsuario = _LayoutUsuario;
	}
	
	
	
}