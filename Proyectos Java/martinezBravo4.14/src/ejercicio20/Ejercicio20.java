/*
 * Objetivo: Un programa que imprima las tablas de multiplicar del 1 al 10 con una función
 * Fecha: 26/11/2026
 * Autor: Diego Martínez
 */
package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {
	//Una función que imprima la tabla de multiplicar del valor introducido
	public static void tablaMultiplicar (int num) {

		System.out.println("Tabla del: "+ num);
		for (int i=1; i<=10;i++) {
			System.out.println(i + "x" + num + "= " + i*num);
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//Imprimimos las tablas de multiplicar del 1 al 10
		for (int i=1; i<=10;i++) {
			System.out.println("Tabla del " + i);
			for (int j=1; j<=10; j++) {
				System.out.println(i + "x" + j + "= " + i*j);
			} System.out.println();
		}
		
		//Pedir el valor y mostrar la función
		System.out.println("Introduce un número entero: ");
		int num = teclado.nextInt();

		tablaMultiplicar(num);
		teclado.close();

	}

}
