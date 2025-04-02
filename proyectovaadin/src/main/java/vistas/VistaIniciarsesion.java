package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

@Tag("vista-iniciarsesion")
@JsModule("./views/vista-iniciarsesion.ts")
public class VistaIniciarsesion extends LitTemplate {

    @Id("contenedorIniciarSesion")
	private Element contenedorIniciarSesion;
	@Id("textField")
	private TextField correo;
	@Id("contraseña")
	private TextField contrasenia;
	@Id("btnIniciarSesion")
	private Button btnIniciarSesion;
	@Id("btnIniciarSesionGoogle")
	private Button btnIniciarSesionGoogle;
	@Id("recuperarContrasenia")
	private Element recuperarContrasenia;

	public VistaIniciarsesion() {
        // You can initialise any data required for the connected UI components here.
    }

}