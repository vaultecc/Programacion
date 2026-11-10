/*
 * Objetivo:Solicitar dos valores al usuario y realizar una operación con los dos valores en un menú de selección
 * Autor: Diego Martínez
 * Fecha: 09/10/2026
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca un valor (númerico): ");
		int num1= teclado.nextInt();
		System.out.println("Introduzca otro valor (númerico):  ");
		int num2= teclado.nextInt();
		System.out.println("Indique la operación que quiere realizar (Inserte un número): ");
		System.out.println(" ");
		System.out.println("(1) suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multiplicación");
		System.out.println("(4) División");
		int opcion=teclado.nextInt();
		
		switch (opcion) {
		case 1:
			int suma= num1 + num2;
			System.out.println("-----------------------------------------------");
			System.out.println("La suma de tus dos números es: " + suma);
			break;
		case 2:
			int resta= num1 - num2;
			System.out.println("-----------------------------------------------");
			System.out.println("La resta de tus dos números es: " + resta);
			break;
		case 3:
			int multiplicacion= num1*num2;
			System.out.println("-----------------------------------------------");
			System.out.println("La multiplicación de tus dos números es: " + multiplicacion);
			break;
		case 4:
			double division= (double)num1/num2;
			System.out.println("-----------------------------------------------");
			System.out.println("La division de tus dos números es: " + division);
		}
		teclado.close();
	}

}
