//Objetivo: pedir dos valores al usuario, con las variables num1 y num2 e intercambiar los valores de las variables.
package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		int num1= 1, num2= 2;
		System.out.println("Ingresa un número: ");
		num1= teclado.nextInt();
		System.out.println("Ingresa otro número: ");
		num2= teclado.nextInt();
		
		int num3= num1;
		num1= num2;
		num2= num3;
		System.out.println("Los número que has ingresado son: " + num1 + " y " + num2);
		
		teclado.close();

	}

}
