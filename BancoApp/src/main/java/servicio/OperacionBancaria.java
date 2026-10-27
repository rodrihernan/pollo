package servicio;

import java.util.ArrayList;

import Modelo.CuentaBancaria;

public class OperacionBancaria {

    private ArrayList<CuentaBancaria> listaCuentas;

    public OperacionBancaria() {
        this.listaCuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        listaCuentas.add(cuenta);
        System.out.println("Cuenta " + cuenta.getNumeroCuenta() + " agregada al sistema.");
        System.out.println(" ");
    }

    public CuentaBancaria buscarCuenta(String numeroCuenta) {
        for (CuentaBancaria cuenta : listaCuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        return null;
    }

    public void mostrarTodasLasCuentas() {
        if (listaCuentas.isEmpty()) {
            System.out.println("No hay cuentas registradas en el sistema.");
            return;
        }
        System.out.println("\n--- Lista de Cuentas Bancarias ---");
        for (CuentaBancaria cuenta : listaCuentas) {
            System.out.println(cuenta);
        }
        System.out.println("--------------------------------------------------------------------");
    }

    public void cerrarCuenta(String numeroCuenta) {
        CuentaBancaria cuenta = buscarCuenta(numeroCuenta);
        if (cuenta != null) {
            cuenta.cerrarCuenta();
        } else {
            System.out.println("Error: No se encontró la cuenta con el número " + numeroCuenta);
        }
    }
}
