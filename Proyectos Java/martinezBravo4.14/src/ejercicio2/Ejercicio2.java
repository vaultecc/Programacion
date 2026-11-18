/*
 * Objetivo: Pedimos la edad por teclado y mostrar por pantalla si eres mayor de edad o no
 * Autor: Diego Martínez
 * Fecha: 18/11/2026
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	//El metodo para calcular si es mayor de edad o no
	public static boolean esMayorEdad (int a) {
		boolean mayor;
		if (a>=18) return mayor=true;
		 else return mayor=false;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaramos la variable y la llenamos por teclado
		int a;
		
		System.out.println("Introduce tu edad");
		a=teclado.nextInt();
		//Mostrar si es mayor de edad o no con el método
		if (esMayorEdad(a)==true) System.out.println("Eres mayor de edad");
		else System.out.println("No eres mayor de edad");
		
		teclado.close();
		
	}

}
