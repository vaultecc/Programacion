package operaciones;

import java.util.Scanner;

public class MayorMenorEdad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu edad; ");
		byte edad= teclado.nextByte();
		
		String resultado;
		resultado = (edad<18)? "Eres menor de edad":"Eres mayor de edad";
		System.out.println(resultado);

   }
	
}
