/*
 * Objetivo: Un programa en el que el usuario introducira una cantidad de euros(multiplo de 5) y se mostraran
 * los billetes necesarios para alcanzar esa cantidad(usando la cantidad mínima de billetes)
 * Autor: Diego Martínez
 * Fecha: 26/10/2026
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaramos las variables
		int numUsuario;
		int billetes;
		int billete5= 5;
		int billete10= 10;
		int billete20= 20;
		int billete50= 50;
		int billete100= 100;
		int billete200= 200;
		int billete500= 500;

		//Pedimos al usuario un número por pantalla
		System.out.println("Introduce una cantidad en euros(multiplo de 5): ");
		numUsuario= teclado.nextInt();
		
		//Calculamos la cantidad de billetes necesarios.
		billetes = numUsuario / billete500;
		numUsuario = numUsuario % billete500;
		System.out.println("Billetes de 500 €: " + billetes);
		
		billetes = numUsuario / billete200;
		numUsuario = numUsuario % billete200;
		System.out.println("Billetes de 200 €: " + billetes);
		
		billetes = numUsuario / billete100;
		numUsuario = numUsuario % billete100;
		System.out.println("Billetes de 100 €: " + billetes);

		billetes = numUsuario / billete50;
		numUsuario = numUsuario % billete50;
		System.out.println("Billetes de 50 €: " + billetes);

		billetes = numUsuario / billete20;
		numUsuario = numUsuario % billete20;
		System.out.println("Billetes de 20 €: " + billetes);
		
		billetes = numUsuario / billete10;
		numUsuario = numUsuario % billete10;
		System.out.println("Billetes de 10 €: " + billetes);
		
		billetes = numUsuario / billete5;
		numUsuario = numUsuario % billete5;
		System.out.println("Billetes de 5 €: " + billetes);
		
		teclado.close();
	}

}
