/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epa.capacitacion.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vaneycaroline
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario_JPA.findAll", query = "SELECT u FROM Usuario_JPA u")
    , @NamedQuery(name = "Usuario_JPA.findByUserName", query = "SELECT u FROM Usuario_JPA u WHERE u.userName = :userName")
    , @NamedQuery(name = "Usuario_JPA.findByUserLogin", query = "SELECT u FROM Usuario_JPA u WHERE u.userLogin = :userLogin")
    , @NamedQuery(name = "Usuario_JPA.findByUserPassword", query = "SELECT u FROM Usuario_JPA u WHERE u.userPassword = :userPassword")})
public class Usuario_JPA implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 30)
    @Column(name = "user_name")
    private String userName;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "user_login")
    private String userLogin;
    @Size(max = 9)
    @Column(name = "user_password")
    private String userPassword;

    public Usuario_JPA() {
    }

    public Usuario_JPA(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userLogin != null ? userLogin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario_JPA)) {
            return false;
        }
        Usuario_JPA other = (Usuario_JPA) object;
        if ((this.userLogin == null && other.userLogin != null) || (this.userLogin != null && !this.userLogin.equals(other.userLogin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epa.capacitacion.modelo.Usuario_JPA[ userLogin=" + userLogin + " ]";
    }
    
}
