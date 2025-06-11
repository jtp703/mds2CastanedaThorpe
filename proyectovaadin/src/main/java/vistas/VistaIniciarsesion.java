package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.PasswordField;

@Tag("vista-iniciarsesion")
@JsModule("./views/vista-iniciarsesion.ts")
public class VistaIniciarsesion extends LitTemplate {

	@Id("contenedorIniciarSesion")
	private Element contenedorIniciarSesion;
	@Id("btnIniciarSesion")
	private Button btnIniciarSesion;
	@Id("btnIniciarSesionGoogle")
	private Button btnIniciarSesionGoogle;
	@Id("btnVolver")
	private Button btnVolver;
	@Id("correo")
	private TextField correo;
	@Id("contrasenia1")
	private PasswordField contrasenia1;
	@Id("recuperarContrasenia")
	private Button recuperarContrasenia;
	public VistaIniciarsesion() {
		// You can initialise any data required for the connected UI components here.
	}

	public TextField getCorreo() {
		return correo;
	}

	public void setCorreo(TextField correo) {
		this.correo = correo;
	}

	public Element getContenedorIniciarSesion() {
		return contenedorIniciarSesion;
	}

	public void setContenedorIniciarSesion(Element contenedorIniciarSesion) {
		this.contenedorIniciarSesion = contenedorIniciarSesion;
	}

	public Button getBtnIniciarSesion() {
		return btnIniciarSesion;
	}

	public void setBtnIniciarSesion(Button btnIniciarSesion) {
		this.btnIniciarSesion = btnIniciarSesion;
	}

	public Button getBtnIniciarSesionGoogle() {
		return btnIniciarSesionGoogle;
	}

	public void setBtnIniciarSesionGoogle(Button btnIniciarSesionGoogle) {
		this.btnIniciarSesionGoogle = btnIniciarSesionGoogle;
	}

	public Button getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(Button btnVolver) {
		this.btnVolver = btnVolver;
	}

	public PasswordField getContrasenia1() {
		return contrasenia1;
	}

	public void setContrasenia1(PasswordField contrasenia1) {
		this.contrasenia1 = contrasenia1;
	}

	public Button getRecuperarContrasenia() {
		return recuperarContrasenia;
	}

	public void setRecuperarContrasenia(Button recuperarContrasenia) {
		this.recuperarContrasenia = recuperarContrasenia;
	}
	
}