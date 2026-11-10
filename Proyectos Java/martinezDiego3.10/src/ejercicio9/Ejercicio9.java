/*
 * Objetivo: Un array de enteros de tamañño 100 con valores enteros entre 1 y 10,luego pedirá un valor N y mostrara en que posiciones del array aparece N.
 * Autor: Diego Martínez
 * Fecha: 09/11/2026
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//Declaramos el array y pedimos el número
		final int CANTIDAD=100;
		int [] miArray= new int[CANTIDAD];
		double N;
		
		System.out.println("Introduce un número(entre 1 y 10");
		N=teclado.nextInt();
		
		
		for (int i = 0; i<miArray.length;i++) {
			miArray[i]= 1+(int)(Math.random()*10);//Llenamos el array con números enteros entre 1 y 10
			if (miArray[i] == N) {
				System.out.println("Tu número esta en la posición " + i);
			}
		}
		teclado.close();

	}

}
