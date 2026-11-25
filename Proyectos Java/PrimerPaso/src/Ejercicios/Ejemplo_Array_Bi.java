package Ejercicios;

public class Ejemplo_Array_Bi {

	public static void main(String[] args) {
		
		int capInicial = 10000;
		
		double acumulado;
		double interes= 0.10;
		
		double [][] saldo= new double [6][5];
		
		for (int i = 0; i<saldo.length;i++) {
			saldo [i][0]= capInicial;
			
			acumulado=10000;
			
			for (int j=1; j<5; j++) {
				acumulado=acumulado+(acumulado*interes);
				
				saldo[i][j] = acumulado;
			}
			interes= interes + 0.01;
			
			
		}
		
		for (int i = 0; i<saldo.length;i++) {
			System.out.println();
			
			for (int j=0; j<5; j++) {
				System.out.print(saldo[i][j] + "  ");
				System.out.print(" ");
				
			}
		}

	}

}
