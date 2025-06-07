package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMegustas;

public class Megustas extends VistaMegustas {
	
	public Verperfildeusuario _verperfildeusuario;
	public ListadotweetsUsuarioregistrado _listadotweetsUsuarioregistrado;
	public ListadotweetsAdministrador _listadotweetsAdministrador;
	public ListadotweetsUsuarionoregistrado _listadotweetsUsuarionoregistrado;
	public VerperfilUsuarioregistrado _verperfilUsuarioregistrado;
	public VerperfilAdministrador _verperfilAdministrador;
	public VerperfilUsuarionoregistrado _verperfilUsuarionoregistrado;

	public Megustas(Verperfildeusuario _verperfil) {
		this._verperfildeusuario = _verperfil;
		if (_verperfil instanceof VerperfilUsuarioregistrado) {
			_verperfilUsuarioregistrado = (VerperfilUsuarioregistrado) _verperfil;
			_listadotweetsUsuarioregistrado = new ListadotweetsUsuarioregistrado(this, _verperfilUsuarioregistrado.usuario.likea.toArray());
			this.getContenedorMegustas().as(VerticalLayout.class).add(_listadotweetsUsuarioregistrado);
		} else if (_verperfil instanceof VerperfilAdministrador) {
			_verperfilAdministrador = (VerperfilAdministrador) _verperfil;
			_listadotweetsAdministrador = new ListadotweetsAdministrador(this, _verperfilAdministrador.usuario.likea.toArray());
			this.getContenedorMegustas().as(VerticalLayout.class).add(_listadotweetsAdministrador);
		} else if (_verperfil instanceof VerperfilUsuarionoregistrado) {
			_verperfilUsuarionoregistrado = (VerperfilUsuarionoregistrado) _verperfil;
			_listadotweetsUsuarionoregistrado = new ListadotweetsUsuarionoregistrado(this, _verperfilUsuarionoregistrado.usuario.likea.toArray());
			this.getContenedorMegustas().as(VerticalLayout.class).add(_listadotweetsUsuarionoregistrado);
		} else {
			throw new UnsupportedOperationException("Tipo de perfil no soportado para me gustas.");
		}
	}
}