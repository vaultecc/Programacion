/*
 * Objetivo: Vamos a expresar una cantidad de segundos guardados en una variable en horas, minutos y segundos.
 * Fecha: 28/10/2026
 * Autor: Diego Martínez
 */
package primerExamen;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		//Declaramos vairables
		int t;
		int hora;
		int minuto;
		int segundos;
		//Pedimos los datos por pantalla
		System.out.println("Introduce una cantidad de segundos");
		t= teclado.nextInt();
		//Realizamos las operaciones
		hora = t/3600;
		minuto= (t%3600) / 60;
		segundos = t%60;

		//Mostramos los resultados
		System.out.println(hora);
		System.out.println(minuto);
		System.out.println(segundos);
		teclado.close();



	}

}
