/*
 * Objetivo: pedir números y sumarlos hasta 0
 * autor: Diego
 * Fecha: 7/10/26
 */
package bucles;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		int numero, suma = 0;
		
		do { 
		System.out.println("Dame un numero:");
		numero= teclado.nextInt();
		suma= suma + numero;
		}  while (numero !=0);
		
		System.out.println("la suma es: " + suma);

	}

}
