package interfaz;

import vistas.VistaListadotweets_item;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.*;
import com.vaadin.flow.component.notification.Notification.Position;

import base_de_datos.Documento;

public class Listadotweets_item extends VistaListadotweets_item {
	
	//private event _darmegusta;
	//private label _nickUsuario;
	//private image _perfilUsuario;
	private int _numRetweets;
	private int _numComentarios;
	
	public base_de_datos.Tweet tweet;

	public Listadotweets _listadotweets;
	public Vercomentarios _vercomentarios;

	public Listadotweets_item(Listadotweets listadoTweets, base_de_datos.Tweet tweet) {
		this._listadotweets = listadoTweets;
		this.tweet = tweet;
		if(tweet == null) {
			Notification.show("No hay tweets que mostrar", 3000, Position.MIDDLE);
		}
		this.getVerperfil().setText(tweet.getTweeteado_por().getNick());
		this.getTextoTweet().setText(tweet.getTexto());
		this.getnComentarios().setText(String.valueOf(tweet.getNumComentarios()));
		this.getnRetweets().setText(String.valueOf(tweet.getNumRetweets()));
		this.getnMegustas().setText(String.valueOf(tweet.getNumMegustas()));
		
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
					this.getDoc2().setSrc(documento.getUrl());
				}
			}
		}
		//falta funcionalidad settear mg y retweet con color si el usuario ya lo ha hecho.
		//falta funcionalidad imagen.
	}

	public Listadotweets_item(Vercomentarios _vercomentarios, base_de_datos.Tweet tweet) {
		this._vercomentarios = _vercomentarios;
		this.tweet = tweet;
	}
}