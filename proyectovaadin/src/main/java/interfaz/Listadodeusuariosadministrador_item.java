package interfaz;

import org.vaadin.example.MainView;

public class Listadodeusuariosadministrador_item extends Listadousuarios_item{
	
	public VerperfilAdministrador _verperfiladministrador;
	public Listadodeusuariosadministrador _listadodeusuariosadministrador;
	public Administrador administrador;
	public base_de_datos.Usuario _usuario;
	
	public Listadodeusuariosadministrador_item(Listadodeusuariosadministrador listadodeusuariosadministrador, base_de_datos.Usuario usuario){
		super(listadodeusuariosadministrador, usuario);
		this.getSeguirUsuario().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilAdministrador(administrador));
	}
	
	public Listadodeusuariosadministrador_item(VerperfilAdministrador _verperfiladministrador, base_de_datos.Usuario usuario) {
		super(_verperfiladministrador, usuario);
		this.getSeguirUsuario().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilAdministrador(administrador));
	}
	
	
	public void VerperfilAdministrador(Administrador administrador) {
		_verperfiladministrador = new VerperfilAdministrador(administrador, _usuario);
		MainView.Pantalla.cambiarVista(_verperfiladministrador);
	}
	

}
