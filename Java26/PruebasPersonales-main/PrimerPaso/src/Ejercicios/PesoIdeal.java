/*
 * Objetivo: Vamos a calcular el peso ideal en base al genero de la persona Hombre/Mujer
 * Autor: Diego Martínez
 * Fecha: 27/10/2026
 */
package Ejercicios;

import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		
		String genero="";
		String Hombre= "H";
		String Mujer= "M";
		int pesoIdealHombre;
		int pesoIdealMujer;
		
		 do {
			  genero = JOptionPane.showInputDialog("Introduce tu género(H/M)");
		 } while (!genero .equalsIgnoreCase(Mujer) && !genero .equalsIgnoreCase(Hombre));
		 
		 int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en centimetros"));
		 
		 if (genero .equalsIgnoreCase(Hombre)) {
			 pesoIdealHombre= altura - 110;
			 System.out.println("Tu peso idea sería: " + pesoIdealHombre + " :O");
		 } else {
			 pesoIdealMujer= altura - 120;
					 System.out.println("Tu peso ideal sería: " + pesoIdealMujer + " :D");
		 }

	}

}
