package Clases;

import java.util.Scanner;

public class Basicas {

    static Scanner sc = new Scanner(System.in);

    public static String LeerTexto(String mensaje) {
        String valor;
        do {
            System.out.println(mensaje);
            valor = sc.next();
            sc.nextLine();

        } while (!(valor.length() > 0));
        return valor;

    }

    public static int LeerEntero(String mensaje, int valorMin, int valorMax) {
        int valor;
        do {
            System.out.println(mensaje);
            valor = sc.nextInt();
        } while (!(valor >= valorMin && valor <= valorMax));
        return valor;

    }

    public static float LeerReal(String mensaje) {
        float valor;
        do {
            System.out.println(mensaje);
            valor = sc.nextFloat();
            sc.nextLine();

        } while (!(valor > 0));
        return valor;

    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("");
            System.out.println("1. Registrar Enfermedad");
            System.out.println("2. Listar Enfermedades ");
            System.out.println("3. Buscar Enfermedad");
            System.out.println("4. Registrar persona enferma");
            System.out.println("5. Listar persona enferma");
            System.out.println("6. Buscar persona enferma ");
            System.out.println("7. SALIR ");
            System.out.println(" ");
            opc = Basicas.LeerEntero("Elija una opcion : ", 1, 7);
        } while (!(opc > 0 && opc < 8));
        return opc;

    }
}
