
package ayudaExamen;

public class metodos {

    public static double productosDescuento(double precio, int cantidad, int descuento) {

        double precioTotal = precio * cantidad;
        double precioFinal = precioTotal - (precioTotal * descuento / 100);

        return precioFinal;
    }

    public static void main(String[] args) {

        double precio = 20;
        int cantidad = 3;
        int descuento = 10;

        double resultado = productosDescuento(precio, cantidad, descuento);
        double precioOriginal = precio * cantidad;

        System.out.println("Usted ha adquirido " + cantidad + " productos, a un precio de "
                + precio + " euros la unidad.");

        System.out.println("El precio a pagar es " + precioOriginal
                + " euros, pero al aplicarle el descuento del " + descuento
                + "% el precio final a pagar es: " + resultado + " euros.");
    }
}
