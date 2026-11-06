/*
 * Objetivo: pedir al usuario un numero y sumarlo hasta 5 en el bucle for.
 * Autor: Diego
 * Fecha: 08/10/26
 */
package bucles;

import java.util.Scanner;

public class Buclefor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int cantidadNum, numero, suma=0;
		
		System.out.println("Dime cuantos números:");
		cantidadNum = teclado.nextInt();
		
		for (int i=1; i<=cantidadNum; i++) {
			System.out.println("dime el número " +  i);
			numero= teclado.nextInt();
			suma = suma + numero;
		}
		System.out.println("La suma es ");

	}

}
