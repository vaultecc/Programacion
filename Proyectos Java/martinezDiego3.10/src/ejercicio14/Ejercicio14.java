/*
 * Objetivo: Creamos un array de entero, introducimos una secuencia hasta 10 veces y luego la mostramos por pantalla
 * Autor: Diego Martínez
 * Fecha: 11/11/2026
 */
package ejercicio14;


public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int CANTIDAD= 55;
		int pos=0;//Necesitamos una variable para ir moviendo posiciones del array
		
		int [] miArray= new int [CANTIDAD];
		//El primer bucle es para decir cuantas veces se va a incrementar el array
		for (int i=1; i<=10; i++) {
			//En este bucle almacenamos ese valor en cada posicion del array
			for (int e=0; e<i; e++) {
				miArray[pos]= i;
				pos++;
			}
		}
		
		//Mostramos los datos por pantalla
		for (int i=0; i<miArray.length;i++) {
			System.out.println(miArray[i]);
		}
	}

}
