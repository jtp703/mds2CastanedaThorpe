package interfaz;

public class Verperfilpersonal extends Verperfildeusuario {
//	private event _cerrar_sesion__Usuario_registrado_;
	public Usuarioregistrado usuarioregistrado;
	public Eliminarperfil _eliminarperfil;
	public Editarperfil _editarperfil;
	
	public Verperfilpersonal(Usuarioregistrado usuarioregistrado) {
		super(usuarioregistrado);
	}

	public void Eliminar_perfil() {
		throw new UnsupportedOperationException();
	}

	public void Editar_perfil() {
		throw new UnsupportedOperationException();
	}

	public void Cerrar_sesion__Usuario_registrado_() {
		throw new UnsupportedOperationException();
	}
}