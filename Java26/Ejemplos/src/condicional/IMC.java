package condicional;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa tu altura:");
		double altura= teclado.nextDouble();
		System.out.println("Ingresa tu peso:");
		double peso= teclado.nextDouble();
		
		double imc= peso/(altura*altura);
		System.out.println(imc);
	
		if (imc <16.0) {
			System.out.println("Ingreso en hospital");
		} else if (imc <17){
			System.out.println("Infrapeso");
		} else if (imc <18) {
			System.out.println("Bajo peso");
		} else if (imc <25) {
			System.out.println("saludable");
		} else if (imc <30) {
			System.out.println("obesidad de grado I");
		} else if (imc <35) {
			System.out.println("obesidad de grado II");
		} else if (imc <40) {
			System.out.println("obesidad de grado III");
		} else {
			System.out.println("obesidad de grado IV");
		}
	}

}
