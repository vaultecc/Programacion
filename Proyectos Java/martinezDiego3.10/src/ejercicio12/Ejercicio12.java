/*
 * Objetivo: Un array de 10 enteros que muestre muestre un menu con diferentes opciones
 * Autor: Diego Martínez
 * Fecha: 09/11/2026
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	//Declaramos las variables y el array
	final int CANTIDAD=10;
	String opcion;
	int V;
	int P;
	int [] miArray = new int [CANTIDAD];
	//Recorremos el array para introducir valores
	for (int i=0; i<miArray.length; i++) {
		miArray[i]= (int)(Math.random()*100);
	}
	//Creamos el menu con las opciones
	do {
		System.out.println("Introduce una opción");
		System.out.println("a. Mostrar valores.");
		System.out.println("b. Introducir valor.");
		System.out.println("c. Salir.");
		opcion=teclado.next();
		
		if (opcion.equalsIgnoreCase("a")) {
			for (int i=0; i<miArray.length; i++) {
				System.out.println(miArray[i]);
			}
		} else if (opcion.equalsIgnoreCase("b")) {
			System.out.println("Introduce un valor:");
			V=teclado.nextInt();
			System.out.println("Ahora elige una posición (0 al 9):");
			P=teclado.nextInt();
			miArray[P]= V;
			System.out.println("Listo");
		}
	} while (!opcion.equalsIgnoreCase("c"));
		
	}
		
}
