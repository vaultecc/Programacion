/*
 * Objetivo: Pedir por teclado un número entero y ver si es positivo, negativo o cero con una función
 * Autor: Diego Martínez
 * Fecha: 18/11/2026
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	//Creamos la función para controlar si el número es positivo,negativo o igual
	public static int dimeSigno(int a) {
		if (a>0) return 1;
		else if (a<0) return -1;
		else return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		int a;
		//Recogemos el resultado y mostramos el resultado
		System.out.println("Introduce un número");
		a=teclado.nextInt();
		
		System.out.println("1 = positivo, -1 = negativo y 0 es igual");
		System.out.println("El resultado es: " + dimeSigno(a));
		
		teclado.close();

	}

}
