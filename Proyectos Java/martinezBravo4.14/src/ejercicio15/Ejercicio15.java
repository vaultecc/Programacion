package ejercicio15;

public class Ejercicio15 {
	
	static final int size =50;
	
	public static double sumaArray (int []x) {
		double suma=0;
		for (int i=0; i<x.length; i++) {
			suma += x[i];
		}
		 return suma;
	}
	
	public static double mediaArray (int[]x) {
		double media;
		media = sumaArray(x) / x.length;
		return media;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] miArray = new int [size];
		int num = 50;
		
		for (int i =0; i<size ;i++) {
			miArray[i]= num;
			num++;

		}
		System.out.println("La suma de todos los valores del array es: " + sumaArray(miArray));
		System.out.println("La media de los valores del array es: " + mediaArray(miArray));
	}

}
