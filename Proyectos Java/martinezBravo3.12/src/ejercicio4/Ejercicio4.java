/*
 * Objetivo: Un programa que muestre por pantalla cuantas vocales hay en una frase introducida por teclado, no se debe diferenciar entre mayusculas o minusculas
 * Autor: Diego Martínez
 * Fecha: 18/11/2026
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaramos las variables
		String frase;
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
		//Pedimos la frase por teclado
		System.out.println("Introduce una frase:");
		frase= teclado.nextLine();
		
		//Usamos el metodo indexOf y le decimos que busque en el intervalo de i con (i, i+1) y cuente la vocal que se encuentra en esa posición
		for (int i =0; i<frase.length() ; i++) {
			if (frase.indexOf("a", i, i+1) >= 0 || frase.indexOf("A", i, i+1) >= 0) {
			    contadorA++;
			} else if (frase.indexOf("e", i, i+1) >= 0 || frase.indexOf("E", i, i+1) >= 0) {
			    contadorE++;
			} else if (frase.indexOf("i", i, i+1) >= 0 || frase.indexOf("I", i, i+1) >= 0) {
			    contadorI++;
			} else if (frase.indexOf("o", i, i+1) >= 0 || frase.indexOf("O", i, i+1) >= 0) {
			    contadorO++;
			} else if (frase.indexOf("u", i, i+1) >= 0 || frase.indexOf("U", i, i+1) >= 0) {
			    contadorU++;
			}
		}
		//Mostramos las cuentas
		System.out.println("Nº de A's: " + contadorA);
		System.out.println("Nº de E's: " + contadorE);
		System.out.println("Nº de I's: " + contadorI);
		System.out.println("Nº de O's: " + contadorO);
		System.out.println("Nº de U's: " + contadorU);
		
		teclado.close();
	}

}
