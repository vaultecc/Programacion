/*
 * Objetivo: Pedir dos números enteros por teclados y mostrar cual es el mínimo mediante una función
 * Autor: Diego Martínez
 * Fecha: 18/11/2026
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	//La función para comparar el número menor
	public static int minimo(int a, int b) {
		if (a>b) {
			return b;
		} else return a;
	}
	
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//Declaramos las variables y pedimos los números por teclado
		int a,b;
	
		System.out.println("Introduce un número");
		a=teclado.nextInt();
		System.out.println("Introduce otro número");
		b=teclado.nextInt();
		
		//Mostramos el número menor con el metodo
		System.out.println(minimo(a, b));
	
		teclado.close();
	}

}
