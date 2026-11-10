/*
 * Objetivo:Pedir un número de dias, si es menor a 0 es no válido, si no, lo muestra en semanas completas y días sueltos
 * Autor: Diego Martínez
 * Fecha: 29/10/2026
 */
package primerExamen;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int diasIntro;
		int semanas;
		int diasSobras;
		
		System.out.println("Introduce una cantidad de días");
		diasIntro= teclado.nextInt();
		
		if (diasIntro <0) {
			System.out.println("Número no válido");
		} else {
			semanas= diasIntro/7;
			diasSobras = diasIntro%7;
			System.out.println(semanas + " semanas y " + diasSobras + " días");
		}

	}

}
