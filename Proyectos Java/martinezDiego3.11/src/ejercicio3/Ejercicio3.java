/*
 * Objetivo: Un programa con una matriz de tamaño NxM (valor por teclado) con los valores de la matriz NxM (Tambien por teclado) 
 * Autor: Diego Martínez
 * Fecha: 12/11/2026
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int N;
		int M;
		int mayor0=0;
		int menor0=0;
		int igual0=0;
		
		System.out.println("Introduce el tamaño de la matriz (filas)");
		N=teclado.nextInt();
		System.out.println("Introduce el tamaño de la matriz (columnas)");
		M=teclado.nextInt();
		
		int [][] miMatriz = new int [N][M];
		//Llenamos la matriz con datos que pida el usuario
		for (int i= 0; i<N; i++) {
			for (int j=0; j<M; j++) {
				System.out.println("Introduce un valor: ");
				miMatriz[i][j]= teclado.nextInt();
			}
		}
		//Contamos números mayores , menores o iguales a 0 
		for (int i= 0; i<N; i++) {
			for (int j=0; j<M; j++) {
				if (miMatriz[i][j] >0) {
					mayor0++;
				} else if (miMatriz[i][j]<0) {
					menor0++;
				} else igual0++;
			}
		}
		//Mostramos los datos
		System.out.println("Mayores que 0: " + mayor0);
		System.out.println("Menor que 0: " + menor0);
		System.out.println("Igual que 0: " + igual0);
		

	}

}
