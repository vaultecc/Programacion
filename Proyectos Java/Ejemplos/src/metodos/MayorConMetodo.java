package metodos;

import java.util.Scanner;

public class MayorConMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner teclado= new Scanner(System.in);
				
				int num1;
				int num2;
				int num3;
				int num4;
				int numMayor=0;
				boolean mismoNumero=false;
				
				System.out.println("Introduce 1 número:");
				num1=teclado.nextInt();
				System.out.println("Introduce 1 número");
				num2=teclado.nextInt();
				System.out.println("Introduce 1 número");
				num3=teclado.nextInt();
				System.out.println("Introduce 1 número");
				num4=teclado.nextInt();
	
				
				if (num1>num2 && num1>num3 && num1>num4) {
					numMayor=num1;
				} else if (num2>num1 && num2>num3 && num2>num4) {
					numMayor=num2;	
				} else if (num3>num1 && num3>num2 && num3>num4) {
					numMayor=num3;
				} else if (num4>num1 && num4>num2 && num4>num3) {
					numMayor=num4;
				} else {
					System.out.println("Son el mismo numero");
					mismoNumero=true;
				}
				
				if (mismoNumero == false) System.out.println(numMayor + " Es el número mayor");
	}
				//Falta añadir el metodo :D

}