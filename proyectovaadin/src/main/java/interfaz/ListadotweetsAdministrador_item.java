package interfaz;

import org.vaadin.example.MainView;

public class ListadotweetsAdministrador_item extends Listadotweets_item {
	//	private event _eliminartweet;
	private int _numRetweets;
	private int _numComentarios;
	public ListadotweetsAdministrador _listadotweetsAdministrador;
	public VercomentariosAdminstrador _vercomentariosAdminstrador;
	public Administrador admin;
	
	public ListadotweetsAdministrador_item(ListadotweetsAdministrador listadotweetsAdministrador) {
		super(listadotweetsAdministrador, null);
		this.getDarRetweet().setVisible(false);
		this.getMeGusta().setVisible(false);
		this.getVerperfil().addClickListener(event -> verPerfilUsuarioNoRegistrado());
		this.getComentar().addClickListener(event -> VercomentariosAdministrador());
	}
	
	public ListadotweetsAdministrador_item(VercomentariosAdminstrador _vercomentariosAdminstrador) {
		super(_vercomentariosAdminstrador);
		this.getDarRetweet().setVisible(false);
		this.getMeGusta().setVisible(false);
		this.getVerperfil().addClickListener(event -> verPerfilUsuarioNoRegistrado());
		this.getComentar().addClickListener(event -> VercomentariosAdministrador());
	}
	
	public void Eliminartweet() {
		throw new UnsupportedOperationException();
	}
	
	public void VercomentariosAdministrador() {
		this._vercomentariosAdminstrador = new VercomentariosAdminstrador(this);
		MainView.Pantalla.cambiarVista(this._vercomentariosAdminstrador);
	}
	
	private void verPerfilUsuarioNoRegistrado() {
		VerperfilAdministrador _verperfilAdministrador = new VerperfilAdministrador(this.admin);
		System.out.println("Ejecución ver perfil de usuario no registrado");
		MainView.Pantalla.cambiarVista(_verperfilAdministrador);
	}
}