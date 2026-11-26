/*
 * Objetivo: Mostrar un menu con dos opciones (1.Circunferencia y 2.Área) se le pedira al usuario un radio y se mostrara el calculo con unas funciones
 * Fecha: 26/11/2026
 * Autor: Diego Martínez
 */
package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {
	//Metodo para mostrar el menu y recoger la respuesta
	public static int menu() {
		Scanner teclado = new Scanner(System.in);
		int respuesta;
		System.out.println();
		System.out.println("Selecciona una opción");
		System.out.println("1. Circunferencia");
		System.out.println("2.Área");
		System.out.println("3.Volumen");
		System.out.println("4.Todas");
		System.out.println("5.Salir");
		respuesta = teclado.nextInt();
		teclado.close();
		return respuesta;
	}
	//Metodo para recoger el radio 
	public static double pideRadio() {
		Scanner teclado = new Scanner(System.in);
		double respuesta;
		System.out.println("Introduce el radio");
		respuesta = teclado.nextDouble();
		teclado.close();
		return respuesta;
		
	}
	//Metodo para la circunferencia
	public static double circunferencia (double r) {
		double circunferencia = 2 * Math.PI * r;
		return circunferencia;
	}
	//Metodo para el area
	public static double area (double r) {
		double area = Math.PI * Math.pow(r, 2);
		return area;
	}
	//Metodo para el volumen
	public static double volumen(double r) {
		double volumen = ((double)4/3) * Math.PI * Math.pow(r, 3);
		return volumen;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int respuestaMenu;
		double radio=0;
		//Un do while para introducir las respuestas y terminar el programa
		do {
			respuestaMenu= menu();
		if (respuestaMenu !=5 ) {
			radio= pideRadio();
		}
		if (respuestaMenu == 1 ) {
			System.out.println("La circunferencia es: " + circunferencia(radio));
		} else if (respuestaMenu == 2) {
			System.out.println("El área es: " + area(radio));
		} else if (respuestaMenu == 3) {
			System.out.println("El volumen es: " + volumen(radio));
		} else if (respuestaMenu == 4) {
			System.out.println("La circunferencia es: " + circunferencia(radio));
			System.out.println("El área es: " + area(radio));
			System.out.println("El volumen es: " + volumen(radio));
		}
	} while (respuestaMenu != 5);
		
		teclado.close();
	}

}
