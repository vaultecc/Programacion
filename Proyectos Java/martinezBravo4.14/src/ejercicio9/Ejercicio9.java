/*
 * Objetivo: Mediante una función con dos valores mostraremos el número más pequeño de 3 valores introducidos
 * Autor: Diego Martínez
 * Fecha: 21/11/2026
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
	//creamos la función para comparar dos números
	public static int valorMenor (int x, int y) {
		if (x>y) return y;
		else return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//declaramos las variables y pedimos los valores
		int valor1, valor2, valor3;
		
		System.out.println("Introduce un número");
		valor1=teclado.nextInt();
		System.out.println("Introduce un número");
		valor2=teclado.nextInt();
		System.out.println("Introduce un número");
		valor3=teclado.nextInt();

		//Metemos una función dentro de otra función para que el valor resultado de la primera función lo compare con otro valor
		System.out.println("El valor más pequeño es: " + valorMenor(valorMenor (valor1, valor2), valor3));

		teclado.close();
	}

}
