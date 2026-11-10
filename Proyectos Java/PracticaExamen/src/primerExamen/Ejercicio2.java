/*
 * Objetivo: Calcular que nota hace falta sacar en el segundo examen, si la nota del primer examen cuenta un 40% y la del segundo un 60%
 * Fecha: 28/10/2026
 * Autor: Diego Martínez
 */
package primerExamen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//declaramos variables
		double nota1=0;
		double notaNecesaria;
		double media;
		double mediaDeseada;
		//preguntamos los datos por teclado
		System.out.println("Introduce la nota de tu primer examen");
		nota1= teclado.nextDouble();
		System.out.println("Introduce tu media deseada:");
		mediaDeseada = teclado.nextDouble();
		//calculamos y mostramos el resultado
		nota1= nota1*0.4;
		media= mediaDeseada-nota1;
		notaNecesaria= media/0.6;
		
		System.out.println("La nota necesaria en el segundo examen para esa média es: " + notaNecesaria);

	}

}
