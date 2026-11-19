/*
 * Objetivo: pedir un valor entero en millas y mostrar su equivalente en kilómetros, mediante una función.
 * Fecha: 19/11/2026
 * Autor: Diego Martínez
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	//Declaramos la función para pasar de millas a km
	public static double millas_a_kilometros(int millas) {
		double km = 1.60934;
		return km * millas;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//Declaramos la variable millas para pedirla por teclado y mostramos el resutlado
		int millas;
		
		System.out.println("Introduce la cantidad de millas: ");
		millas= teclado.nextInt();
		
		System.out.println("Eso son: " + millas_a_kilometros(millas));
		teclado.close();
	}

}
