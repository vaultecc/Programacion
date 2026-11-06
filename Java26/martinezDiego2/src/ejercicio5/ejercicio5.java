//Objetivo: Pedir dos números al usuario y hacer calculos.
package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingresa un número:");
		int num1= teclado.nextInt();
		System.out.println("Ingresa otro número:");
		int num2= teclado.nextInt();
		
		int menor= Math.min(num1, num2);
		System.out.println("El menor número de los dos es: " + menor);

		double elevado= Math.pow(num1, num2);
		System.out.println("El primer número elevado al segundo da: " + elevado);
		
		double raizCuadrada= Math.sqrt(num1);
		System.out.println("La raiz cuadrada del primer número es: " + raizCuadrada);
		
		double random= Math.random() * num2;
		System.out.println("Un valor random de tu segundo número es: " + random);
		
		teclado.close();
	}

}
