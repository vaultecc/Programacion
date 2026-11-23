/*
 * Objetivo: Pasar de km a millas con una función
 * Fecha: 22/11/2026
 * Autor: Diego Martínez
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
	//Creamos la funcion para pasar km a millas
	public static double conversionAMillas (double x) {
		double millas = 0.621371;
		
		return x * millas;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double km;
		//Pedimos los km a calcular y mostramos el resultado
		System.out.println("Introduce una cantidad de km: ");
		km=teclado.nextDouble();
		
		System.out.println("Esos son: " + conversionAMillas(km) + " millas");
		
		teclado.close();
	}

}
