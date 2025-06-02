package base_de_datos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import base_de_datos.Comentario;

public class BD_Comentarios {
	public BDPrincipal _bD_principal;
	public Vector<Comentario> _contiene_comentarios = new Vector<Comentario>();

	public void borrarComentario(int aIdComentario) {
		throw new UnsupportedOperationException();
	}

	public void quitarMegustaComentario(int aIdUsuario, int aIdComentario) {
		throw new UnsupportedOperationException();
	}

	public Comentario escribirComentario(String aTexto) {
		throw new UnsupportedOperationException();
	}

	public void darMegustaComentario(int aIdUsuario, int aIdComentario) {
		throw new UnsupportedOperationException();
	}

	public Comentario[] cargarComentarios() {
		throw new UnsupportedOperationException();
	}
}