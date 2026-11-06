/*
 * Objetivo: Sumas los pares y los impares de los númeroes entre 100 y 200 y mostrar las sumas
 * Fecha: 22/10/2026
 * Autor: Diego Martínez
 */
package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {

		//Declaramos las variables
		int sumaPares=0;
		int sumaImpares=0;
		
		//Creamos un bucle que sume los pares e impares
		for (short i=100; i<=200; i++) {

			boolean pares = i % 2==0;

			if (pares) {
				sumaPares= sumaPares + i;
			} else {
				sumaImpares= sumaImpares + i;
			}
		}
		System.out.println("La suma de los pares es " + sumaPares);
		System.out.println("La suma de los impares es " + sumaImpares);


	}

}
