/*
 * Objetivo: Mostrar por pantalla un triangulo con una función, habra 2 valores el caracter a imprimir y el número de lineas
 * Fecha: 23/11/2026
 * Autor: Diego Martínez
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
	//Declaro el método
	public static void triangulo (char x, int y) {
		int bucle1=y*2;//Usamos este valor para imprimir el doble de espacios ya que en eclipse el espacio ocupa medio caracter aprox
		int bucle2=1;//Con este valor imprimimos los caracteres en el bucle
		String espacio= " ";
		//Creamos el triangulo con 2 for anidados, uno para imprimir los espacios y otro los caracteres
		for (int i =0; i<y;i++) {	
			for (int j=0; j<bucle1; j++) {
				System.out.print(espacio);
				}
				for(int q=0; q<bucle2; q++) {
					System.out.print(x);	
			}
			bucle2+=2;
			bucle1-=2;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//Declaramos las variables pedimos los valores y mostramos el resultado del método
		char caracter;
		int lineas;
		
		System.out.println("Introduce un caracter");
		caracter = teclado.next().charAt(0);
		System.out.println("Introduce la cantidad de lineas");
		lineas=teclado.nextInt();
		
		triangulo(caracter, lineas);
		teclado.close();
	}

}
