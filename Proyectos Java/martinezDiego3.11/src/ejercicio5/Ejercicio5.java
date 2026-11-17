/*
 * Objetivo: Un programa que registre sueldos de hombres y mujeres, detectar si existe una brecha salarial. Pedir número de personas por teclado
 * su género (0 varón 1 mujer ) y su sueldo, guardar en matriz y mostrar la media por género
 * Autor: Diego Martínez
 * Fecha: 13/11/2026
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		final int N;
		int contadorH =0;  int contadorM = 0;
		int sueldoTotalH = 0; int sueldoTotalM = 0;
		double sueldoMedioH = 0; double sueldoMedioM = 0;

		System.out.println("Introduzca el numero de empledados");
		N= teclado.nextInt();
		
		int [][] miMatriz= new int [N][2];
		
		//Recorremos la matriz y introducimos los datos por teclado
		for (int i=0; i<miMatriz.length; i++) {
			System.out.println("Introduce tu género (0 hombre y 1 mujer) : ");
			miMatriz[i][0]=teclado.nextInt();
			System.out.println("Introduce tu sueldo:");
			miMatriz[i][1]=teclado.nextInt();
		}
		
		//Calculamos el sueldo total y la cantidad de Hombres/mujeres
		for (int i=0; i<miMatriz.length; i++) {
			if (miMatriz[i][0] == 0) {
				contadorH++;
				sueldoTotalH = miMatriz[i][1] +  sueldoTotalH;
			}
			if (miMatriz[i][0] == 1) {
				contadorM++;
				sueldoTotalM = miMatriz[i][1] +  sueldoTotalM;
			}
		}
		
		//Calculamos la media en el caso de que en la empresa haya hombres o mujeres
		if (contadorH > 0) {
			sueldoMedioH= (double)sueldoTotalH / contadorH;
			System.out.println("El sueldo medio de los hombres es: " + sueldoMedioH + "€");
		}
		if (contadorM > 0) {
			sueldoMedioM = (double)sueldoTotalM / contadorM;
			System.out.println("El sueldo medio de las mujeres es: " + sueldoMedioM + "€");
		}

		
		teclado.close();
		
	}
	
}
