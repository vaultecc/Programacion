/*
 * Objetivo: Solicitar al usuario 2 números, comprobar que número es mayor o igual y mostrarlo por pantalla.
 * Autor: Diego Martínez
 * Fecha: 06/10/2000
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Pedimos los números al usuario.
		System.out.println("Ingresa un número:");
		int num1= teclado.nextInt();
		
		System.out.println("Ingresa otro número:");
		int num2= teclado.nextInt();
		//Mostramos por pantalla que número es mayor o si son iguales.
		if (num1 > num2) {
			System.out.println("El número mayor es: " + num1);
		} else if (num1 == num2) {
			System.out.println("Ambos números son iguales " + num1 + " y " + num2);
		} else {
			System.out.println("El número mayor es: " + num2);
		}
		teclado.close();
	}

}
