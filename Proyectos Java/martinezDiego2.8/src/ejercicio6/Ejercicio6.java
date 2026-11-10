/*
 * Objetivo: Leemos un número, calculamos su cuadrado hasta que se introduzca un número negativo
 * Autor: Diego Martínez
 * Fecha: 15/10/2026
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		//Declaramos variables
		double num1= 1;
		double cuadrado= 0;
		
		//Realizamos el blucle hasta tener un número negativo
		while (num1 >=0) {
			System.out.println("Introduce un número");
			num1 = teclado.nextInt();
			if (num1 <0) {
				System.out.println("Fin del programa");
			} else {
				cuadrado= num1 * num1;
			}
		}
		System.out.println("El cuadrado de ese número es: " + cuadrado);
		teclado.close();

	}

}
