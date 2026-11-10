package operaciones;

import java.util.Scanner;

public class MayorIgual {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int num1;
		System.out.println("Ingresa un número: ");
		num1= teclado.nextInt();
		
		int num2;
		System.out.println("Ahora ingresa otro número: ");
		num2= teclado.nextInt();
		
		boolean mayorIgual= num1 > num2;
		System.out.println("El primer numero es mayor o igual que el primero? " + mayorIgual); 
		
		boolean igual= num1 == num2;
		System.out.println("El primer numero es igual que el primero? " + igual); 
		
		// TODO Auto-generated method stub

	}

}
