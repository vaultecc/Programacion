/*
 * Objetivo: Un programa que compruebe si 3 valores enteros se ajustan a la ecuacion de pitagoras con una función
 * Fecha: 25/11/2026
 * Autor: Diego Martínez
 */
package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {
	//Declaramos el método para comprobar si la ecuación se ajusta
	public static boolean pitagoras (int x, int y , int z) {
		x = Math.powExact(x, 2);
		y = Math.powExact(y, 2);
		z = Math.powExact(z, 2);
		boolean iguales= false;
		if ( x+y == z) {
			return iguales = true;
		}
			return iguales;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//Declaramos las variables y mostramos el resultado con el metodo
		int x,y,z;
		
		System.out.println("Introduce un valor entero");
		x=teclado.nextInt();
		System.out.println("Introduce un valor entero");
		y=teclado.nextInt();
		System.out.println("Introduce un valor entero");
		z=teclado.nextInt();
		
		if (pitagoras(x, y, z) == true) System.out.println("Se ajusta a la ecuación de Pitágoras");
		else System.out.println("No se ajusta a la ecuación de Pitágoras");

		teclado.close();
	}

}
