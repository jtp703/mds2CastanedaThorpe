package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaRetweets;

public class Retweets extends VistaRetweets {
	public Verperfildeusuario _verperfildeusuario;
	public ListadotweetsUsuarioregistrado _listadotweetsUsuarioregistrado;
	public ListadotweetsAdministrador _listadotweetsAdministrador;
	public ListadotweetsUsuarionoregistrado _listadotweetsUsuarionoregistrado;
	public Listadotweets _listadotweets;
	
	public Retweets(Verperfildeusuario _verperfil) {
		this._verperfildeusuario = _verperfil;
		
		if(_verperfil instanceof VerperfilUsuarioregistrado) {
			VerperfilUsuarioregistrado _verperfilregistrado = (VerperfilUsuarioregistrado) _verperfil;
			_listadotweetsUsuarioregistrado = new ListadotweetsUsuarioregistrado(this, _verperfilregistrado.usuario.retweetea.toArray());
			this.getContenedorRetweets().as(VerticalLayout.class).add(_listadotweetsUsuarioregistrado);
		} else if(_verperfil instanceof VerperfilAdministrador) {
			VerperfilAdministrador _verperfiladmin = (VerperfilAdministrador) _verperfil;
			_listadotweetsAdministrador = new ListadotweetsAdministrador(this, _verperfiladmin.usuario.retweetea.toArray());
			this.getContenedorRetweets().as(VerticalLayout.class).add(_listadotweetsAdministrador);
		} else if(_verperfil instanceof VerperfilUsuarionoregistrado) {
			VerperfilUsuarionoregistrado _verperfilnoregistrado = (VerperfilUsuarionoregistrado) _verperfil;
			_listadotweetsUsuarionoregistrado = new ListadotweetsUsuarionoregistrado(this, _verperfilnoregistrado.usuario.retweetea.toArray());
			this.getContenedorRetweets().as(VerticalLayout.class).add(_listadotweetsUsuarionoregistrado);
		} else {
			throw new UnsupportedOperationException("Tipo de perfil no soportado para retweets.");
		}
	}
}