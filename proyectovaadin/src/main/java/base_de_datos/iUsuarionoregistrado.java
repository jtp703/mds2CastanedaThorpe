package base_de_datos;

import java.util.Date;
import base_de_datos.Usuario;

public interface iUsuarionoregistrado extends iCibernauta {

	public Usuario registrarse(String aNombre, String aPassword, String aMail, String aNickusuario, String aFotoFondo, String aFotoPerfil, String aDescripcion, Date aFecha_creacion);

	public UsuarioAutentificado iniciarSesion(String aMail, String aPassword);
	
	public UsuarioAutentificado findByUserMail(String aMail);
}