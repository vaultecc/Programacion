/*
 * Objetivo: Pedir por teclado un número entero y ver si es positivo, negativo o cero con un método
 * Autor: Diego Martínez
 * Fecha: 18/11/2026
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static int dimeSigno(int a) {
		int resultado;
		if (a>0) return 1;
		else if (a<0) return -1;
		else return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		int a;
		
		System.out.println("Introduce un número");
		a=teclado.nextInt();
		
		System.out.println("1 = positivo, -1 = negativo y 0 es igual");
		System.out.println("El resultado es: " + dimeSigno(a));

	}

}
