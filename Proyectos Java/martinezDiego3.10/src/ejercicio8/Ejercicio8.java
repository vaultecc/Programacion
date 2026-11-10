/*
 * Objetivo: Array de 100 números reales aleatorios entre 0.0 y 1.0, pedira al usuario un valor real R y mostrara cuantos valores del array son igual o superiores a R
 * Autor: Diego Martínez
 * Fecha: 09/11/2026
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//declaramos las variables y el array y pedimos el número
		final int CANTIDAD= 100;
		double R;
		int contador=0;
		
		double [] miArray= new double[CANTIDAD];
		
		System.out.println("Introduce un número(entre 0.0 y 0.1)");
		R=teclado.nextDouble();
		//llenamos cada posicion del array
		for (int i=0; i<miArray.length; i++) {
			miArray[i]= Math.random();
			if (miArray[i]>=R) contador++;
		}
		
		System.out.println("La cantidad de números superiores o iguales al tuyo son " + contador);
		teclado.close();
	}

}
