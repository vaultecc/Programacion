package condicional;

import java.util.Scanner;

public class DiasSemana {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa un número del día de la semana 1/7:");
		int dia= teclado.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("viernes");
			break;
		case 6:
			System.out.println("sabado");
			break;
		case 7:
			System.out.println("domingo");
			break;
		default:
			System.out.println("día no valido");
		}
		
		teclado.close();
	}

}
