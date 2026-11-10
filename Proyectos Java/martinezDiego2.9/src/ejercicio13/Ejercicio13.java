/*
 * Objetivo: Un programa donde el usuario piensa un número del 1 al 100
 * y el ordenador intentara adivinarlo, el usuario indica mayor, menor o igual
 * Fecha:26/10/2026
 * Autor:Diego Martínez
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int max= 100;
		int min= 1;
		int numRandom = (int)(Math.random()*(max - min + 1) + min);
		String respuestaUsuario;
		String igual= "igual";
		String mayor= "mayor";
		String menor= "menor";


			System.out.println(numRandom);
			respuestaUsuario = teclado.next();


			do {
				if (respuestaUsuario.equals(mayor)) {
					min = numRandom + 1;
					numRandom = (int)(Math.random()*(max - min + 1)) + min;
					System.out.println(numRandom);
					respuestaUsuario = teclado.next();
				} else if (respuestaUsuario.equals(menor)) {
					max = numRandom - 1;
					numRandom = (int)(Math.random()*(max - min + 1)) + min;
					System.out.println(numRandom);
					respuestaUsuario = teclado.next();
				}
			} while (respuestaUsuario.equals(mayor) || respuestaUsuario.equals(menor));



	}

}
