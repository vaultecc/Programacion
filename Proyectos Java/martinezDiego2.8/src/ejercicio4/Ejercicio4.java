/*
 * Objetvo:Pediremos al usuario valores positivos hasta que introduzca 0
 * y mostraremos por pantalla la cantidad de números mayores de 0 y la media de estos.
 * Autor: Diego Martínez
 * Fecha: 14/10/2026
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		//Declaramos las variables
		int valores= 1;
		int contador= 0;
		int sumaValores= 0;
		double media= 0;

		/*Aqui hacemos un bucle mientras el usuario de números positivos, contamos las veces que da un número positivo
		 * y le damos la media de todos estos
		 */
		while (valores !=0 ) {
			System.out.println("Introduce valores positivos (Dame 0 para dejar de sumar)");
			valores= teclado.nextInt();
			if (valores >0) {
				contador++;
				sumaValores= sumaValores + valores;
				media = (double)sumaValores / contador;
			}
		}

		//Mostramos la información por pantalla
		System.out.println("La cantidad de números mayores a 0 introducidos son " + contador);
		System.out.println("La media de esos números es: " + media);

		teclado.close();
	}

}
