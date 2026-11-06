//Objetivo: Crear un programa de conversión de euros a pesetas y de pesetas a euros
package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		//Aquí hacemos la conversión de euros a pesetas.
		
		double euro;
		System.out.println("Ingresa la cantidad en euros:");
		euro= teclado.nextDouble();
		
		double pesetasAeuro= euro * 166.386;
		System.out.println("Esa cantidad de euros en pesetas son: " + pesetasAeuro);
		
		//Aquí hacemos la conversión de pesetas a euros.
		double pesetas;
		System.out.println("Ingresa la cantidad en pesetas: ");
		pesetas= teclado.nextDouble();
		
		double euroApesetas= pesetas/166.386;
		System.out.println("Esa cantidad en euros son: " + euroApesetas);
		
		teclado.close();
		
	}

}
