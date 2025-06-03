package base_de_datos;

public interface iAdministrador extends iCibernauta {

	public void borrarTweet(int aIdTweet);

	public void borrarComentario(int aIdComentario);

	public void banearUsuario(int aIdAdministrador, int aIdUsuario);
	
	public UsuarioAutentificado iniciarSesion(String aMail, String aPassword);
	
	public UsuarioAutentificado findByUserMail(String aMail);
}