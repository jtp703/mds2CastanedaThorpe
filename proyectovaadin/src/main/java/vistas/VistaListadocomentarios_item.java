package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.button.Button;

@Tag("vista-listadocomentarios_item")
@JsModule("./views/vista-listadocomentarios_item.ts")
public class VistaListadocomentarios_item extends LitTemplate {

	@Id("botonEliminarComentario")
	private NativeButton botonEliminarComentario;
	@Id("btnDarMegusta")
	private Icon btnDarMegusta;
	@Id("verMegustas")
	private Button verMegustas;
	@Id("verperfil")
	private Button verperfil;

	public NativeButton getBotonEliminarComentario() {
		return botonEliminarComentario;
	}

	public void setBotonEliminarComentario(NativeButton botonEliminarComentario) {
		this.botonEliminarComentario = botonEliminarComentario;
	}

	public Icon getBtnDarMegusta() {
		return btnDarMegusta;
	}
	public void setBtnDarMegusta(Icon btnDarMegusta) {
		this.btnDarMegusta = btnDarMegusta;
	}
	public Button getVerMegustas() {
		return verMegustas;
	}
	public void setVerMegustas(Button verMegustas) {
		this.verMegustas = verMegustas;
	}
	public Button getVerperfil() {
		return verperfil;
	}
	public void setVerperfil(Button verperfil) {
		this.verperfil = verperfil;
	}
	
}