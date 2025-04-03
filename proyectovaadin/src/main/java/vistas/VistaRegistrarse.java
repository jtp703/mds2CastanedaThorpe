package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;

@Tag("vista-registrarse")
@JsModule("./views/vista-registrarse.ts")
public class VistaRegistrarse extends LitTemplate {

    @Id("correo")
	private TextField correo;
	@Id("contenedorRegistrarse")
	private Element contenedorRegistrarse;
	@Id("nickUsuario")
	private TextField nickUsuario;
	@Id("imgPerfil")
	private TextField imgPerfil;
	@Id("imgFondo")
	private TextField imgFondo;
	@Id("descripción")
	private TextArea descripción;
	@Id("contrasenia")
	private TextField contrasenia;
	@Id("btnVolver")
	private Button btnVolver;
	@Id("btnRegistrarse")
	private Button btnRegistrarse;
	@Id("iniciarSesion")
	private Element iniciarSesion;

	public VistaRegistrarse() {
        // You can initialise any data required for the connected UI components here.
    }

}