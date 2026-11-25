
package segundoExamen;

import java.util.Scanner;

public class Practica1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double notaDeseada;
		
		System.out.println("Introduce la nota del primer examen: ");
		nota1 = teclado.nextDouble();
		System.out.println("Introduce la media deseada: ");
		notaDeseada =teclado.nextDouble();
		
		nota2 = (notaDeseada - (nota1*0.4)) /0.6;
		
		System.out.println("La nota necesaria en el segundo examen : " + nota2);
		
		

	}

}
