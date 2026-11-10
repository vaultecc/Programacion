package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduce tu dirección: ");
		String direccion= teclado.nextLine();
		
		System.out.println("Introduce tu teléfono: ");
		String telefono= teclado.nextLine();
		
		System.out.println("Tus datos son:");
		System.out.println(nombre);
		System.out.println(direccion);
		System.out.println(telefono);
		
		teclado.close();
		
	}

}
