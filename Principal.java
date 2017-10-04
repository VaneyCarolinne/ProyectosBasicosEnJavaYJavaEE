import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		Persona[] lista = new Persona[10];
		
		int i=1;
		lista[0] = new Persona("Vanessa","Buenos dias estoy aprendiendo Hilos :), Entre de numero:  "+i);
		i++;
		lista[1] = new Persona("Carlos","Buenos dias estoy aprendiendo Hilos :3, Entre de numero:  "+i);
		i++;
		lista[2] = new Persona("Maria","Buenos dias estoy aprendiendo Hilos :L, Entre de numero:  "+i);
		i++;
		lista[3] = new Persona("Juan","Buenos dias estoy aprendiendo Hilos C:, Entre de numero:  "+i);
		i++;
		lista[4] = new Persona("Luis","Buenos dias estoy aprendiendo Hilos :>, Entre de numero:  "+i);
		i++;
		lista[5] = new Persona("Junior","Buenos dias estoy aprendiendo Hilos :8, Entre de numero:  "+i);
		i++;
		lista[6] = new Persona("Roberto","Buenos dias estoy aprendiendo Hilos :u, Entre de numero:  "+i);
		i++;
		lista[7] = new Persona("Ander","Buenos dias estoy aprendiendo Hilos :v, Entre de numero:  "+i);
		i++;
		lista[8] = new Persona("Rafael","Buenos dias estoy aprendiendo Hilos :F, Entre de numero:  "+i);
		i++;
		lista[9] = new Persona("Hellmuth","Buenos dias estoy aprendiendo Hilos :O, Entre de numero:  "+i);
		for(int j=0; j<10; j++)
			lista[j].start();
		

	}

}
