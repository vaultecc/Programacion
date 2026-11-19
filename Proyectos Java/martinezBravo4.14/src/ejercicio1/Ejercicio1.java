/*
 * Objetivo: Un programa con una función que realize una multiplicación, luego lo mostramos por pantalla
 * Autor: Diego Martínez
 * Fecha: 18/11/2026
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	//Declaramos la función que realiza la multiplicación
	public static double multiplica (double a, double b) {
		return a * b;
	}
	
	public static void main (String [] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaramos las variables
		double a;
		double b;
		//Pedimos los valores y mostramos el resultado
		System.out.println("Introduce un número");
		a=teclado.nextDouble();
		System.out.println("Introduce otro número");
		b=teclado.nextDouble();
		
		System.out.println(multiplica(a, b));
		
	}

}
