package base_de_datos;

import base_de_datos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Documento;
import base_de_datos.Tweet;

// Ajusta este import al nombre real del PersistentManager generado por tu ORM:
import base_de_datos.MDS12425PFCastanedaThorpePersistentManager;

public class BD_Documentos {
    public BDPrincipal _bD_principal;
    public Vector<Documento> _contiene_documentos = new Vector<Documento>();

    /**
     * Crea y asocia un nuevo Documento a un Tweet existente.
     *
     * @param aDocumentos URL o ruta del documento.
     * @param aTipo       Tipo del documento (por ejemplo, "imagen", "pdf", etc.).
     * @param aIdTweet    ID del Tweet al que se asocia este documento.
     */
    public void addDocumento(String aDocumentos, String aTipo, int aIdTweet) throws PersistentException {
        PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
                .instance().getSession().beginTransaction();
        try {
            // 1. Cargamos el Tweet al que queremos asociar el Documento
            Tweet tweet = TweetDAO.loadTweetByORMID(aIdTweet);
            if (tweet == null) {
                throw new PersistentException("Tweet con ID " + aIdTweet + " no encontrado.");
            }

            // 2. Creamos el Documento
            Documento doc = DocumentoDAO.createDocumento();
            doc.setUrl(aDocumentos);
            doc.setTipo(aTipo);

            // 3. Asociamos el Documento al Tweet
            doc.setPertenecea_tweet(tweet);

            // 4. Guardamos el Documento
            DocumentoDAO.save(doc);

            t.commit();
        } catch (Exception e) {
            t.rollback();
        } finally {
            MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
        }
    }
}
