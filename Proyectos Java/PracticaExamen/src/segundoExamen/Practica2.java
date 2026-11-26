package segundoExamen;

import java.util.Scanner;

public class Practica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		final int ALUMNOS=4;
		final int ASIGNATURAS=5;
		double notaMin, notaMax, notaMedia;
		double suma;
		
		String [] nombres = {"Alumno 1", "Alumno 2", "Alumno 3", "Alumno 4"};
		double [][] notas = new double [ALUMNOS][ASIGNATURAS];
		
		for (int i=0; i<ALUMNOS; i++) {
			for (int j=0; j<ASIGNATURAS; j++) {
				//System.out.println(nombres[i] + " Introduce tu nota " + (j+1) + ":");
				//notas[i][j]= teclado.nextDouble();
				notas[i][j]= (Math.random()*9)+1;
				notas[i][j]=Math.round(notas[i][j]*10.0) /10.0;
			}
		}
		

		for (int i=0; i<ALUMNOS; i++) {
			suma=0;
			notaMin= notas[i][0];
			notaMax= notas[i][0];
			for (int j=0; j<ASIGNATURAS; j++) {
				if (notaMax<notas[i][j]) notaMax = notas[i][j];
				if (notaMin>notas[i][j]) notaMin= notas[i][j];
				suma+= notas[i][j];
			}
			notaMedia = suma / ASIGNATURAS;
			notaMedia = Math.round(notaMedia*10.0)/10.0;
			System.out.println();
			System.out.println("La nota maxima del " + nombres[i] + " es " + notaMax);
			System.out.println("La nota minima del " + nombres[i] + " es " + notaMin);
			System.out.println("Y su nota média es: " +  notaMedia);
		}

	}

}
