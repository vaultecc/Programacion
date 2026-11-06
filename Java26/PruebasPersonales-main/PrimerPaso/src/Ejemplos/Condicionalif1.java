package Ejemplos;

import java.util.Scanner;

public class Condicionalif1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Introduce tu edad");
		int edad= teclado.nextInt();
		
		if (edad >=18 && edad <150) {
			System.out.println("Eres mayor de edad");
		} else if (edad <18 && edad >0) {
			System.out.println("Eres menor de edad");
		} else {
			System.out.println("Esa edad es imposible");
		}
		teclado.close();
	} 

}
