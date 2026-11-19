/*
 * Objetivo: Un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y perímetro con una función
 * Fecha: 19/11/2026
 * Autor: Diego Martínez
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	
	//Las funciones que devolveran área y perímetro
	public static double perimetroRectangulo(double ancho, double alto) {
		return 2 * (ancho + alto);
	}
	
	public static double areaRectangulo(double ancho, double alto) {
		return ancho * alto;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double ancho, alto;
		//Pedimos los datos y mostramos el resultado por pantalla
		System.out.println("Introduce el ancho");
		ancho= teclado.nextDouble();
		System.out.println("Introduce el alto");
		alto= teclado.nextDouble();
		
		System.out.println("El perímetro es: " + perimetroRectangulo(ancho, alto));
		System.out.println("El área es: " + areaRectangulo(ancho, alto));
		teclado.close();
	}

}
