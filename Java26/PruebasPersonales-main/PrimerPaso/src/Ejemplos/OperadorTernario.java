package Ejemplos;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		int edad= teclado.nextInt();
		
		/*if (edad>18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor");
		}*/
		
		String resultado=(edad>18)? "Eres mayor de edad":"Eres menor de edad";
		
		System.out.println(resultado);
	}

}
