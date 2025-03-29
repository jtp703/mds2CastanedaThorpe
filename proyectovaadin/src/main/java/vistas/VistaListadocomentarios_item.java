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

@Tag("vista-listadocomentarios_item")
@JsModule("./views/vista-listadocomentarios_item.ts")
public class VistaListadocomentarios_item extends LitTemplate {

	@Id("botonEliminarComentario")
	private NativeButton botonEliminarComentario;

	public NativeButton getBotonEliminarComentario() {
		return botonEliminarComentario;
	}

	public void setBotonEliminarComentario(NativeButton botonEliminarComentario) {
		this.botonEliminarComentario = botonEliminarComentario;
	}

	
}