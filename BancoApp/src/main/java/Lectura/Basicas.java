package Lectura;

import java.util.Scanner;

public class Basicas {

    private static final Scanner scanner = new Scanner(System.in);

    public static int leerInt(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            System.out.print(mensaje);
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    public static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número decimal.");
            System.out.print(mensaje);
            scanner.next();
        }
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }

    public static String leerString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public static char leerChar(String mensaje) {
        System.out.print(mensaje);
        String input = scanner.nextLine();
        while (input.length() != 1) {
            System.out.println("Entrada inválida. Por favor, ingrese un solo caracter.");
            System.out.print(mensaje);
            input = scanner.nextLine();
        }
        return input.charAt(0);
    }
}

