/*
 * Objetivo: El usuario introducira un número multiplo de 5 y mostraremos los billetes necesarios
 * Autor: Diego Martínez
 * Fecha:29/10/2026
 */
package primerExamen;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		int numUsuario;
		int billetes;
		int billete500= 500;
		int billete200= 200;
		int billete100= 100;
		int billete50= 50;
		int billete20= 20;
		int billete10= 10;
		int billete5= 5;
		
		System.out.println("Introduce una candidad de euros (Multiplo de 5): ");
		numUsuario = teclado.nextInt();
		
		billetes= numUsuario/billete500;
		numUsuario= numUsuario%billete500;
		if (billetes>=1) System.out.println(billetes + " de 500");
		
		billetes= numUsuario/billete200;
		numUsuario= numUsuario%billete200;
		if (billetes>=1) System.out.println(billetes + " de 200");
		
		billetes= numUsuario/billete100;
		numUsuario= numUsuario%billete100;
		if (billetes>=1) System.out.println(billetes + " de 100");
		
		billetes= numUsuario/billete50;
		numUsuario= numUsuario%billete50;
		if (billetes>=1) System.out.println(billetes + " de 50");
		
		billetes= numUsuario/billete20;
		numUsuario= numUsuario%billete20;
		if (billetes>=1) System.out.println(billetes + " de 20");
		
		billetes= numUsuario/billete10;
		numUsuario= numUsuario%billete10;
		if (billetes>=1) System.out.println(billetes + " de 10");
		
		billetes= numUsuario/billete5;
		numUsuario= numUsuario%billete5;
		if (billetes>=1) System.out.println(billetes + " de 5");
		
		
		
	}

}
