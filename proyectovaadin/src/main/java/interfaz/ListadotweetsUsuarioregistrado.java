package interfaz;

import java.util.ArrayList;
import java.util.Comparator;
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
		this._vermuroprincipalUsuarioregistrado = vermuroprincipalUsuarioregistrado;
		this.iUsuarioregistrado = vermuroprincipalUsuarioregistrado._usuarioregistrado.iUsuarioregistrado;
		
		try {
			ArrayList<Tweet> tweets = new ArrayList<Tweet>();
			for(base_de_datos.Usuario usuarioSeguido: vermuroprincipalUsuarioregistrado._usuarioregistrado._usuarioregistrado.sigue.toArray()) {
	            if(usuarioSeguido.tweetea != null) {
	            	for(Tweet tweet : usuarioSeguido.tweetea.toArray()) {
						tweets.add(tweet);
					}
	            }
			}
			
			if(vermuroprincipalUsuarioregistrado._usuarioregistrado._usuarioregistrado.tweetea != null) {
				for(Tweet tweet : vermuroprincipalUsuarioregistrado._usuarioregistrado._usuarioregistrado.tweetea.toArray()) {
					tweets.add(tweet);
				}
			}
			tweets.sort(Comparator
				    .comparing(Tweet::getFechaCreacion)
				    .reversed()
				);
		 	if (!tweets.isEmpty()) {
	                for (Tweet t : tweets) {
	                    ListadotweetsUsuarioregistrado_item item =
	                        new ListadotweetsUsuarioregistrado_item(this, t);
	                    _listadotweetsUsuarioregistrado.add(item);
	                    this.getContenedorListadoTweets_item()
	                        .as(VerticalLayout.class)
	                        .add(item);
	                }
            }
        } catch (Exception pe) {
            Notification.show(
                "No se pudieron cargar los tweets: " + pe.getMessage(),
                3000, Position.MIDDLE
            );
        }
		this.getVerPerfilPersonal().addClickListener(event ->
        MainView.Pantalla.cambiarVista(new Verperfilpersonal(vermuroprincipalUsuarioregistrado._usuarioregistrado)));
		this.getBtnEnviarTweet().addClickListener(event -> Enviartweet());

		this.getVerPerfilPersonal().addClickListener(event -> verPerfilPersonal());
	}

	public ListadotweetsUsuarioregistrado(
			VerlistadodetweetsfiltradoUsuarioregistrado _verlistadodetweetsfiltradoUsuarioregistrado) {
		super(_verlistadodetweetsfiltradoUsuarioregistrado, null);
	}

	public ListadotweetsUsuarioregistrado(VerperfilUsuarioregistrado _verperfilUsuarioregistrado) {
		super(_verperfilUsuarioregistrado);
		
		this._vermuroprincipalUsuarioregistrado = _verperfilUsuarioregistrado.vermuroprincipalUsuarioregistrado;
		
		for(Tweet tweet: _verperfilUsuarioregistrado.usuario.tweetea.toArray()) {
			ListadotweetsUsuarioregistrado_item itemNuevo = new ListadotweetsUsuarioregistrado_item(this, tweet);
			this.getContenedorListadoTweets_item().as(VerticalLayout.class).add(itemNuevo);
		}
	}
	
	public ListadotweetsUsuarioregistrado(Verperfilpersonal _verperfilpersonal) {
		super(_verperfilpersonal);
		this._verperfilpersonal = _verperfilpersonal;
		this._vermuroprincipalUsuarioregistrado = _verperfilpersonal.vermuroprincipalUsuarioregistrado;
		this.iUsuarioregistrado = _verperfilpersonal.usuarioregistrado.iUsuarioregistrado;

		for (Tweet tweet : _verperfilpersonal.usuarioregistrado._usuarioregistrado.tweetea.toArray()) {
			ListadotweetsUsuarioregistrado_item itemNuevo = new ListadotweetsUsuarioregistrado_item(this, tweet);
			this.getContenedorListadoTweets_item().as(VerticalLayout.class).add(itemNuevo);
		}

		this.getBtnEnviarTweet().setVisible(false);
		}

	public void verPerfilPersonal() {
		MainView.Pantalla.cambiarVista(_verperfilpersonal);
	}

	public void Enviartweet() {
	    // 1. Obtención de datos básicos
	    int idUsuario = this._vermuroprincipalUsuarioregistrado
	                          ._usuarioregistrado
	                          ._usuarioregistrado
	                          .getID();

	    String texto = getTextoTweet().getValue().trim();
	    if (texto.isEmpty()) {
	        Notification.show("El texto del tweet no puede estar vacío");
	        return;
	    }

	    // 2. Recogida de URLs + tipos
	    List<String> listaUrls  = new ArrayList<>();
	    List<String> listaTipos = new ArrayList<>();

	    // helper para no repetir código
	    addAdjunto(listaUrls, listaTipos, getUrl1().getValue(), (String) getSelect1().getValue());
	    addAdjunto(listaUrls, listaTipos, getUrl2().getValue(), (String) getSelect2().getValue());

	    // 3. Conversión a arrays (nunca null)
	    String[] documentosArray = listaUrls .toArray(new String[0]);
	    String[] tiposArray      = listaTipos.toArray(new String[0]);

	    try {
	        // 4. Llamada al back-end
	        Tweet nuevoTweet = this.iUsuarioregistrado
	                              .escribirTweet(idUsuario, texto, documentosArray, tiposArray);

	        // 5. Insertar el nuevo tweet al principio del listado
	        ListadotweetsUsuarioregistrado_item itemNuevo =
	            new ListadotweetsUsuarioregistrado_item(this, nuevoTweet);
	        VerticalLayout layout =
	            this.getContenedorListadoTweets_item()
	                .as(VerticalLayout.class);
	        layout.addComponentAsFirst(itemNuevo);

	        // 6. Reset del formulario y notificación
	        resetForm();
	        Notification.show("Tweet enviado correctamente", 1500, Position.BOTTOM_START);
	        
	        Usuarioregistrado usuarioregistrado = new Usuarioregistrado(
	                _vermuroprincipalUsuarioregistrado._usuarioregistrado.mainView,
	                iUsuarioregistrado.cargarPerfilUsuarioregistrado(
	                		_vermuroprincipalUsuarioregistrado._usuarioregistrado._usuarioregistrado.getID()
	                		));
	        _vermuroprincipalUsuarioregistrado._usuarioregistrado.mainView.removeAll();
	        _vermuroprincipalUsuarioregistrado._usuarioregistrado.mainView.add(usuarioregistrado);

	    } catch (Exception ex) {
	        Notification.show("Error al enviar tweet: " + ex.getMessage(), 3000, Position.MIDDLE);
	    }
	}

	/** Añade un adjunto si URL y tipo son válidos */
	private void addAdjunto(List<String> urls, List<String> tipos,
	                        String url, String tipo) {
	    if (url   != null && !url.trim().isEmpty() &&
	        tipo  != null && !tipo.trim().isEmpty()) {
	        urls .add(url.trim());
	        tipos.add(tipo.trim());
	    }
	}
	
	private void resetForm() {
	    getTextoTweet().clear();
	    getUrl1()      .clear();
	    getSelect1()   .clear();
	    getUrl2()      .clear();
	    getSelect2()   .clear();
	}

	public ListadotweetsUsuarioregistrado(Retweets _retweets, Tweet[] _retweetsArray) {
		super(_retweets);
		this._retweets = _retweets;
		if(_retweets._verperfildeusuario instanceof VerperfilUsuarioregistrado) {
			this._verperfilUsuarioregistrado = (VerperfilUsuarioregistrado) _retweets._verperfildeusuario;
			this._vermuroprincipalUsuarioregistrado = _retweets._verperfilUsuarioregistrado.vermuroprincipalUsuarioregistrado;
		} else if(_retweets._verperfildeusuario instanceof Verperfilpersonal) {
			this._verperfilpersonal = (Verperfilpersonal) _retweets._verperfildeusuario;
			this._vermuroprincipalUsuarioregistrado = _retweets._verperfilpersonal.vermuroprincipalUsuarioregistrado;
		}
		for (Tweet tweet : _retweetsArray) {
			ListadotweetsUsuarioregistrado_item item = new ListadotweetsUsuarioregistrado_item(this, tweet);
			this.getContenedorListadoTweets_item().as(VerticalLayout.class).add(item);
		}
	}
	
	public ListadotweetsUsuarioregistrado(Megustas _megustas, Tweet[] _megustasArray) {
		super(_megustas);
		this._megustas = _megustas;
		if(_megustas._verperfildeusuario instanceof VerperfilUsuarioregistrado) {
			this._verperfilUsuarioregistrado = (VerperfilUsuarioregistrado) _megustas._verperfildeusuario;
			this._vermuroprincipalUsuarioregistrado = _megustas._verperfilUsuarioregistrado.vermuroprincipalUsuarioregistrado;
		} else if(_megustas._verperfildeusuario instanceof Verperfilpersonal) {
			this._verperfilpersonal = (Verperfilpersonal) _megustas._verperfildeusuario;
			this._vermuroprincipalUsuarioregistrado = _megustas._verperfilpersonal.vermuroprincipalUsuarioregistrado;
		}
		for (Tweet tweet : _megustasArray) {
			ListadotweetsUsuarioregistrado_item item = new ListadotweetsUsuarioregistrado_item(this, tweet);
			this.getContenedorListadoTweets_item().as(VerticalLayout.class).add(item);
		}
	}
}