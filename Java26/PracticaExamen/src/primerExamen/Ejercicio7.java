package primerExamen;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int caramelos;
		int kids;
		int reparto;
		int sobra;
		
		System.out.println("Cuantos caramelos hay?");
		caramelos=teclado.nextInt();
		System.out.println("Y cuantos niños son?");
		kids=teclado.nextInt();
		
		if (caramelos <=0 || kids <=0) {
			System.out.println("Datos no válidos");
		} else {
			reparto = caramelos / kids;
			sobra = caramelos%kids;
			System.out.println("Cada niño recibe " + reparto + " caramelos");
			System.out.println("Sobran " + sobra + " caramelos");
		}

	}

}
