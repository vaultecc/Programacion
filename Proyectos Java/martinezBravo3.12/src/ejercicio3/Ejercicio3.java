/*
 * Objetivo: Crear un programa que pida dos cadenas de texto por teclado, luego indicar si son iguales 
 * e y si son iguales ignorando mayusculas
 * Autor: Diego Martínez
 * Fecha: 18/11/2026
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main (String [] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaramos las variables
		String nombre;
		String apellido;
		String apellido2;
		String id;
		
		//Pedimos por teclado el nombre y apellidos
		System.out.println("Introduce tu nombre");
		nombre=teclado.next();
		System.out.println("Introduce tu primer apellido");
		apellido= teclado.next();
		System.out.println("Introduce tu segundo apellido");
		apellido2=teclado.next();
		
		//Almacenamos las 3 primeras posiciones y lo combertimos a mayusculas
		String letrasNombre = nombre.substring(0,3);
		String letrasApellido = apellido.substring(0,3);
		String letrasApellido2 = apellido2.substring(0,3);
		id= letrasNombre+letrasApellido+letrasApellido2;
		id = id.toUpperCase();
		System.out.println("Tú coódigo de usuario es: " + id);
		
		teclado.close();
	}

}
