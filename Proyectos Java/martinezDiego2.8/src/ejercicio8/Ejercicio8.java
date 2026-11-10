/*
 * Objetivo: Tomaremos los datos del usuario, calcularemos los resultados y los mostraremos por pantalla.
 * Autor: Diego Martínez
 * Fecha: 16/10/2026
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		//Declaramos las variables
		String nombre;
		String apellido;
		String ciudad;
		String ciudadMasLarga= "ciudad";
		byte edad;
		int numeroRutas;
		double distanciaUltima;
		double distanciaRutas= 0;
		int numParticipantes;
		double mediaRutas= 0;
		double distanciaMasLarga= 0;
		
		//Pedimos los datos por pantalla
		System.out.println("Introduce tu nombre");
		nombre= teclado.nextLine();
		System.out.println("Introduce tu apellido");
		apellido= teclado.nextLine();
		System.out.println("Introduce tu edad");
		edad= teclado.nextByte();
		while (edad <=17 || edad >=45) {//En el caso de ser menor de 17 o mayor a 45 mostrar edad incorrecta y pedir la edad de nuevo
			System.out.println("Esa edad no es correcta");
			System.out.println("Introduce tu edad");
			edad= teclado.nextByte();
		}
		System.out.println("Introduce el número de rutas realizadas");
		numeroRutas= teclado.nextInt();
		System.out.println("Introduce la distancia de la ultima ruta (en km)");
		distanciaUltima= teclado.nextDouble();
		
		//Aquí creamos un bucle que se repita 5 y pida los datos al usuario
		for (int i= 0; i<5; i++) {
			System.out.println("Registro de 5 rutas");
			System.out.println("-----------------------");
			System.out.println("Introduce la distancia");
			distanciaRutas= teclado.nextDouble();
			mediaRutas= mediaRutas+distanciaRutas;
			System.out.println("Introduce el número de participantes");
			numParticipantes= teclado.nextInt();
			teclado.nextLine();
			System.out.println("Introduce la ciudad");
			ciudad= teclado.nextLine();
			if (distanciaRutas > distanciaMasLarga) {//Definimos que cual es la distancia más larga y se la asignamos a una ciudad
				ciudadMasLarga = ciudad;
				distanciaMasLarga= distanciaRutas;
			}
		}

		//Mostramos los datos por pantalla
		System.out.println("----------------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Número de rutas realizadas: " + numeroRutas);
		System.out.println("");
		System.out.println("Distancia media (5 últimas rutas): " + mediaRutas/5);
		System.out.println("La distancia más larga de las últimas 5 rutas: " + distanciaMasLarga);
		System.out.println("La ciudad con la ruta más larga es: " + ciudadMasLarga);
		System.out.println("----------------------");
		
		teclado.close();
	}

}
