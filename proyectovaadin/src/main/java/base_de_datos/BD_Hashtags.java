package base_de_datos;

import base_de_datos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import base_de_datos.Hashtag;
import base_de_datos.Tweet;

// Ajusta este import al nombre real del PersistentManager generado por tu ORM:
import base_de_datos.MDS12425PFCastanedaThorpePersistentManager;

public class BD_Hashtags {
    public BDPrincipal _bD_principal;
    public Vector<Hashtag> _contiene_hashtags = new Vector<Hashtag>();

    /**
     * Recupera todos los hashtags de la base de datos.
     */
    public Hashtag[] cargarHashtags() throws PersistentException {
        PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
                .instance().getSession().beginTransaction();
        Hashtag[] resultados = new Hashtag[0];
        try {
            // Sin criterio (null, null) lista todos los hashtags
            resultados = HashtagDAO.listHashtagByQuery(null, null);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        } finally {
            MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
        }
        return resultados;
    }

    /**
     * Asocia un hashtag (aIdHashtag) a un tweet (aIdTweet).
     * Si la asociación no existía, se añade y se incrementa numMenciones en el hashtag.
     */
    public void addHashtag(int aIdTweet, int aIdHashtag) throws PersistentException {
        PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
                .instance().getSession().beginTransaction();
        try {
            Tweet tweet = TweetDAO.loadTweetByORMID(aIdTweet);
            Hashtag hashtag = HashtagDAO.loadHashtagByORMID(aIdHashtag);
            if (tweet != null && hashtag != null) {
                // tweet.contiene es HashtagSetCollection; hashtag.aparece_en es TweetSetCollection
                if (!tweet.contiene.contains(hashtag)) {
                    // Añadimos en el lado del tweet
                    tweet.contiene.add(hashtag);
                    TweetDAO.save(tweet);
                    HashtagDAO.save(hashtag);
                }
            }
            t.commit();
        } catch (Exception e) {
            t.rollback();
        } finally {
            MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
        }
    }
}
