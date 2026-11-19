/*
 * Objetivo:Pedir un entero N, mostrar sumatorio,productorio y valor intermedio de 1 a N con una función
 * Fecha: 19/11/2026
 * Autor: Diego Martínez
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	//Devuelve el sumatorio de 1 a n
	public static int suma1aN(int n) {
		int sumatorio=0;
		for (int i=1; i<=n; i++ ) {
			sumatorio = sumatorio + i;
			}
		return sumatorio;
	}
	//Devuelve el producto de 1 a n
	public static int producto1aN(int n) {
		int producto=1;
		for (int i=1; i<=n; i++ ) {
			producto = producto * i;
			}
		return producto;
	}
	//Devuelve el intermedio de n y 1
	public static double intermedio1aN(int n) {
		return (double)(1+n)/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("Introduce un valor entero: ");
		n = teclado.nextInt();
		
		System.out.println("El sumatorio de " + n + " es: " + suma1aN(n));
		System.out.println("El producto de " + n + " es: " + producto1aN(n));
		System.out.println("El intermedio de " + n + " y 1 es: " + intermedio1aN(n));
		teclado.close();
	}

}
