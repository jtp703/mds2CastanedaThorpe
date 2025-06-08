package base_de_datos;

import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

// Necesitas importar estas tres clases para que el compilador las encuentre:
import base_de_datos.Administrador;
import base_de_datos.AdministradorDAO;
import base_de_datos.MDS12425PFCastanedaThorpePersistentManager;

public class BD_Administradores {
	public BDPrincipal _bD_principal;
	public Vector<Administrador> _contiene_administradores = new Vector<Administrador>();
    /**
     * Intenta iniciar sesión para un Administrador buscándolo por mail y contraseña.
     * Devuelve el Administrador coincidente, o null si no existe.
     */
    public Administrador iniciarSesion(String aMail, String aPassword) throws PersistentException {
        PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
                .instance().getSession().beginTransaction();
        Administrador administrador = null;
        try {
            String condicion = "Mail = '" + aMail.replace("'", "''") +
                               "' AND Password = '" + aPassword.replace("'", "''") + "'";
            Administrador[] encontrados = AdministradorDAO.listAdministradorByQuery(condicion, null);
            if (encontrados != null && encontrados.length > 0) {
                administrador = encontrados[0];
            }
            t.commit();
        } catch (Exception e) {
            t.rollback();
        } finally {
            MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
        }
        return administrador;
    }

    /**
     * Busca un Administrador por su ID (Mail).
     * Devuelve el Administrador coincidente, o null si no existe.
     */
    public Administrador findByUserMail(String aMail) throws PersistentException {
        PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
                .instance().getSession().beginTransaction();
        Administrador administrador = null;
        try {
            String condicion = "Mail = '" + aMail.replace("'", "''") + "'";
            Administrador[] encontrados = AdministradorDAO.listAdministradorByQuery(condicion, null);
            if (encontrados != null && encontrados.length > 0) {
                administrador = encontrados[0];
            }
            t.commit();
        } catch (Exception e) {
            t.rollback();
        } finally {
            MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
        }
        return administrador;
    }
}