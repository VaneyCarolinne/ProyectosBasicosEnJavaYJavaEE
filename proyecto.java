import java.util.Scanner;



public class proyecto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Legislador[] a = new Legislador[10];
		String cargo="",x="";
		Scanner entrada;
		String nombre, apellido,ci,prov;
		
		entrada = new Scanner(System.in);
		
		for (int i=0; i<10; i++){
			System.out.println("Ingrese Nombre, Apellido, Cedula");
			System.out.println("Provincia a la que representa y que cargo posee");
			nombre=entrada.next();
			apellido=entrada.next();
			ci=entrada.next();
			prov=entrada.next();
		    cargo=entrada.next();
		    if(cargo.equals("Diputado")||cargo.equals("Diputada")){
		    	System.out.println("Ingrese Camara en la cual trabaja");
		    	x=entrada.next();
		    	a[i]= new Diputado(prov,nombre,apellido,ci,x);
		    }else{
		    	System.out.println("Ingrese Camara en la cual trabaja");
		    	x=entrada.next();
		    	a[i]= new Senador(prov,nombre,apellido,ci,x);
		    }
		}
		
		imprimir(a);
	}
	
	static void imprimir(Legislador[] r){
		for(int i=0; i<10;i++){
			System.out.println("Datos del Legislador: ");
			System.out.println(r[i].getApellido());
			System.out.println(r[i].getNombre());
			System.out.println(r[i].getCedula());
			System.out.println(r[i].getCamaraEnQueTrabaja());
			System.out.println(r[i].getProvincia());
			System.out.println();
			System.out.println();
		}
		
	}

}
