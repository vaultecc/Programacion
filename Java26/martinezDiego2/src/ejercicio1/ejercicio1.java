//Objetivo: Pediremos los datos al usuario, haremos un calculo de su salario neto y mostraremos la ficha del usuario por pantalla
package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		//Declaramos las variables, le pregunamos al usuario el dato y lo guardamos
		String nombre;
		System.out.println("Ingresa tu nombre: ");
		nombre= teclado.nextLine();
		
		String apellido;
		System.out.println("Ingresa tu apellido: ");
		apellido= teclado.nextLine();
		
		int fechaNacimiento;
		System.out.println("Ingresa tu fecha de nacimiento: ");
		fechaNacimiento= teclado.nextInt();
		
		int salarioBruto;
		System.out.println("Ingresa tu salario bruto: ");
		salarioBruto= teclado.nextInt();
		
		int edadEnLaEmpresa;
		System.out.println("Ingresa los años trabajado en la empresa: ");
		edadEnLaEmpresa= teclado.nextInt();
		
		//Aquí calculamos el aumento de su salario por cada año trabajado, 2% por año.
		
		double aumentoAntiguedad= 0.2;
		double totalAumento= salarioBruto * aumentoAntiguedad;
		double salarioBrutoyAntiguedad= salarioBruto + aumentoAntiguedad;
		
		/*
		 * Calculamos el lo que paga de IRPF y se lo restamos a su salario bruto (Habiendo sumado el extra por antiguedad) para obtener el salario neto sin el extra por antiguedad.
		 * Luego le sumamos al salario neto el extra por antiguedad
		 */
		double irpf= 0.15; 
		
		double totalIRPF= salarioBruto * irpf;
		double salarioNetoSinAntiguedad= salarioBruto - totalIRPF;
		
		double totalSalarioNeto= salarioNetoSinAntiguedad + totalAumento;
		
		
		//Mostramos la ficha al usuario con sus datos
		System.out.println("Estimad@ " + nombre + " " + apellido + ", su salario bruto es " + salarioBruto + ", teniendo en cuenta un IRPF del 15% su salario neto es " + salarioNetoSinAntiguedad + "€.");
		
		System.out.println("Debido a sus " + edadEnLaEmpresa + " años trabajados en la emprea, su salario se incrementara un 2% por año trabajado. El aumento es de " + totalAumento + " y el salario total es " + totalSalarioNeto);
		
		
	}

}
