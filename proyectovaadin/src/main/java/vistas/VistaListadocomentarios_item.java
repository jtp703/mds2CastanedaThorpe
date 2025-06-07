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
import com.vaadin.flow.component.html.Label;

@Tag("vista-listadocomentarios_item")
@JsModule("./views/vista-listadocomentarios_item.ts")
public class VistaListadocomentarios_item extends LitTemplate {

	@Id("botonEliminarComentario")
	private NativeButton botonEliminarComentario;
	@Id("btnDarMegusta")
	private Icon btnDarMegusta;
	@Id("verperfil")
	private Button verperfil;
	@Id("Contenedorcontenido")
	private Element contenedorcontenido;
	@Id("textoComentario")
	private Paragraph textoComentario;
	@Id("nMegustas")
	private Label nMegustas;

	public NativeButton getBotonEliminarComentario() {
		return botonEliminarComentario;
	}

	public Element getContenedorcontenido() {
		return contenedorcontenido;
	}

	public void setContenedorcontenido(Element contenedorcontenido) {
		this.contenedorcontenido = contenedorcontenido;
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

	public Button getVerperfil() {
		return verperfil;
	}

	public void setVerperfil(Button verperfil) {
		this.verperfil = verperfil;
	}
	public Paragraph getTextoComentario() {
		return textoComentario;
	}
	public void setTextoComentario(Paragraph textoComentario) {
		this.textoComentario = textoComentario;
	}
	public Label getnMegustas() {
		return nMegustas;
	}
	public void setnMegustas(Label nMegustas) {
		this.nMegustas = nMegustas;
	}

}