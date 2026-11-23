/*
 * Objetivo: Mostrar por pantalla un triangulo con una función, habra 2 valores el caracter a imprimir y el número de lineas
 * Fecha: 23/11/2026
 * Autor: Diego Martínez
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
	
	public static void triangulo (char x, int y) {
		String espacio = " ";
		int bucle1 =y;
		int bucle2 =y;
		
		for (int i=0; i<bucle1; i++) {
			for (int j=0; j<bucle2; j++) {
				System.out.print(espacio);
				for (int k=0; k<y; k++) {
					System.out.print(x);
				}
			}
			System.out.println();
			bucle2-=1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		char caracter;
		int lineas;
		
		System.out.println("Introduce un caracter");
		caracter = teclado.next().charAt(0);
		System.out.println("Introduce la cantidad de lineas");
		lineas=teclado.nextInt();
		
		triangulo(caracter, lineas);

	}

}
