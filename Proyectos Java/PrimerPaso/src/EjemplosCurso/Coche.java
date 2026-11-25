package EjemplosCurso;

public class Coche {

	private double ancho;
	
	private double alto;
	
	private double peso;
	
	private String color;
	
	private int ruedas;
	
	
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRuedas() {
		
		return ruedas;
	}

	public void setRuedas(int r) {
		if (r<3 || r>4) {
			System.out.println("Esa cantidad de ruedas no es posible");
		}
		this.ruedas = r;
	}

	void arrancar()	{
		
		
	}
	
	void frenar () {
		
		
	}
	
	void girar () {
		
		
	}
	
} 
