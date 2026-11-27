package fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		/*
		LocalDate fecha1;
		//Opcion 1: Generar objetos a partir de datos int
		System.out.println("Introduce año");
		int year =teclado.nextInt();
		System.out.println("introduce el mes");
		int mes= teclado.nextInt();
		System.out.println("Introduce el día");
		int dia = teclado.nextInt();
		
		fecha1 = LocalDate.of(year, mes, dia);
		System.out.println(fecha1);*/
		//Opción 2: Generar objtos a partir de string
		LocalDate fecha2;
		System.out.println("Introduce tu fecha de nacimiento(aaaa-mm-dd)");
		String cadena = teclado.nextLine();
		
		fecha2 = LocalDate.parse(cadena);
		System.out.println(fecha2);
		
		LocalDate fecha3;
		fecha3 = fecha2.plusMonths(3);
		System.out.println(fecha3);
		
		LocalDate fechahoy = LocalDate.now();
		System.out.println(fechahoy);
		
		
		DayOfWeek diasTotales = fecha2.getDayOfWeek();
		System.out.println(diasTotales);
		
		LocalTime hora1;
		System.out.println("dame una hora");
		int hora = teclado.nextInt();
		System.out.println("Dame unos minutos");
		int minutos = teclado.nextInt();
		
		hora1 = LocalTime.of(hora, minutos);
		System.out.println(hora1);
		
	}

}
