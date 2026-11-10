/*
 * Objetivo: Un programa que pida al usuario sus datos salariales
 * con ello calcularemos su suedlo base, complementos y retenciones
 * Autor: Diego Martínez
 * Fecha: 29/10/2026
 */
package Martinez;

import java.util.Scanner;

public class Diego1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//Declaramos e inicializamos variables
		String nombre;
		int complementoTransporte;
		boolean transporte = false;
		int sueldoBase;
		int antiguedad;
		int irpf=0;
		int extraAntiguedad=0;
		int sueldoBruto=0;
		int ExtraTransporte= 0;
		int totalImpuestos;
		int sueldoNeto;
		
		//Pedimos los datos por pantalla
		System.out.println("Introduce tus datos");
		System.out.println("Nombre: ");
		nombre=teclado.nextLine();
		System.out.println("Sueldo Base: ");
		sueldoBase=teclado.nextInt();
		while (sueldoBase<=0) {//Si el sueldo base es menor o igual a 0 damos error y volvemos a preguntar
			System.out.println("Error");
			System.out.println("Sueldo Base: ");
			sueldoBase=teclado.nextInt();
		}
		System.out.println("Tiene concedido el complemento por transporte(1=Si 2=No)?");
		complementoTransporte=teclado.nextInt();
		if (complementoTransporte==1) {//En el caso de tener el complemento de transporte lo confirmamos
			transporte=true;
		}
		System.out.println("Antiguedad(En años)");
		antiguedad=teclado.nextInt();
		
		if (transporte==true) {
			ExtraTransporte=100;
		}
		
		if (antiguedad>=3) {//Comprobamos si tiene extra por antiguedad
			extraAntiguedad = (sueldoBase/100) *2;
			
		}
		//Calculamos el irpf
		if (sueldoBase<1000) {
			irpf = 10;
		} else if (sueldoBase>=1000 || sueldoBase<=2000) {
			irpf = 15;
		} else {
			irpf = 20;
	
		}
		
		//Calculamos el sueldo bruto/neto e impuestos
		sueldoBruto= sueldoBase + extraAntiguedad + ExtraTransporte;
		totalImpuestos= (sueldoBruto*irpf) /100;
		sueldoNeto= sueldoBruto-totalImpuestos;
		
		//Mostramos los datos por pantalla
		System.out.println("---RESUME DE NÓMINA---");
		System.out.println("Nombre: " + nombre);
		System.out.println("Sueldo Base: " + sueldoBase + "€");
		System.out.println("Complemento Transporte: " + ExtraTransporte+ "€");
		System.out.println("Complemento Antriguedad: " + extraAntiguedad+ "€");
		System.out.println("Sueldo Bruto: " + sueldoBruto+ "€");
		System.out.println("Porcentaje IRPF aplicado: " + irpf + "%");
		System.out.println("Total impuestos: " + totalImpuestos+ "€");
		System.out.println("Sueldo neto: " + sueldoNeto+ "€");
	}

}
