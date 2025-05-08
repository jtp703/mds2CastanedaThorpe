package interfaz;

public class VerperfilUsuarioregistrado extends Verperfildeusuario {
	/*private event _bloquear_usuario;
	private event _seguir_usuario_desde_perfil;*/
	
	public Usuarioregistrado usuarioregistrado;
	public ListadotweetsUsuarioregistrado listadotweetsUsuarioregistrado;
	
	public VerperfilUsuarioregistrado(Usuarioregistrado usuarioregistrado) {
		super(usuarioregistrado);
	}
	
	public VerperfilUsuarioregistrado(ListadotweetsUsuarioregistrado listadotweetsUsuarioregistrado) {
		super(listadotweetsUsuarioregistrado);
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
	public void Bloquear_usuario() {
		throw new UnsupportedOperationException();
	}

	public void Seguir_usuario_desde_perfil() {
		throw new UnsupportedOperationException();
	}

	public void VerListadoTweets() {
		throw new UnsupportedOperationException();
	}
}