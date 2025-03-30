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

@Tag("vista-listadotweets_item")
@JsModule("./views/vista-listadotweets_item.ts")
public class VistaListadotweets_item extends LitTemplate {

	@Id("iconoPerfil")
	private Avatar iconoPerfil;
	@Id("verPerfil")
	private Element verPerfil;
	@Id("textoTweet")
	private Paragraph textoTweet;
	@Id("contenedorInteracciones")
	private HorizontalLayout contenedorInteracciones;
	@Id("meGusta")
	private Icon meGusta;
	@Id("verMegustas")
	private Element verMegustas;
	@Id("darRetweet")
	private Icon darRetweet;
	@Id("verRetweet")
	private Element verRetweet;
	@Id("comentar")
	private Icon comentar;
	@Id("BtnEliminarTweet")
	private Button btnEliminarTweet;
	@Id("contenedorTweet")
	private Element contenedorTweet;
	
	public VistaListadotweets_item() {
		// You can initialise any data required for the connected UI components here.
	}
	
	public Avatar getIconoPerfil() {
		return iconoPerfil;
	}
	public void setIconoPerfil(Avatar iconoPerfil) {
		this.iconoPerfil = iconoPerfil;
	}
	public Element getVerPerfil() {
		return verPerfil;
	}
	public void setVerPerfil(Element verPerfil) {
		this.verPerfil = verPerfil;
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
	public Element getVerMegustas() {
		return verMegustas;
	}
	public void setVerMegustas(Element verMegustas) {
		this.verMegustas = verMegustas;
	}
	public Icon getDarRetweet() {
		return darRetweet;
	}
	public void setDarRetweet(Icon darRetweet) {
		this.darRetweet = darRetweet;
	}
	public Element getVerRetweet() {
		return verRetweet;
	}
	public void setVerRetweet(Element verRetweet) {
		this.verRetweet = verRetweet;
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
	
}