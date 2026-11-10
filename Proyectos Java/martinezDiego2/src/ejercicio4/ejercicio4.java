//Objetivo: Pediremos al usuario un valor, almacenaremos los datos en una variable tipo double y aplicaremos funciones math
package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		//Aquí obtenemos el número con el cual vamos a realizar el ejercicio
		double num1;
		System.out.println("Ingresa un número: ");
		num1= teclado.nextDouble();
		
		//Aquí redondeamos el número siempre hacia arriba
		double ceil= Math.ceil(num1);
		System.out.println("Tu número aproximado hacia arriba: " + ceil);
		//Aquí redondeamos siempre hacia abajo
		double floor= Math.floor(num1);
		System.out.println("Tu número aproximado hacia abajo: " + floor);
		//Y aquí realizamos una aproximación estandar, desde 5 para arriba hacia el número alto y de 4 para abajo hacia el númeor bajo
		long round= Math.round(num1);
		System.out.println("Tu número con una aproximación estandar es: " + round);
		
		teclado.close();
	}

}
