/*
 * Objetivo: Un programa que almacene notas de 4 alumnos y 6 asignaturas, el usuario introduce las notas por taclado 
 * y luego el programa muestra nota,mínima,máxima y media. 
 * Autor: Diego Martínez
 * Fecha: 13/11/2026
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main (String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaramos las variables y la matriz
		final int ALUMNOS= 4;
		final int ASIGNATURAS= 5;
		int min,max;
		int suma;
		double media;
		
		int [][] miMatriz = new int [ALUMNOS][ASIGNATURAS];
		
		//Recorremos la matriz y pedimos la información al usuario
		for (int i =0; i<ALUMNOS; i++) {
			for (int j=0; j<ASIGNATURAS; j++) {
				System.out.println("Introduce tu nota:");
				miMatriz[i][j]= teclado.nextInt();
			}
		}
		
		//Recorremos la matriz mostrando las notas de cada alumno
		for (int i =0; i<ALUMNOS; i++) {
			System.out.print("Alumno " +  (i+1) + ":");
			for (int j=0; j<ASIGNATURAS; j++) {
				System.out.print(" " + miMatriz[i][j] + " ");
			}
			System.out.println();
		}
		
		//Recorremos la matriz calculando la media
		for (int i =0; i<ALUMNOS; i++) {
			suma=0;
			min=miMatriz[i][0]; max=miMatriz[i][0];
			for (int j=0; j<ASIGNATURAS; j++) {
				suma= miMatriz[i][j] + suma;
				if (miMatriz[i][j] > max) max= miMatriz[i][j];
				if (miMatriz[i][j]<min) min = miMatriz[i][j];
			}
			 media= (double)suma/ASIGNATURAS;
			 System.out.println();
			System.out.println("La nota media del alumno " + (i+1) + " es de: " + media);
			System.out.println("La nota maxima del alumno " + (i+1) + " es de: " + max + " y la mínima es: " + min);
		}
		
		teclado.close();
	}
}
