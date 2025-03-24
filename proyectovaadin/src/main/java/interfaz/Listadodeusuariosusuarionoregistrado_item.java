package interfaz;

public class Listadodeusuariosusuarionoregistrado_item extends Listadousuarios_item {
	public Listadodeusuariosusuarionoregistrado _listadodeusuariosusuarionoregistrado;
	
	Listadodeusuariosusuarionoregistrado_item(Listadodeusuariosusuarionoregistrado listadodeusuariosusuarionoregistrado){
		super(listadodeusuariosusuarionoregistrado);
		this.get_SeguirUsuario().setVisible(false);
	}
	

}
