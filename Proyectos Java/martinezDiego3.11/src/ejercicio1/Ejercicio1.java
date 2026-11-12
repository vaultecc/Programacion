/*
 * Objetivo: una matriz de tamaño 5x5 que almacene números del 1 al 25
 * Fecha: 12/11/2026
 * Autor: Diego Martínez
 */
package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] miMatriz = new int[5][5];
		int suma=1;
		//Recorremos la matriz anidando un bucle for dentro de otro para ir moviendose entre las posiciones
		for (int i=0; i<5;i++) {
			for (int j=0; j<5;j++) {
				miMatriz[i][j]= suma++;
			}
		}
		//Hacemos lo mismo pero para mostrar los resultados
		for (int i=0; i<5;i++) {
			for (int j=0; j<5;j++) {
				System.out.print(miMatriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
