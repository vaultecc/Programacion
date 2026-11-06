/*
 * Objetivo: probar peticion de datos al usuario
 */
package probarPeticion;

import java.util.Scanner;

public class ProbarPeticion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int edad;
		System.out.println("Dame tu edad:");
		edad = teclado.nextInt();
		System.out.println("Tu edad es:" + edad);

	}

}
