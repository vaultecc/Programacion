/*
 * Objetivo: Dos arrays de enteros del 1 al 100 el segundo debe copiar y mostrar los valores del primero en orden inverso
 * Autor: Diego Martínez
 * Fecha: 09/11/2026
 */
package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		//Declaramos e inicializamos los arrays
		final int CANTIDAD= 100;
		
		int [] miArray= new int[CANTIDAD];
		int [] miArray2= new int[CANTIDAD];
		//recorremos el array del 1 al 100
		for ( int i =0; i<miArray.length; i++) {
			miArray[i]= i+1;
		System.out.println(miArray[i]);
		} 
		//recorremos el array al inversa empezando con la ultima posicion del primer array
		for (int i=0; i<miArray2.length; i++) {
			miArray2[i]= miArray[99-i];
			System.out.println(miArray2[i]);
		}
			
	}

}
