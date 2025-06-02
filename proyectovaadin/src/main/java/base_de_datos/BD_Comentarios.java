package base_de_datos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import base_de_datos.Comentario;
import base_de_datos.Usuario;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import base_de_datos.MDS12425PFCastanedaThorpePersistentManager; // Ajustar al nombre real del PersistentManager generado por ORM

public class BD_Comentarios {
	public BDPrincipal _bD_principal;
	public Vector<Comentario> _contiene_comentarios = new Vector<Comentario>();

	/**
	 * Elimina un comentario dado su ID.
	 */
	public void borrarComentario(int aIdComentario) throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		try {
			Comentario comentario = ComentarioDAO.loadComentarioByORMID(aIdComentario);
			if (comentario != null) {
				ComentarioDAO.delete(comentario);
			}
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}

		MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
	}

	/**
	 * Quita el "Me gusta" de un comentario: elimina la relación entre el usuario y el comentario,
	 * y decrementa el contador de "Me gusta".
	 */
	public void quitarMegustaComentario(int aIdUsuario, int aIdComentario) throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		try {
			Usuario usuario = UsuarioDAO.loadUsuarioByORMID(aIdUsuario);
			Comentario comentario = ComentarioDAO.loadComentarioByORMID(aIdComentario);
			if (usuario != null && comentario != null) {
				// Remueve la relación Many-to-Many
				if (comentario.comlikeado_por.contains(usuario)) {
					comentario.comlikeado_por.remove(usuario);
					// Actualiza el contador de "Me gusta"
					int actuales = comentario.getNumMegustas();
					comentario.setNumMegustas(Math.max(0, actuales - 1));
					ComentarioDAO.save(comentario);
				}
			}
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}

		MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
	}

	/**
	 * Crea y guarda un nuevo comentario con el texto proporcionado.
	 * Inicializa el contador de "Me gusta" a cero.
	 */
	public Comentario escribirComentario(String aTexto) throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		Comentario comentario = null;
		try {
			comentario = ComentarioDAO.createComentario();
			comentario.setTexto(aTexto);
			comentario.setNumMegustas(0);
			ComentarioDAO.save(comentario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}

		MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
		return comentario;
	}

	/**
	 * Añade un "Me gusta" a un comentario: crea la relación entre el usuario y el comentario,
	 * y aumenta el contador de "Me gusta".
	 */
	public void darMegustaComentario(int aIdUsuario, int aIdComentario) throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		try {
			Usuario usuario = UsuarioDAO.loadUsuarioByORMID(aIdUsuario);
			Comentario comentario = ComentarioDAO.loadComentarioByORMID(aIdComentario);
			if (usuario != null && comentario != null) {
				// Añade la relación Many-to-Many
				if (!comentario.comlikeado_por.contains(usuario)) {
					comentario.comlikeado_por.add(usuario);
					// Actualiza el contador de "Me gusta"
					int actuales = comentario.getNumMegustas();
					comentario.setNumMegustas(actuales + 1);
					ComentarioDAO.save(comentario);
				}
			}
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}

		MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
	}

	/**
	 * Devuelve todos los comentarios almacenados en la base de datos.
	 */
	public Comentario[] cargarComentarios() throws PersistentException {
		PersistentTransaction t = MDS12425PFCastanedaThorpePersistentManager
				.instance().getSession().beginTransaction();
		Comentario[] resultados = new Comentario[0];
		try {
			// Sin criterios (null, null) lista todos los comentarios
			resultados = ComentarioDAO.listComentarioByQuery(null, null);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}

		MDS12425PFCastanedaThorpePersistentManager.instance().disposePersistentManager();
		return resultados;
	}
}
