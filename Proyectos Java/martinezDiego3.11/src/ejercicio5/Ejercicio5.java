/*
 * Objetivo: Un programa que registre sueldos de hombres y mujeres, detectar si existe una brecha salarial. Pedir número de personas por teclado
 * su género (0 varón 1 mujer ) y su sueldo, guardar en matriz y mostrar la media por género
 * Autor: Diego Martínez
 * Fecha: 13/11/2026
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		final int N;
		int numVaron=0;
		int numMujer=0;
		
		System.out.println("Introduzca el numero de empledados");
		N= teclado.nextInt();
		
		int [][] miMatriz= new int [N][N];
		
		for (int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.println("Introduce tu género (0 varon y 1 mujer): ");
				miMatriz[i][j]=teclado.nextInt();
				if (miMatriz[i][j]==0) numVaron++;
				if (miMatriz[i][j]==1) numMujer++;
			}
		}
		

		

	}

}
