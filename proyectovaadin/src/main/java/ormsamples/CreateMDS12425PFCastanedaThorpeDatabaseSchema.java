/**
 * Licensee: Diego(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS12425PFCastanedaThorpeDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance());
			base_de_datos.MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
