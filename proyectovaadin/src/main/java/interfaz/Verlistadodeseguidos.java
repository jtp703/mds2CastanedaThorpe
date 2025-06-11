package interfaz;

import org.vaadin.example.MainView;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import base_de_datos.Usuario;

public class Verlistadodeseguidos extends Verlistado {

	
	public VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado;
	public VerperfilUsuarionoregistrado _verperfilusuarionoregistrado;
	public VerperfilAdministrador _verperfilaministrador;
	public Verperfilpersonal _verperfilpersonal;
	public Listadodeusuariosusuarioregistrado _listadousuariosusuarioregistrado;
	public Listadodeusuariosusuarionoregistrado _listadousuariosusuarionoregistrado;
	public Listadodeusuariosadministrador _listadousuariosadministrador;
	public base_de_datos.Usuario usuario;
	

	public Verlistadodeseguidos(Listadodeusuariosusuarioregistrado _listadousuariosusuarioregistrado,
			Usuario[] _usuarioSetCollection) {
		super(_listadousuariosusuarioregistrado);
		this._listadousuariosusuarioregistrado = _listadousuariosusuarioregistrado;
		usuario = this._listadousuariosusuarioregistrado._verlistadoglobaldeusuariosUsuarioregistrado._usuarioregistrado._usuarioregistrado;
		// Botón Cerrar
        this.getBtnCerrar().addClickListener(event -> btnCerrar());
        this.getTituloSeguidores().setVisible(false);

        try {

        	//_listadousuariosusuarioregistrado._item.removeAll(null);
            Usuario[] todosLosSeguidos = _usuarioSetCollection;

            for (Usuario u : todosLosSeguidos) {

                    Listadodeusuariosusuarioregistrado_item item =
                        new Listadodeusuariosusuarioregistrado_item(this, u);
                    
                    this.getListadoSeguidores().as(VerticalLayout.class).add(item);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public Verlistadodeseguidos(Listadodeusuariosusuarionoregistrado _listadousuariosusuarionoregistrado,
			Usuario[] _usuarioSetCollection) {
		super(_listadousuariosusuarionoregistrado);
		this._listadousuariosusuarionoregistrado = _listadousuariosusuarionoregistrado;
		// Botón Cerrar
        this.getBtnCerrar().addClickListener(event -> btnCerrar());
        this.getTituloSeguidores().setVisible(false);

        try {

            Usuario[] todosLosSeguidos = _usuarioSetCollection;

            for (Usuario u : todosLosSeguidos) {

                    Listadodeusuariosusuarionoregistrado_item item =
                        new Listadodeusuariosusuarionoregistrado_item(this._listadousuariosusuarionoregistrado, u);
                    item.usuarionoregistrado.getVerPerfilPersonal().setText(u.getNick());

                    item.getSeguirUsuario().setVisible(false);
                    item.getContenedorSeguidoresSeguidos().setVisible(false);
                    
                    this.getListadoSeguidores().as(VerticalLayout.class).add(item);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public Verlistadodeseguidos(Listadodeusuariosadministrador _listadousuariosadministrador,
			Usuario[] _usuarioSetCollection) {
		super(_listadousuariosadministrador);
		this._listadousuariosadministrador = _listadousuariosadministrador;
		// Botón Cerrar
        this.getBtnCerrar().addClickListener(event -> btnCerrar());
        this.getTituloSeguidores().setVisible(false);
        try {

            Usuario[] todosLosSeguidos = _usuarioSetCollection;

            for (Usuario u : todosLosSeguidos) {

                    Listadodeusuariosadministrador_item item =
                        new Listadodeusuariosadministrador_item(this._listadousuariosadministrador, u);
                    item.administrador.getVerPerfilPersonal().setText(u.getNick());

                    item.getSeguirUsuario().setVisible(false);
                    item.getContenedorSeguidoresSeguidos().setVisible(false);
                    
                    this.getListadoSeguidores().as(VerticalLayout.class).add(item);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	public Verlistadodeseguidos(VerperfilUsuarioregistrado _verperfildeusuariousuarioregistrado, Usuario[] _usuarioSetCollection) {
		super(_verperfildeusuariousuarioregistrado);
        this._verperfildeusuariousuarioregistrado = _verperfildeusuariousuarioregistrado;
        this.getVerPerfil().setText(_verperfildeusuariousuarioregistrado.usuario.getNick());
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
		this.getVerPerfil().setText(_verperfilusuarionoregistrado.usuario.getNick());
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
		this.getVerPerfil().setText(_verperfilaministrador.usuario.getNick());
		for (Usuario usuario : _usuarioSetCollection) {
			Listadodeusuariosadministrador_item item = new Listadodeusuariosadministrador_item(_verperfilaministrador, usuario);
			eliminarSeguidoresYSeguidos(item);
			this.getListadoSeguidos().as(VerticalLayout.class).add(item);
		}

		this.getBtnCerrar().addClickListener(event -> btnCerrar());
	}
	
	public Verlistadodeseguidos(Verperfilpersonal _verperfilpersonal,
			Usuario[] _usuarioSetCollection) {
		super(_verperfilpersonal);
		this._verperfilpersonal = _verperfilpersonal;
		// Botón Cerrar
        this.getBtnCerrar().addClickListener(event -> btnCerrar());

        try {

            Usuario[] todosLosSeguidos = _usuarioSetCollection;

            for (Usuario u : todosLosSeguidos) {

                    Listadodeusuariosusuarionoregistrado_item item =
                        new Listadodeusuariosusuarionoregistrado_item(this._listadousuariosusuarionoregistrado, u);
                    item.usuarionoregistrado.getVerPerfilPersonal().setText(u.getNick());

                    item.getSeguirUsuario().setVisible(false);
                    item.getContenedorSeguidoresSeguidos().setVisible(false);
                    
                    this.getListadoSeguidores().as(VerticalLayout.class).add(item);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	private void eliminarSeguidoresYSeguidos(Listadousuarios_item item) {
		item.getSeguirUsuario().setVisible(false);
		item.getContenedorSeguidoresSeguidos().setVisible(false);
	}

	private void btnCerrar() {
		MainView.Pantalla.volver();
	}
}