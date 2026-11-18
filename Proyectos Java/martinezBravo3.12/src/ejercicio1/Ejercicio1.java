/*
 * Objetivo: Un programa que pida un programa de texto y luego muestre cada palabra en una linea distinta
 * Fecha: 16/11/2026
 * Autor: Diego Martínez
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main (String [] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaramos un String y un array
		String cadena;
		String [] palabras;
		//Pedimos una cadena de texto por teclado
		System.out.println("Introduce una cadena de texto: ");
		cadena= teclado.nextLine();
		//Guardamos una palabra en cada posición del array cuando haya un espacio
		palabras = cadena.split(" ");
		//Recorremos el array mostrando cada palabra
		for (int i = 0; i<palabras.length; i++) {
			System.out.println(palabras[i]);
		}
		teclado.close();
		
	}

}
