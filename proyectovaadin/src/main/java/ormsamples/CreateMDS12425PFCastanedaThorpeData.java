/**
 * Licensee: Diego(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS12425PFCastanedaThorpeData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession().beginTransaction();
		try {
			base_de_datos.UsuarioAutentificado base_de_datosUsuarioAutentificado = base_de_datos.UsuarioAutentificadoDAO.createUsuarioAutentificado();
			// Initialize the properties of the persistent object here
			base_de_datos.UsuarioAutentificadoDAO.save(base_de_datosUsuarioAutentificado);
			base_de_datos.Usuario base_de_datosUsuario = base_de_datos.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : likea_comentario, likea, retweetea, publica_comentario, es_seguido, es_bloqueado, tweetea, sigue, bloquea, es_baneado, idUsuario
			base_de_datos.UsuarioDAO.save(base_de_datosUsuario);
			base_de_datos.Tweet base_de_datosTweet = base_de_datos.TweetDAO.createTweet();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tweet_contiene, tiene_comentario, likeado_por, reetweteado_por, retweet, contiene, numComentarios, numRetweets, numMegustas, es_eliminado, tweeteado_por, tweet
			base_de_datos.TweetDAO.save(base_de_datosTweet);
			base_de_datos.Comentario base_de_datosComentario = base_de_datos.ComentarioDAO.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : comlikeado_por, numMegustas, es_eliminado, pertenecea_tweet, comentado_por
			base_de_datos.ComentarioDAO.save(base_de_datosComentario);
			base_de_datos.Administrador base_de_datosAdministrador = base_de_datos.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : banea, elimina_tweet, elimina, idAdministrador
			base_de_datos.AdministradorDAO.save(base_de_datosAdministrador);
			base_de_datos.Hashtag base_de_datosHashtag = base_de_datos.HashtagDAO.createHashtag();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : aparece_en, numMenciones
			base_de_datos.HashtagDAO.save(base_de_datosHashtag);
			base_de_datos.Documento base_de_datosDocumento = base_de_datos.DocumentoDAO.createDocumento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pertenecea_tweet
			base_de_datos.DocumentoDAO.save(base_de_datosDocumento);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMDS12425PFCastanedaThorpeData createMDS12425PFCastanedaThorpeData = new CreateMDS12425PFCastanedaThorpeData();
			try {
				createMDS12425PFCastanedaThorpeData.createTestData();
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
