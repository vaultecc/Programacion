package Ejemplos;

import javax.swing.JOptionPane;

public class ClaseArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String [] paises = {"España","Francia","Alemania","Inglaterra","Holanda","Portugal","Italia"};*/
		
		String []paises = new String [9];
		
		/*paises[0] = "España";
		paises[1] = "Francia";
		paises[2] = "Alemania";
		paises[3] = "Italia";
		paises[4] = "Inglaterra";
		paises[5] = "Holanda";
		paises[6] = "Suiza";
		paises[7] = "Suecia";
		paises[8] = "Noruega";*/
		
		//Rellenamos el array con un bucle for
		for (int i=0; i<paises.length ; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce un pais");
		}
		
		//Por cada elemento (Tipo string) que hay en el array paises
		for (String elemento:paises) {
			System.out.println("País: " + elemento);
		}
	}

}
