package pruebas;

import java.util.Scanner;

public class pruebas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inserta un número: ");
		int num1= teclado.nextInt();
		
		System.out.println("Inserta otro numero: ");
		int num2= teclado.nextInt();
		
		int resultado= num1%num2;
		
		System.out.println("Tu resultado da: " + resultado);
		
		

	}

}
