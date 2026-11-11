/*
 * Objetivo:  Creamos un array de tamaño 1000 y lo llenamos con valores aleatorios entre 0 y 99, luego pedira un valor por teclado y mostrara si ese valor existe en el array y cuantas veces.
 * Autor: Diego Martínez
 * Fecha: 11/11/2026
 */
package ejercicio20;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		final int CANTIDAD= 1000;
		int N;
		int contador=0;
		
		int [] miArray= new int [CANTIDAD];
		//Llenamos el array
		for (int i= 0; i<miArray.length; i++) {
			miArray[i]= (int)(Math.random()*100);
		}
		//Pedimos el valor a comparar si esta en el array
		System.out.println("Introduce un valor");
		N=teclado.nextInt();
		
		//Recorremos el array y comprobamos si ese valor esta, y contamos las veces
		for (int i= 0; i<miArray.length; i++) {
			
			if (miArray[i]==N) {
				contador++;
			}
		}
		
		if (contador >=1) {
			System.out.println(N + " Existe en el array, una cantidad de " +  contador + " veces");
		} else System.out.println("No se repite");
		
		teclado.close();
	}

}
