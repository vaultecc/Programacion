/*
 * Objetivo: Pediremos un número por teclado y mostraremos los números desde el 1 hasta este introducido
 * Fecha/19/10/2026
 * Autor:Diego Martínez
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//Declaramos la variable que vamos a necesitar por teclado
		System.out.println("Introduce un número");
		int num1=teclado.nextInt();
		
		//Creamos un bucle que muestre llegue hasta el número introducido por teclado
		for (int i=1; i<=num1; i++) {
			System.out.println(i);
		}
		teclado.close();
	}

}
