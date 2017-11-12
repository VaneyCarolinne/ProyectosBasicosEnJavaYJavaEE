/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epa.capacitacion.control;

/**
 *
 * @author vaneycarolinne
 */
import static com.opensymphony.xwork2.Action.SUCCESS;
import epa.capacitacion.modelo.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.opensymphony.xwork2.ActionSupport;
import epa.capacitacion.entidad.*;
import java.util.List;
import javax.persistence.Query;
import java.util.ArrayList;

public class Usuario_Controlador extends ActionSupport {

    //private static  Usuario_JPA user_db;
    private Usuario user_entity;
    private ArrayList<Usuario> L;

    public Usuario getUser_entity() {
        return user_entity;
    }

    public void setUser_entity(Usuario user_entity) {
        this.user_entity = user_entity;
    }

    public ArrayList<Usuario> getL() {
        return L;
    }

    public void setL(ArrayList<Usuario> L) {
        this.L = L;
    }

    public String Register() {
        String resp;
        Usuario_JPA user_db = new Usuario_JPA();
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("PruebaStruts2PU");
        EntityManager em = emf.createEntityManager();//Esto se utiliza para la transaccion..

        //Gestionar transacción...
        try {
            em.getTransaction().begin();

            user_db.setUserLogin(user_entity.getUser_login());
            user_db.setUserPassword(user_entity.getUser_password());
            user_db.setUserName(user_entity.getUser_name());

            em.persist(user_db);
            em.getTransaction().commit();
            resp = SUCCESS;
            addActionMessage("Usuario Registrado con éxito...!!");
        } catch (Exception e) {
            resp = ERROR;
            addActionError("ERROR de sistema..." + e.getMessage());

        } finally {
            //Validando EntitManager
            if (em != null) {
                em.close();
            }
            //Validando EntitManagerFactory
            if (emf != null) {
                emf.close();
            }
        }
        return resp;
    }

    public static List<Usuario_JPA> listar() throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PruebaStruts2PU");
        EntityManager em = emf.createEntityManager();
        List<Usuario_JPA> lista_generada = null;
        Query consulta = em.createNamedQuery("Usuario_JPA.findAll");
        lista_generada = consulta.getResultList();
        //EntityManager
        if (em != null) {
            em.close();
        }
        //EntityManagerFactory
        if (emf != null) {
            emf.close();
        }
        return lista_generada;
    }

    public String Listar_amigos() throws Exception {
        L = new ArrayList<Usuario>();
        List<Usuario_JPA> R = listar();

        for (Usuario_JPA u : R) {
            Usuario v = new Usuario();

            v.setUser_login(u.getUserLogin());
            v.setUser_name(u.getUserName());
            v.setUser_password(u.getUserPassword());
            L.add(v);

        }

        return SUCCESS;
    }

    public String modificar() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PruebaStruts2PU");
        EntityManager em = emf.createEntityManager();
        String resp;
        Usuario_JPA user_db;
        try {
            em.getTransaction().begin();
            user_db = em.find(Usuario_JPA.class, user_entity.getUser_login());
            if (user_db != null) {
                user_db.setUserPassword(user_entity.getUser_password());
                user_db.setUserName(user_entity.getUser_name());
                em.merge(user_db);
                em.getTransaction().commit();
                resp = SUCCESS;
                addActionMessage("Usuario modificado con exito");
            } else {
                resp = ERROR;
                addActionError("El usuario no esta en la Base de Datos");
            }
        } catch (Exception e) {
            resp = ERROR;
            em.getTransaction().rollback();
            addActionError("ERROR FATAL: " + e.getMessage());
        } finally {
            //Validando el EntityManager
            if (em != null) {
                em.close();
            }
            //Validando el EntityManagerFactory
            if (emf != null) {
                emf.close();
            }
        }

        return resp;
    }

    public String validar() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PruebaStruts2PU");
        EntityManager em = emf.createEntityManager();
        String resp;
        Usuario_JPA user_db = new Usuario_JPA();
        em.getTransaction().begin();
        user_db = em.find(Usuario_JPA.class, user_entity.getUser_login());

        try {
            if (user_entity.getUser_login().equals(user_db.getUserLogin()) && user_entity.getUser_password().equals(user_db.getUserPassword())) {
                em.persist(user_db);
                em.getTransaction().commit();
                addActionMessage("Acceso Exitoso!");
                resp = SUCCESS;
            } else {
                if (user_entity.getUser_login().trim().length() == 0) {
                    addActionError("ERROR: El campo del login está vacío.");
                }
                if (user_entity.getUser_password().trim().length() == 0) {
                    addActionError("ERROR: El campo de la contraseña está vacío");
                }
                if (!(user_entity.getUser_login().equals(user_db.getUserLogin())) && user_entity.getUser_password().equals(user_db.getUserPassword())) {
                    addActionError("ERROR: El usuario y la contraseña no coinciden");
                }
                if (((user_entity.getUser_login().equals(user_db.getUserLogin())) && user_entity.getUser_password().equals(user_db.getUserPassword())) && !user_entity.getUser_password().equals(user_db.getUserPassword())) {
                    addActionError("ERROR: El usuario y la contraseña no coinciden");
                }
                resp = ERROR;
            }
        } catch (Exception e) {
            resp = ERROR;
            em.getTransaction().rollback();
            addActionError("ERROR FATAL:" + e.getMessage());
        } finally {
            //Validando el EntityManager
            if (em != null) {
                em.close();
            }
            //Validando el EntityManagerFactory
            if (emf != null) {
                emf.close();
            }
        }

        return resp;
    }

    public String eliminar() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PruebaStruts2PU");
        EntityManager em = emf.createEntityManager();
        Usuario_JPA user_db;
        String resp;
        try {
            em.getTransaction().begin();
            user_db = em.find(Usuario_JPA.class, user_entity.getUser_login());
            if (user_db != null) {
                em.remove(user_db);
                em.getTransaction().commit();
                resp=SUCCESS;
                addActionMessage("Usuario Eliminado con éxito!");
            } else {
                addActionError("Usuario no existe en BD");
                em.getTransaction().rollback();
                resp=ERROR;
            }

        } catch (Exception e) {
            em.getTransaction().rollback();
            resp=ERROR;
            addActionError("ERROR FATAL: " + e.getMessage());
        } finally {
            //EntityManager
            if (em != null) {
                em.close();
            }
            //EntityManagerFactory
            if (emf != null) {
                emf.close();
            }
        }

        return resp;
    }

}
