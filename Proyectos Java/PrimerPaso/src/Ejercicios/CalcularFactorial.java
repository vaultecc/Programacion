/*
 * Objetivo: Sacaremos el factorial del número introducido por pantalla
 */
package Ejercicios;

import javax.swing.JOptionPane;

public class CalcularFactorial {

	public static void main(String[] args) {
	
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		int factorial= 1;
		
		for (int i=1; i<numUsuario; i++) {
			factorial= factorial*i;
		}
		
		System.out.println("El factorial de ese número es " + factorial);

	}

}
