/*
 * Objetivo: Declarar 3 variables y saber la media de las notas de las 3
 * Completado :)
 */
package Ejercicios;

public class CalculadoraNotas {

	public static void main(String[] args) {
		//Declaración y iniciación de variables
		double nota1= 7.5;
		double nota2=2.0;
		double nota3=10.25;
		
		double media= (nota1 + nota2 + nota3)/3;
		
		//Aquí mostraremos cada nota por separado y la media de las 3
		System.out.println("El resultado de la primera nota es: " + nota1);
		System.out.println("El resultado de la segunda nota es: " + nota2);
		System.out.println("El resultado de la tercera nota es: " + nota3);
		System.out.println("La media de las tres notas da como resultado: " + String.format("%.2f", media));
		
		//Aquí mostraremos si la media de las notas es superior a 5 ha aprobado y si es inferior ha suspendido

		if (media >= 5) {
			System.out.println("Ha aprobado");
		} else {
			System.out.println("Ha suspendido");
		}
		
		
		
		
			

	}

}
