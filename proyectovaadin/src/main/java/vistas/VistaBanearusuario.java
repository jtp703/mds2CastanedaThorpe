package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;

@Tag("vista-banearusuario")
@JsModule("./views/vista-banearusuario.ts")
public class VistaBanearusuario extends LitTemplate {

    @Id("contenedorBanearUsuario")
	private Element contenedorBanearUsuario;
	@Id("verPerfil")
	private Element verPerfil;
	@Id("motivoBaneo")
	private TextArea motivoBaneo;
	@Id("btnVolver")
	private Button btnVolver;
	@Id("btnEnviarBaneo")
	private Button btnEnviarBaneo;

	public VistaBanearusuario() {
        // You can initialise any data required for the connected UI components here.
    }

}