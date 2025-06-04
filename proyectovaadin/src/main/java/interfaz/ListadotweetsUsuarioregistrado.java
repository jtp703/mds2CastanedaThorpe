package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.vaadin.example.MainView;

import base_de_datos.Tweet;
import base_de_datos.iUsuarioregistrado;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListadotweetsUsuarioregistrado extends Listadotweets {
	
	public VermuroprincipalUsuarioregistrado _vermuroprincipalUsuarioregistrado;
	public VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado;
	public VerperfilUsuarioregistrado _verperfilUsuarioregistrado;
	public Vector<ListadotweetsUsuarioregistrado_item> _listadotweetsUsuarioregistrado = new Vector<ListadotweetsUsuarioregistrado_item>();
	public Verperfilpersonal _verperfilpersonal;
	public iUsuarioregistrado iUsuarioregistrado;
	
	public ListadotweetsUsuarioregistrado(VermuroprincipalUsuarioregistrado vermuroprincipalUsuarioregistrado) {
		super(vermuroprincipalUsuarioregistrado);
		this.iUsuarioregistrado = vermuroprincipalUsuarioregistrado._usuarioregistrado.iUsuarioregistrado;
		//_verperfilpersonal = new Verperfilpersonal(new Usuarioregistrado(this));
		

		ListadotweetsUsuarioregistrado_item item1 = new ListadotweetsUsuarioregistrado_item(this, null);
		ListadotweetsUsuarioregistrado_item item2 = new ListadotweetsUsuarioregistrado_item(this, null);
		_listadotweetsUsuarioregistrado.add(item1);
		_listadotweetsUsuarioregistrado.add(item2);
		for (ListadotweetsUsuarioregistrado_item item : _listadotweetsUsuarioregistrado) {
			this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		}

		
		this.getBtnEnviarTweet().addClickListener(event -> Enviartweet());

		this.getVerPerfilPersonal().addClickListener(event -> verPerfilPersonal());
	}
	
	public ListadotweetsUsuarioregistrado(VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado) {
		super(_verlistadodetweetsfiltradoUsuarioregistrado);
	}
	
	public ListadotweetsUsuarioregistrado(VerperfilUsuarioregistrado _verperfilUsuarioregistrado) {
		super(_verperfilUsuarioregistrado);

		ListadotweetsUsuarioregistrado_item item1 = new ListadotweetsUsuarioregistrado_item(this, null);
		ListadotweetsUsuarioregistrado_item item2 = new ListadotweetsUsuarioregistrado_item(this, null);
		_listadotweetsUsuarioregistrado.add(item1);
		_listadotweetsUsuarioregistrado.add(item2);
		for (ListadotweetsUsuarioregistrado_item item : _listadotweetsUsuarioregistrado) {
			this.getContenedorListadoTweets().as(VerticalLayout.class).add(item);
		}

	}
	
	public void verPerfilPersonal() {
		MainView.Pantalla.cambiarVista(_verperfilpersonal);
	}
	
	public void Enviartweet() {
	    // Obtén el id del usuario directamente aquí
	    int idUsuario = this._vermuroprincipalUsuarioregistrado._usuarioregistrado._usuarioregistrado.getIdUsuario();
	    // Resto del método como antes
	    String texto = this.getTextoTweet().getValue().trim();
	    if (texto.isEmpty()) {
	        Notification.show("El texto del tweet no puede estar vacío");
	        return;
	    }

	    String url1  = this.getUrl1().getValue().trim();
	    String tipo1 = this.getTipoUrl1().getValue();

	    String url2  = this.getUrl2().getValue().trim();
	    String tipo2 = this.getTipoUrl2().getValue();

	    List<String> listaUrls  = new ArrayList<>();
	    List<String> listaTipos = new ArrayList<>();

	    if (!url1.isEmpty() && tipo1 != null) {
	        listaUrls.add(url1);
	        listaTipos.add(tipo1);
	    }
	    if (!url2.isEmpty() && tipo2 != null) {
	        listaUrls.add(url2);
	        listaTipos.add(tipo2);
	    }

	    String[] documentosArray;
	    String[] tiposArray;
	    if (listaUrls.isEmpty()) {
	        documentosArray = null;
	        tiposArray      = null;
	    } else {
	        documentosArray = listaUrls.toArray(new String[0]);
	        tiposArray      = listaTipos.toArray(new String[0]);
	    }

	    try {
	        Tweet nuevoTweet = this.iUsuarioregistrado.escribirTweet(
	            idUsuario,
	            texto,
	            documentosArray,
	            tiposArray
	        );

	        ListadotweetsUsuarioregistrado_item itemNuevo =
	            new ListadotweetsUsuarioregistrado_item(this, nuevoTweet);
	        this.getContenedorListadoTweets()
	            .as(VerticalLayout.class)
	            .addComponentAsFirst(itemNuevo);

	        // Limpiar todos los campos del formulario
	        this.getTextoTweet().clear();
	        this.getUrl1().clear();     this.getTipoUrl1().clear();
	        this.getUrl2().clear();     this.getTipoUrl2().clear();

	        Notification.show("Tweet enviado correctamente", 1500, Position.BOTTOM_START);
	    }
	    catch (Exception ex) {
	        Notification.show("Error al enviar tweet: " + ex.getMessage(), 3000, Position.MIDDLE);
	    }
	}

}