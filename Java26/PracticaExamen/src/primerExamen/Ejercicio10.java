package primerExamen;

import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numUsuario;
		int contador=0;
		boolean valido= false;
		
		System.out.println("Introduce un número entero:");
		numUsuario=teclado.nextInt();
		
		if (numUsuario <=0) {
			System.out.println("Número invalido");
			valido= true;
			
		} else {
			for (int i=1; i<=numUsuario;i++) {
				if (i % 3 == 0 &&  i % 5 != 0 || i % 5 == 0 && i % 3 != 0) {
						System.out.println(i);
						contador++;
				}
			}
		}
		if (valido==false)System.out.println("Total: " + contador);
		
		teclado.close();
	}
}
