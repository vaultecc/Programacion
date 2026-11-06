package misPruebas;

import java.util.Scanner;

public class MisPruebas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opcion;
		double dineroCuenta = 1000;
		double retiro;
		String usuario;
		
		System.out.println("Bienvenido, introduzca su usuario:");
		usuario = teclado.next();
		
		System.out.println("Hola de nuevo " + usuario);
		System.out.println("Selecciona la opción a realizar:");
		System.out.println("-----------------------------------");
		System.out.println("1. Ver cantidad en la cuenta");
		System.out.println("2. Retirar dinero");
		System.out.println("3. Ingresar dinero");
		System.out.println("4. salir");
		opcion = teclado.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println(dineroCuenta + "€");
			break;
		case 2:
			System.out.println("Ingrese la cantidad a retirar");
			retiro = teclado.nextDouble();
			if (retiro > dineroCuenta) {
				System.out.println("Cantidad ingresada no válida");
			} else {	
				dineroCuenta = dineroCuenta - retiro;
				System.out.println("Retiro realizado con exito, la cantidad actual de la cuenta es: " + dineroCuenta);
			}

		}
		
		
		

	}

}
