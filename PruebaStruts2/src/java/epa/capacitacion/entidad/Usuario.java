/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epa.capacitacion.entidad;

import java.util.Objects;

/**
 * *******Modelo es la base de datos En este caso es porque aqui vamos agregando
 * datos..Pero en realidad Usuario es parte del controlador
 * *********
 */
/**
 *
 * @author vaneycaroline
 */
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.user_name);
        hash = 59 * hash + Objects.hashCode(this.user_password);
        hash = 59 * hash + Objects.hashCode(this.user_login);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.user_name, other.user_name)) {
            return false;
        }
        if (!Objects.equals(this.user_password, other.user_password)) {
            return false;
        }
        if (!Objects.equals(this.user_login, other.user_login)) {
            return false;
        }
        return true;
    }

}
