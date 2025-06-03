package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;


@Tag("vista-listadotweets")
@JsModule("./views/vista-listadotweets.ts")
public class VistaListadotweets extends LitTemplate {

	@Id("contenedorNuevoTweet")
	private Element contenedorNuevoTweet;

	@Id("contenedorListadoTweets")
	private Element contenedorListadoTweets;
	@Id("contenedorListadoTweets_item")
	private Element contenedorListadoTweets_item;

	@Id("btnEnviarTweet")
	private Button btnEnviarTweet;

	@Id("verPerfilPersonal")
	private Button verPerfilPersonal;

	@Id("idTextoTweet")
	private TextArea idTextoTweet;

	@Id("tipoUrl1")
	private RadioButtonGroup<String> tipoUrl1;

	@Id("url1")
	private TextField url1;

	@Id("url2")
	private TextField url2;

	@Id("tipoUrl2")
	private RadioButtonGroup<String> tipoUrl2;

	public VistaListadotweets() {
		// You can initialise any data required for the connected UI components here.
	}

	public TextArea getIdTextoTweet() {
		return idTextoTweet;
	}

	public void setIdTextoTweet(TextArea idTextoTweet) {
		this.idTextoTweet = idTextoTweet;
	}

	public RadioButtonGroup<String> getTipoUrl1() {
		return tipoUrl1;
	}

	public void setTipoUrl1(RadioButtonGroup<String> tipoUrl1) {
		this.tipoUrl1 = tipoUrl1;
	}

	public TextField getUrl1() {
		return url1;
	}

	public void setUrl1(TextField url1) {
		this.url1 = url1;
	}

	public TextField getUrl2() {
		return url2;
	}

	public void setUrl2(TextField url2) {
		this.url2 = url2;
	}

	public RadioButtonGroup<String> getTipoUrl2() {
		return tipoUrl2;
	}

	public void setTipoUrl2(RadioButtonGroup<String> tipoUrl2) {
		this.tipoUrl2 = tipoUrl2;
	}

	public Element getContenedorListadoTweets() {
		return contenedorListadoTweets;
	}

	public void setContenedorListadoTweets(Element contenedorListadoTweets) {
		this.contenedorListadoTweets = contenedorListadoTweets;
	}

	public Element getContenedorNuevoTweet() {
		return contenedorNuevoTweet;
	}

	public void setContenedorNuevoTweet(Element contenedorNuevoTweet) {
		this.contenedorNuevoTweet = contenedorNuevoTweet;
	}

	public Button getVerPerfilPersonal() {
		return verPerfilPersonal;
	}

	public void setVerPerfilPersonal(Button verPerfilPersonal) {
		this.verPerfilPersonal = verPerfilPersonal;
	}

	public Element getContenedorListadoTweets_item() {
		return contenedorListadoTweets_item;
	}

	public void setContenedorListadoTweets_item(Element contenedorListadoTweets_item) {
		this.contenedorListadoTweets_item = contenedorListadoTweets_item;
	}

	public Button getBtnEnviarTweet() {
		return btnEnviarTweet;
	}

	public void setBtnEnviarTweet(Button btnEnviarTweet) {
		this.btnEnviarTweet = btnEnviarTweet;
	}

}