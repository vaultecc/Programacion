/*
 * Objetivo: Un programa que pida 5 precios y muestre por pantalla cada precio + 21% IVA con una función
 * Fecha: 19/11/2026
 * Autor: Diego Martínez
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	//Declaramos la función para calcular el iva
	public static double precioConIVA (double precio) {
		double iva = 0.21;
		double ivaTotal = precio * iva;
		return precio + ivaTotal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//Declaramos la variable de la cantidad de precios que se van a introducir y se pide esa cantidad de veces
		final int PRODUCTOS = 5;
		int precio;
		
		for (int i=0; i<PRODUCTOS; i++) {
			System.out.println("Introduce un precio: ");
			precio = teclado.nextInt();
			System.out.println("El precio con IVA sería de: " + precioConIVA(precio) + "€");
		}
		teclado.close();
	}

}
