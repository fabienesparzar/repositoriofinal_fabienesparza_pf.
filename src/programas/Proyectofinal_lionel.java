package programas;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Proyectofinal_lionel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Título del programa
        System.out.println("===== Registro de Compras del Cliente =====");

        // Registrar fecha y hora actual
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Fecha y hora de registro: " + ahora.format(formato));

        // Ingreso de datos
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        double[] compras = new double[3];
        for (int i = 0; i < compras.length; i++) {
            while (true) {
                System.out.print("Ingrese el monto de la compra " + (i + 1) + ": ");
                compras[i] = scanner.nextDouble();
                if (compras[i] < 0) {
                    System.out.println("⚠️ Error: El monto no puede ser negativo. Intente nuevamente.");
                } else {
                    break;
                }
            }
        }

        // Cálculos
        double totalCompras = compras[0] + compras[1] + compras[2];
        double promedioCompras = totalCompras / 3;

        // Resultados
        System.out.println("\n===== Resultados =====");
        System.out.println("Cliente: " + nombreCliente);
        System.out.printf("Total de compras: S/ %.2f\n", totalCompras);
        System.out.printf("Promedio de compras: S/ %.2f\n", promedioCompras);
        System.out.println("Registro completado correctamente ✅");

        scanner.close();
    }
}



