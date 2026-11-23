/*
 * Objetivo: Un programa que reciba un número y te muestre la tabla de multiplicar de este con una función
 * Fecha: 22/11/2026
 * Autor: Diego Martínez
 */
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
	
	//Calculamos la tabla con la función
	public static void tablaM (int x) {
		int multiplicar;
		for (int i=1; i<=10;i++) {
			multiplicar= i*x;
			System.out.println(x +" por " + i + "= " + multiplicar);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		//Pedimos el número y mostramos el resultado de la función
		System.out.println("Introduce un número: ");
		num = teclado.nextInt();
		tablaM(num);

		teclado.close();
	}

}
