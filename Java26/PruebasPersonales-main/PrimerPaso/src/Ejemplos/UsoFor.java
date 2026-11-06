package Ejemplos;

import javax.swing.JOptionPane;

public class UsoFor {

	public static void main(String[] args) {
		
		String correo =JOptionPane.showInputDialog("Introduce tu correo: ");
				
		int longitud= correo.length();
		int arroba=0;
		boolean punto= false;
		
		for (int i=0; i<longitud; i++) {
			
			if (correo.charAt(i)=='@') {
				arroba++;
			}
			if (correo.charAt(i)=='.') {
				punto=true;
			}
		}
		
		if (arroba==1 && punto==true) {
			System.out.println("mail correcto");
		} else {
			System.out.println("mail incorrecto");
		}

	}

}
