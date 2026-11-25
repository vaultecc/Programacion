/*
 * Objetivo:Un programa que va a generar un número random y el usuario debera averiguarlo
 * Fecha:26/10/2026
 * Autor: Diego Martínez
 */
package Ejercicios;

import java.util.Scanner;

public class AdivinaElNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numRandom= (int)(Math.random()*100)+1;
		int numUsuario;
		int contador= 1;
		
		System.out.println("Introduce un número entre 1 y 100");
		numUsuario=teclado.nextInt();
		
		do {
			contador++;
			if (numUsuario<numRandom) {
				System.out.println("Introduce un número mayor");
				numUsuario=teclado.nextInt();
			} else if (numUsuario>numRandom) {
				System.out.println("Introduce un número menor");
			numUsuario=teclado.nextInt();
			}
		} while (numUsuario!=numRandom);

		System.out.println("Lo lograste we");
		System.out.println("Número de intentos: " + contador);
		teclado.close();
	}

}
