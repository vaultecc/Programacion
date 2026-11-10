/*
 * Objetivo: solcitaremos unos datos al usuario y en funcion de la nota que nos de mostraremos el resultado de la nota en formato de palabras.
 * Autor: Diego Martínez
 * Fecha: 08/10/2026
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Solicitamos los datos
		System.out.println("Ingresa tu nombre:");
		String nombre=teclado.nextLine();
		System.out.println("Ingresa tu apellido:");
		String apellido= teclado.nextLine();
		System.out.println("Introduce tu ciclo formativo:");
		String ciclo= teclado.nextLine();
		System.out.println("Introduce tu nota:");
		int nota= teclado.nextInt();
		//En función de la nota, mostraremos la nota obtenida en un formato de texto.
		switch (nota) {
		case 1:
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellido);
			System.out.println("Ciclo Formativo: " + ciclo);
			System.out.println("Nota académica: 1 (Insuficiente)");
			break;
		case 2:
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellido);
			System.out.println("Ciclo Formativo: " + ciclo);
			System.out.println("Nota académica: 2 (Insuficiente)");
			break;
		case 3:
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellido);
			System.out.println("Ciclo Formativo: " + ciclo);
			System.out.println("Nota académica: 3 (Insuficiente)");
			break;
		case 4:
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellido);
			System.out.println("Ciclo Formativo: " + ciclo);
			System.out.println("Nota académica: 4 (Insuficiente)");
			break;
		case 5:
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellido);
			System.out.println("Ciclo Formativo: " + ciclo);
			System.out.println("Nota académica: 5 (Aprobado)");
			break;
		case 6:
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellido);
			System.out.println("Ciclo Formativo: " + ciclo);
			System.out.println("Nota académica: 6 (Bien)");
			break;
		case 7:
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellido);
			System.out.println("Ciclo Formativo: " + ciclo);
			System.out.println("Nota académica: 7 (Bien)");
			break;
		case 8:
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellido);
			System.out.println("Ciclo Formativo: " + ciclo);
			System.out.println("Nota académica: 8 (Notable)");
			break;
		case 9:
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellido);
			System.out.println("Ciclo Formativo: " + ciclo);
			System.out.println("Nota académica: 9 (Notable)");
			break;
		case 10:
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellido);
			System.out.println("Ciclo Formativo: " + ciclo);
			System.out.println("Nota académica: 10 (Sobresaliente)");	
		}
		teclado.close();
		
	}

}
