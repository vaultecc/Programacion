/*
 * Objetivo: Leeremos un número, calcularemos y mostraremos su factorial
 * Fecha:19/10/2026
 * Autor: Diego Martinez
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//Solicitamos el número por pantalla
		System.out.println("Introduzca un número positivo");
		int num1= teclado.nextInt();
		int n=1;
		
		for (int i=1; i<=num1; i++) {
			n= i*n;
		}
		
		System.out.println("El factorial de ese número es " + n);
		teclado.close();
	}

}
