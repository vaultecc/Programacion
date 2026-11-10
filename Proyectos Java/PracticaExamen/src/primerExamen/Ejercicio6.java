/*
 * Objetivo: pide un número entero y muestra si es par o impar
 */
package primerExamen;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		int numEntero;
		int numPar=0;
		int numImpar;
		
		System.out.println("Introduce un número entero");
		numEntero=teclado.nextInt();
		
		if (numEntero % 2 == 0) {
			System.out.println("Número par");
		} else if (numEntero % 2 ==1 || numEntero % 2 ==-1) {
			System.out.println("Número impar");
		}
	}

}
