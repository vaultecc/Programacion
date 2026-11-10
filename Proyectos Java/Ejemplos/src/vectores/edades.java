/*
 * Objetivos: guarda edades en un vector y calcula la media.
 * Autor: diego
 * Fecha: 15/10/2026
 */
package vectores;

import java.util.Scanner;

public class edades {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		int edadusuario= 0;
		final int TAMANYO = 50;
		int contador= 0;
		int suma = 0;
		double media;
		int edad []; //Declaración
		edad = new int [TAMANYO]; //Instanciación
		
		for (int i=0; i<edad.length; i++) {
			edad[i] = (int)(Math.random()*50);
		}
		
		for (int i=0; i<edad.length; i++) {
			System.out.println(" En la posición" + i + " la edad es " + edad[i]);
					suma = suma + edad[i];
		}
		media = (double) suma / edad.length;
		System.out.println("La media de edad es " + media);

		for (int i=0; i<edad.length; i++) {
			if (edad[i]<media) {
				System.out.println(" En la posición" + i + " la edad es " + edad[i]);
				contador++;
			}
		}
		
		System.out.println("La cantidad de edades superiores a la media es " + contador);
		
		//Posicion que ocupa la edad pedida del usuario
		System.out.println("Introduce tu edad:");
		edadusuario= teclado.nextInt();
		int posicion = 0;
		boolean edadEncontrada = false;
		do {
			if (edad[posicion] == edadusuario) {
				edadEncontrada = true;
			}
			posicion++;
		} while (posicion<edad.length && edadEncontrada == false);
		
		if (edadEncontrada == true) {
			System.out.println("La edad buscada se encuentra en la posicio: " + (posicion-1));
		} else {
			System.out.println("No existe");
		}
		
	}

}
