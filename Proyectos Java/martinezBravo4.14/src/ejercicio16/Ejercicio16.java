/*
 * Objetivo: Llenar un array con un metodo con valores random
 * Fecha: 23/11/2026
 * Autor: Diego Martínez
 */
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
	
	static int size;
	//Creamos el metodo para llenar el array
	public static double [] valoresRandom () {
		double [] array = new double [size];
		for (int i=0; i<size;i++) {
			array[i]= (Math.random()*100)+1;
			array[i] = Math.round(array[i] * 100.0) / 100.0;
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el tamaño del array: ");
		size= teclado.nextInt();
		//Llenamos el array con el metodo y lo mostramos por pantalla
		double [] miArray = valoresRandom();
		
		for (int i=0; i<size;i++) {
			System.out.println(miArray[i]);
			
			teclado.close();
		}

	}

}
