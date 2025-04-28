/**
 * Licensee: Diego(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteMDS12425PFCastanedaThorpeData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().getSession().beginTransaction();
		try {
			base_de_datos.Usuario base_de_datosUsuario = base_de_datos.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			base_de_datos.UsuarioDAO.delete(base_de_datosUsuario);
			base_de_datos.Tweet base_de_datosTweet = base_de_datos.TweetDAO.loadTweetByQuery(null, null);
			// Delete the persistent object
			base_de_datos.TweetDAO.delete(base_de_datosTweet);
			base_de_datos.Comentario base_de_datosComentario = base_de_datos.ComentarioDAO.loadComentarioByQuery(null, null);
			// Delete the persistent object
			base_de_datos.ComentarioDAO.delete(base_de_datosComentario);
			base_de_datos.Administrador base_de_datosAdministrador = base_de_datos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			base_de_datos.AdministradorDAO.delete(base_de_datosAdministrador);
			base_de_datos.Hashtag base_de_datosHashtag = base_de_datos.HashtagDAO.loadHashtagByQuery(null, null);
			// Delete the persistent object
			base_de_datos.HashtagDAO.delete(base_de_datosHashtag);
			base_de_datos.Documento base_de_datosDocumento = base_de_datos.DocumentoDAO.loadDocumentoByQuery(null, null);
			// Delete the persistent object
			base_de_datos.DocumentoDAO.delete(base_de_datosDocumento);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMDS12425PFCastanedaThorpeData deleteMDS12425PFCastanedaThorpeData = new DeleteMDS12425PFCastanedaThorpeData();
			try {
				deleteMDS12425PFCastanedaThorpeData.deleteTestData();
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
