package Ejemplos;

public class ClaseArrays {

	public static void main(String[] args) {
		
		
		/*int[] miArray= new int [5];*/
		
		/*for (int i=0; i<5; i++) {
			miArray[i]= (int)(Math.random()*(100)+1);
		}*/
		
		int [] miArray = {5,15,51,53,95,12,31,31,543,12,32,42,12,54,23}; //Declaras e inicializas directamente
		
		for (int i=0; i<miArray.length; i++) {
			System.out.println("valor del índice " + i + " igual a " + miArray[i]);
		}

	}

}
