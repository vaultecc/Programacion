package tiposEnumerados;


public class TiposEnumerados {
	
	final int NOTA1=1;
	final int NOTA2=2;
	final int NOTA3=3;
	final int NOTA4=4;
	final int NOTA5=5;
	final int NOTA6=6;
	final int NOTA7=7;
	final int NOTA8=8;
	final int NOTA9=9;
	final int NOTA10=10;
	public enum Notas {NOTA1, NOTA2, NOTA3, NOTA4, NOTA5, NOTA6, NOTA7, NOTA8, NOTA9, NOTA10};

	public static void main(String[] args) {
		
		Notas notaExamen1 = Notas.NOTA10 ;
		Notas notaExamen2 = Notas.NOTA9 ;
		
		System.out.println("La nota del primer examen es: " + notaExamen1);
		

	}

}
