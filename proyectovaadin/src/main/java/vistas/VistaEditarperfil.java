package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextArea;

@Tag("vista-editarperfil")
@JsModule("./views/vista-editarperfil.ts")
public class VistaEditarperfil extends LitTemplate {

    @Id("_nickUsuario")
	private TextField _nickUsuario;
	@Id("_NombreUsuario")
	private TextField _NombreUsuario;
	@Id("_contraUsuario")
	private TextField _contraUsuario;
	@Id("_UrlImagenPerfil")
	private TextField _UrlImagenPerfil;
	@Id("_UrlImagenFondo")
	private TextField _UrlImagenFondo;
	@Id("_DescripcionPerfil")
	private TextArea _DescripcionPerfil;

	public VistaEditarperfil() {
        // You can initialise any data required for the connected UI components here.
    }

}