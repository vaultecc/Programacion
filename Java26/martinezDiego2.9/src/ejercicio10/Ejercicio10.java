/*
 * Objetivo: Leeremos unas notas por teclado hasta introducir -1 y mostramos sy alguna tiene valor 10
 * Fecha:22/10/2026
 * Atuor: Diego Martínez
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int notas=0;
		boolean sobresaliente=false;
		
		do {
			System.out.println("Introduce tu nota (Introduce -1 para terminar): ");
		    notas = teclado.nextInt();
		    
		    if (notas >10 || (notas <0 && notas !=-1)) {
		    	System.out.println("Nota no valida");
		    }
		    if (notas ==10) {
		    	sobresaliente=true;
		    }
		} while (notas !=-1);
		
		if (sobresaliente == true) System.out.println("Enhorabuena has sacado un sobresaliente");
		else System.out.println("No hubo ningun 10");
		
		teclado.close();
		
	}

}
