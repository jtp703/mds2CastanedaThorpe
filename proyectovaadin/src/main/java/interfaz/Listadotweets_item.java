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
		if(tweet == null) {
			Notification.show("No hay tweets que mostrar", 3000, Position.MIDDLE);
		}
		this.getVerperfil().setText(tweet.getTweeteado_por().getNick());
		this.getTextoTweet().setText(tweet.getTexto());
		this.getnComentarios().setText(String.valueOf(tweet.tiene_comentario.size()));
		this.getnRetweets().setText(String.valueOf(tweet.reetweteado_por.size()));
		this.getnMegustas().setText(String.valueOf(tweet.likeado_por.size()));
		
		if(tweet.tweet_contiene.toArray() != null) {
			Documento documento = null;
			for(int i = 0; i < tweet.tweet_contiene.size(); i++) {
				documento = tweet.tweet_contiene.toArray()[i];
				if(documento != null && i > 0) {
					/*
					//opcion1 no va
					this.getDoc1().setSrc(documento.getUrl());
					//opcion2 no va
					this.getDoc1().getStyle().set("src", documento.getUrl());
					//opcion3
					 */
					Image img = new Image(documento.getUrl(), "Documento");
					this.setDoc1(img);
				} else if(documento != null){
					Image img = new Image(documento.getUrl(), "Documento");
					this.setDoc2(img);
				}
			}
		}
	}

	public Listadotweets_item(Vercomentarios _vercomentarios, base_de_datos.Tweet tweet) {
		this._vercomentarios = _vercomentarios;
		this.tweet = tweet;
	}
}