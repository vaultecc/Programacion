package pruebas;

import java.util.Scanner;

public class buclefor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int inicio, fin;
		
		System.out.println("inicio");
		inicio= teclado.nextInt();
		System.out.println("fin");
		fin=teclado.nextInt();
		
		for (int i=inicio; i<=fin; i++) {
			System.out.println("Probando" + i + " ");
			if ( i % 3 == 0) {
				System.out.println("/n" + i + " es multiplo");
			}
		}


	}

}
