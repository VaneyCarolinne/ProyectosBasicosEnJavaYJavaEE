package epa.capacitacion.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import epa.capacitacion.entidad.Usuario;

/*********Controlador**********/
public class UsuarioAction extends ActionSupport {
	
	/**
	 * generaron serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private Usuario user;
	private ArrayList<Usuario> vector;
	
	
	/*
	public String execute() {
        return SUCCESS;
    }
	
	public void validate() {
		
		if(user.getUser_login().isEmpty()) {
			addFieldError("user_login", "ERROR: Login de usuario esta vacio...!");
		}
		if(user.getUser_password().isEmpty()) {
			addFieldError("user_password", "ERROR: password del usuario vacio...!");
		}
	
	} */

	public ArrayList<Usuario> getVector() {
		return vector;
	}

	public void setVector(ArrayList<Usuario> vector) {
		this.vector = vector;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
	
	public String validar() {
		String resp=ERROR;
		
		if((user.getUser_login().equals("EPA")||user.getUser_login().equals("epa"))&&user.getUser_password().equals("123")){
			user.setUser_name("VaneyCaroline");
			addActionMessage("Acceso Exitoso!");
			resp=SUCCESS;
		}else{
			if(user.getUser_login().trim().length()==0||user.getUser_password().trim().length()==0) {
				addActionError("ERROR: debe Ingresar algun dato.");
			}else {
				addActionError("ERROR: El usuario y la contraseña no coinciden");
			}
		}
		
		return resp;
	}
	
	public String Listar_amigos() {
	
		vector = new ArrayList<>();
		Usuario user1, user2, user3;

		user1 = new Usuario();
		user1.setUser_login("vcruz");
		user1.setUser_name("Vanessa");
		user1.setUser_password("123456789");
		
		user2 = new Usuario();
		user2.setUser_login("carias");
		user2.setUser_name("Carlos");
		user2.setUser_password("1234");
		
		user3 = new Usuario();
		user3.setUser_login("sbarrios");
		user3.setUser_name("Susana");
		user3.setUser_password("123456");
		
		vector.add(user1);
		vector.add(user2);
		vector.add(user3);
		
		return SUCCESS;
	}
}
