package segundoExamen;

import java.util.Scanner;

public class Practica5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String frase;
		int contadorA=0;
		int contadorE=0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		
		System.out.println("Introduce una frase");
		frase = teclado.nextLine();
		
		for (int j=0; j<=frase.length()-1;j++) {
			if (frase.indexOf("a", j, j+1) >0) {
				contadorA++;
			}
		}
	
		System.out.println(contadorA);
	}

}
