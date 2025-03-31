package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

@Tag("vista-darretweet")
@JsModule("./views/vista-darretweet.ts")
public class VistaDarretweet extends LitTemplate {

    @Id("_MensajeRetweet")
	private TextArea _MensajeRetweet;
	@Id("idEnviarRetweet")
	private Button idEnviarRetweet;
	@Id("_verPerfil")
	private Element _verPerfil;

	public VistaDarretweet() {
        // You can initialise any data required for the connected UI components here.
    }

	public TextArea get_MensajeRetweet() {
		return _MensajeRetweet;
	}

	public void set_MensajeRetweet(TextArea _MensajeRetweet) {
		this._MensajeRetweet = _MensajeRetweet;
	}

	public Button getIdEnviarRetweet() {
		return idEnviarRetweet;
	}

	public void setIdEnviarRetweet(Button idEnviarRetweet) {
		this.idEnviarRetweet = idEnviarRetweet;
	}

	
	
}