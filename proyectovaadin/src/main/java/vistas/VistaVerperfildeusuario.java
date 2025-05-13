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
	@Id("contenedorListadotweets")
	private Element contenedorListadotweets;
	@Id("verPerfil")
	private Element verPerfil;
	@Id("btnEditarPerfil")
	private Button btnEditarPerfil;
	@Id("btnEliminarPerfil")
	private Button btnEliminarPerfil;
	@Id("verSeguidos")
	private Button verSeguidos;
	@Id("verSeguidores")
	private Button verSeguidores;
	@Id("verPosts")
	private Button verPosts;
	@Id("verRetweets")
	private Button verRetweets;
	@Id("verMegustas")
	private Button verMegustas;
	
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
	public Element getContenedorListadotweets() {
		return contenedorListadotweets;
	}
	public void setContenedorListadotweets(Element contenedorListadotweets) {
		this.contenedorListadotweets = contenedorListadotweets;
	}
	public Element getVerPerfil() {
		return verPerfil;
	}
	public void setVerPerfil(Element verPerfil) {
		this.verPerfil = verPerfil;
	}
	public Button getBtnEditarPerfil() {
		return btnEditarPerfil;
	}
	public void setBtnEditarPerfil(Button btnEditarPerfil) {
		this.btnEditarPerfil = btnEditarPerfil;
	}
	public Button getBtnEliminarPerfil() {
		return btnEliminarPerfil;
	}
	public void setBtnEliminarPerfil(Button btnEliminarPerfil) {
		this.btnEliminarPerfil = btnEliminarPerfil;
	}
	public Button getVerSeguidos() {
		return verSeguidos;
	}
	public void setVerSeguidos(Button verSeguidos) {
		this.verSeguidos = verSeguidos;
	}
	public Button getVerSeguidores() {
		return verSeguidores;
	}
	public void setVerSeguidores(Button verSeguidores) {
		this.verSeguidores = verSeguidores;
	}
	public Button getVerPosts() {
		return verPosts;
	}
	public void setVerPosts(Button verPosts) {
		this.verPosts = verPosts;
	}
	public Button getVerRetweets() {
		return verRetweets;
	}
	public void setVerRetweets(Button verRetweets) {
		this.verRetweets = verRetweets;
	}
	public Button getVerMegustas() {
		return verMegustas;
	}
	public void setVerMegustas(Button verMegustas) {
		this.verMegustas = verMegustas;
	}
	
	
	
}