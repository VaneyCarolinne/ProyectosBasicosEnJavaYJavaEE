import java.io.IOException;
import java.util.Scanner;

public class estudiante {

	private String apellido, nombre;
    private int edad;
    private float[] notas = new float[3];
	private static Scanner entrada;
	
	/**
	* @param apellido: Sera el apellido del estudiante.
	* @param nombre: Sera el nombre del estudiante.
	* @param edad: La edad del estudiante
	* @param notas: Es un vector de numeros reales en el cual el estudiante tiene sus notas de los 3 lapsos.
	***/
    
  //Constructor de la clase Estudiante
  	public estudiante(){
  		apellido="";
  		nombre="";
  		edad=0;
  		for(int i=0; i< 3; i++){
  			notas[i]=0;
  		}
  	}
  	
  /**Metodos Observadores de la clase:
  ** @method getApellido: FUNCION Devuelve el apellido del estudiante
  ** @method getNombre: FUNCION Devuelve el nombre del estudiante
  ** @method getEdad: FUNCION Devuelve la edad del estudiante
  ** @method getNotas: PROCEDIMIENTO Muestra por pantalla las notas
  **
  */	
  	public String getApellido(){ return(apellido); }
  	public String getNombre(){ return(nombre); }
  	public int getEdad(){ return(edad); }
  	public void getNotas(){
  		for(int i=1; i<=3; i++){
  			System.out.println("Lapso: "+i+"calificacion: "+notas[i-1]);
  		}
  	}
  
  	/**Metodos Modificadores de la clase:
  	  ** @method setApellido: modifica el apellido del estudiante por el @param ape
  	  ** @method setNombre: modifica el nombre del estudiante por el @param name
  	  ** @method setEdad: modifica la edad del estudiante por el @param e
  	  ** @method setNotas: modifica las notas del estudiante por el @param vector
  	  ** @method setNotas: modifica cada nota del estudiante por sus respectivos parametros
  	  ** @param nota1, nota2, nota3.
  	  */
  	public void setApellido(String ape){apellido=ape;}
  	public void setNombre(String name){nombre=name;}
  	public void setEdad(int e){edad=e;}
  	public void setNotas(int nota1, int nota2, int nota3){
  		notas[0]=nota1;
  		notas[1]=nota2;
  		notas[2]=nota3;
  	}
  	public void setNotas(float[] vector){
  		for(int i=0; i<3; i++){
  			notas[i]=vector[i];
  		}
  	}

	
	public static void main(String[] args) throws IOException {
		// TODO proyecto para el curso de Java Nivel II
		
		entrada = new Scanner(System.in);
		estudiante alumno = new estudiante();
		int i=1, k;
		float[] vector = new float[3];
		
		//Lee los datos de 3 estudiantes por pantalla
		do{
			System.out.println("Por favor ingrese su nombre, apellido y edad: ");
			alumno.setNombre(entrada.next());
			alumno.setApellido(entrada.next());
			alumno.setEdad(entrada.nextInt());
			k=1;
			for(int j = 0; j < 3; j++){
				System.out.println("Por favor ingrese las notas del "+ k +" lapso: ");
				 vector[j]=entrada.nextFloat();
			}
			alumno.setNotas(vector);
		    System.out.println("El promedio del estudiante es: "+Calcular_promedio(vector));
		    System.out.println();
			i++;
		}while(i<=3);
		System.out.println("Hasta Luego...!!");
		
	}
	/**
	 * {@code} Funcion que devuelve el promedio del estudiante
	 *  a traves del @param array que se esta leyendo en ese momento.
	 *  retorna un float.
	 **/

	static float Calcular_promedio(float[] array){
		float suma=0, promedio=0;
		for(int i=0; i< 3; i++){
			suma=suma+array[i];
		}
		promedio=suma/3;
		return promedio;
	}  
}



