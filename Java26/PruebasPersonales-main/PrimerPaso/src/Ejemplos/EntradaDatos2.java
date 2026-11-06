package Ejemplos;

import javax.swing.JOptionPane;

public class EntradaDatos2 {

	public static void main(String[] args) {
		
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre pls");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
		
		double salario=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu salario"));
		
		System.out.println("Te llamas " + nombreUsuario + " y el proximo año tendras " + (edad+1) + 
				" años, y tu salario es de " + salario + " €");

	}

}
