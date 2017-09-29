
public class Persona {

	/**
	 * @param nombre, apellido, cedula de la persona. 
	 * 
	 */
	public String nombre;
	public String apellido;
	public String cedula;

	public Persona(String n, String a, String c){
		nombre=n;
		apellido=a;
		cedula=c;
	}
	
	
    /**
     * @metho metodos observadores de la clase... 
     * 
     */
	public String getNombre(){return(nombre);}
	public String getApellido(){return(apellido);}
	public String getCedula(){return(cedula);}
	/**
	 * @metho metodos modificadores de la clase...
	 */
	
	public void setNombre(String name){
		nombre=name;
	}
	public void setApellido(String lastname){
		apellido=lastname;
	}
	public void setCedula(String ci){
		cedula=ci;
	}
}
