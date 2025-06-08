package vistas;

import java.util.List;

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
import com.vaadin.flow.component.select.Select;

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

	@Id("url1")
	private TextField url1;

	@Id("url2")
	private TextField url2;

	@Id("textoTweet")
	private TextArea textoTweet;

	@Id("select1") 
	private Select<String> select1;
	@Id("select2") 
	private Select<String> select2;

	public VistaListadotweets() {
		// You can initialise any data required for the connected UI components here.
		List<String> tipos = List.of("Imagen", "Video");

	    // 2. Cárgalas en ambos selects
	    select1.setItems(tipos);
	    select2.setItems(tipos);

	    // 3. (Optativo) placeholder o valor por defecto
	    select1.setPlaceholder("Tipo");
	    select2.setPlaceholder("Tipo");
	}

	public Select getSelect1() {
		return select1;
	}

	public void setSelect1(Select select1) {
		this.select1 = select1;
	}

	public Select getSelect2() {
		return select2;
	}

	public void setSelect2(Select select2) {
		this.select2 = select2;
	}

	public TextArea getTextoTweet() {
		return textoTweet;
	}

	public void setTextoTweet(TextArea textoTweet) {
		this.textoTweet = textoTweet;
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