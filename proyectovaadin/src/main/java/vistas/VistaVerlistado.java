package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.button.Button;

@Tag("vista-verlistado")
@JsModule("./views/vista-verlistado.ts")
public class VistaVerlistado extends LitTemplate {

	@Id("contenedorListadousuariosSeguidores-Seguidos")
	private Element contenedorListadousuariosSeguidoresSeguidos;
	@Id("tituloSeguidores")
	private H1 tituloSeguidores;
	@Id("Seguidos")
	private H1 seguidos;
	@Id("verPerfil")
	private Element verPerfil;
	@Id("ListadoSeguidores")
	private Element listadoSeguidores;
	@Id("ListadoSeguidos")
	private Element listadoSeguidos;
	@Id("btnCerrar")
	private Button btnCerrar;

	
	public Element getContenedorListadousuariosSeguidoresSeguidos() {
		return contenedorListadousuariosSeguidoresSeguidos;
	}


	public void setContenedorListadousuariosSeguidoresSeguidos(Element contenedorListadousuariosSeguidoresSeguidos) {
		this.contenedorListadousuariosSeguidoresSeguidos = contenedorListadousuariosSeguidoresSeguidos;
	}


	public H1 getTituloSeguidores() {
		return tituloSeguidores;
	}


	public void setTituloSeguidores(H1 tituloSeguidores) {
		this.tituloSeguidores = tituloSeguidores;
	}


	public H1 getSeguidos() {
		return seguidos;
	}


	public void setSeguidos(H1 seguidos) {
		this.seguidos = seguidos;
	}


	public Element getVerPerfil() {
		return verPerfil;
	}


	public void setVerPerfil(Element verPerfil) {
		this.verPerfil = verPerfil;
	}


	public Element getListadoSeguidores() {
		return listadoSeguidores;
	}


	public void setListadoSeguidores(Element listadoSeguidores) {
		this.listadoSeguidores = listadoSeguidores;
	}


	public Element getListadoSeguidos() {
		return listadoSeguidos;
	}


	public void setListadoSeguidos(Element listadoSeguidos) {
		this.listadoSeguidos = listadoSeguidos;
	}
	
	public Button getBtnCerrar() {
		return btnCerrar;
	}
	
	public void setBtnCerrar(Button btnCerrar) {
		this.btnCerrar = btnCerrar;
	}

	public VistaVerlistado() {
        // You can initialise any data required for the connected UI components here.
    }

}