package Aplicacion;

import Lectura.Basicas;
import Modelo.CuentaBancaria;
import Modelo.Titular;
import servicio.OperacionBancaria;

public class BancoApp {

    public static void main(String[] args) {
        OperacionBancaria gestorCuentas = new OperacionBancaria();

        int opcion;

        do {
            mostrarMenu();
            opcion = Basicas.leerInt("Elija una opción: ");

            switch (opcion) {
                case 1:
                    crearCuenta(gestorCuentas);
                    break;
                case 2:
                    realizarOperacion(gestorCuentas, "depositar");
                    break;
                case 3:
                    realizarOperacion(gestorCuentas, "retiro");
                    break;
                case 4:
                    consultarSaldo(gestorCuentas);
                    break;
                case 5:
                    gestorCuentas.mostrarTodasLasCuentas();
                    break;
                case 6:
                    cerrarCuenta(gestorCuentas);
                    break;
                case 7:
                    System.out.println("Saliendo del sistema bancario. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del 1 al 7.");
                    break;
            }

        } while (opcion != 7);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1. Abrir nueva cuenta");
        System.out.println("2. Realizar depósito");
        System.out.println("3. Realizar retiro");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Listar todas las cuentas");
        System.out.println("6. Cerrar cuenta");
        System.out.println("7. Salir");
    }

    private static void crearCuenta(OperacionBancaria gestorCuentas) {
        System.out.println("\n--- Abrir Nueva Cuenta ---");

        String codigo = Basicas.leerString("Ingrese código de titular: ");
        String apellidos = Basicas.leerString("Ingrese apellidos: ");
        String nombres = Basicas.leerString("Ingrese nombres: ");
        char genero = Basicas.leerChar("Ingrese género (M/F): ");
        String dni = Basicas.leerString("Ingrese DNI: ");
        String direccion = Basicas.leerString("Ingrese dirección: ");
        String email = Basicas.leerString("Ingrese email: ");
        String telefono = Basicas.leerString("Ingrese teléfono: ");

        Titular nuevoTitular = new Titular(codigo, apellidos, nombres, genero, dni, direccion, email, telefono);

        String numCuenta = Basicas.leerString("Ingrese número de cuenta: ");
        CuentaBancaria nuevaCuenta = new CuentaBancaria(numCuenta, nuevoTitular);

        gestorCuentas.agregarCuenta(nuevaCuenta);
    }

    private static void realizarOperacion(OperacionBancaria gestorCuentas, String tipoOperacion) {
        String numCuenta = Basicas.leerString("Ingrese el número de cuenta: ");
        CuentaBancaria cuenta = gestorCuentas.buscarCuenta(numCuenta);

        if (cuenta != null) {
            double monto = Basicas.leerDouble("Ingrese el monto a " + tipoOperacion + ": ");
            if (tipoOperacion.equals("depositar")) {
                cuenta.depositar(monto);
            } else {
                cuenta.retirar(monto);
            }
        } else {
            System.out.println("Error: Cuenta no encontrada.");
        }
    }

    private static void consultarSaldo(OperacionBancaria gestorCuentas) {
        String numCuenta = Basicas.leerString("Ingrese el número de cuenta para consultar saldo: ");
        CuentaBancaria cuenta = gestorCuentas.buscarCuenta(numCuenta);
        if (cuenta != null) {
            cuenta.consultarSaldo();
        } else {
            System.out.println("Error: Cuenta no encontrada.");
        }
    }

    private static void cerrarCuenta(OperacionBancaria gestorCuentas) {
        String numCuenta = Basicas.leerString("Ingrese el número de cuenta a cerrar: ");
        gestorCuentas.cerrarCuenta(numCuenta);
    }
}
