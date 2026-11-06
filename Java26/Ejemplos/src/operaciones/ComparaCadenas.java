/*
 * Objetivo: adivina una palabra
 */
package operaciones;

import java.util.Scanner;

public class ComparaCadenas {

	public static void main(String[] args) {
		final String PALABRA = "rojo";
		
		Scanner teclado = new Scanner(System.in);
		
		String cadena;
		
		System.out.println("Intenta adivinar mi palabra");
		cadena = teclado.nextLine();
		
		if ( cadena.equals(PALABRA)) {
			System.out.println("Es correcto");
		} else {
			System.out.println("Es incorrecto");
		}
		teclado.close();
	}

}
