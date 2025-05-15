package interfaz;

import org.vaadin.example.MainView;

public class Listadodeusuariosadministrador_item extends Listadousuarios_item{
	
	public VerperfilAdministrador _verperfiladministrador;
	public Listadodeusuariosadministrador _listadodeusuariosadministrador;
	public Administrador administrador;
	
	public Listadodeusuariosadministrador_item(Listadodeusuariosadministrador listadodeusuariosadministrador){
		super(listadodeusuariosadministrador);
		this.getSeguirUsuario().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilAdministrador(administrador));
	}
	
	public Listadodeusuariosadministrador_item(VerperfilAdministrador _verperfiladministrador) {
		super(_verperfiladministrador);
		this.getSeguirUsuario().setVisible(false);
		this.getVerperfil().addClickListener(event -> VerperfilAdministrador(administrador));
	}
	
	
	public void VerperfilAdministrador(Administrador administrador) {
		_verperfiladministrador = new VerperfilAdministrador(administrador);
		MainView.Pantalla.cambiarVista(_verperfiladministrador);
	}
	

}
