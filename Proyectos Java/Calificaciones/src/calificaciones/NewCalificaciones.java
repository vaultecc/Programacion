package calificaciones;

public class NewCalificaciones {
	
	static final int NUM_ALUMNOS= 8;
	static final int NUM_MATERIAS= 4;
	static final String [] NOMBRES = {"José","Miguel","Juan","Pedro","María","Irene","Carmen","Gracia"};
	static final String [] MATERIAS = {"Lengua","Inglés","Física", "Música"};
	static int [][] notas = new int [NUM_ALUMNOS][NUM_MATERIAS];
	
	
	//Este método calcula la media de cada alumno
	public static double [] mediaAlumno (int [][] x) {
		int sumaMedia;
		double mediaA;
		
		double [] medias= new double[NUM_ALUMNOS];
		
		for (int i =0; i<NUM_ALUMNOS;i++) {
			sumaMedia=0;
			for (int j=0; j<NUM_MATERIAS ;j++) {
				sumaMedia+=x[i][j];
			}
			mediaA = (double)sumaMedia/NUM_MATERIAS;
			medias[i] = mediaA;
		}
		return medias;
	}
	
	//Este método devuelve la média de cada materia
	public static double [] mediaMateria (int [][] x) {
		int suma=0;
		double mediaM;
		
		double [] medias= new double[NUM_MATERIAS];
		
		for (int i=0; i<NUM_MATERIAS; i++) {
			suma=0;
			for (int j=0; j<NUM_ALUMNOS; j++ ) {
				suma+= x[j][i];
			}
			mediaM = (double) suma/NUM_ALUMNOS;
			medias[i] = mediaM;
		}
		return medias;
	}
	
	public static String mediaBaja () {
		double mediaMasBaja = mediaAlumno(notas)[0];
		int posicion=0;
		
		for (int i = 0; i<NUM_ALUMNOS; i++) {
			if (mediaAlumno(notas)[i] < mediaMasBaja) {
				mediaMasBaja = mediaAlumno(notas)[i];
				posicion=i;
			}
		}
		return NOMBRES[posicion];
	}
	
	public static String materiaMedia4 () {
		String mediaSuperior4 = "No hay medias inferiores a 4";
		for (int i =0; i<NUM_MATERIAS; i++) {
			if (mediaMateria(notas)[i] <4) {
				return MATERIAS[i];
			}
		}
			   return mediaSuperior4;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<NUM_ALUMNOS;i++) {
			for (int j=0; j<NUM_MATERIAS;j++) {
				notas[i][j]= (int)(Math.random()*10)+1;
			}
		}

		for (int i=0; i<NUM_ALUMNOS;i++) {
			System.out.println("La media de " + NOMBRES[i] + " es " + mediaAlumno(notas)[i]);
		}
		System.out.println();
		for (int i=0; i<NUM_MATERIAS;i++) {
			System.out.println("La media de " + MATERIAS[i] + " es " + mediaMateria(notas)[i]);
		}
	
		System.out.println();
		System.out.println("La persona con la média más baja es: " + mediaBaja());
		System.out.println();
		System.out.println("La materia con la calificación media inferior a 4 es: " + materiaMedia4());

	}
}
