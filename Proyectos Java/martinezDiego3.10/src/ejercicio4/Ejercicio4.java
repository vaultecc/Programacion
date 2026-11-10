/*
 * Objetivo: Programa que pida 20 números enteros los almacene en un array y muestre la suma de los valores positivos y negativos
 * Autor: Diego Martínez
 * Fecha: 05/11/2026
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaramos el array y variables
		final int CANTIDAD= 20;
		
		int [] enteros = new int [CANTIDAD];
		int positivos=0;
		int negativos=0;
		//Recorremos el array y vamos sumando los negativos y los positivos
		for (int i = 0; i<enteros.length; i++) {
			System.out.println("Introduce un número");
			enteros[i]= teclado.nextInt();
			
			if (enteros[i]>0) positivos= positivos + enteros[i];
			
			if (enteros[i]<0) negativos = negativos + enteros[i];
		}
		
		System.out.println("La suma de los positivos es " + positivos);
		System.out.println("La suma de los negativos es " + negativos);
		
		teclado.close();
		

	}

}
