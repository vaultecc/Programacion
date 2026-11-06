/*
 * Objetivo: Pedir unos datos al usuario y en funcion de la información mostrar unos datos.
 * Autor: Diego Martínez
 * Fecha: 08/10/2026
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre= teclado.nextLine();
		System.out.println("Introduce tu apellido: ");
		String apellido= teclado.nextLine();
	}

}
