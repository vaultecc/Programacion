package Ejemplos;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Podrias introducir tu edad?: ");
		byte edad = teclado.nextByte(); teclado.nextLine();
		
		
		System.out.println("Introduce tu nombre pls: ");
		String nombre_usuario = teclado.nextLine(); 
		
		
		System.out.println("Tu nombre es: " + nombre_usuario + " :D");
		System.out.println("Y tu edad sería: " + edad + " añitos");
		
		teclado.close();

	}

}
