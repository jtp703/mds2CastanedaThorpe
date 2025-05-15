package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Tag("vista-listadousuarios_item")
@JsModule("./views/vista-listadousuarios_item.ts")
public class VistaListadousuarios_item extends LitTemplate {

	@Id("_LayoutUsuario")
	private HorizontalLayout _LayoutUsuario;
	@Id("SeguirUsuario")
	private Button seguirUsuario;
	@Id("verSeguidores")
	private Button verSeguidores;
	@Id("verSeguidos")
	private Button verSeguidos;
	@Id("verperfil")
	private Button verperfil;
	@Id("contenedorSeguidoresSeguidos")
	private HorizontalLayout contenedorSeguidoresSeguidos;

	public VistaListadousuarios_item() {
		// You can initialise any data required for the connected UI components here.
	}

	public HorizontalLayout getContenedorSeguidoresSeguidos() {
		return contenedorSeguidoresSeguidos;
	}

	public void setContenedorSeguidoresSeguidos(HorizontalLayout contenedorSeguidoresSeguidos) {
		this.contenedorSeguidoresSeguidos = contenedorSeguidoresSeguidos;
	}

	public Button getSeguirUsuario() {
		return seguirUsuario;
	}

	public void setSeguirUsuario(Button seguirUsuario) {
		this.seguirUsuario = seguirUsuario;
	}

	public HorizontalLayout get_LayoutUsuario() {
		return _LayoutUsuario;
	}

	public void set_LayoutUsuario(HorizontalLayout _LayoutUsuario) {
		this._LayoutUsuario = _LayoutUsuario;
	}

	public Button getVerSeguidores() {
		return verSeguidores;
	}

	public void setVerSeguidores(Button verSeguidores) {
		this.verSeguidores = verSeguidores;
	}

	public Button getVerSeguidos() {
		return verSeguidos;
	}

	public void setVerSeguidos(Button verSeguidos) {
		this.verSeguidos = verSeguidos;
	}

	public Button getVerperfil() {
		return verperfil;
	}

	public void setVerperfil(Button verperfil) {
		this.verperfil = verperfil;
	}

}