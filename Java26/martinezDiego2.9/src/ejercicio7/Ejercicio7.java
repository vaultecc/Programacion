/*
 * Objetivo: Creamos una secuencia de números no nulos hasta que se introduzca 0 y mostramos el total de números positivos/negativos
 *Autor: Diego Martínez
 *Fecha: 22/10/2026
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaramos las variables
		long num1= 1;
		int contadorPositivos=0;
		int contadorNegativos=0;
		
		//Creamos un bucle hasta que el usuario ponga 0 y contamos los negativos y positivos
		while (num1!=0) {
			System.out.println("Introduce un número (Introduce 0 para terminar):");
			num1 = teclado.nextLong();
			if (num1 >0) {
				contadorPositivos++;
			} else if (num1 <0) {
				contadorNegativos++;
			}
		}
		
		//Mostramos la cantidad de negativos y positivos por pantalla
		if (contadorPositivos >0) {
			System.out.println("En total has introducido " + contadorPositivos + " números positivos");
		} else {
			System.out.println("No has introducido números positivos");
		} 
		
		if (contadorNegativos >0) {
			System.out.println("En total has introducido " + contadorNegativos + " números negativos");
		} else {
			System.out.println("No has introducido números negativos");
		}
		teclado.close();

	}

}
