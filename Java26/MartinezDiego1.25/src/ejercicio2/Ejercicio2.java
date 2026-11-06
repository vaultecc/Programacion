package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		String direccion;
		String nombre;
		String telefono;
		
		
		System.out.println("Introduce tu nombre: ");
		nombre=teclado.nextLine();
		System.out.println("Introduce tu direccion: ");
		direccion= teclado.nextLine();
		System.out.println("Introduce tu número de teléfono: ");
		telefono= teclado.nextLine();
		
		System.out.println("Bienvenido al sistema");
		System.out.println("Has iniciado sesión con el usuario: " + nombre);
		System.out.println("Según tus da");
		

	}

}
