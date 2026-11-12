/*
 * Objetivo: Un programa con una matriz 10x10 con los valores de la tabla de multiplicar del 1 al 10 luego muestra la matriz por pantalla
 * Autor: Diego Martínez
 * Fecha: 12/11/2026
 */
package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos las variables
		final int CANTIDAD= 10;
		int N=1;
		int M=1;
		//Creamos nuestra matriz con un tamaño 10x10
		int [][] miMatriz = new int [CANTIDAD][CANTIDAD];
		//Llenamos la matriz con los valores multiplicados de 1 * N, cuando N valga más de 10 vuelve a valer 1
		for (int i=0; i<CANTIDAD; i++) {
			for (int j=0; j<CANTIDAD; j++) {
				miMatriz[i][j]= 1 * N;
				N++;
				if (N>10) N=1;
			}
		}
		
		//Mostramos la información por pantalla
		for (int i=0; i<CANTIDAD; i++) {
			for (int j=0; j<CANTIDAD; j++) {
				System.out.print(miMatriz[i][j]);
			}
			System.out.println();
		}
		
	
	}

}
