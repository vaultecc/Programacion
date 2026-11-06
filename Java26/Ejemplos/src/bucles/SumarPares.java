/*
 * Objetivo: Pedir numeros hasta que sea negativo, y hacer la suma de todos los números que sean pares
 * Autor: Diego Martínez
 * Fecha: 05/10/2026
 */
package bucles;

import java.util.Scanner;

public class SumarPares {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		int num1;
		int suma=0;
		boolean pares= false;
		
		System.out.println("Dame un número");
		num1= teclado.nextInt();
		
		while (num1 >=0) {
			pares = num1 % 2 ==0;
		 if (pares){
			suma= suma + num1;
		}
		    System.out.println("Dame un número");
			num1 = teclado.nextInt();
		}
		
		System.out.println("La suma de los númeroes pares es: " + suma);
		
		teclado.close();
	}

}
