/*
 * Objetivo: Crear un programa que pida dos cadenas de texto por teclado, luego indicar si son iguales 
 * e y si son iguales ignorando mayusculas
 * Autor: Diego Martínez
 * Fecha: 18/11/2026
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//Declaramos las variables
		String cadena;
		String cadena2;
		
		System.out.println("Introduce una cadena de texto");
		cadena= teclado.nextLine();
		System.out.println("Introduce otra cadena de texto");
		cadena2= teclado.nextLine();
		
		//Comparamos las cadenas teniendo en cuenta mayusculas y minusculas
		if (cadena.equals(cadena2)) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas no son iguales");
		}
		
		//Ignoramos las mayusculas y minusculas
		 if (cadena.equalsIgnoreCase(cadena2)) {
			System.out.println("Son iguales ignorando mayusculas");
		}  else {
			System.out.println("Tampoco son iguales ignorando mayusculas");
		}
	
		 teclado.close();
	}

}
