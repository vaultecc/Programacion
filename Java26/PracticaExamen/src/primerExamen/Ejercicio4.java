/*
 * Objetivo:Pedir 10 números y mostrar la media de los positivos, negatibos y la canidad de 0
 * Autor: Diego Martínez
 * Fecha:29/10/2026
 */
package primerExamen;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaramos e inicializamos las variables
		int numUsuario;
		int numPos=0;
		int numNeg=0;
		int contadorPositivos=0;
		int contadorNegativos=0;
		int contadorCeros=0;
		double mediaPos= 0;
		double mediaNeg= 0;
		//Creamos un bucle que pida 10 números y cuente la cantidad de positivos, negativos y ceros.
		for (int i=0; i<10; i++) {
			System.out.println("Introduce un número:");
			numUsuario=teclado.nextInt();
			
			if (numUsuario>0) {
				contadorPositivos++;
				numPos= numPos+numUsuario;
			} else if (numUsuario<0) {
				contadorNegativos++;
				numNeg= numNeg+numUsuario;
			} else {
				contadorCeros++;
			}
		}
		
		//Calculamos la medía y mostramos los datos por pantalla
		if (contadorPositivos>0) {
			mediaPos = (double)numPos/contadorPositivos;
		} 
		
		if (contadorNegativos>0) {
			mediaNeg = (double)numNeg/contadorNegativos;
		}
		
		System.out.println("La media de los números positivos es " + mediaPos);
		System.out.println("La media de los números negativos es " + mediaNeg);
		System.out.println("La cantidad de ceros ha sido de " + contadorCeros);
		teclado.close();

	}

}
