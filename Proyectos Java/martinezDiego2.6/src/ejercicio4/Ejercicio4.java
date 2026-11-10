/*
 * Objetivo: Solicitaremos los datos a los clientes para llevar un control de sus compras
 * Autor: Diego Martinez
 * Fecha:07/10/2026
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		//Aquí solicitamos los datos
		System.out.println("Ingresa tu nombre: ");
		String nombre= teclado.nextLine();
		System.out.println("Ingresa tu apellido: ");
		String apellido= teclado.nextLine();
		System.out.println("Total importe primera compra: ");
		double importeGastado1= teclado.nextDouble();
		System.out.println("Total importe segunda compra: ");
		double importeGastado2= teclado.nextDouble();
		System.out.println("Total importe tercera compra: ");
		double importeGastado3= teclado.nextDouble();
		System.out.println("Total importe cuarta compra: ");
		double importeGastado4= teclado.nextDouble();
		
		double totalImportes= importeGastado1 + importeGastado2 + importeGastado3 + importeGastado4;
		double mediaTotal= totalImportes / 4;
		
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellido);
		System.out.println("Primer importe: " + importeGastado1 + " euros");
		System.out.println("Segundo importe: " + importeGastado2 + " euros");
		System.out.println("Tercer importe: " + importeGastado3 + " euros");
		System.out.println("Cuarto importe: " + importeGastado4 + " euros");
		System.out.println("Importe medio: " + mediaTotal + " euros");
		
		
		
		
		
		//Aquí mostramos la información y ofrecemos el descuento si cumple las condiciones.
		if (totalImportes >=300) {
			
			System.out.println("Enhorabuena has alcanzado los 300 euros en compras este mes, dispone de un descuento de 50 euros en tu siguiente compra.");
		} else {
			
			System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de descuento.");
			
		}
		
		teclado.close();
		
	}

}
