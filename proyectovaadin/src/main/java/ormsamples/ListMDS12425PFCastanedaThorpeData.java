/**
 * Licensee: Diego(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListMDS12425PFCastanedaThorpeData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario...");
		base_de_datos.Usuario[] base_de_datosUsuarios = base_de_datos.UsuarioDAO.listUsuarioByQuery(null, null);
		int length = Math.min(base_de_datosUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tweet...");
		base_de_datos.Tweet[] base_de_datosTweets = base_de_datos.TweetDAO.listTweetByQuery(null, null);
		length = Math.min(base_de_datosTweets.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosTweets[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario...");
		base_de_datos.Comentario[] base_de_datosComentarios = base_de_datos.ComentarioDAO.listComentarioByQuery(null, null);
		length = Math.min(base_de_datosComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		base_de_datos.Administrador[] base_de_datosAdministradors = base_de_datos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(base_de_datosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Hashtag...");
		base_de_datos.Hashtag[] base_de_datosHashtags = base_de_datos.HashtagDAO.listHashtagByQuery(null, null);
		length = Math.min(base_de_datosHashtags.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosHashtags[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Documento...");
		base_de_datos.Documento[] base_de_datosDocumentos = base_de_datos.DocumentoDAO.listDocumentoByQuery(null, null);
		length = Math.min(base_de_datosDocumentos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosDocumentos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Usuario by Criteria...");
		base_de_datos.UsuarioCriteria base_de_datosUsuarioCriteria = new base_de_datos.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_datosUsuarioCriteria.ID.eq();
		base_de_datosUsuarioCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Usuario[] base_de_datosUsuarios = base_de_datosUsuarioCriteria.listUsuario();
		int length =base_de_datosUsuarios== null ? 0 : Math.min(base_de_datosUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Tweet by Criteria...");
		base_de_datos.TweetCriteria base_de_datosTweetCriteria = new base_de_datos.TweetCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_datosTweetCriteria.ID.eq();
		base_de_datosTweetCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Tweet[] base_de_datosTweets = base_de_datosTweetCriteria.listTweet();
		length =base_de_datosTweets== null ? 0 : Math.min(base_de_datosTweets.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosTweets[i]);
		}
		System.out.println(length + " Tweet record(s) retrieved."); 
		
		System.out.println("Listing Comentario by Criteria...");
		base_de_datos.ComentarioCriteria base_de_datosComentarioCriteria = new base_de_datos.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_datosComentarioCriteria.idComentario.eq();
		base_de_datosComentarioCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Comentario[] base_de_datosComentarios = base_de_datosComentarioCriteria.listComentario();
		length =base_de_datosComentarios== null ? 0 : Math.min(base_de_datosComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosComentarios[i]);
		}
		System.out.println(length + " Comentario record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		base_de_datos.AdministradorCriteria base_de_datosAdministradorCriteria = new base_de_datos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_datosAdministradorCriteria.ID.eq();
		base_de_datosAdministradorCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Administrador[] base_de_datosAdministradors = base_de_datosAdministradorCriteria.listAdministrador();
		length =base_de_datosAdministradors== null ? 0 : Math.min(base_de_datosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Hashtag by Criteria...");
		base_de_datos.HashtagCriteria base_de_datosHashtagCriteria = new base_de_datos.HashtagCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_datosHashtagCriteria.idHashtag.eq();
		base_de_datosHashtagCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Hashtag[] base_de_datosHashtags = base_de_datosHashtagCriteria.listHashtag();
		length =base_de_datosHashtags== null ? 0 : Math.min(base_de_datosHashtags.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosHashtags[i]);
		}
		System.out.println(length + " Hashtag record(s) retrieved."); 
		
		System.out.println("Listing Documento by Criteria...");
		base_de_datos.DocumentoCriteria base_de_datosDocumentoCriteria = new base_de_datos.DocumentoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//base_de_datosDocumentoCriteria.idDocumento.eq();
		base_de_datosDocumentoCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Documento[] base_de_datosDocumentos = base_de_datosDocumentoCriteria.listDocumento();
		length =base_de_datosDocumentos== null ? 0 : Math.min(base_de_datosDocumentos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosDocumentos[i]);
		}
		System.out.println(length + " Documento record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListMDS12425PFCastanedaThorpeData listMDS12425PFCastanedaThorpeData = new ListMDS12425PFCastanedaThorpeData();
			try {
				listMDS12425PFCastanedaThorpeData.listTestData();
				//listMDS12425PFCastanedaThorpeData.listByCriteria();
			}
			finally {
				base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
