package condicional;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Dime tu nota");
		int nota= teclado.nextInt();
		
		if (nota >=1 && nota <=10) {
			  if (nota >= 5) {
				System.out.println("Estas aprobado");
			} else { 
				System.out.println("No estas aprobado");
			}
			
			} else {
				System.out.println("La nota no es valida");
			}
		
		if (nota <5) {
			System.out.println("INSUFICIENTE");
		} else {
			if (nota <6) {
				System.out.println("suficiente");
			} else {
				if(nota <7) {
					System.out.println("bien");
				} else {
					if(nota<9) {
						System.out.println("notable");
					} else {
						if (nota <10 || nota ==10) {
							System.out.println("sobresaliente");
						}
					}
				}
			}
		}


		}
		
		
	}

