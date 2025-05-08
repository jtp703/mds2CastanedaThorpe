package interfaz;

public class VerperfilAdministrador extends Verperfildeusuario {
	public Administrador _administrador;
	public Banearusuario _banearusuario;
	
	public VerperfilAdministrador(Administrador _administrador) {
		super(_administrador);
	}

	public void Banear_usuarios() {
		throw new UnsupportedOperationException();
	}
}