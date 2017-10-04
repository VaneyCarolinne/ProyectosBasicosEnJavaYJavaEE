
public class Persona extends Thread{

	/**
	 * @param nombre, apellido, cedula de la persona. 
	 * 
	 */
	public String nombre;
	public String mensaje;

	
	public Persona(String n, String sms){
		nombre=n;
		mensaje=sms;
	}
	
	
    /**
     * @metho metodos observadores de la clase... 
     * 
     */
	public String getNombre(){return(nombre);}
	public String getMensaje(){return(mensaje);}
	
	/**
	 * @metho metodos modificadores de la clase...
	 */
	
	public void setNombre(String name){
		nombre=name;
	}
	
	public void setMensaje(String sms){
		mensaje=sms;
	}
	
	//Procesar Mensaje:
	public void ProcesarMensaje(){
		System.out.println("El mensaje de "+getNombre()+" es: "+getMensaje());
	}
	
	public void run(){
		DormirEnSegundos(3);
		ProcesarMensaje();
	}
	
	public void DormirEnSegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}

