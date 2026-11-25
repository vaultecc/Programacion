package Ejercicios;

public class NumAleatorioArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numAleatorio= new int [200];
		
		//Llenamos los arrays con números aleatorios
		for (int i =0; i<numAleatorio.length ; i++) {
			numAleatorio[i]= (int)(Math.random()*(100)+1);
		}
		
		//Con el bucle for each mostramos los datos almacenados en cada posicion del array
		for (int cantidad:numAleatorio) {
			System.out.print(cantidad + " ");
		}
		

	}

}
