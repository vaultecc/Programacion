/*
 * Objetivo: Un programa que calcule la suma y el producto de los 10 primeros números naturales
 * Fecha:22/10/2026
 * Autor: Diego Martínez
 */
package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Declaramos las variables
		int suma=0;
		int producto= 1;
		
		//Creamos un bucle que calcule la suma y el product hasta 10
		for (int i=1; i<=10; i++) {
			suma= suma+i;
			producto= producto*i;
		}
		//mostramos los datos por pantalla
		System.out.println("La suma es: " + suma);
		System.out.println("El producto es: " + producto);

	}

}
