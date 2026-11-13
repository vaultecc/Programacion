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
		int numVaron=0;
		int numMujer=0;
		int sueldoM=0;
		int sueldoV=0;
		int mediaM, mediaV;
		
		System.out.println("Introduzca el numero de empledados");
		N= teclado.nextInt();
		
		int [][] empleados= new int [N][1];
		
		for (int i=0; i<empleados.length; i=N) {
			System.out.println("Introduce tu género (0 varón 1 mujer) : ");
			empleados[i][0]=teclado.nextInt();
			System.out.println("Introduce tu sueldo: ");
			empleados[i][1]=teclado.nextInt();
			}
		
		for (int i=0; i<empleados.length; i=N) {
			if (empleados[i][0] == 0) {
				numVaron++;
				sueldoV= sueldoV + empleados[i][1];
			}
			if (empleados[i][0] == 1) {
				numMujer++;
				sueldoM= sueldoM + empleados[i][1];
			}
			}
		
		

	}
}