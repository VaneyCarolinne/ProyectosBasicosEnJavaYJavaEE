package Vaney;

import java.util.ArrayList;
import java.util.List;

public class Respuesta14 {

	/**
	 * Hecho por Vanessa Cruz
	 * CI: 23426481
	 */
	public static void main(String[] args) {
		   List<Integer> x = new ArrayList<Integer>();
		   x.add(new Integer(3));
		   doStuff(x);
		   int numero;
		   float u;
		   String real;
		   		   
		try{   
		   for(Integer i: x)
		      System.out.println(i + " "); 
		}catch(Exception e){
			real = String.valueOf(x.get(2));
			u = Float.parseFloat(real); 
			numero = (int)u;
			System.out.println(numero + " ");
		}   
	}

		static void doStuff(List y) {
		     y.add(new Integer(4));
		     y.add(new Float(3.14f));
		}

}
