package primerExamen;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double nota;
		int contador=0;
		
		do {
			System.out.println("Introduce una nota del 0 al 10");
			nota = teclado.nextDouble();
			
			if (nota <0 || nota >10) System.out.println("Nota no valida");
			else if (nota == 10) contador++;
			
		} while (nota!= -1);
		
		if (contador>=1) System.out.println("Has tenido uno o más dieces!!");
		else System.out.println("No hubo ningún diez :/");
		
		teclado.close();

	}

}
