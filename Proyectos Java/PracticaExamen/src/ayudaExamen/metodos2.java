
package ayudaExamen;

import java.util.Scanner;

public class metodos2 {

    public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado,
            double salarioOficinistas, int numeroOficinistas,
            boolean proyectosTerminados, double presupuestoEmpresa) {

        if (!proyectosTerminados) {

            System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados");
            return false;
        }

        double gastoPersonal = salarioJefe + salarioEncargado
                + (salarioOficinistas * numeroOficinistas);

        if (gastoPersonal > 20000) {

            System.out.println("No ha pasado la auditoría ya que el gasto en personal es de "
                    + gastoPersonal + " euros y excede el límite mensual de 20.000 euros");
            return false;
        }

        if (presupuestoEmpresa > 100000) {

            System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de "
                    + presupuestoEmpresa + " euros excede el límite establecido de 100.000 euros");
            return false;
        }

        System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
        return true;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el salario del jefe: ");
        double salarioJefe = teclado.nextDouble();

        System.out.print("Introduce el salario del encargado: ");
        double salarioEncargado = teclado.nextDouble();

        System.out.print("Introduce el salario de los oficinistas: ");
        double salarioOficinistas = teclado.nextDouble();

        System.out.print("Introduce el número de oficinistas: ");
        int numeroOficinistas = teclado.nextInt();

        System.out.print("¿Se han terminado los proyectos? (true/false): ");
        boolean proyectosTerminados = teclado.nextBoolean();

        System.out.print("Introduce el presupuesto de la empresa: ");
        double presupuestoEmpresa = teclado.nextDouble();

        boolean resultado = auditoriaEmpresa(salarioJefe, salarioEncargado,
                salarioOficinistas, numeroOficinistas,
                proyectosTerminados, presupuestoEmpresa);

        System.out.println("Resultado de la auditoría: " + resultado);

        teclado.close();
    }
}
