package interfaz;

public class Listadodeusuariosadministrador_item extends Listadousuarios_item{
	public Listadodeusuariosadministrador _listadodeusuariosadministrador;
	
	Listadodeusuariosadministrador_item(Listadodeusuariosadministrador listadodeusuariosadministrador){
		super(listadodeusuariosadministrador);
		this.getSeguirUsuario().setVisible(false);
	}
	

}
