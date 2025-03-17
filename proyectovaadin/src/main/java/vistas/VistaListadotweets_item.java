	package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

@Tag("vista-listadotweets_item")
@JsModule("./views/vista-listadotweets_item.ts")
public class VistaListadotweets_item extends LitTemplate {

    @Id("idPerfilLayout")
	private HorizontalLayout idPerfilLayout;
	@Id("idContenidoTweetLayout")
	private Element idContenidoTweetLayout;
	@Id("idEliminarTweet")
	private Button idEliminarTweet;

	public VistaListadotweets_item() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getIdPerfilLayout() {
		return idPerfilLayout;
	}

	public void setIdPerfilLayout(HorizontalLayout idPerfilLayout) {
		this.idPerfilLayout = idPerfilLayout;
	}

	public Element getIdContenidoTweetLayout() {
		return idContenidoTweetLayout;
	}

	public void setIdContenidoTweetLayout(Element idContenidoTweetLayout) {
		this.idContenidoTweetLayout = idContenidoTweetLayout;
	}

	public Button getIdEliminarTweet() {
		return idEliminarTweet;
	}

	public void setIdEliminarTweet(Button idEliminarTweet) {
		this.idEliminarTweet = idEliminarTweet;
	}
	
	

}