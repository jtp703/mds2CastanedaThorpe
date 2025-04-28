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
	public VistaVerperfildeusuario() {
        // You can initialise any data required for the connected UI components here.
    }

}