package interfaz;

import org.vaadin.example.MainView;

public class Listadodeusuariosusuarionoregistrado_item extends Listadousuarios_item {
	
	public VerperfilUsuarionoregistrado _verPerfilUsuarionoregistrado;
	public Listadodeusuariosusuarionoregistrado _listadodeusuariosusuarionoregistrado;
	public Usuarionoregistrado usuarionoregistrado;
	public base_de_datos.Usuario _usuario;
	
	public Listadodeusuariosusuarionoregistrado_item(Listadodeusuariosusuarionoregistrado listadodeusuariosusuarionoregistrado, base_de_datos.Usuario usuario){
		super(listadodeusuariosusuarionoregistrado, usuario);
		this._usuario = usuario;
		this.getSeguirUsuario().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilUsuarionoregistrado(usuarionoregistrado));
	}
	
	public Listadodeusuariosusuarionoregistrado_item(VerperfilUsuarionoregistrado _verPerfilUsuarionoregistrado, base_de_datos.Usuario usuario) {
		super(_verPerfilUsuarionoregistrado, usuario);
		this._usuario = usuario;
		this.getSeguirUsuario().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilUsuarionoregistrado(usuarionoregistrado));
	}
	
	public void VerperfilUsuarionoregistrado(Usuarionoregistrado usuarionoregistrado) {
		_verPerfilUsuarionoregistrado = new VerperfilUsuarionoregistrado(usuarionoregistrado);
		MainView.Pantalla.cambiarVista(_verPerfilUsuarionoregistrado);
	}

}
