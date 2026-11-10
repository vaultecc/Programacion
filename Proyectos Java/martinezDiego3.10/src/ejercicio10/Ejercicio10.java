/*
 * Objetivo: Creamos un array para calcular la media,max,min, superiores e inferiores a la media de las altutas introducidas
 * Autor: Diego Martínez
 * Fecha: 09/11/2026
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//Declaramos e inicializamos variables y y array
		final int N;
		double media;
		double totalAlturas=0;
		int superiorMedia=0;
		int inferiorMedia=0;
		double alturaMin=0;
		double alturaMax=0;

		System.out.println("Introduce el número de personas");
		 N= teclado.nextInt();
		
		double [] altura = new double[N];
		//Recorremos el array y calculamos la media,max,min y superiores e inferiores a la media y mostramos la información
		for (int i = 0; i<altura.length; i++) {
			System.out.println("Introduce tu altura en metros");
			altura[i]= teclado.nextDouble();
			
			if (i == 0) {//Volvemos a inicializar las variables en el blucle para llenarlas con el primer valor
				 alturaMax= altura[i];
				 alturaMin= altura[i];
			} else {
			if (altura[i] > alturaMax) alturaMax = altura[i];
			
			if (altura[i] < alturaMin) alturaMin = altura[i];
			}
			
			totalAlturas= totalAlturas + altura [i];

		}
		
		media = totalAlturas / N;
		
		for (int i=0; i<altura.length; i++) {
			if (altura[i] > media) superiorMedia++;
			
			if (altura[i] < media) inferiorMedia++;
		}
		 
		System.out.println("La altura media es: " + media + " metros");
		System.out.println("La altura maxima es de "	+ alturaMax + " metros, y la mínima de " + alturaMin + " metros");
		System.out.println("Personas superiores a la media: " + superiorMedia);
		System.out.println("Personas inferiores a la media:  " + inferiorMedia);
		 teclado.close();
	}

}
