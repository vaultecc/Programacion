/*
 * Objetivo: Realizar un programa que pregunte el nombre y el usuario introduce su nombre y el programa responde Hola "nombre".
 * Fecha:28/10/2026
 * Autor: Diego Martínez
 */
package primerExamen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//Declaramos la variable
		String nombre;
		//Preguntamos al usuario su nombre y guardamos la respuesta en la variable
		System.out.println("¿Cómo te llamas?");
		nombre= teclado.nextLine();
		//Mostramos el mensaje con su nombre y un saludo
		System.out.println("Hola " + nombre + ".");
		teclado.close();

	}

}
