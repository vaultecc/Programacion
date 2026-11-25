package Ejemplos;

import java.util.Scanner;

public class UsoSwitch2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un día de la semana");
		
		String diaSemana=teclado.nextLine();
		
		String resultado=switch(diaSemana) {
		
		case "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"->"Laborable";
		
		case "Sabado", "Domingo"->"Festivo";
		
		default-> "Día no valido";
		
		};
		
		System.out.println(resultado);
		teclado.close();

	}

}
