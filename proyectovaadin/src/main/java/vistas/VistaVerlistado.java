package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;

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

	public VistaVerlistado() {
        // You can initialise any data required for the connected UI components here.
    }

}