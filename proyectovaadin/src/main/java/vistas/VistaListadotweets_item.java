package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;

@Tag("vista-listadotweets_item")
@JsModule("./views/vista-listadotweets_item.ts")
public class VistaListadotweets_item extends LitTemplate {

	@Id("iconoPerfil")
	private Avatar iconoPerfil;
	@Id("textoTweet")
	private Paragraph textoTweet;
	@Id("contenedorInteracciones")
	private HorizontalLayout contenedorInteracciones;

	public Button getVerperfil() {
		return verperfil;
	}

	public void setVerperfil(Button verperfil) {
		this.verperfil = verperfil;
	}

	@Id("meGusta")
	private Icon meGusta;
	@Id("darRetweet")
	private Icon darRetweet;
	@Id("comentar")
	private Icon comentar;
	@Id("BtnEliminarTweet")
	private Button btnEliminarTweet;
	@Id("contenedorTweet")
	private Element contenedorTweet;
	@Id("verperfil")
	private Button verperfil;
	@Id("nMegustas")
	private Label nMegustas;
	@Id("nRetweets")
	private Label nRetweets;
	@Id("nComentarios")
	private Label nComentarios;
	@Id("doc1")
	private Image doc1;
	@Id("doc2")
	private Image doc2;

	public VistaListadotweets_item() {
		// You can initialise any data required for the connected UI components here.
	}

	public Element getContenedorTweet() {
		return contenedorTweet;
	}

	public void setContenedorTweet(Element contenedorTweet) {
		this.contenedorTweet = contenedorTweet;
	}

	public Avatar getIconoPerfil() {
		return iconoPerfil;
	}

	public void setIconoPerfil(Avatar iconoPerfil) {
		this.iconoPerfil = iconoPerfil;
	}

	public Paragraph getTextoTweet() {
		return textoTweet;
	}

	public void setTextoTweet(Paragraph textoTweet) {
		this.textoTweet = textoTweet;
	}

	public HorizontalLayout getContenedorInteracciones() {
		return contenedorInteracciones;
	}

	public void setContenedorInteracciones(HorizontalLayout contenedorInteracciones) {
		this.contenedorInteracciones = contenedorInteracciones;
	}

	public Icon getMeGusta() {
		return meGusta;
	}

	public void setMeGusta(Icon meGusta) {
		this.meGusta = meGusta;
	}

	public Icon getDarRetweet() {
		return darRetweet;
	}

	public void setDarRetweet(Icon darRetweet) {
		this.darRetweet = darRetweet;
	}

	public Icon getComentar() {
		return comentar;
	}

	public void setComentar(Icon comentar) {
		this.comentar = comentar;
	}

	public Button getBtnEliminarTweet() {
		return btnEliminarTweet;
	}

	public void setBtnEliminarTweet(Button btnEliminarTweet) {
		this.btnEliminarTweet = btnEliminarTweet;
	}
	
	public String getContenidoTexto() {
	    return this.getTextoTweet().getText();
	}

	public String getNombreUsuario() {
	    return this.getVerperfil().getText();
	}

	public Label getnMegustas() {
		return nMegustas;
	}

	public void setnMegustas(Label nMegustas) {
		this.nMegustas = nMegustas;
	}

	public Label getnRetweets() {
		return nRetweets;
	}

	public void setnRetweets(Label nRetweets) {
		this.nRetweets = nRetweets;
	}

	public Label getnComentarios() {
		return nComentarios;
	}

	public void setnComentarios(Label nComentarios) {
		this.nComentarios = nComentarios;
	}

	public Image getDoc1() {
		return doc1;
	}

	public void setDoc1(Image doc1) {
		this.doc1 = doc1;
	}

	public Image getDoc2() {
		return doc2;
	}

	public void setDoc2(Image doc2) {
		this.doc2 = doc2;
	}

}