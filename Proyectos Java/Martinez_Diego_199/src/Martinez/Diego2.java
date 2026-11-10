/*
 * Objetivo:Calcular los multiplos de 7 y 13 entre 2 números introducidos por el usuario
 * Autor: Diego Martínez
 * Fecha:29/10/2026
 */
package Martinez;

import java.util.Scanner;

public class Diego2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int n;
		int m;
		int numMayor=0;
		
		System.out.println("Introduce un número: ");
		n=teclado.nextInt();
		System.out.println("Introduce otro número: ");
		m=teclado.nextInt();
		
		if (n>m) {
			numMayor=n;
		} else if (n<m) {
			numMayor=m;
		}
		
		for (int i=0; i<numMayor; i++) {
			if (i % n == 7 ||  i % n == 13) {
				System.out.println("Multiplos entre " + n + " " + i);
			}
			if (i % m == 7 || i % m == 13) {
				System.out.println("Multiplos entre " + m + " " + i);
			}
		}
	}

}
