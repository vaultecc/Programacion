package EjemplosCurso;

public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche renault = new Coche();
		
		
		renault.setColor("azul");
		
		renault.arrancar();
		
		Coche mazda=new Coche();
		
		mazda.setRuedas(4);
		
		mazda.girar();

		
		System.out.println("El coche tiene: " + mazda.getRuedas() + " ruedas y el otro coche es de color " + renault.getColor());
	}

}
