package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

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
	@Id("contenedorEditarPerfil")
	private Element contenedorEditarPerfil;
	@Id("btnVolver")
	private Button btnVolver;
	@Id("btnGuardar")
	private Button btnGuardar;

	public VistaEditarperfil() {
        // You can initialise any data required for the connected UI components here.
    }

	public TextField get_nickUsuario() {
		return _nickUsuario;
	}

	public void set_nickUsuario(TextField _nickUsuario) {
		this._nickUsuario = _nickUsuario;
	}

	public TextField get_NombreUsuario() {
		return _NombreUsuario;
	}

	public void set_NombreUsuario(TextField _NombreUsuario) {
		this._NombreUsuario = _NombreUsuario;
	}

	public TextField get_contraUsuario() {
		return _contraUsuario;
	}

	public void set_contraUsuario(TextField _contraUsuario) {
		this._contraUsuario = _contraUsuario;
	}

	public TextField get_UrlImagenPerfil() {
		return _UrlImagenPerfil;
	}

	public void set_UrlImagenPerfil(TextField _UrlImagenPerfil) {
		this._UrlImagenPerfil = _UrlImagenPerfil;
	}

	public TextField get_UrlImagenFondo() {
		return _UrlImagenFondo;
	}

	public void set_UrlImagenFondo(TextField _UrlImagenFondo) {
		this._UrlImagenFondo = _UrlImagenFondo;
	}

	public TextArea get_DescripcionPerfil() {
		return _DescripcionPerfil;
	}

	public void set_DescripcionPerfil(TextArea _DescripcionPerfil) {
		this._DescripcionPerfil = _DescripcionPerfil;
	}

	public Element getContenedorEditarPerfil() {
		return contenedorEditarPerfil;
	}

	public void setContenedorEditarPerfil(Element contenedorEditarPerfil) {
		this.contenedorEditarPerfil = contenedorEditarPerfil;
	}

	public Button getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(Button btnVolver) {
		this.btnVolver = btnVolver;
	}

	public Button getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(Button btnGuardar) {
		this.btnGuardar = btnGuardar;
	}
	
	
	
}