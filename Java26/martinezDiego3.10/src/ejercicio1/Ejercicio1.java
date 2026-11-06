/*
 * Objetivo: Un programa que pida diez números reales, los alamcene en un array y muestre los valores
 * Fecha: 28/10/2026
 * Autor: Diego Martínez
 */
package ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaramos el array
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
