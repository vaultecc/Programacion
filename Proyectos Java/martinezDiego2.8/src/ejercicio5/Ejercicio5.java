/*
 * Objetivo: Pediremos 10 números y mostraremos la media de los números positivos,negativos y cantidad de 0
 * Autor: Diego Martínez
 * Fecha: 15/1072026
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Aquí declaramos las variables
		int num1;
		int contador= 0;
		int contadorCero= 0;
		int contadorPositivos= 0;
		int contadorNegativos= 0;
		
		int valorPositivo= 0;
		int valorNegativo= 0;
		
		double mediaPositivos= 0;
		double mediaNegativos= 0;
		
		//Utilizamos while para hacer un bucle que registre la cantidad de positivos/negativos y total de 0
		while (contador !=10) {
			System.out.println("Introduce un número");
			num1 = teclado.nextInt();
			contador++;
			if (num1 >0) {
				contadorPositivos++;
				valorPositivo= valorPositivo + num1;
			} else if (num1 <0) {
				contadorNegativos++;
				valorNegativo = valorNegativo + num1;
			} else {
				contadorCero++;
			}
		}
		
		//Calculamos la media de negativos y positivos
		mediaPositivos= (double)valorPositivo / contadorPositivos;
		mediaNegativos= (double)valorNegativo / contadorNegativos;
		
		//Mostramos los datos por pantalla
		
		System.out.println("La media de los positivos es: " + mediaPositivos);
		System.out.println("La media de los negativos es: " + mediaNegativos);
		System.out.println("La cantidad de ceros han sido: " + contadorCero);

		teclado.close();
	}

}
