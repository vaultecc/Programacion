/*
 * Objetivo: Un programa que sea una secunecia de números no nulos hasta que se introduzca 0
 * y contar números negativos/positivos y mostrarlos.
 * Fecha: 26/10/2026
 * Autor: Diego Martínez
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaramos variables
		int numUsuario;
		int contadorNeg=0;
		int contadorPos=0;

		//Repetirmos el bucle siempre que el número introducido no sea nulo y contamos numeros pos/neg
		do {
			System.out.println("Introduce un número (Introduce 0 para terminar): ");
			numUsuario=teclado.nextInt();

			if (numUsuario>0) {
				contadorPos++;
			} else if (numUsuario<0) {
				contadorNeg++;
			}

		} while (numUsuario!=0);

		//Si hay algún número negativo mostramos la cantidad de positivos y negativos
		if (contadorNeg >=1) {
		System.out.println("Has introducido " + contadorPos + " números positivos");
		System.out.println("Has introducido " + contadorNeg + " números negativos");
		
		}
		teclado.close();

	}

}
