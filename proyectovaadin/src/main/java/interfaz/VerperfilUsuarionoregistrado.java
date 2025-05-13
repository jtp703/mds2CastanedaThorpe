package interfaz;

import org.vaadin.example.MainView;

public class VerperfilUsuarionoregistrado extends Verperfildeusuario{
	public Usuarionoregistrado _usuarioNoRegistrado;
	public ListadotweetsUsuarionoregistrado _listadotweetsUsuarioNoRegistrado;
	
	public VerperfilUsuarionoregistrado(Usuarionoregistrado _usuarioNoRegistrado) {
		super(_usuarioNoRegistrado);
		this._usuarioNoRegistrado = _usuarioNoRegistrado;
		this.getBtnBanearUsuario().setVisible(false);
		this.getBtnEditarPerfil().setVisible(false);
		this.getBtnEliminarPerfil().setVisible(false);
		this.getBtnBloquear().setVisible(false);
		this.getBtnSeguir().setVisible(false);
		
		this.getBtnVolver().addClickListener(event -> btnVolver());
	}
	
	public VerperfilUsuarionoregistrado(ListadotweetsUsuarionoregistrado _listadotweetsUsuarioNoRegistrado) {
		super(_listadotweetsUsuarioNoRegistrado);
	}
	
	public void Retweets(Retweets _retweets) {
		this._retweets = _retweets;
	}
	public void Me_gustas(Megustas _megustas) {
		this._megustas = _megustas;
	}
	public void Ver_Listado(Verlistado _verlistado) {
		this._verlistado = _verlistado;
	}
	public void Listadotweets(Listadotweets _listadotweets) {
		this._listadotweets = _listadotweets;
	}
	
	private void btnVolver() {
		MainView.Pantalla.volver();
		System.out.println("Volver a la vista anterior desde ver perfil usuario no registrado");
	}

}
