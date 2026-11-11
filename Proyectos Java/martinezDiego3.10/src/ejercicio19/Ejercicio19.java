/*
 * Objetivo: Se le pedira al usuario su puntuacion en un torneo, se almacenaran en un array y se mostrara ordenada de forma descendente
 * Autor: Diego Martínez
 * Fecha: 11/11/2026
 */
package ejercicio19;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		final int CANTIDAD=8;
		
		int [] puntuacion= new int [CANTIDAD];
		
		for (int i=0; i<puntuacion.length;i++) {
			System.out.println("Introduce tu puntiación (entre 1000 y 2800) :");
			puntuacion[i]=teclado.nextInt();
		}
		//Ordenamos el array
		Arrays.sort(puntuacion);
		//Y lo mostramos de forma descendente
		for (int i=puntuacion.length-1; i>=0 ;i--) {
		System.out.println(puntuacion[i]);
		}
		
		teclado.close();

	}

}
