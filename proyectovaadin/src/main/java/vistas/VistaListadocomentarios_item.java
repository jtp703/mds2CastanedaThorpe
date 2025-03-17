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

@Tag("vista-listadocomentarios_item")
@JsModule("./views/vista-listadocomentarios_item.ts")
public class VistaListadocomentarios_item extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("_idEliminarComentario")
	private NativeButton _idEliminarComentario;
	@Id("a")
	private Element a;
	@Id("vaadinAvatar")
	private Avatar vaadinAvatar;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("_numLikes")
	private Span _numLikes;
	@Id("_idMg")
	private Icon _idMg;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vaadinTextArea")
	private TextArea vaadinTextArea;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;

	
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}


	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}


	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}


	public NativeButton get_idEliminarComentario() {
		return _idEliminarComentario;
	}


	public void set_idEliminarComentario(NativeButton _idEliminarComentario) {
		this._idEliminarComentario = _idEliminarComentario;
	}


	public Element getA() {
		return a;
	}


	public void setA(Element a) {
		this.a = a;
	}


	public Avatar getVaadinAvatar() {
		return vaadinAvatar;
	}


	public void setVaadinAvatar(Avatar vaadinAvatar) {
		this.vaadinAvatar = vaadinAvatar;
	}


	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}


	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}


	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}


	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}


	public Span get_numLikes() {
		return _numLikes;
	}


	public void set_numLikes(Span _numLikes) {
		this._numLikes = _numLikes;
	}


	public Icon get_idMg() {
		return _idMg;
	}


	public void set_idMg(Icon _idMg) {
		this._idMg = _idMg;
	}


	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}


	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}


	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}


	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}


	public TextArea getVaadinTextArea() {
		return vaadinTextArea;
	}


	public void setVaadinTextArea(TextArea vaadinTextArea) {
		this.vaadinTextArea = vaadinTextArea;
	}


	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}


	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}


	public VistaListadocomentarios_item() {
        // You can initialise any data required for the connected UI components here.
    }

}