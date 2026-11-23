package calificaciones;

public class Calificaciones {
	
	public static void mediaAlumno (int [][] calificaciones) {
		int suma;
		double media;
		
		String [] nombresAlumnos = {"Jose", "Miguel", "Juan", "Pedro", "María", "Irene", "Carmmen", "Gracia"} ;

		
		for (int alumno=0; alumno<8 ; alumno++ ) {
			suma = 0 ;
			for (int materia=0; materia<4; materia++) {
				suma = suma + calificaciones [alumno][materia];
			}
			media = (double)suma / 4;
			System.out.println("La media del alumno " + nombresAlumnos[alumno] + " es " + media);
		}
	}
	
	public static void mediaMateria (int [][] calificaciones) {
		int suma=0;
		double media;
		int numMateria=0;
		
		String [] nombresMaterias = {"Lengua", "Inglés", "Física","Música"};
		
		for (int materia=0; materia<4 ;materia++) {
			suma = 0;
			for (int alumno=0; alumno<8; alumno++) {
				
				suma = suma + calificaciones[alumno][materia];
			}
			media = (double)suma / 8;
			
			System.out.println("La media de la materia " + nombresMaterias[numMateria] + " es " + media);
			numMateria++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int ALUMNOS = 8;
		final int MATERIAS = 4;
		int num;
		
		int [][] calificaciones = new int [ALUMNOS][MATERIAS];
		
		for (int alumno=0; alumno<ALUMNOS; alumno++) {
			for (int materia=0; materia<MATERIAS; materia++) {
				calificaciones[alumno][materia] = (int)(Math.random()*10)+1;
			}
		}
		
		mediaAlumno(calificaciones);
		System.out.println();
		mediaMateria(calificaciones);

	}

}
