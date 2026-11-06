package Ejemplos;

public class ManipulacionCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aquí se prueba el metodo length y charAt
		String nombre= "paco";
		
		
		int longitud=nombre.length();
		System.out.println("Mi nombre tiene " + longitud + " Letras");
		
		
		System.out.println("la ultima letra de mi nombre es " + 
		nombre.charAt(nombre.length()-1));
		
		/*String frase ="Hoy es un estupendo día para programar en java";
		
		String subcadena= frase.substring(10);
		System.out.println(subcadena);*/

	}

}
