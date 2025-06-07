package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Usuario;

public class Verlistadodeseguidos extends Verlistado {

	public Listadodeusuariosusuarioregistrado _listadousuariosusuarioregistrado;
	public VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado;
	public VerperfilUsuarionoregistrado _verperfilusuarionoregistrado;
	public VerperfilAdministrador _verperfilaministrador;

	public Verlistadodeseguidos(Listadousuarios _listadousuarios) {
		super(_listadousuarios);
		this.getListadoSeguidores().setVisible(false);
		this.getTituloSeguidores().setVisible(false);
		Listadousuarios_item item0 = new Listadousuarios_item(_listadousuarios, null);
		item0.getSeguirUsuario().setVisible(false);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item0);

		Listadousuarios_item item1 = new Listadousuarios_item(_listadousuarios, null);
		item1.getSeguirUsuario().setVisible(false);
		this.getListadoSeguidos().as(VerticalLayout.class).add(item1);

		this.getBtnCerrar().addClickListener(event -> btnCerrar());
	}

	public Verlistadodeseguidos(VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado, Usuario[] _usuarioSetCollection) {
		super(_verperfildeusuariousuarioregistrado);
        this._verperfildeusuariousuarioregistrado = _verperfildeusuariousuarioregistrado;
        // Botón Cerrar
        this.getBtnCerrar().addClickListener(event -> btnCerrar());

        try {

            Usuario[] todosLosSeguidos = _usuarioSetCollection;

            for (Usuario u : todosLosSeguidos) {

                    Listadodeusuariosusuarioregistrado_item item =
                        new Listadodeusuariosusuarioregistrado_item(this._verperfildeusuariousuarioregistrado, u);
                    item.usuarioRegistrado.getVerPerfilPersonal().setText(u.getNick());

                    item.getSeguirUsuario().setVisible(false);
                    item.getContenedorSeguidoresSeguidos().setVisible(false);
                    
                    this.getListadoSeguidores().as(VerticalLayout.class).add(item);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public Verlistadodeseguidos(VerperfilUsuarionoregistrado _verperfilusuarionoregistrado, Usuario[] _usuarioSetCollection) {
		super(_verperfilusuarionoregistrado);
		this._verperfilusuarionoregistrado = _verperfilusuarionoregistrado;
		this.getListadoSeguidores().setVisible(false);
		this.getTituloSeguidores().setVisible(false);
		this.getBtnCerrar().addClickListener(event -> btnCerrar());

		try {

			Usuario[] todosLosSeguidos = _usuarioSetCollection;

			for (Usuario u : todosLosSeguidos) {

				Listadodeusuariosusuarionoregistrado_item item = new Listadodeusuariosusuarionoregistrado_item(
						this._verperfilusuarionoregistrado, u);
				item.usuarionoregistrado.getVerPerfilPersonal().setText(u.getNick());

				item.getSeguirUsuario().setVisible(false);
				item.getContenedorSeguidoresSeguidos().setVisible(false);

				this.getListadoSeguidos().as(VerticalLayout.class).add(item);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public Verlistadodeseguidos(VerperfilAdministrador _verperfilaministrador, Usuario[] _usuarioSetCollection) {
		super(_verperfilaministrador);
		this.getListadoSeguidores().setVisible(false);
		this.getTituloSeguidores().setVisible(false);
		for (Usuario usuario : _usuarioSetCollection) {
			Listadodeusuariosadministrador_item item = new Listadodeusuariosadministrador_item(_verperfilaministrador, usuario);
			eliminarSeguidoresYSeguidos(item);
			this.getListadoSeguidos().as(VerticalLayout.class).add(item);
		}

		this.getBtnCerrar().addClickListener(event -> btnCerrar());
	}
	
	private void eliminarSeguidoresYSeguidos(Listadousuarios_item item) {
		item.getSeguirUsuario().setVisible(false);
		item.getContenedorSeguidoresSeguidos().setVisible(false);
	}

	private void btnCerrar() {
		MainView.Pantalla.volver();
	}
}