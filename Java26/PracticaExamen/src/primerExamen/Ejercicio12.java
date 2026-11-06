package primerExamen;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		String nombre;
		String apellidos;
		String ciudad=".";
		String ciudadConMasDistancia= "";
		int edad;
		int rutasRealizadas;
		double distanciaUltima;
		double distanciaCaminata;
		int numParticipantes;
		double distancia5UltimasRutas=0;
		double mediaUltimas5rutas=0;
		double distanciaMasLarga=0;
		
		
		System.out.println("Introduce tus datos:");
		System.out.println("--------------------");
		System.out.println("Nombre:");
		nombre=teclado.nextLine();
		System.out.println("Apellidos:");
		apellidos=teclado.nextLine();
		System.out.println("Edad:");
		edad= teclado.nextInt();
		while (edad <=17 || edad >=45) {
			System.out.println("Esa edad no es correcta");
			System.out.println("Edad:");
			edad= teclado.nextInt();
		}
		System.out.println("Número de rutas realizadas:");
		rutasRealizadas= teclado.nextInt();
		System.out.println("Distancia ultima ruta:");
		distanciaUltima=teclado.nextDouble();
		
		for (int i=0; i<5;i++) {
			System.out.println("Datos ultimas 5 caminatas:");
			
			System.out.println("Distancia:");
			distanciaCaminata=teclado.nextDouble();
			distancia5UltimasRutas= distanciaCaminata + distancia5UltimasRutas;
			if (distanciaCaminata>distanciaMasLarga) distanciaMasLarga=distanciaCaminata;
			
			System.out.println("Número de participantes:");
			numParticipantes=teclado.nextInt();
			teclado.nextLine();
			
			System.out.println("Ciudad:");
			ciudad=teclado.nextLine();
			if (distanciaCaminata==distanciaMasLarga) ciudadConMasDistancia=ciudad;
		}
		
		mediaUltimas5rutas= distancia5UltimasRutas/5;
		
		System.out.println("-------------------------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Número de rutas realizadas: " + rutasRealizadas);
		System.out.println("Distancia media(5 Últimas rutas): " + mediaUltimas5rutas);
		System.out.println("Distancia más larga de las últimas 5 rutas: " + distanciaMasLarga + "km");
		System.out.println("Ciudad de la ruta más larga: " + ciudadConMasDistancia );
		System.out.println("-------------------------------");

	}

}
