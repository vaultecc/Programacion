/*
 * Objetivo: Solicitar al usuario los datos,Nombre,Edad y Nota académica y mostrarlos por pantalla si cumple las condiciones
 * Autor: Diego Martinez
 * Fecha: 06/10/2026
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Solicitamos los datos.
		System.out.println("Introduce tu nombre: ");
		String nombre= teclado.nextLine();
		
		System.out.println("Introduce tu edad: ");
		short edad= teclado.nextShort();
		
		System.out.println("Introduce tu nota académica: ");
		double nota= teclado.nextDouble();
		
		//Mostramos los datos por pantalla en base a las condiciones que cumpla.
		if (edad >= 18 && nota >7) {
			System.out.println(nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas.");
		} else {
			System.out.println(nombre + ", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos." );
		}
		
		teclado.close();

	}

}
