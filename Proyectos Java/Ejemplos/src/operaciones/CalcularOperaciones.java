/*
 * Vamos a pedir un numero y calcular el doble del mismo.
 */
package operaciones;

import java.util.Scanner;

public class CalcularOperaciones {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		//Aquí vamos a empezar pidiendo un número para dar el doble del mismo
		int numero;
		System.out.println("Ingresa un número");
		numero = teclado.nextInt();
		
		int doble = numero * 2;
		System.out.println("El doble de tu número es");
		System.out.println(doble);
		
		//Aquí sumamos el nuevo numero al anterior que teniamos
		int numero2;
		System.out.println("Ingresa otro número");
		numero2 = teclado.nextInt();
		
		int suma = numero2 + doble;
		System.out.println("La suma de tu número nuevo con el anterior es:");
		System.out.println(suma);
		
		//Aquí restamos el nuevo numero al anterior que teniamos
		int numero3;
		System.out.println("Ingresa otro número");
		numero3 = teclado.nextInt();
		
		int resta = suma - numero3;
		System.out.println("La resta de tu número nuevo con el anterior es:");
		System.out.println(resta);
		
		//Aquí dividimos el nuevo numero al anterior que teniamos
		double numero4;
	    System.out.println("Ingresa otro número");
	    numero4 = teclado.nextInt();
	    
	    	
		double division = resta / numero4;
		System.out.println("La division de tu número nuevo con el anterior es:");
		System.out.println(division);
		
		//Aqui vamos a ver si el primer numero que has dado es mayor o igual que el primero	
		boolean numeroMayor= numero >= numero2;
		System.out.println("El primer número que diste es mayor o igual que el segundo?: " + numeroMayor);
		
		
		
		

	}

}
