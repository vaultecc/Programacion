/*
 * Objetivo: Pedir número y sumarlos mientras sean distinto de 0
 * Autor: Diego Martínez
 * Fecha: 05/10/2026
 */
package bucles;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		int numero;//No tiene porque valer 1, es para iniciar el bucle
		int suma = 0;
		
		System.out.println("Dame un número para sumar: (Dame 0 para dejar de sumar)");
		numero= teclado.nextInt();

		while (numero !=0) {
			suma = suma + numero;
			System.out.println("Dame un número para sumar: (Dame 0 para dejar de sumar)");
			numero= teclado.nextInt();
		}
		System.out.println("La suma es: " + suma);
		
		teclado.close();

	}

}
