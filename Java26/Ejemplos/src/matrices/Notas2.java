package matrices;

public class Notas2 {

	public static void main(String[] args) {
		final int NUM_ALUMNOS = 10;
		final int NUM_MATERIAS = 6;
		String[] nombreAlumnos = {"Pepe", "Pedro", "Pablo", "María", "Ruben", "Carlos", "Juan",
				"Diego", "Marcos", "Estefania"};
		
		String[] nombreMateria = {"Programacion", "Lenguaje de marcas" , "Base de datos", "Entornos de desarrollo",
				"Sistemas informaticos", "Digitalicación"};
		
		int notas [] [] = new int [NUM_ALUMNOS][NUM_MATERIAS];
		//Asignamos notas aleatorias
		for (int alumno=0; alumno<NUM_ALUMNOS; alumno++) {
			for (int materia=0; materia<NUM_MATERIAS; materia++) {
				notas[alumno][materia] = (int)(Math.random()*10);			
			}
		}
		// Mostramos notas alumnos
		
		for (int materia=0; materia<nombreMateria.length; materia++) {
			System.out.print(" " + nombreMateria[materia]+ " ");
		}
		System.out.println();
		for (int alumno=0; alumno<NUM_ALUMNOS; alumno++) {
			System.out.print(nombreAlumnos[alumno] + " : ");
			for (int materia=0; materia<NUM_MATERIAS; materia++) {
				System.out.print(notas[alumno][materia]+ " 	       ");	
			}
			System.out.println();
			
			//calculamos la media de cada amteria
			for ( int materia=0; materia<NUM_ALUMNOS; materia++) {
				suma++
					for (int alumno=0; )
				}
			}
		}
	}
}