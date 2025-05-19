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
	@Id("iniciarsesion")
	private Button iniciarsesion;

	public VistaRegistrarse() {
		// You can initialise any data required for the connected UI components here.
	}

	public TextField getCorreo() {
		return correo;
	}

	public void setCorreo(TextField correo) {
		this.correo = correo;
	}

	public Element getContenedorRegistrarse() {
		return contenedorRegistrarse;
	}

	public void setContenedorRegistrarse(Element contenedorRegistrarse) {
		this.contenedorRegistrarse = contenedorRegistrarse;
	}

	public TextField getNickUsuario() {
		return nickUsuario;
	}

	public void setNickUsuario(TextField nickUsuario) {
		this.nickUsuario = nickUsuario;
	}

	public TextField getImgPerfil() {
		return imgPerfil;
	}

	public void setImgPerfil(TextField imgPerfil) {
		this.imgPerfil = imgPerfil;
	}

	public TextField getImgFondo() {
		return imgFondo;
	}

	public void setImgFondo(TextField imgFondo) {
		this.imgFondo = imgFondo;
	}

	public TextArea getDescripción() {
		return descripción;
	}

	public void setDescripción(TextArea descripción) {
		this.descripción = descripción;
	}

	public TextField getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(TextField contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Button getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(Button btnVolver) {
		this.btnVolver = btnVolver;
	}

	public Button getBtnRegistrarse() {
		return btnRegistrarse;
	}

	public void setBtnRegistrarse(Button btnRegistrarse) {
		this.btnRegistrarse = btnRegistrarse;
	}

	public Button getIniciarsesion() {
		return iniciarsesion;
	}

	public void setIniciarsesion(Button iniciarsesion) {
		this.iniciarsesion = iniciarsesion;
	}

}