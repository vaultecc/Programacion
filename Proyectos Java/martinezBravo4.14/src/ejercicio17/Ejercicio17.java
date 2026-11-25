/*
 * Objetivo: Pedir números enteros hasta que de introduzca 0 y decir si es primo o no mediante una función
 */
package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {
	//El metodo para saber si hay valores primos
	public static String numPrimo (int x) {
		int contadorDivisores=0;
		String numSiPrimo = "Ese número es primo";
		String numNoPrimo = "Ese número no es primo";
		
		for (int i =1; i<=x ;i++) {
			if (x%i == 0) {
				contadorDivisores++;
			}
		}
		if (contadorDivisores==2) return numSiPrimo;
		else return numNoPrimo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num;
		//Mostramos por pantalla el resultado de la funcion con el número introducido
		do {
			System.out.println("Introduce un número entero (0 para acabar): ");
			num = teclado.nextInt();
			while (num <0) { //Si el número es negativo no es valido
				System.out.println("Ese número no es valido");
				System.out.println("Introduce un número entero valido (0 para acabar): ");
				num = teclado.nextInt();
			}
			System.out.println(numPrimo(num));;
		} while (num !=0);
	}

}
