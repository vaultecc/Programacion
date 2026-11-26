
package ayudaExamen;

public class metodos1 {

    public static String indicaMesDias(int mes) {

        if (mes < 1 || mes > 12) {
            return "El mes es incorrecto";
        }

        switch (mes) {

        case 1:
            return "Enero, 31 días";

        case 2:
            return "Febrero, 28 días";

        case 3:
            return "Marzo, 31 días";

        case 4:
            return "Abril, 30 días";

        case 5:
            return "Mayo, 31 días";

        case 6:
            return "Junio, 30 días";

        case 7:
            return "Julio, 31 días";

        case 8:
            return "Agosto, 31 días";

        case 9:
            return "Septiembre, 30 días";

        case 10:
            return "Octubre, 31 días";

        case 11:
            return "Noviembre, 30 días";

        case 12:
            return "Diciembre, 31 días";

        default:
            return "El mes es incorrecto";
        }
    }

    public static void main(String[] args) {

        int mes = 2;

        System.out.println(indicaMesDias(mes));
    }
}
