package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")

@NamedQueries({
   @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
   , @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.userName = :nombre")
   , @NamedQuery(name = "Usuario.findByUsuario", query = "SELECT u FROM Usuario u WHERE u.userLogin = :usuario")
   , @NamedQuery(name = "Usuario.findByPass", query = "SELECT u FROM Usuario u WHERE u.userPassword = :pass")})


public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	

	@Override
	public String toString() {
		return "Usuario [userLogin=" + userLogin + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", hashCode()=" + hashCode() + ", getUserLogin()=" + getUserLogin() + ", getUserName()="
				+ getUserName() + ", getUserPassword()=" + getUserPassword() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userLogin == null) ? 0 : userLogin.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (userLogin == null) {
			if (other.userLogin != null)
				return false;
		} else if (!userLogin.equals(other.userLogin))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		return true;
	}

	@Id
	@Column(name="user_login")
	private String userLogin;

	@Column(name="user_name")
	private String userName;

	@Column(name="user_password")
	private String userPassword;

	public Usuario() {
	}

	public String getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}