/*
 * Objetivo: Almacenamos una secuencia aritmetica en un array y luego la mostramos,
 * Autor: Diego Martínez
 * Fecha: 11/11/2026
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//Declaramos las variables y pedimos los datos
		int V;//Valor inicial
		int I;//Incrementos
		final int N;
		
		System.out.println("Introduce el valor inicial");
		V=teclado.nextInt();
		System.out.println("Introduce por cuanto se incrementara");
		I=teclado.nextInt();
		System.out.println("Introduce la cantidad de veces");
		N=teclado.nextInt();
		
		int [ ] miArray= new int[N];
		//Recorremos el array y mostramos la secuencia
		for (int i = 0; i<miArray.length;i++) {
			miArray[i]= V;
			V=miArray[i]+I;
			System.out.println(miArray[i]);
		}
		
		teclado.close();

	}

}
