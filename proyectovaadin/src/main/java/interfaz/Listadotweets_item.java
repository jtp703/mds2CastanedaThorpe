package interfaz;

import vistas.VistaListadotweets_item;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.*;
import com.vaadin.flow.component.notification.Notification.Position;

import base_de_datos.Documento;

public class Listadotweets_item extends VistaListadotweets_item {
	
	public Listadotweets _listadotweets;
	public Vercomentarios _vercomentarios;
	public base_de_datos.Tweet tweet;
	
	public Listadotweets_item(Listadotweets listadoTweets, base_de_datos.Tweet tweet) {
        this._listadotweets = listadoTweets;
        this.tweet = tweet;
        if (tweet == null) {
            Notification.show("No hay tweets que mostrar", 3000, Position.MIDDLE);
            return;
        }
        
        // Rellenar datos básicos
        getVerperfil().setText(tweet.getTweeteado_por().getNick());
        getTextoTweet().setText(tweet.getTexto());
        getnComentarios().setText(String.valueOf(tweet.tiene_comentario.size()));
        getnRetweets().setText(String.valueOf(tweet.reetweteado_por.size()));
        getnMegustas().setText(String.valueOf(tweet.likeado_por.size()));
        
        // Obtener los documentos asociados al tweet
        base_de_datos.Documento[] docs = 
            tweet.tweet_contiene.toArray();
        
        // Documento 1
        if (docs.length >= 1 && docs[0] != null) {
            getDoc1().setSrc(docs[0].getUrl());
            getDoc1().setAlt("Documento 1");
            getDoc1().getStyle()
                .set("width", "120px")
                .set("height", "auto")
                .set("border-radius", "8px")
                .set("margin-right", "8px");
        } else {
            getDoc1().setVisible(false);
        }

        // Documento 2
        if (docs.length >= 2 && docs[1] != null) {
            getDoc2().setSrc(docs[1].getUrl());
            getDoc2().setAlt("Documento 2");
            getDoc2().getStyle()
                .set("width", "120px")
                .set("height", "auto")
                .set("border-radius", "8px");
        } else {
            getDoc2().setVisible(false);
        }
    }

	public Listadotweets_item(Vercomentarios _vercomentarios, base_de_datos.Tweet tweet) {
		this._vercomentarios = _vercomentarios;
		this.tweet = tweet;
		this.getVerperfil().setText(tweet.getTweeteado_por().getNick());
		this.getTextoTweet().setText(tweet.getTexto());
		this.getBtnEliminarTweet().setVisible(false);
	}
}