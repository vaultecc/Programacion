/*
 * Objetivo: Pedir una fecha dia, mes , año por separado y nos diga si la fecha es correcta mediante una funcion
 * Autor: Diego Martínez
 * Fecha: 22/11/2026
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	//Tenemos en cuenta con la funcion las fechas correctas
	public static String fecha (int d, int m, int y) {
		String fechaMal = "no es correcta";
		String fechaBien = "es correcta";
		if (d <1 || d >31) return fechaMal;
		else if (m <1 || m >12) return fechaMal;
		else if (y <=0 ) return fechaMal;
		else if (m == 2 && d >28 || m == 4 && d >30 || m == 6 && d >30 || m == 9 && d >30 || m== 11 && d >30) return fechaMal;
		else return fechaBien;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int dia, mes, year;
		//Pedimos los datos por teclado y mostramos si la fecha es correcta con la función
		System.out.println("---FECHA---");
		System.out.println("Introduce el día");
		dia=teclado.nextInt();
		System.out.println("Introduce el mes");
		mes=teclado.nextInt();
		System.out.println("Introduce el año");
		year=teclado.nextInt();
		
		System.out.println("Tu fecha: " + dia + "/" + mes +"/" + year + " " + fecha(dia, mes, year) );

		teclado.close();
	}

}
