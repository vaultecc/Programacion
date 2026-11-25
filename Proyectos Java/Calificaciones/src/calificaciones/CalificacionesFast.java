package calificaciones;

public class CalificacionesFast {
	
	public static int [][] calificaciones (int ALUMNOS, int MATERIAS) {
		
		int [][] calificaciones = new int [ALUMNOS][MATERIAS];
		
		for (int i =0; i<ALUMNOS; i++) {
			for (int j=0; j<MATERIAS; j++) {
				calificaciones[i][j]= (int)(Math.random()*10)+1;
			}
		}
		return calificaciones;
	}
	
	public static double [] mediaAlumno (int [][] x, int ALUMNOS, int MATERIAS) {
		int suma=0;
		double media;
		double [] mediaAlumno = new double [ALUMNOS];
		
		for (int i=0; i<ALUMNOS;i++) {
			suma =0;
			 for (int j=0; j<MATERIAS; j++) {
				suma += x[i][j];
			}
			 media = (double)suma / MATERIAS;
			 mediaAlumno[i] = media;
		}
		return mediaAlumno;
	}
	
	public static double [] mediaMateria (int [][] x, int ALUMNOS, int MATERIAS) {
		int suma=0;
		double media;
		double [] mediaMateria = new double [MATERIAS];
		
		for (int i=0; i<MATERIAS;i++) {
			suma =0;
			 for (int j=0; j<ALUMNOS; j++) {
				 suma += x[j][i];
			}
			 media = (double)suma / ALUMNOS;
			 mediaMateria[i] = media;
		}
		return mediaMateria;
	}
	
	public static String alumnoMediaBaja (int [][] x, String [] NOMBRE_ALUMNOS, int ALUMNOS, int MATERIAS) {
		
		double mediaBaja = mediaAlumno(x,ALUMNOS,MATERIAS)[0];
		String mensaje= "El alumno con la calificación más baja es " + NOMBRE_ALUMNOS[0];
		double [] mediaPorAlumno =  mediaAlumno(x,ALUMNOS,MATERIAS);
		
		for (int i=0; i<ALUMNOS; i++) {
			if (mediaBaja > mediaPorAlumno[i]) {
				mediaBaja = mediaPorAlumno[i];
				mensaje = "El alumno con la calificación más baja es " + NOMBRE_ALUMNOS[i];
			}
		}
		return mensaje;
	}
	
	public static String materiaMenor4 (int [][] x, int MATERIAS,int ALUMNOS, String [] NOMBRE_MATERIAS) {
		
		String mensaje = "No hay materias con una calificación media inferior a 4";
		double [] mediaPorMateria = mediaMateria(x, ALUMNOS, MATERIAS);
		int contador = 0;
		boolean materiaInferior4 = false;
		
		do {
			if (mediaPorMateria[contador]<4  ) {
				mensaje = "La materia " + NOMBRE_MATERIAS[contador] + " tiene una calificación media inferior a 4";
				materiaInferior4 = true;
		} contador++;
		} while (contador != 4 && materiaInferior4 != true);
		
		return mensaje;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 final int ALUMNOS = 8;
		 final int MATERIAS = 4;
		 final String [] NOMBRE_ALUMNOS = {"José", "Miguel", "Juan", "Pedro", "María", "Irene", "Carmen", "Gracia"};
		 final String [] NOMBRE_MATERIAS =  {"lengua","inglés", "física", "música"};
		
		int [][] notas = new int [ALUMNOS][MATERIAS];
		
		notas=calificaciones(ALUMNOS,MATERIAS);
		
		for (int i =0; i<ALUMNOS; i++) {
			System.out.println("La media del alumno " + NOMBRE_ALUMNOS[i] + " es " + mediaAlumno(notas,ALUMNOS,MATERIAS)[i]);
		}
		
		System.out.println();
		
		for (int i =0; i<MATERIAS; i++) {
			System.out.println("La media de la materia " + NOMBRE_MATERIAS[i] + " es " + mediaMateria(notas,ALUMNOS,MATERIAS)[i]);
		}
		
		System.out.println();
		
		System.out.println(alumnoMediaBaja(notas,NOMBRE_ALUMNOS,ALUMNOS,MATERIAS));
		
		System.out.println();
		
		System.out.println(materiaMenor4(notas, MATERIAS,ALUMNOS, NOMBRE_MATERIAS));
	}

}
