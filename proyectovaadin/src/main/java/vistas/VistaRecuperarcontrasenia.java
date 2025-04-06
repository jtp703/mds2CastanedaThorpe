package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

@Tag("vista-recuperarcontrasenia")
@JsModule("./views/vista-recuperarcontrasenia.ts")
public class VistaRecuperarcontrasenia extends LitTemplate {

    @Id("correo")
	private TextField correo;
	@Id("btnEnviar")
	private Button btnEnviar;
	@Id("btnCerrar")
	private Button btnCerrar;
	public VistaRecuperarcontrasenia() {
        // You can initialise any data required for the connected UI components here.
    }

}