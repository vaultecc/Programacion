package calculosSimples;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce la base del rectangulo: ");
		double base= teclado.nextDouble();
		
		System.out.println("Introduce la altura del rectangulo: ");
		double altura= teclado.nextDouble();
		
		double area= base * altura;
		System.out.println("El area del rectangulo es: " + area);
	}

}
