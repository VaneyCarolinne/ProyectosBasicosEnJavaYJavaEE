package epa.capacitacion.entidad;



/*********Modelo es la base de datos
 *  En este caso es porque aqui vamos agregando datos..Pero en realidad Usuario es parte
 *  del controlador
 * **********/

public class Usuario {
	
	private String user_name;
	private String user_password;
	private String user_login;
	
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_login() {
		return user_login;
	}
	public void setUser_login(String user_login) {
		this.user_login = user_login;
	}

}
