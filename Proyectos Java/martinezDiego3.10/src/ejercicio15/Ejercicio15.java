/*
 * Objetivo: Un programa que pida al usuario 2 valores y luego cree un array de tamaño N que contenga M en todas sus posiciones
 * Autor: Diego Martínez
 * Fecha: 11/11/2026
 */
package ejercicio15;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		final int N;
		final int M;
		
		System.out.println("Introduce un valor (Tamaño)");
		N=teclado.nextInt();
		System.out.println("Introduce otro valor (Contenido)");
		M=teclado.nextInt();
		//Con este metodo almacenamos en todo el array el valor indicado
		int [] miArray= new int [N];
		
		Arrays.fill(miArray, M);
		
		for (int i=0; i<miArray.length; i++) {
			System.out.println(miArray[i]);
		}
		teclado.close();
	}

}
