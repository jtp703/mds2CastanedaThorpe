/**
 * Licensee: Diego(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMDS12425PFCastanedaThorpeData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession().beginTransaction();
		try {
			base_de_datos.UsuarioAutentificado base_de_datosUsuarioAutentificado = base_de_datos.UsuarioAutentificadoDAO.loadUsuarioAutentificadoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.UsuarioAutentificadoDAO.save(base_de_datosUsuarioAutentificado);
			base_de_datos.Usuario base_de_datosUsuario = base_de_datos.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.UsuarioDAO.save(base_de_datosUsuario);
			base_de_datos.Tweet base_de_datosTweet = base_de_datos.TweetDAO.loadTweetByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.TweetDAO.save(base_de_datosTweet);
			base_de_datos.Comentario base_de_datosComentario = base_de_datos.ComentarioDAO.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.ComentarioDAO.save(base_de_datosComentario);
			base_de_datos.Administrador base_de_datosAdministrador = base_de_datos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.AdministradorDAO.save(base_de_datosAdministrador);
			base_de_datos.Hashtag base_de_datosHashtag = base_de_datos.HashtagDAO.loadHashtagByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.HashtagDAO.save(base_de_datosHashtag);
			base_de_datos.Documento base_de_datosDocumento = base_de_datos.DocumentoDAO.loadDocumentoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.DocumentoDAO.save(base_de_datosDocumento);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving UsuarioAutentificado by UsuarioAutentificadoCriteria");
		base_de_datos.UsuarioAutentificadoCriteria base_de_datosUsuarioAutentificadoCriteria = new base_de_datos.UsuarioAutentificadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosUsuarioAutentificadoCriteria.ID.eq();
		System.out.println(base_de_datosUsuarioAutentificadoCriteria.uniqueUsuarioAutentificado());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		base_de_datos.UsuarioCriteria base_de_datosUsuarioCriteria = new base_de_datos.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosUsuarioCriteria.ID.eq();
		System.out.println(base_de_datosUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Tweet by TweetCriteria");
		base_de_datos.TweetCriteria base_de_datosTweetCriteria = new base_de_datos.TweetCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosTweetCriteria.idTweet.eq();
		System.out.println(base_de_datosTweetCriteria.uniqueTweet());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		base_de_datos.ComentarioCriteria base_de_datosComentarioCriteria = new base_de_datos.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosComentarioCriteria.idComentario.eq();
		System.out.println(base_de_datosComentarioCriteria.uniqueComentario());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		base_de_datos.AdministradorCriteria base_de_datosAdministradorCriteria = new base_de_datos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosAdministradorCriteria.ID.eq();
		System.out.println(base_de_datosAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Hashtag by HashtagCriteria");
		base_de_datos.HashtagCriteria base_de_datosHashtagCriteria = new base_de_datos.HashtagCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosHashtagCriteria.idHashtag.eq();
		System.out.println(base_de_datosHashtagCriteria.uniqueHashtag());
		
		System.out.println("Retrieving Documento by DocumentoCriteria");
		base_de_datos.DocumentoCriteria base_de_datosDocumentoCriteria = new base_de_datos.DocumentoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//base_de_datosDocumentoCriteria.idDocumento.eq();
		System.out.println(base_de_datosDocumentoCriteria.uniqueDocumento());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMDS12425PFCastanedaThorpeData retrieveAndUpdateMDS12425PFCastanedaThorpeData = new RetrieveAndUpdateMDS12425PFCastanedaThorpeData();
			try {
				retrieveAndUpdateMDS12425PFCastanedaThorpeData.retrieveAndUpdateTestData();
				//retrieveAndUpdateMDS12425PFCastanedaThorpeData.retrieveByCriteria();
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
