/*
 * Objetivo: Pediremos datos al usuario, comprobaremos si cumple los requisitos y en el caso de que si mostraremos un mensaje por pantalla
 * Autor: Diego Martínez
 * Fecha: 07/10/2026
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		int edad= teclado.nextInt();
		teclado.nextLine();
		
		if (edad <18) {
			System.out.println("No tiene la edad requerida para realizar estos estudios.");
		} else {
			
			System.out.println("Introduce tu nombre: ");
			String nombre= teclado.nextLine();
			
			System.out.println("Introduce tu apellido: ");
			String apellido= teclado.nextLine();
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellido);
			System.out.println("Edad: " + edad);
			System.out.println();
			System.out.println("Usted ha sido admitido");
		} 
		teclado.close();
	}

}
