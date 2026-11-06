/*
 * Objetivo: calcular las notas medias de laumnos en varias materias.
 * Autor: Diego Martínez
 * Fcha: 23/10/2026
 */
package matrices;

public class Notas {

	public static void main(String[] args) {
		final int NUM_ALUMNOS = 10;
		final int NUM_MATERIAS = 6;
		
		int notas [] [] = new int [NUM_ALUMNOS][NUM_MATERIAS];
		//Asignamos notas aleatorias
		for (int alumno=0; alumno<NUM_ALUMNOS; alumno++) {
			for (int materia=0; materia<NUM_MATERIAS; materia++) {
				notas[alumno][materia] = (int)(Math.random()*10);			
			}
		}
		// Mostramos notas alumnos
		for (int alumno=0; alumno<NUM_ALUMNOS; alumno++) {
			System.out.print("Alumno " + alumno + " : ");
			for (int materia=0; materia<NUM_MATERIAS; materia++) {
				System.out.print(notas[alumno][materia]+ "  ");	
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
		//calculamos la media a cada alumno
		int suma=0;
		for (int alumno=0; alumno<NUM_ALUMNOS; alumno++) {
			suma = 0 ;
			for (int materia=0; materia<NUM_MATERIAS; materia++) {		
				suma = suma + notas[alumno][materia];
			}
			double media = (double)suma / NUM_MATERIAS;
			System.out.println("La media del alumno " + alumno + " es: " + media);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		//Calculamos la media de cada materia
		double mediaMateria;
		int sumaMateria=0;
		for (int alumno=0; alumno<NUM_ALUMNOS; alumno++) {
			for (int materia=0; materia<NUM_MATERIAS; materia++) {
				sumaMateria = 0 ;
				sumaMateria = suma + notas[alumno][materia];
			}
			mediaMateria = (double)sumaMateria / NUM_ALUMNOS;
			System.out.println("La media de la materia es: " + mediaMateria);
		}
		
		
	}

}
