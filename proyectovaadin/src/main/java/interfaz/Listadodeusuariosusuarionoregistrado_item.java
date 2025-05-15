package interfaz;

import org.vaadin.example.MainView;

public class Listadodeusuariosusuarionoregistrado_item extends Listadousuarios_item {
	
	public VerperfilUsuarionoregistrado _verPerfilUsuarionoregistrado;
	public Listadodeusuariosusuarionoregistrado _listadodeusuariosusuarionoregistrado;
	public Usuarionoregistrado usuarionoregistrado;
	
	public Listadodeusuariosusuarionoregistrado_item(Listadodeusuariosusuarionoregistrado listadodeusuariosusuarionoregistrado){
		super(listadodeusuariosusuarionoregistrado);
		this.getSeguirUsuario().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilUsuarionoregistrado(usuarionoregistrado));
	}
	
	public Listadodeusuariosusuarionoregistrado_item(VerperfilUsuarionoregistrado _verPerfilUsuarionoregistrado) {
		super(_verPerfilUsuarionoregistrado);
		this.getSeguirUsuario().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilUsuarionoregistrado(usuarionoregistrado));
	}
	
	public void VerperfilUsuarionoregistrado(Usuarionoregistrado usuarionoregistrado) {
		_verPerfilUsuarionoregistrado = new VerperfilUsuarionoregistrado(usuarionoregistrado);
		MainView.Pantalla.cambiarVista(_verPerfilUsuarionoregistrado);
	}

}
