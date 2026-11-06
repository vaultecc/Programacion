/*
 * Objetivo: Crear un bucle que recoja 2 valores por teclado y los eleve a su potencia sin usar el operador ^
 * Fecha: 23/10/2026
 * Autor: Diego Martínez 
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaramos variables y la almacenamos
		int a;
		int b;
		int resultado= 1;
		
		System.out.println("Introduce un valor: ");
		a = teclado.nextInt();
		System.out.println("Introduce otro valor: ");
		b = teclado.nextInt();
		
		//creamos el bucle que calcule la potencia y mostramos resultados
		for (int i= 0; i<b; i++) {
			resultado = resultado * a;
		}
		
		System.out.println("La potencia de " + a + " elevado a " + b + " es " + resultado);
		teclado.close();
	}

}
