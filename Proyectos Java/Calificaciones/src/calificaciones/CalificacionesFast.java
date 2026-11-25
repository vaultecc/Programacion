package calificaciones;

public class CalificacionesFast {
	
	static final int ALUMNOS = 8;
	static final int MATERIAS = 4;
	static final String [] NOMBRE_ALUMNOS = {"José", "Miguel", "Juan", "Pedro", "María", "Irene", "Carmen", "Gracia"};
	static final String [] NOMBRE_MATERIAS =  {"lengua","inglés", "física", "música"};
	
	
	public static int [][] calificaciones () {
		
		int [][] calificaciones = new int [ALUMNOS][MATERIAS];
		
		for (int i =0; i<ALUMNOS; i++) {
			for (int j=0; j<MATERIAS; j++) {
				calificaciones[i][j]= (int)(Math.random()*10)+1;
			}
		}
		return calificaciones;
	}
	
	public static double [] mediaAlumno (int [][] x) {
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
	
	public static double [] mediaMateria (int [][] x) {
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
	
	public static String alumnoMediaBaja (int [][] x) {
		
		double mediaBaja = mediaAlumno(x)[0];
		String mensaje= "El alumno con la calificación más baja es " + NOMBRE_ALUMNOS[0];
		
		for (int i=0; i<ALUMNOS; i++) {
			if (mediaBaja > mediaAlumno(x)[i]) {
				mediaBaja = mediaAlumno(x)[i];
				mensaje = "El alumno con la calificación más baja es " + NOMBRE_ALUMNOS[i];
			}
		}
		return mensaje;
	}
	
	public static String materiaMenor4 (int [][] x) {
		
		String mensaje = "No hay materias con una calificación media inferior a 4";
		
		for (int i=0; i<MATERIAS; i++) {
			if (mediaMateria(x)[i] <4  ) {
				mensaje = "La materia " + NOMBRE_MATERIAS[i] + " tiene una calificación media inferior a 4";
				break;
			}
		}
		return mensaje;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] notas = new int [ALUMNOS][MATERIAS];
		
		notas=calificaciones();
		
		for (int i =0; i<ALUMNOS; i++) {
			System.out.println("La media del alumno " + NOMBRE_ALUMNOS[i] + " es " + mediaAlumno(notas)[i]);
		}
		
		System.out.println();
		
		for (int i =0; i<MATERIAS; i++) {
			System.out.println("La media de la materia " + NOMBRE_MATERIAS[i] + " es " + mediaMateria(notas)[i]);
		}
		
		System.out.println();
		
		System.out.println(alumnoMediaBaja(notas));
		
		System.out.println();
		
		System.out.println(materiaMenor4(notas));
	}

}
