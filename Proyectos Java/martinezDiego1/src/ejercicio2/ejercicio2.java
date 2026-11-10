//Objetivo: Solicitar al usuario datos sobre un equipo de futbol haciendo uso de las variables
package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Aqui asignamos y declaramos las variables, y preguntamos al usuario los datos
		String equipo;
		System.out.println("Ingresa el nombre del equipo: ");
		equipo = teclado.nextLine();

		int edadfundacion;
		System.out.println("Introduce el año de fundación");
		edadfundacion = teclado.nextInt();
		teclado.nextLine();

		String estadio;
		System.out.println("Ingresa el nombre del estadio: ");
		estadio = teclado.nextLine();

		String capitan;
		System.out.println("Introduce el nombre del capitán: ");
		capitan = teclado.nextLine();

		//Aqui mostramos todos los datos
		System.out.println("**********************************************");
		System.out.println("******* Nombre del Equipo: " + equipo + " *******");
		System.out.println("******* Fundado en: " + edadfundacion + " *******");
		System.out.println("******* Estadio: " + estadio + " *******");
		System.out.println("******* Capitán: " + capitan + " *******");

		teclado.close();
	}
}