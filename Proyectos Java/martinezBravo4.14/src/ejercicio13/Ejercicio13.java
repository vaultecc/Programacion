/*
 * Objetivo: calcular la cantidad de descuento que nos han hecho , recibir el precio sin descuento y el con descuento y calcularlo con una funcion
 * Fecha: 23/11/2026
 * Autor: Diego Martínez
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
	//La funcion para calcular el descuento
	public static double descuento(double x,double y) {
		double descuentoTotal = x - y;
		double porcentajeDescuento = (descuentoTotal / x) * 100;
		return porcentajeDescuento;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		double descuentoNo, descuentoSi;
		
		//Pedimos el precio con y sin descuento y mostrarmos el % meidante la función
		System.out.println("Introduce la cantidad sin descuento: ");
		descuentoNo=teclado.nextDouble();
		System.out.println("Introduce la cantidad con el descuento");
		descuentoSi=teclado.nextDouble();
		
		System.out.println("El descuento en % es: " + descuento(descuentoNo, descuentoSi)+"%");
		teclado.close();
	}

}
