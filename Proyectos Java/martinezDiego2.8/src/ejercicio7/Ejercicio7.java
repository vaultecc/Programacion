/*
 * Objetivo: calcular n.aleatorio entre 0 y 50,el usuario introduciera numeros y el programa dira mayor/menor hasta que acierte.
 * Atuor: Diego Martínez
 * Fecha:16/10/26
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		//Declaramos las variables
		int numeroRandom = (int)(Math.random()*50);
		int mayorOmenor= 0;
		
		//comprobamos si el número es mayor o menor hasta que sea correcto
		while (mayorOmenor != numeroRandom) {
			System.out.println("Introduce un número entre 0 y 50");
			mayorOmenor = teclado.nextInt();
			
			 if (mayorOmenor >50 || mayorOmenor <0) {
				System.out.println("Número invalido");
			} else if (mayorOmenor > numeroRandom) {
				System.out.println("El número es Menor");
			} else if (mayorOmenor < numeroRandom) {
				System.out.println("El número es Mayor");
			} else {
				System.out.println("CORRECTO!!!");
			}
		}
		teclado.close();
	}

}
