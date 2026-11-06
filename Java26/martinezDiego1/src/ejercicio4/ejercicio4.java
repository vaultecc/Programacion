package ejercicio4;

//Objetivo: Vamos a crear unas series de enumerados, crearles unas variables, asignarles un valor y mostrarlos pon pantalla.
public class ejercicio4 {
	//Aqui hacemos la lista de enumerados.
	public enum size {PEQUEÑA, MEDIANA, GRANDE, EXTRAGRANDE};

	public static void main(String[] args) {
		//Aquí creamos las variables y asignamos un valor
		
		size hamburguesa1= size.PEQUEÑA;
		size hamburguesa2= size.MEDIANA;
		size hamburguesa3= size.GRANDE;
		size hamburguesa4= size.EXTRAGRANDE;
		
		//Aquí mostramos por pantalla los valores de las variales
		System.out.println("Elige el tamaño de hamburguesa: " + hamburguesa1);
		System.out.println("Elige el tamaño de hamburguesa: " + hamburguesa2);
		System.out.println("Elige el tamaño de hamburguesa: " + hamburguesa3);
		System.out.println("Elige el tamaño de hamburguesa: " + hamburguesa4);

	}

}
