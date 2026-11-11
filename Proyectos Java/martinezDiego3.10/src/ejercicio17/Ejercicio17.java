/*
 * Objetivo: El usuario introduce 20 números enteros 10 en un array y 10 en otro, comparara ambos arrays y dira si son iguales o no
 * Autor: Diego Martínez
 * Fecha: 11/11/2026
 */
package ejercicio17;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		final int CANTIDAD=10;
		//Declaramos los arrays y le asignamos valores por teclado
		int [] miArray= new int[CANTIDAD];
		int [] miArray2= new int [CANTIDAD];
		
		for (int i =0; i<miArray.length; i++) {
			System.out.println("Introduce un valor(Primer Array)");
			miArray[i]= teclado.nextInt();
		}
		
		for (int i =0; i<miArray.length; i++) {
			System.out.println("Introduce un valor(Segundo Array)");
			miArray2[i]= teclado.nextInt();
		}
		//Con Arrays.equals comparamos ambos arrays
		if (Arrays.equals(miArray, miArray2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
		teclado.close();
	}

}
