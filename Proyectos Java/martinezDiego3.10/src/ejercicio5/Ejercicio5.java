/*
 * Objetivo: Programa que pida 20 números enteros los almacene en un array y calculamos y mostramos la media
 * Autor: Diego Martínez
 * Fecha: 05/11/2026
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int CANTIDAD= 20;
		//Declaramos el array y las variables
		double [] reales = new double [CANTIDAD];
		double suma=0;
		double media;
		//recorremos el array, acumulamos valores y mostramos los resultados
		for (int i = 0; i<reales.length; i++) {
			System.out.println("Introduce un número");
			reales[i]= teclado.nextDouble();
		
			suma = suma + reales[i];
		}
		
		media = suma/CANTIDAD;
		System.out.println("La media de todos los números es: " + media);
		teclado.close();
		

	}

}
