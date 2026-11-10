/*
 * Objetivo: Solicitar al usuario una nota en valor entero e indicar  la clasificación de 0 a 10.
 * Autor: Diego Martínez
 * Fecha: 09/10/26
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//Aquí solicitamos la nota al usuario y almacenamos el dato.
		System.out.println("Introduce tu nota");
		int nota= teclado.nextInt();
		
		
		//Aquí usamos switch para mostrar por pantalla la información en base a la nota.
		switch (nota) {
		case 0:
			System.out.println(nota + " (Insuficiente)");
			break;
		case 1:
			System.out.println(nota + " (Insuficiente)");
			break;
		case 2:
			System.out.println(nota + " (Insuficiente)");
			break;
		case 3:
			System.out.println(nota + " (Insuficiente)");
			break;
		case 4:
			System.out.println(nota + " (Insuficiente)");
			break;
		case 5:
			System.out.println(nota + " (Suficiente)");
			break;
		case 6:
			System.out.println(nota + " (Bien)");
			break;
		case 7:
			System.out.println(nota + " (Bien)");
			break;
		case 8:
			System.out.println(nota + " (Notable)");
			break;
		case 9:
			System.out.println(nota + " (Notable)");
			break;
		case 10:
			System.out.println(nota + " (Sobresaliente)");
			break;
		default://Aquí en el caso de que la nota sea mayor que 10 o menor que 0 mostramos este mensaje
			System.out.println("La nota introducida no es valida.");
		}
		
		teclado.close();

	}

}
