/*
 * Objetivo: Objetivo: Pedir numeros hasta que sea negativo, y hacer la suma de todos los números que sean pares con Dowhile
 */
package bucles;

import java.util.Scanner;

public class SumaParesDoWhile {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		int num1, suma= 0;
		
		do { 
			System.out.println("Dame un numero:");
			num1= teclado.nextInt();
			  if (num1 % 2 ==0 && num1 >0) {
				suma= suma + num1;
			}
		} while (num1 >=0);
			
		System.out.println("la suma es: " + suma);	
		
		teclado.close();
		}
		
	}
