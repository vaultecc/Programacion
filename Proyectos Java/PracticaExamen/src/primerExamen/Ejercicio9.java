package primerExamen;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int numUsuario;
		int centenas;
		int decenas;
		int unidades;
		
		System.out.println("Introduce un número entero de 3 cifras, entre 100/999: ");
		numUsuario=teclado.nextInt();
		
		if (numUsuario<100 || numUsuario>999) {
			System.out.println("Número no válido, esto a claude no le gusta");
		} else {
			centenas= numUsuario/100;
			numUsuario= numUsuario%100;
			System.out.println(centenas);
			decenas = numUsuario/10;
			System.out.println(decenas);
			unidades= numUsuario%10;
			System.out.println(unidades);
			
		}

	}

}
