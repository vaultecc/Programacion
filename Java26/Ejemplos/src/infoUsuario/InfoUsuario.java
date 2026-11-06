/*
 * Objetivo: Aquí vamos a hacer un programa para pedir al usuario su nombre, edad y altura, al final de todo lo mostraremos en un mensaje
 */
package infoUsuario;

import java.util.Scanner;

public class InfoUsuario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String nombre;
		System.out.println("Dime tu nombre:");
		nombre = teclado.nextLine();
		
		String edad;
		System.out.println("Dime tu edad:");
		edad = teclado.nextLine();
		
		String altura;
		System.out.println("Dime tu altura:");
		altura = teclado.nextLine();
		
		System.out.println("Los datos ingresados fueron:");
		System.out.println("Nombre:" + nombre);
		System.out.println("Edad:" + edad);
		System.out.println("Altura:" + altura);
		

	}

}
