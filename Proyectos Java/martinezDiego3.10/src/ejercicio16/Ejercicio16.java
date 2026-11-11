/*
 * Objetivo: Creamos un array de entero, introducimos una secuencia hasta 10 veces y luego la mostramos por pantalla utilizando el metodo Arrays.fill
 * Autor: Diego Martínez
 * Fecha: 11/11/2026
 */
package ejercicio16;

import java.util.Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int CANTIDAD= 55;
		int pos=0;
		
		int [] miArray= new int [CANTIDAD];
		
		for (int i=1; i<=10; i++) {
			Arrays.fill(miArray, pos, pos+i, i);//Con este metodo introducimos un valor en la posicion que pongamos hasta la posicion final y decimos que valor introducir
			pos = pos + i;//le sumamos a la posicion el valor por donde vamos
			}
		//recorremos el array mostrando cada posicion 
		for (int i=0; i<miArray.length;i++) {
			System.out.println(miArray[i]);
		}
	}

}
