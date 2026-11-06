package condicional;

import java.util.Scanner;

public class PositivoOnegativo {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Dame un número: ");
		int num1= teclado.nextInt();
		
		if (num1 >0)  { //positivo y negativo
			System.out.println("Tu numero es positivo");
		} else if (num1 == 0) { //Tu numero es neutro
			System.out.println("Tu numero es neutro");
		} else {
			System.out.println("Tu número es negativo");
		}
		
		if (num1 % 2 == 0) { //par e impar
			System.out.println("Tu número par ");
		} else {
			System.out.println("Tu número es impar");
		}
		
	}

}
