/*
 * Objetivo: Un array de tamaño 30 que almacene valores randoms de 0 a 9 y los ordene y muestre
 * Autor: Diego Martínez
 * Fecha: 11/11/2026
 */
package ejercicio18;

import java.util.Arrays;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int CANTIDAD=30;
		
		int [] miArray= new int[CANTIDAD];
		
		for (int i = 0; i<miArray.length;i++) {
			miArray[i]= (int)(Math.random()*10);
		}
		//Utilizamos el metodo sort para poder ordenar de forma ascendente los valroes del array
		Arrays.sort(miArray);
		
		for(int i=0; i<miArray.length;i++) {
			System.out.println(miArray[i]);
		}

	}

}
