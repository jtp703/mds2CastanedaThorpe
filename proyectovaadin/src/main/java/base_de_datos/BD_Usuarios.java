package base_de_datos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import base_de_datos.Usuario;
import java.util.Date;

public class BD_Usuarios {
	public BDPrincipal _bD_principal;
	public Vector<Usuario> _contiene_usuarios = new Vector<Usuario>();

	public void borrarPerfil(String aMotivo, String aConfirmacion) {
		throw new UnsupportedOperationException();
	}

	public void seguirUsuario(int aIdSeguidor, int aIdSeguido) {
		throw new UnsupportedOperationException();
	}

	public void dejarSeguir(int aIdSeguidor, int aIdSeguido) {
		throw new UnsupportedOperationException();
	}

	public void actualizar(int aId, String aNombre, String aNickUsuario, String aContrasenia, String aFotoPerfil, String aImgPerfil, String aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public Usuario cargarPerfiilUsuarioregistrado(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] cargarUsuarios() {
		throw new UnsupportedOperationException();
	}

	public Usuario[] cargarUsuariosMegustaTweet(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void asociarUsuarioTweet(int aIdTweetRetweteado, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void banearUsuario(int aIdAdministrador) {
		throw new UnsupportedOperationException();
	}

	public void registrarse(String aNombre, String aPassword, String aMail, String aNickusuario, String aFotoFondo, String aFotoPerfil, String aDescripcion, Date aFecha_creacion) {
		throw new UnsupportedOperationException();
	}

	public Usuario iniciarSesion(String aMail, String aPassword) {
		throw new UnsupportedOperationException();
	}
}