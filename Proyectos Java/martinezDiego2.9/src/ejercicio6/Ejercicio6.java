/*
 * Objetivo: Leer 100 números no nulos y mostrar si ha leído alguno negativo o no
 *Autor: Diego Martínez
 *Fecha: 21/10/2026
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		//Creamos un bucle que pida 100 números no nulos (Al introducir 0 se acaba)
		int numNegativo=0;
		for (int i=1; i<=100; i++) {
			System.out.println("Escribe un número no nulo (Escribe 0 para terminar):");
			int num1=teclado.nextInt();
			if (num1==0) {
			i=100;
			System.out.println("Fin");
		} else if (num1<0) {//Contamos los números negativos y mostramos por pantalla si hay o no hay
			numNegativo++;
		}
	}
		if (numNegativo>=1 ) {
		System.out.println("Hay un total de " + numNegativo + " números negativos");
		} else {
			System.out.println("No hay números negativos");
		}
		teclado.close();
	}
		
}
