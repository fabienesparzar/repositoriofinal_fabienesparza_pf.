package programas;

import java.util.Scanner;

public class Proyectofinal_lionel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        // Solicitar las tres compras
        System.out.print("Ingrese el monto de la compra 1: ");
        double compra1 = scanner.nextDouble();

        System.out.print("Ingrese el monto de la compra 2: ");
        double compra2 = scanner.nextDouble();

        System.out.print("Ingrese el monto de la compra 3: ");
        double compra3 = scanner.nextDouble();

        // Calcular total y promedio
        double totalCompras = compra1 + compra2 + compra3;
        double promedioCompras = totalCompras / 3;

        // Mostrar resultados
        System.out.println("\nRESULTADOS");
        System.out.println("Cliente: " + nombre);
        System.out.println("Total compras          : " + totalCompras);
        System.out.println("Promedio de compras    : " + promedioCompras);
    }
}

