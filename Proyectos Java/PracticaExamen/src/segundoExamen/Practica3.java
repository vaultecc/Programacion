package segundoExamen;

import java.util.Scanner;

public class Practica3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		final int NUMEROPERSONAS;
		int genero;
		double sueldo;
		double mediaVaron, mediaMujer;
		double sumaVaron=0;
		double  sumaMujer=0;
		int numH=0;
		int numM=0;
		
		System.out.println("Introduce el número de personas:");
		NUMEROPERSONAS =teclado.nextInt();
		
		double [][] sueldoMedio = new double [NUMEROPERSONAS][NUMEROPERSONAS];
		
		for (int i=0; i<NUMEROPERSONAS; i++) {
			System.out.println("Introduce tu genero (0 varón 1 mujer) ");
			genero = teclado.nextInt();
			sueldoMedio[i][0] = genero;
				System.out.println("Introduce tu sueldo");
				sueldo = teclado.nextDouble();
				sueldoMedio[i][i] = sueldo;
				if (sueldoMedio[i][0] == 0) {
					sumaVaron+= sueldo;
					numH++;
				} else if (sueldoMedio[i][0] == 1) {
					sumaMujer += sueldo;
					numM++;
				}
			}

		
		mediaMujer = sumaMujer / numM;
		mediaVaron = sumaVaron / numH;
		
		System.out.println("el sueldo medio de los hombres es: " + mediaVaron + "€");
		System.out.println("el sueldo medio de las mujeres es: " + mediaMujer + "€");
		
	}

}
