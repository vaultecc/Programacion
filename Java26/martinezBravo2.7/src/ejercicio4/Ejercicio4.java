/*
 * Objetivo: Solicitar al usuario 4 notas, calcular y mostrar la media al usuario.
 * Autor: Diego Martínez
 * Fecha: 09/10/26
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//Aquí solicitamos los datos al usuario
		System.out.println("Introduce tu nota de Matemáticas");
		float notaMates= teclado.nextFloat();
		System.out.println("Introduce tu nota de Sociales");
		float notaSociales= teclado.nextFloat();
		System.out.println("Introduce tu nota de Lengua");
		float notaLengua= teclado.nextFloat();
		System.out.println("Introduce tu nota de Ingles");
		float notaIngles= teclado.nextFloat();
		//Aquí calculamos la nota media
		float notaMedia = (notaMates + notaSociales + notaLengua + notaIngles) / 4;
		System.out.println("Tu nota media es: " + notaMedia);
		//Aquí mostramos la nota media redondeada hacia arriba.
		double notaMediaUp;
		notaMediaUp = Math.ceil(notaMedia);
		System.out.println("Tu nota media redondeada hacia arriba es: " + notaMediaUp);
		//Aquí la nota media redondeada hacia abajo.
		double notaMediaDown;
		notaMediaDown = Math.floor(notaMedia);
		System.out.println("Tu nota media redondeada hacia abajo es: " + notaMediaDown);
		//Aquí calculamos si con la media de notas puede acceder a estudios superiores
		if (notaMedia >8 && notaMedia <=10) {
			System.out.println("Puedes acceder a los estudios superiores.");
		} else {
			System.out.println("Debido a tu nota media no puedes acceder a estos estudios.");
		}
		teclado.close();
	}

}
