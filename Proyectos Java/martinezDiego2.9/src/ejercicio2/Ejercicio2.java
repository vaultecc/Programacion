/*
 * Objetivo:Mostraremos los númeroes pares entre el 1 y el 200
 * Fecha/19/10/2026
 * Autor:Diego Martínez
 */
package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos un bucle que sume de 2 en 2 y muestre los númeroes pares
		for (int i=2; i<=201; i=i+2) {
			if (i % 2==0) {
				System.out.println(i);
			}
		}

	}

}