package interfaz;

import org.orm.PersistentException;
import org.vaadin.example.MainView;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;

import base_de_datos.Usuario;
import base_de_datos.iUsuarioregistrado;
import vistas.VistaEditarperfil;

public class Editarperfil extends VistaEditarperfil{
	
	//	private event _guardarcambios;
	public Verperfilpersonal _verperfilpersonal;
	//public Usuarioregistrado usuarioregistrado;
	public iUsuarioregistrado _iUsuarioregistrado;
	
	public Editarperfil(Verperfilpersonal _verperfilpersonal) {
		this._verperfilpersonal = _verperfilpersonal;
		this._iUsuarioregistrado = _verperfilpersonal.usuarioregistrado.iUsuarioregistrado;
		this.get_nickUsuario().setValue(_verperfilpersonal.usuarioregistrado._usuarioregistrado.getNick());
		this.get_NombreUsuario().setValue(_verperfilpersonal.usuarioregistrado._usuarioregistrado.getNombre());
		this.get_DescripcionPerfil().setValue(_verperfilpersonal.usuarioregistrado._usuarioregistrado.getDescripcion());
		this.get_UrlImagenFondo().setValue(_verperfilpersonal.usuarioregistrado._usuarioregistrado.getFotoFondo());
		this.get_UrlImagenPerfil().setValue(_verperfilpersonal.usuarioregistrado._usuarioregistrado.getFotoPerfil());
		this.get_contraUsuario().setValue(_verperfilpersonal.usuarioregistrado._usuarioregistrado.getPassword());
		this.getBtnVolver().addClickListener(event -> btnVolver());
		this.getBtnGuardar().addClickListener(event -> Guardarcambios());
	}
	
	public void Guardarcambios() {
        try {
            String nombre       = this.get_NombreUsuario().getValue().trim();
            String nick         = this.get_nickUsuario().getValue().trim();
            String contrasenia  = this.get_contraUsuario().getValue().trim();
            String fotoPerfil   = this.get_UrlImagenPerfil().getValue().trim();
            String fotoFondo    = this.get_UrlImagenFondo().getValue().trim();
            String descripcion  = this.get_DescripcionPerfil().getValue().trim();

            int idUsuario = _verperfilpersonal.usuarioregistrado._usuarioregistrado.getID();

            // 1. Guardamos los cambios en la base de datos
            this._iUsuarioregistrado.actualizar(
                idUsuario,
                nombre,
                nick,
                contrasenia,
                fotoPerfil,
                fotoFondo,
                descripcion
            );

            // 2. Recuperamos el Usuario actualizado desde la BD
            Usuario usuarioActualizado = _iUsuarioregistrado.cargarPerfilUsuarioregistrado(idUsuario);

            // 3. Sustituimos el objeto viejo por el actualizado en Verperfilpersonal
            _verperfilpersonal.usuarioregistrado._usuarioregistrado = usuarioActualizado;

            // 4. Mostramos notificación y volvemos a la vista anterior
            Notification.show("Perfil actualizado correctamente", 2000, Position.TOP_CENTER);
            MainView.Pantalla.volver();

        } catch (Exception e) {
            Notification.show("Error al actualizar el perfil: " + e.getMessage(), 3000, Position.TOP_CENTER);
        }
    }
	
	private void btnVolver() {
		MainView.Pantalla.volver();
	}
}