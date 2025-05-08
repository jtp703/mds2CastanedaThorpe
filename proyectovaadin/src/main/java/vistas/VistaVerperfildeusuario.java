package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.tabs.Tab;

@Tag("vista-verperfildeusuario")
@JsModule("./views/vista-verperfildeusuario.ts")
public class VistaVerperfildeusuario extends LitTemplate {

	@Id("contenedorVerPerfil")
	private Element contenedorVerPerfil;
	@Id("contenedorImgFondo")
	private Element contenedorImgFondo;
	@Id("contenedorImgPerfil")
	private Element contenedorImgPerfil;
	@Id("btnVolver")
	private Button btnVolver;
	@Id("btnSeguir")
	private Button btnSeguir;
	@Id("btnBloquear")
	private Button btnBloquear;
	@Id("btnBanearUsuario")
	private Button btnBanearUsuario;
	@Id("descripcionPerfil")
	private Paragraph descripcionPerfil;
	@Id("nombreUsuario")
	private H1 nombreUsuario;
	@Id("verSeguidos")
	private Element verSeguidos;
	@Id("verSeguidores")
	private Element verSeguidores;
	@Id("verPosts")
	private Tab verPosts;
	@Id("verRetweets")
	private Tab verRetweets;
	@Id("contenedorListadotweets")
	private Element contenedorListadotweets;
	@Id("VerMeGustas")
	private Tab verMeGustas;
	@Id("verPerfil")
	private Element verPerfil;

	
	public Element getContenedorVerPerfil() {
		return contenedorVerPerfil;
	}
	public void setContenedorVerPerfil(Element contenedorVerPerfil) {
		this.contenedorVerPerfil = contenedorVerPerfil;
	}
	public Element getContenedorImgFondo() {
		return contenedorImgFondo;
	}
	public void setContenedorImgFondo(Element contenedorImgFondo) {
		this.contenedorImgFondo = contenedorImgFondo;
	}
	public Element getContenedorImgPerfil() {
		return contenedorImgPerfil;
	}
	public void setContenedorImgPerfil(Element contenedorImgPerfil) {
		this.contenedorImgPerfil = contenedorImgPerfil;
	}
	public Button getBtnVolver() {
		return btnVolver;
	}
	public void setBtnVolver(Button btnVolver) {
		this.btnVolver = btnVolver;
	}
	public Button getBtnSeguir() {
		return btnSeguir;
	}
	public void setBtnSeguir(Button btnSeguir) {
		this.btnSeguir = btnSeguir;
	}
	public Button getBtnBloquear() {
		return btnBloquear;
	}
	public void setBtnBloquear(Button btnBloquear) {
		this.btnBloquear = btnBloquear;
	}
	public Button getBtnBanearUsuario() {
		return btnBanearUsuario;
	}
	public void setBtnBanearUsuario(Button btnBanearUsuario) {
		this.btnBanearUsuario = btnBanearUsuario;
	}
	public Paragraph getDescripcionPerfil() {
		return descripcionPerfil;
	}
	public void setDescripcionPerfil(Paragraph descripcionPerfil) {
		this.descripcionPerfil = descripcionPerfil;
	}
	public H1 getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(H1 nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public Element getVerSeguidos() {
		return verSeguidos;
	}
	public void setVerSeguidos(Element verSeguidos) {
		this.verSeguidos = verSeguidos;
	}
	public Element getVerSeguidores() {
		return verSeguidores;
	}
	public void setVerSeguidores(Element verSeguidores) {
		this.verSeguidores = verSeguidores;
	}
	public Tab getVerPosts() {
		return verPosts;
	}
	public void setVerPosts(Tab verPosts) {
		this.verPosts = verPosts;
	}
	public Tab getVerRetweets() {
		return verRetweets;
	}
	public void setVerRetweets(Tab verRetweets) {
		this.verRetweets = verRetweets;
	}
	public Element getContenedorListadotweets() {
		return contenedorListadotweets;
	}
	public void setContenedorListadotweets(Element contenedorListadotweets) {
		this.contenedorListadotweets = contenedorListadotweets;
	}
	public Tab getVerMeGustas() {
		return verMeGustas;
	}
	public void setVerMeGustas(Tab verMeGustas) {
		this.verMeGustas = verMeGustas;
	}
	public Element getVerPerfil() {
		return verPerfil;
	}
	public void setVerPerfil(Element verPerfil) {
		this.verPerfil = verPerfil;
	}

}