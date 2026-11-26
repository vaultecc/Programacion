/*
 * Objetivo: Un programa que calcule el importe de la compra de unos productos
 * Autor: Diego
 * Fecha: 27//11/2026
 */
package martinez;

import java.util.Scanner;

public class Diego1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//Declaramos las variables
		String fin;
		int unidadesProducto;
		double importe=0;
		int contador=0;
		double precioUnidad = 20.33;
		double precioUnidades11y12 = 18.66;
		double precioResto = 16;
		int contadorProductos=0;
		double totalImportes=0;
		int totalUnidades=0;
		
	do {
		System.out.println("Introduce el nombre del producto");
		 String nombre = teclado.nextLine(); nombre = teclado.nextLine();//Tengo que pedir 2 veces el nombre porque en la segunda vuelta se lo salta
		 
		do {
		System.out.println("Introduce el número de unidades del producto");
		unidadesProducto = teclado.nextInt();
		if (unidadesProducto > 15 || unidadesProducto < 1) {
			System.out.println("Error debe estar entre 1 y 15");
		}
		} while (unidadesProducto > 15 || unidadesProducto < 1);
		totalUnidades+= unidadesProducto;
		//Calculamos el importe en base a la cantidad de productos
		for (int i=1; i<=unidadesProducto; i++) {
			if (i <= 10) {
				importe +=precioUnidad;
			} else if (i == 11 || i == 12) {
				importe +=precioUnidades11y12;
			} else {
				importe +=precioResto;
			}
		}
		//Calculamos el importe
		importe = Math.floor(importe * 100) / 100;
		totalImportes += importe;
		System.out.println("Importe de " + nombre +" es de: " + importe + "€");
		contadorProductos++;
	} while (contadorProductos!=7);
	//Mostramos el resultado
	System.out.println("Se han procesado " + totalUnidades + " unidades de productos con un importe total de " + totalImportes + "€");
	}

}
