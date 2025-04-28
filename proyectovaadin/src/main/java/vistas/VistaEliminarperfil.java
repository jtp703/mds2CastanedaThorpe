package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

@Tag("vista-eliminarperfil")
@JsModule("./views/vista-eliminarperfil.ts")
public class VistaEliminarperfil extends LitTemplate {

    @Id("contenedorEliminarCuenta")
	private Element contenedorEliminarCuenta;
	@Id("textFieldMotivo")
	private TextField textFieldMotivo;
	@Id("textFieldConfirmacion")
	private TextField textFieldConfirmacion;
	@Id("btnEliminarCuenta")
	private Button btnEliminarCuenta;
	@Id("btnVolver")
	private Button btnVolver;

	public VistaEliminarperfil() {
        // You can initialise any data required for the connected UI components here.
    }

}