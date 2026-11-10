/*
 * Objetivo: Crearemos un programa que pida 10 números reales
 * se almacene en un array y muestre la suma de todos los valores.
 * Fecha: 28/10/2026
 * Autor: Diego Martínez
 */
package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] numReal = new double [10];


		//Creamos un bucle para llenar los espacios del array mediante pantalla
		for (int i=0; i<numReal.length; i++) {
			numReal[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
		}

		//Mostramos los datos por pantalla
		for (double total:numReal) {
			System.out.print(total + " ");
		}


	}

}