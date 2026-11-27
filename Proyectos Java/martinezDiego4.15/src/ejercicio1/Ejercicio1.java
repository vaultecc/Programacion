/*
 * Objetivo: Un método que devolvera true en el caso de que los parametros de los nombres introducidos sean iguales y sale al contrario
 * Autor: Diego José Martínez Bravo
 * Fecha: 27/11/2026
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String fin;
		
		do {
			System.out.println("Introduce fin para acabar");
			fin = teclado.next();
			
		} while (fin.equalsIgnoreCase("fin"));
		
		
	}

}
