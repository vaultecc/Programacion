package operaciones;

import java.util.Scanner;

public class operacionesMatematicas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int num1;
		System.out.println("dame un número: ");
		num1= teclado.nextInt();
		
		double raizCuadrada= Math.sqrt(num1);
		System.out.println("La raiz cuadrada de ese número es: " + raizCuadrada);

	}

}
