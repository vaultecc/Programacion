package martinez;

public class Diego2 {
	
	public static int tempMayor (double [] temp) {
		double temperaturaMayor= temp[0];
		int dia=0;
		
		for (int i=0; i<temp.length; i++) {
			if (temperaturaMayor < temp[i]) {
				temperaturaMayor = temp[i];
				dia=i;
			}
		}
		return dia+1;
	}
	
	public static double tempMediaImpar (double [] temp) {
		double suma=0;
		double mediaImpar;
		for (int i=0; i<temp.length;i++) {
			if (i % 2 ==0) {
			suma+=temp[i];
			}
		}
		mediaImpar = suma / temp.length;
		return mediaImpar;
	}
	
	public static int tempInferiorMedia (double [] temp) {
		double suma=0;
		double media, mediaInferior;
		int contador=0;
		int diaInferioMedia=0;
		
		for (int i=0; i<temp.length;i++) {
			suma+=temp[i];
		}
		media = suma / temp.length;
		
		for (int i=0; i<temp.length;i++) {
			if (temp[i]<media) {
				contador++;
			}
			if (temp[i]<media && contador == 2) {
				mediaInferior = temp[i];
				diaInferioMedia= i+1;
			}
		}
		return diaInferioMedia;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] tempMax = {25.55, 0.68, 25.47, 14.35, 8.15, 8.74, 4.58, 16.12, 30.98, 16.13, 23.28, 16.99, 7.84, 27.53, -3.64, 29.53, 6.04, 11.08, 12.27, 19.28, 27.43, 21.63, 30.19, 26.8, 20.65, 2.88, 9.56, 4.59, 2.24, 4.2, 25.25};
		
		System.out.println("El dia que registro la mayor temperatura fue: "+  tempMayor(tempMax));
		System.out.println("La temperatura media registrada los días impares fue: " + tempMediaImpar(tempMax));
		System.out.println("El segundo día que registro una temperatura inferior a la media fue: "+tempInferiorMedia(tempMax));
	}

}
