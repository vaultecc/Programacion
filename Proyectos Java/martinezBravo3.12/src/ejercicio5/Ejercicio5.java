/*
 * Objetivo:Leer una frase por teclado e indicar si la frase es un palíndromo.
 * Autor: Diego Martínez
 * Fecha: 18/11/2026
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		boolean palindromo= false;
		
		String frase;
		String invertida= "";;
		
		System.out.println("Introduce una frase");
		frase=teclado.nextLine();
		//Con este metodo eliminamos los espacios
		frase= frase.replace(" ", "");
		
		//Aquí invertimos la frase introducida.
		for (int i = frase.length()-1; i>=0 ;i--) {
				invertida += frase.charAt(i);
			
		}

		//Comparamos sin las frases son un palindromo
		if (frase.equalsIgnoreCase(invertida)) palindromo=true;
		// Y mostramos el resultado en base a ser o no un palindromo
		if (palindromo==true) {
			System.out.println("La frase es un palindromo");
		} else {
			System.out.println("La frase no es un palindromo");
		}
			teclado.close();
	}

}
