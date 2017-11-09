package prueba;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int tipo_operacion = mostrar_menu(entrada);
		
		switch(tipo_operacion) {
		  case 1:
			   System.out.println("Guardar");
				Usuario usuario1 = leer(entrada,true);
				guardar(usuario1);
		  break;
		  case 2:
			   System.out.println("Modificar");
			   System.out.println("Login:?");
			   String login = entrada.next().trim();
			   modificar(login);
	      break;
		  case 3:
			  System.out.println("Buscar");
			  System.out.println("Login:?");
			  String login2 = entrada.next().trim();
			try {  
			  Usuario user_resp = buscar(login2);
			  System.out.println("Usuario Respuesta:");
			  System.out.println(user_resp.getUserLogin());
			  System.out.println(user_resp.getUserName());
			  System.out.println(user_resp.getUserPassword());
			}catch(Exception e){
				System.out.println("ERROR: "+e.getMessage());
			}  
		  break;
		  case 4:
			  System.out.println("Eliminar");
			  System.out.println("Login:?");
			  String login3 = entrada.next().trim();
			  eliminar(login3);
		  break;
		  case 5:
			  List<Usuario> listaR = new ArrayList<Usuario>();
			  listaR = Listar();
			  for (Usuario usuario : listaR) {
				System.out.println("Login: "+usuario.getUserLogin());
				System.out.println("Nombre: "+usuario.getUserName());
				System.out.println("Password: "+usuario.getUserPassword());
				System.out.println();
			  }
		  break;
		  default:
		
		}
		
		

		
	}
	
	public static int mostrar_menu(Scanner entrada) {
		System.out.println("********Menu*******");
		System.out.println("Ingrese la Opción que quiera realizar:");
		System.out.println("Opción 1: Guardar");
		System.out.println("Opción 2: Modificar");
		System.out.println("Opción 3: Buscar");
		System.out.println("Opción 4: Eliminar");
		System.out.println("Opción 5: Listar");
		System.out.println("Opción seleccionada:?");
		
		return entrada.nextInt();
	}
	
	
	
	public static void guardar(Usuario user) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_prueba");
		EntityManager em = emf.createEntityManager();//Esto se utiliza para la transaccion..
		//Gestionar transacción...
		try {
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
		}catch(Exception e) {
			System.out.print("ERROR FATAL: " +e.getMessage());
		}finally {
			//Validando EntitManager
			if(em!=null) {
				em.close();
			}
			//Validando EntitManagerFactory
			if(emf!=null) {
				emf.close();
			}
		}
		
	}
	
	public static void modificar(String login) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_prueba");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Usuario user_db;
			user_db = em.find(Usuario.class, login);
			if(user_db!=null) {
				System.out.println("Modificaciones de:");
				System.out.println(user_db);
				System.out.println("OJO: No se debe modificar el login");
				
				Usuario user_new = leer(new Scanner(System.in),false);
				
				//user_db.setUserLogin(user_new.getUserLogin());
				user_db.setUserName(user_new.getUserName());
				user_db.setUserPassword(user_new.getUserPassword());
				
				
				em.merge(user_db);
				em.getTransaction().commit();
			}
			
		}catch(Exception e) {
			
			em.getTransaction().rollback();
			System.out.println("ERROR FATAL: "+e.getMessage());
			
		}finally {
			//Validando EntiManager
			if(em!=null) {
				em.close();
			}
			//Validando EntityManagerFactory
			if(emf!=null) {
				emf.close();
			}
		}
		
	}
	
	public static Usuario buscar(String login){
		Usuario user_resp = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_prueba");
		EntityManager em = emf.createEntityManager();
		
		
		try {
			
			em.getTransaction().begin();
			user_resp = em.find(Usuario.class, login);
			em.getTransaction().commit();
		}catch(Exception e){
			em.getTransaction().rollback();
			System.out.println("ERROR FATAL: "+e.getMessage());
		}finally {
			//Validando EntiManager
			if(em!=null) {
				em.close();
			}
			//Validando EntityManagerFactory
			if(emf!=null) {
				emf.close();
			}
		}
		
		return user_resp;
	}
	
	@SuppressWarnings("unused")
	public static void eliminar(String login) {
		Usuario user_resp = new Usuario();
		//user_resp = buscar(login);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_prueba");
		EntityManager em = emf.createEntityManager();
		
		
		try {
			
			em.getTransaction().begin();
			user_resp = em.find(Usuario.class, login);
			
			System.out.println(user_resp.getUserLogin());
			System.out.println(user_resp.getUserPassword());
			System.out.println(user_resp.getUserName());
			
			if(user_resp!=null){ 
				em.remove(user_resp);
				em.getTransaction().commit();
				System.out.println("Usuario Eliminado con exito!");
			}else{
				System.out.println("El usuario no existe en la Base de datos");
				em.getTransaction().rollback();
			}
		}catch(Exception e){
			em.getTransaction().rollback();
			System.out.println("ERROR FATAL: "+e.getMessage());
		}finally {
			//Validando EntiManager
			if(em!=null) {
				em.close();
			}
			//Validando EntityManagerFactory
			if(emf!=null) {
				emf.close();
			}
		}
		
		
	}
	
	public static Usuario leer(Scanner entrada, boolean con_login) {
		Usuario user = new Usuario();
		
		if(con_login){
			System.out.print("Login: ");
			user.setUserLogin(entrada.next().trim());
		}
		System.out.print("Clave: ");
		user.setUserPassword(entrada.next().trim());
		System.out.print("Nombre: ");
		user.setUserName(entrada.next().trim());
		
		return user;
	}
	
	@SuppressWarnings("unchecked")
	public static List<Usuario> Listar(){
		List<Usuario> lista = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_prueba");
		EntityManager em = emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			javax.persistence.Query query= em.createNamedQuery("Usuario.findAll");
            lista=query.getResultList();
			
			
		}catch(Exception e){
			em.getTransaction().rollback();
			System.out.println("ERROR FATAL: "+e.getMessage());
		}finally {
			//Validando EntiManager
			if(em!=null) {
				em.close();
			}
			//Validando EntityManagerFactory
			if(emf!=null) {
				emf.close();
			}
		}
		
		return lista;
		
	}

	
	
}
